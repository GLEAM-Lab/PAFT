package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FIND_CLOSEST_ELEMENTS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,3.9,4.0,5.0,2.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.9,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,5.9,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,3.0,4.0,5.0,2.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,3.0,4.0,5.0,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.2,3.1,4.1,5.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,3.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.2,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {3.4,5.6,8.1,14.5,21.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.4,5.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.9,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.9,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.2,2.3,2.4,2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.2,1.3,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.2,3.3,5.1,7.8,9.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,3.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,3.5,4.5,5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.2,3.3,5.1,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,3.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.36581021654089096,0.9,1.0,1.8,2.5,2.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.3,2.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.2,1.3,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.2,1.4,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.2,3.3,5.1,5.605725348678288,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.1,5.605725348678288}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.3,2.4,5.0,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.5,2.9,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.2,1.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.0,2.0,2.276052871016944,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.276052871016944}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2,1.3,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.3,2.4,5.0,5.0,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,1.5,2.5,3.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2,1.3556851172598539,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3556851172598539,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,3.5,4.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.9065922001939695,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.0,2.0,2.276052871016944,2.276052871016944,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.276052871016944,2.276052871016944}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.1,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,1.6325127784783873,2.0,2.1,2.2,2.3,2.4,2.424000205756431,2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.4,1.4603348592696748,1.7891067661112277,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,3.4,3.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.4,3.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2,1.3556851172598539,1.4,1.6,1.6,1.8,2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.6,1.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2,2.0,2.1,2.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.5310052282063495});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,2.0,2.1,2.2,2.3,2.4,2.424000205756431,2.5,3.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,1.3,2.0,2.1,2.2,2.3,2.4,2.424000205756431,2.5,3.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2,1.3556851172598539,1.4,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.2,1.4,1.4,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,1.5,2.5,3.5,4.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.5,0.6660078740884678,1.1,1.3,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.395275547571625,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3,1.395275547571625,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,1.8332957131132472,2.1,2.2,2.3,2.4,2.424000205756431,2.5,3.0198699773905164,3.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.4603348592696748,1.8,2.5,2.9,3.1,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.1,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.9,3.1,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.1,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0884212994945,2.0,2.0,2.1,2.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {3.0,3.3,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.2,4.001419307404744,5.1,7.8,9.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.001419307404744,5.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,1.0884212994945,3.206051292454492,5.0,7.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,2.0,2.1,2.1,2.2,2.3,2.4,2.424000205756431,2.5,3.4,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.1,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.6605281965718235,2.9,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,2.6605281965718235}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.9,3.1,3.1,14.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.1,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,1.0,1.0884212994945,3.206051292454492,5.0,7.0,9.0,9.819481586162372});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.395275547571625,1.395275547571625,1.4,10.0,10.511377904483744});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.6605281965718235,2.9,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.9,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.395275547571625,1.395275547571625,1.395275547571625,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3,1.5,2.3827054707590554,2.5,3.5,4.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.2,1.3,10.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,1.8332957131132472,2.1,2.2,2.3,2.4,2.424000205756431,2.5,3.0198699773905164,3.4,14.5,18.924237928824464});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.2,1.4,1.4,1.6,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.2,1.4,1.4,1.4,1.5267476484891433,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.2,3.3,5.1,5.605725348678288});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.1,5.605725348678288}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.4603348592696748,1.7891067661112277,2.3827054707590554,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4603348592696748}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.5267476484891433,1.9065922001939695,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.4,5.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,5.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,1.3,2.0,2.1,2.2,2.4,2.424000205756431,2.5,3.4,14.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.424000205756431}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5530302075029647,1.1,1.1,1.3,1.395275547571625,1.395275547571625,1.395275547571625,1.395275547571625,1.4,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.2,1.4,1.4,1.5267476484891433,1.6,1.8,2.3827054707590554,9.819481586162372});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.36581021654089096,0.9,1.0,1.8,2.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.395275547571625,1.395275547571625,1.4,1.4603348592696748,1.7891067661112277,2.0458316789819433});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.395275547571625}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {3.4,5.6,8.1,14.5,21.7,21.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {21.7,21.7}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,2.5,2.9,3.1,3.1,14.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.1,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.801058079332841,5.6,8.1,14.5,21.7,21.7});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {21.7,21.7}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9785581741632983,1.0,1.2,1.4,1.4,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9,1.2,1.8,2.5,2.6605281965718235,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,2.6605281965718235}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.833907583498922,1.0,1.0,1.2,1.4,1.4,1.4,1.6,1.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {3.0,3.3,5.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0458316789819433,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0458316789819433,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.0,2.0,2.276052871016944,3.0,5.0,5.5341526068204185});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.276052871016944}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,3.0,5.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5127269056999775,1.0,1.0,1.0,3.0,5.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,3.3,5.1,5.605725348678288});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.1,5.605725348678288}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,2.0,2.276052871016944,2.276052871016944,2.276052871016944,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.276052871016944,2.276052871016944}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.3,2.3,2.4,2.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3,1.3,1.395275547571625,1.4,1.9701824712767706});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0458316789819433,3.0,4.565252363825356,7.0,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.790113744385612,1.0,1.0,1.2,1.4,1.4,1.4,1.5267476484891433,1.6,1.8,1.8775084870729148,2.3827054707590554,9.819481586162372});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5575018658936712,2.2,3.3,5.1,7.8,9.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5575018658936712,2.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.1,1.2,1.3,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,2.65618349195373,3.3,5.1,5.605725348678288,7.8,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.8,7.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8643084490077626,1.1,1.395275547571625,1.4603348592696748,1.7891067661112277,2.3827054707590554,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.395275547571625,1.4603348592696748}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,1.0884212994945,3.206051292454492,5.0,6.465751844577957,7.0,7.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1963194756636508,2.0,2.2,2.3,2.3827054707590554,2.4,2.424000205756431,2.5,3.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3827054707590554,2.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.1,2.3,2.4,3.248590254248692,5.0,7.8});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.2,1.8,2.5,2.9,3.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.9,3.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,3.0,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {10.0,12.2,15.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,12.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-1.0,0.0,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,3.0,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.2,2.3,2.4,2.5,3.0,3.5,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,1.5,2.5,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,8.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,4.0,6.0,8.0,12.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.382610224991176,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.5,6.599012700484447}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,3.0,5.5,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,4.0,8.0,12.0,14.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-5.5,-1.0,0.0,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-5.5,-5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.2655100630808445,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,5.2655100630808445}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,5.5,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,7.0,8.78882547388092,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.78882547388092,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.02,4.0,6.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {8.0,10.0,15.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,4.0,6.0,8.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,4.0,6.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,1.5,2.5,4.5,4.5,4.6,8.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.5,4.4,4.6,4.939076975024989,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.3,1.5,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.158193327872366,8.0,10.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,3.0,4.0,4.116320447941627,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.116320447941627}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {8.0,10.0,15.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {55.0,55.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.2994894489778384,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2994894489778384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.1,1.2,1.3,1.5,16.382610224991176});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6560261484277246,2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5690704627594818,4.0,6.0,8.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,3.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,2.4746384005005804,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.4746384005005804}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.0,2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,14.418547049602209,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.0772407046865693,1.09,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.07,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.4,4.5,4.6,6.665410244529757});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.1,1.2,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,4.0,6.0,8.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,7.0,8.1,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.1,8.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,14.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,3.0,4.0,4.116320447941627,5.5,6.5,6.897666475955764,7.0,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.897666475955764,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8669891442380135,0.9,1.1,1.2,1.2994894489778384,1.5,1.5050122069252874});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.034315406660118855,0.04,0.05,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.034315406660118855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.1,1.2,1.3,1.5,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,14.418547049602209,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,2.0,4.0,6.0,7.499866250660795,8.0,8.44265458853031,10.0,10.0,12.0,14.0,14.418547049602209,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,20.0,25.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5139198781210071,0.6184885915334304,0.8669891442380135,0.9,1.02,1.2,1.2994894489778384,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8669891442380135,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,6.0,8.0,10.0,10.928876492306518,16.0,18.0,20.0,20.299145411424135});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.299145411424135}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,4.0,6.0,8.0,12.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6560261484277246,2.0,2.0,4.0,6.429181592060958,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.07,1.5690704627594818,6.0,8.0,10.0,14.0,15.798039725437825,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.1,1.2,1.3,1.5,1.5,1.5,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,1.5,2.5,4.5,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.2,1.3,1.5,1.5,1.5,1.818731078819195,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,1.5,1.5,2.5,4.5,4.5,4.6,8.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,1.0,1.01,1.02,1.03,1.04,1.06,1.07,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.07,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.03,2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.03,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,0.9,1.0,1.1,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.1814576506974284,1.5,4.6,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1814576506974284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.07,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,40.0,45.0,45.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.7865124688376424,2.0,2.1,2.3,2.4,2.4746384005005804,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.4746384005005804}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {6.599012700484447,10.0,15.0,20.0,25.0,30.0,32.696672390862496,35.0,40.0,45.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {55.0,55.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,3.0,5.5,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,3.0,4.0767066000694365,5.5,5.5,5.5,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,9.46529267466774,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.46529267466774,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.03,2.0,4.0,4.5,6.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,6.0,7.114467485940238,8.0,10.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,6.0,6.0,6.5,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.0,2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,8.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,6.0,8.0,8.44265458853031,10.0,10.0,10.0,12.0,14.0,14.418547049602209,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,5.411478708195559,6.0,6.0,6.5,8.0,10.0,11.11260309319111,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,8.0,8.0,12.0,14.0,14.0,15.546107430151807,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.07,1.1,1.1,1.2,1.3,1.5,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.2,1.2994894489778384,1.5,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2994894489778384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,5.411478708195559,5.411478708195559,6.0,6.0,6.5,8.0,10.0,11.11260309319111,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.411478708195559,5.411478708195559}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,5.5,7.0,8.1,10.0,12.0,20.299145411424135});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.6666213882097827,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,7.499866250660795,9.53381250714651,10.0,12.2,15.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.53381250714651,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8669891442380135,0.9,1.1,1.2,1.2994894489778384,1.5,1.5050122069252874,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,30.0,35.0,40.0,40.0,40.0,45.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {6.599012700484447,10.0,15.0,20.0,25.155142584904603,30.0,32.696672390862496,35.0,39.332502120913084,40.0,45.0,50.0,55.0,55.89445078247812,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {39.332502120913084,40.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,14.0,16.0,16.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,8.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.6666213882097827,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,3.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0,5.2655100630808445,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.6666213882097827,0.02,0.03,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.6184885915334304,1.1,1.5,4.4,4.6,4.939076975024989});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.0,8.160853174340843,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,1.5,9.53381250714651,10.0,12.2,15.0,25.0,25.0,29.831398888667575,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,3.0,5.5,5.551571029636836,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,4.0,6.0,8.0,9.0,10.0,14.0,17.571401589748874,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.3,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,4.0,5.947417635576787,6.0,8.0,8.44265458853031,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5139198781210071,0.8669891442380135,0.9,1.02,1.2,1.2994894489778384,1.3863619602788184,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8669891442380135,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.5,3.0,4.0,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,8.0,8.5,9.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,4.0,6.0,12.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {3.5,8.0,10.0,11.11260309319111,15.0,20.0,30.0,35.0,40.0,45.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {55.0,55.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.02,3.0,5.5,7.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5139198781210071,0.6184885915334304,0.8669891442380135,0.9,1.02,1.2,1.2,1.2994894489778384,55.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,40.0,45.0,45.0,50.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.01,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,7.806074229380199,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,17.017909644933226,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,6.0,6.5,6.5,6.599012700484447,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.5,6.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.034315406660118855,0.04,0.05,1.0,2.0,3.0,4.0,5.0,5.221177911957358});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.034315406660118855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9,1.1,1.2,1.3,1.5,1.5,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8469491643968111,1.3045571102030344,2.2,2.5,3.0,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,20.0,25.0,25.0,25.0,26.97451098928445,30.0,35.0,40.0,45.0,49.10291931707272,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.5050122069252874,8.160853174340843});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9724428236562728,1.0,1.1,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9724428236562728,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9,1.1,1.2,1.3,1.5,1.5,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,2.5,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.034315406660118855,0.04,0.05,0.12421918650107888,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.034315406660118855}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,5.5,7.0,8.1,8.160853174340843,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.1,8.160853174340843}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,3.0,4.0,4.116320447941627,5.5,6.5,6.897666475955764,7.0,8.0,8.5,9.0,11.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,3.0,3.0,5.5,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.28103973290652706,0.8669891442380135,0.9,1.2,1.2994894489778384,1.5,1.5050122069252874,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,45.0,45.0,50.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,6.0,8.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,4.4,4.5,4.6,5.234353973789352,6.665410244529757,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,8.44265458853031,10.0,10.0,12.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.05,1.06,1.07,1.08,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,5.5,5.947417635576787,7.0,8.1,10.0,12.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {6.599012700484447,10.0,15.0,20.0,25.0,30.0,32.696672390862496,35.0,40.0,45.0,50.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {50.0,50.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.0,8.0,10.0,12.0,14.0,14.0,16.382610224991176,18.0,19.576719293639055});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,27.787145135987792});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,8.44265458853031,10.0,12.0,13.788619379218963,14.0,16.0,16.0,27.787145135987792});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,6.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.7865124688376424,2.0,2.1,2.3,2.356960463661484,2.4746384005005804,3.0,3.218109998725394,3.3623458011252803,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.356960463661484}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,3.0,5.5,5.551571029636836,7.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,2.0,4.0,4.0,5.2655100630808445,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,3.0,5.5,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.12421918650107888,1.0,2.2,3.0,5.5,5.551571029636836,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,4.0,6.0,8.0,8.44265458853031,9.822157022781347,10.0,10.0,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0772407046865693,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,8.0,10.0,14.0,14.0,16.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,9.46529267466774,9.46529267466774,10.0,12.0,14.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.46529267466774,9.46529267466774}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.28103973290652706,0.8669891442380135,1.2,1.2994894489778384,1.5,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2994894489778384}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,5.411478708195559,5.411478708195559,6.0,6.0,6.0,6.5,8.0,10.0,11.11260309319111,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.411478708195559,5.411478708195559}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,5.5,7.0,8.1,8.466001202728346,8.95101932968127,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.1,8.466001202728346}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,4.0,5.947417635576787,6.0,8.0,8.44265458853031,12.0,12.418249060121813,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8469491643968111,2.2,2.5,3.0,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.269254657391212,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.02,2.3,3.14159,4.0,6.0,8.0,10.0,14.0,16.767545759200633,17.017909644933226,17.571401589748874,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {8.0,10.0,15.0,20.0,25.0,35.0,40.0,45.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {55.0,55.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,10.0,13.824069802841814,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.4435944565678805,0.01,0.02,0.03,0.05,0.05028614760154865,1.0,2.0,3.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.12421918650107888,1.0,1.818731078819195,2.2,3.0,5.5,5.551571029636836,6.403237256252221});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,1.5,2.5,4.4,4.5,4.6,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,10.0,12.2,15.0,20.0,25.0,25.0,25.0,26.97451098928445,30.0,35.0,40.0,45.0,49.10291931707272,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6560261484277246,2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0,20.0,26.795571288047835});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,6.0,8.0,10.0,14.0,16.0,18.0,18.749468845893265,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,8.0,8.0,8.29697380414211,12.0,14.0,14.0,18.0,20.0,20.42203827416755});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.269254657391212,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.0,6.429181592060958,8.0,8.0,8.29697380414211,12.0,14.0,18.0,20.0,20.42203827416755});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,15.76994730012607,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9662373014773534,1.5,2.5,4.5,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,40.0,45.0,45.0,50.0,50.26009016575274,55.0,59.86524667040781,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,1.0,2.0,3.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,1.02,2.3,4.0,6.0,8.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.327988671440092,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,15.798039725437825,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,1.7865124688376424,4.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,9.417859749600701,10.0,12.0,14.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,12.2,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,4.4,4.5,4.6,4.6,5.234353973789352,6.665410244529757,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.6,4.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.02,3.0,5.5,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,8.1,10.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,1.7865124688376424,4.0,8.0,12.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,8.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.4435944565678805,0.01,0.02,0.03,0.05,0.05028614760154865,2.0,3.0,3.0,4.0,5.0,19.576719293639055});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.4,4.5,4.6,6.665410244529757,25.155142584904603});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.9330272852017845,4.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,4.798779233017978,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,0.04099142839372982,4.0,6.0,6.0,6.209009875631743,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04099142839372982,0.04099142839372982}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,4.0,5.0,7.114467485940238,55.89445078247812});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05028614760154865}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,1.466541278824319,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,4.5,6.0,8.44265458853031,10.0,10.0,10.0,14.0,16.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.4232216344489177,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.0772407046865693,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0772407046865693,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,1.1814576506974284,2.3,4.0,6.0,8.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.1,1.2,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,2.0,4.0,4.0,5.2655100630808445,8.0,10.0,12.0,14.0,16.382610224991176,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,11.0,13.77605677385521,15.798039725437825,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9662373014773534,1.0,2.2,2.5,2.5,2.8599183671220882,5.5,7.0,8.1,10.0,12.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.8599183671220882,3.0,5.5,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.8599183671220882,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.02,6.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.01,0.02,0.03,0.04,0.05,1.0,1.9001113401579832,2.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01,0.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.4,4.4,4.6,4.939076975024989,6.158193327872366,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,9.0,10.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5139198781210071,0.688267766025751,0.9,1.1,1.2,1.2994894489778384,1.5,1.5050122069252874});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.3,1.4,1.5,3.14159});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,3.472532087278931,5.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,8.95101932968127,10.0,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,3.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.1,2.3,2.4,3.0,3.218109998725394,4.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,0.05028614760154865,3.0,4.0,5.0,7.114467485940238,55.89445078247812});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05028614760154865}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,2.8599183671220882,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,10.0,35.0,49.10291931707272});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5139198781210071,0.688267766025751,0.688267766025751,0.9,0.9,1.1,1.2,1.2994894489778384,1.5,1.5050122069252874});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.688267766025751,0.688267766025751}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,1.1814576506974284,1.1814576506974284,2.3,4.0,6.0,8.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1814576506974284,1.1814576506974284}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,8.0,8.165060725213888,10.0,14.0,14.0,16.0,16.0,20.0,20.0,20.0,23.168506393906302});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,1.0,1.01,1.02,1.03,1.04,1.06,1.07,1.0772407046865693,1.09,1.2236675297369042,1.5,3.218109998725394});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.07,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.4,4.5,6.665410244529757,7.114467485940238});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,4.0,5.947417635576787,5.947417635576787,6.0,8.0,8.44265458853031,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,12.2,14.0,14.0,16.0,16.767545759200633,18.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,3.0,4.0,5.0,8.5,15.798039725437825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.2,1.2,1.3,1.5,1.5,1.5,1.5297371940268396,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.924856117004536,-7.924856117004536,-5.5,-1.0,0.0,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.924856117004536,-7.924856117004536}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,6.205105396326149,8.0,10.0,14.0,14.0,16.0,18.0,19.602621522082107,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,1.5,8.269254657391212,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,45.0,45.0,50.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,3.0,5.5,8.466001202728346,8.95101932968127,8.95101932968127,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,18.0,20.0,21.776020048455045});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,4.0,6.0,8.0,10.0,13.824069802841814,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1814576506974284,6.0,8.0,12.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.0,2.1,2.3,3.0,3.218109998725394,3.221514033861171,4.0,4.798779233017978,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,6.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8669891442380135,0.9,1.1,1.1774230759627462,1.2,1.2994894489778384,1.5,1.5050122069252874,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.5,1.5,1.5,1.5,2.5,4.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9,1.0,1.1,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,6.0,8.0,10.0,12.0,14.0,18.0,18.749468845893265,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,3.888075639562932,4.0,4.0767066000694365,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5690704627594818,1.5690704627594818,4.0,6.0,8.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5690704627594818,1.5690704627594818}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,3.218109998725394,4.0,6.0,7.0,7.3360191113939095,8.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0,5.2655100630808445,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {8.1,10.0,15.0,20.0,25.0,35.0,40.0,50.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {55.0,55.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,3.0,4.0767066000694365,5.5,5.5,5.5,5.5,7.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9037214840830983,1.2,1.2,1.3,1.5,1.5,1.5,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.05,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.05,1.0,1.0962359918452567,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,3.218109998725394,4.0,6.0,7.0,7.3360191113939095,8.0,8.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,4.349151293837573,6.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,18.0,20.0,20.0,20.0,26.229273556591572});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9037214840830983,1.2,1.2,1.3,1.5,1.5,1.5,1.818731078819195,15.0,15.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,20.0,20.0,20.0,20.0,20.187288588389958});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,2.0895046761278855,6.0,6.0,8.0,8.0,8.92786079014893,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,3.0,5.5,8.1,10.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.2,1.3,1.5,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.943395611525982,1.0,1.1,1.2,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.943395611525982}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.5,1.5,1.5,1.5,1.5,2.5,4.5,4.5,5.473257313004003});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,10.0,13.262375674219438,14.0,14.0,16.0,18.0,18.436316131164133,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,9.91722512272562,10.0,12.0,14.0,16.0,16.0,16.382610224991176,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.07,1.1,1.1,1.2,1.3,1.5,5.0,39.332502120913084});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,4.0,6.0,6.0,8.0,12.0,14.0,18.0,18.749468845893265,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.8856343453453412,4.0,4.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,18.129628808825963,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.0,2.0,3.957403606421238,4.0,4.5,8.44265458853031,10.0,12.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.6666213882097827,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,2.0,3.0,4.0,4.0,4.394299899024294,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.116320447941627,6.0,6.0,8.0,8.44265458853031,10.0,10.0,10.0,14.0,14.418547049602209,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,6.0,8.0,10.0,14.0,14.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9,1.0,1.1,1.3,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8669891442380135,0.9,1.02,1.2,1.2994894489778384,1.3863619602788184,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8669891442380135,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,10.0,12.2,15.0,20.0,25.0,25.0,25.0,26.97451098928445,30.0,35.0,35.0,40.0,45.0,49.10291931707272,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.06,1.0772407046865693,1.09,1.0955579192553242,1.4,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.6184885915334304,1.02,2.9330272852017845,4.0,8.0,10.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6455807679446233,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,8.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8669891442380135,1.2994894489778384,1.5,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2994894489778384,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.04,2.2,3.0,5.5,8.1,12.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.1924738153692487,2.2,3.0,4.45315095513391,5.280495862081772,5.5,10.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.3,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,1.1,2.0,3.0,3.888075639562932,4.0,4.0767066000694365,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.0,8.5,9.0,10.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,1.0,3.0,4.0,5.0,8.5,15.798039725437825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.8856343453453412,4.0,4.0,8.0,10.0,10.116257863367483,12.0,14.0,16.382610224991176,18.0,18.129628808825963,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.05,1.05,1.06,1.07,1.08,1.09,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,2.0895046761278855,6.0,6.0,8.0,8.0,8.92786079014893,12.0,14.0,14.0,18.0,20.0,25.155142584904603});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.01,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.806074229380199,8.0,8.5,9.0,11.0,13.064576749502223,20.0,45.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {6.599012700484447,6.599012700484447,10.0,15.0,20.0,25.155142584904603,30.0,32.696672390862496,35.0,39.332502120913084,40.0,45.0,50.0,55.0,55.89445078247812,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.599012700484447,6.599012700484447}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,16.0,16.767545759200633,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,5.5,5.947417635576787,5.947417635576787,7.0,8.1,10.0,12.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,7.475004333922216,8.0,10.0,10.0,10.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,3.0,5.0,8.5,15.798039725437825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,14.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.3,1.5,1.5,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-7.0,1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,2.3,2.8618583668856092,6.0,8.0,9.267942797567402,10.0,14.0,14.0,16.0,16.767545759200633,18.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.4232216344489177,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.0772407046865693,1.0772407046865693,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0772407046865693,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,7.499866250660795,9.53381250714651,10.0,12.2,15.0,20.0,25.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.53381250714651,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.02,3.14159,4.0,6.0,8.0,10.0,14.0,16.767545759200633,17.017909644933226,17.571401589748874,18.0,19.806219144943235,20.0,20.6630094716787});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {19.806219144943235,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,3.0,5.5,8.1,8.1,8.1,10.0,12.0,14.161005217271027});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,12.0,14.0,16.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,6.0,10.0,14.0,16.0,18.0,18.749468845893265,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.0772407046865693,4.0,6.0,6.5,6.822814323950394,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,40.0,45.0,45.0,50.0,50.0,50.0,50.26009016575274,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,3.0,3.0,4.0767066000694365,5.5,5.5,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,3.0,5.5,8.466001202728346,8.95101932968127,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.6184885915334304,1.1,1.5,4.6,4.939076975024989,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.6,4.939076975024989}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,1.3045571102030344,2.0,2.5,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,8.0,8.5,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.047547201476359824,2.2,3.0,5.5,5.551571029636836,5.551571029636836,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.551571029636836,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.28103973290652706,0.8669891442380135,0.9,1.2,1.2994894489778384,1.5050122069252874,1.7604712793484323,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8669891442380135,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.2,2.5,5.5,7.0,8.1,10.0,12.0,12.418249060121813});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,11.899754514324702,12.0,16.0,16.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6455807679446233,1.9788644804016007,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.6455807679446233,1.9788644804016007}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.5,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.0,8.44265458853031,10.0,10.0,10.0,12.0,12.0,14.0,16.0,16.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {18.0,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,2.3,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,27.787145135987792});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.3,2.3,2.4,4.0,4.0,6.0,8.0,10.0,14.0,14.0,16.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.5297371940268396,1.6560261484277246,2.0,2.0,4.0,6.0,8.0,8.44265458853031,9.822157022781347,10.0,10.0,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.02,2.3,3.14159,4.0,6.0,8.0,10.0,14.0,16.767545759200633,17.017909644933226,17.571401589748874,18.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {18.0,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,6.0,8.0,11.207230408564428,12.0,14.0,18.0,18.749468845893265,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {12.2,20.0,25.0,30.0,30.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {30.0,30.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.6666213882097827,0.02,0.03,0.04,0.05,0.05028614760154865,1.0,1.0,2.0,3.0,3.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,2.4746384005005804,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.4746384005005804}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05028614760154865,3.0,4.0,4.0,5.0,7.114467485940238,18.0,56.85662291559699});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.01,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.806074229380199,7.806074229380199,8.0,8.5,9.0,11.0,13.064576749502223,20.0,45.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3863619602788184,2.0895046761278855,4.0767066000694365,6.0,6.0,10.0,14.0,16.0,18.0,18.749468845893265,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.08,1.5297371940268396,1.6560261484277246,2.0,2.0,4.0,6.0,7.0820683754231695,8.44265458853031,9.822157022781347,10.0,10.0,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,8.44265458853031,9.53381250714651,10.0,10.0,12.2,15.0,20.0,25.0,25.0,26.97451098928445,30.0,35.0,35.0,40.0,45.0,49.10291931707272,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,6.0,7.114467485940238,8.0,10.0,16.0,18.0,19.72261389713443,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.349151293837573,6.0,8.0,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.0,2.0,3.546654362764467,4.0,4.5,6.029698420802205,6.029698420802205,8.44265458853031,9.417859749600701,10.0,12.0,14.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,6.0,8.0,8.44265458853031,10.0,10.0,10.0,12.0,14.0,14.418547049602209,16.0,18.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,14.0,15.76994730012607,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0082030251683296,3.0,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0082030251683296,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.02,2.3,3.14159,3.15574335268653,4.0,6.0,6.927259205596625,8.0,10.0,14.0,16.767545759200633,17.017909644933226,17.571401589748874,18.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {18.0,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.0772407046865693,1.09,1.5,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0772407046865693,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,4.4,4.5,4.6,4.6,5.234353973789352,6.665410244529757,25.0,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.6,4.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.05,1.06,1.06,1.0772407046865693,1.09,1.0955579192553242,1.4,1.5039503277778656,4.180523818260757,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.2,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,2.8618583668856092,3.0,4.0,5.0,5.5,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.0,8.160853174340843,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.5,6.599012700484447}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.234353973789352,5.5,5.5,6.0,6.5,6.5,6.599012700484447,7.0,7.5,8.269254657391212,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.7604712793484323,2.0,4.0,6.0,6.0,8.0,10.0,12.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,16.0,16.767545759200633,17.017909644933226,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.7865124688376424,2.0,2.1,2.3,2.4,2.4746384005005804,3.0,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.8469491643968111,2.0,2.8618583668856092,3.0,4.0,5.0,5.5,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.0,8.160853174340843,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0082030251683296,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,2.0082030251683296}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,9.0,10.0,11.0,20.122031404033642});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.5,3.0,3.0,4.0767066000694365,5.5,5.5,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.3,2.4,2.4,2.8599183671220882,3.0,3.218109998725394,4.0,5.0,6.0,7.0,8.0,10.0,35.0,49.10291931707272});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.4,2.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,2.2,3.0,5.5,8.1,10.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.047547201476359824,0.047547201476359824,1.0,2.2,2.5,3.0,5.5,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.047547201476359824,0.047547201476359824}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.4435944565678805,0.01,0.01,0.02,0.03,0.05,0.05028614760154865,3.0,3.0,4.0,5.846567632615504,19.576719293639055});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01,0.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.9330272852017845,4.0,8.0,10.0,13.064576749502223,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.04,1.9399653370329437,2.2,2.2,3.0,5.5,8.1,12.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04099142839372982,1.01,4.0,6.0,6.0,6.5,8.0,8.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,8.44265458853031,8.536569059145345,10.0,10.0,12.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,4.0,5.0,5.5,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,9.0,10.0,11.0,19.687269573467056});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.02,2.3,2.3,3.14159,3.15574335268653,4.0,6.0,6.927259205596625,8.0,10.0,14.0,16.767545759200633,17.017909644933226,17.571401589748874,18.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,4.4,4.6,5.234353973789352,6.665410244529757,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.6}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,2.2,2.5,3.0,3.0,5.947417635576787,7.0,8.1,10.0,10.993269956834816,12.0,26.229273556591572});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,3.0,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,8.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.2191751894779});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {6.599012700484447,6.599012700484447,10.0,15.0,25.155142584904603,30.0,32.696672390862496,35.0,39.332502120913084,40.0,45.0,50.0,55.0,55.89445078247812,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.599012700484447,6.599012700484447}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,2.5,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,14.0,14.0,16.0,16.767545759200633,17.53373065895191,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.03,1.04,1.05,1.05,1.06,1.07,1.08,1.09,1.3756762743992506,1.5050122069252874,8.160853174340843});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,25.0,30.0,35.0,35.0,40.0,45.0,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,5.551571029636836,7.0,8.1,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.6560261484277246,2.0,2.0,2.5,4.0,6.0,8.0,8.0,8.44265458853031,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,1.220256107767016,2.2,3.0,5.5,8.1,10.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,9.46529267466774,10.0,11.142506383321514,12.0,14.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.46529267466774,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.5,3.0,3.0,5.5,8.466001202728346,8.95101932968127,10.0,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.03,1.04,1.05,1.05,1.06,1.07,1.08,1.09,1.1774230759627462,1.3756762743992506,8.160853174340843});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02299168798800066,0.04099142839372982,4.0,6.0,6.0,10.0,14.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.0772407046865693,1.3,1.4,1.5,1.5739280052557727,3.14159});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5739280052557727}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,5.5,5.5,5.5,7.0,8.1,8.1,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2,1.2,1.2994894489778384});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.12421918650107888,1.0,2.2,3.0,5.5,5.551571029636836,7.0,19.806219144943235});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.551571029636836}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.2,1.3,1.5,1.5,1.5,1.818731078819195,6.5,19.806219144943235});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.04,0.05,1.0,3.0,4.0,4.0,5.0,26.229273556591572});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,1.1924738153692487,2.0,2.0,4.5,6.029698420802205,8.44265458853031,9.417859749600701,10.0,12.0,14.0,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.5,6.029698420802205,8.44265458853031,8.44265458853031,10.0,12.0,13.788619379218963,14.0,16.0,16.0,27.787145135987792});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.44265458853031,8.44265458853031}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,2.3,4.0,6.0,8.0,10.0,14.0,16.0,16.767545759200633,17.017909644933226,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,4.5,6.0,8.44265458853031,10.0,10.0,10.0,10.340582780598625,14.0,16.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,3.0,4.0,4.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.04,1.05,1.06,1.06,1.0772407046865693,1.09,1.0955579192553242,1.4,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.6560261484277246,1.8674194929061803,2.0,2.0,4.0,5.947417635576787,5.947417635576787,6.0,8.0,8.44265458853031,12.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,30.0,35.0,40.0,40.0,40.0,45.0,50.0,50.26009016575274,55.0,60.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.07,2.0,3.2272923514971583,4.0,4.0,5.2655100630808445,10.0,12.0,14.0,14.89821624719136,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,10.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.5050122069252874,8.160853174340843});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.02,1.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,2.0,4.0,4.056125258588345,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,2.5,3.0,3.0,4.0767066000694365,5.5,5.5,5.5,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,12.0,14.0,15.76994730012607,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,2.2,3.0,5.5,8.1,10.0,10.0,13.824069802841814});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.158193327872366,8.0,10.0,14.0,16.0,16.767545759200633,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.158193327872366}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,1.5,9.53381250714651,10.0,10.0,12.2,15.0,20.0,25.0,25.0,25.0,26.97451098928445,30.0,35.0,40.0,45.0,49.10291931707272,50.0,55.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0,4.0,5.2655100630808445,8.0,10.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.05,1.05,1.06,1.06,1.0772407046865693,1.09,1.0955579192553242,1.4,1.5039503277778656,4.180523818260757,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.2,1.3,1.5,1.5,1.5,1.818731078819195,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.8286805027884407,2.0,4.0,6.0,8.0,8.44265458853031,10.0,10.0,12.0,14.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.08,1.5297371940268396,1.6560261484277246,2.0,2.0,2.0,4.0,6.0,8.0,8.44265458853031,8.841367869022669,9.822157022781347,10.0,10.0,14.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,3.0,3.0,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,2.0,4.0,6.0,7.499866250660795,8.0,8.44265458853031,10.0,10.0,14.0,14.418547049602209,14.926417551298215,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9,1.0,1.1,1.3,1.3,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,2.5,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,7.5,8.0,8.5,9.0,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.5,1.5,1.5,1.5,1.5,3.4324193164878443,4.5,4.5,5.473257313004003});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.04,2.2,5.5,8.1,12.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,3.957403606421238,3.957403606421238,4.0,4.0,10.0,12.0,14.0,16.382610224991176,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.957403606421238,3.957403606421238}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,0.9,1.0,1.1,1.4,1.5,15.798039725437825});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0,5.2655100630808445,8.0,12.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,12.908111205033855,14.0,16.0,16.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,2.5,4.4,4.5,6.665410244529757,6.665410244529757,6.665410244529757,7.114467485940238});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.665410244529757,6.665410244529757}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.5,1.5,1.5,1.5,1.5,1.5,3.4324193164878443,4.5,4.5,5.473257313004003});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,8.44265458853031,10.0,12.0,13.788619379218963,14.0,14.0,16.0,16.0,27.787145135987792});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.5,1.1638488635239006,1.5,4.4,4.6,5.234353973789352,6.665410244529757,25.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5,0.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.03,0.04,0.05028614760154865,3.0,4.0,4.0,5.0,7.114467485940238,18.0,56.85662291559699});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.2,2.5,3.0,3.0,5.947417635576787,7.0,8.1,9.417859749600701,10.0,10.993269956834816,12.0,12.0,26.229273556591572});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.04,1.05,1.06,1.07,1.08,1.09,1.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.04,1.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-7.0,1.02,2.3,4.0,6.0,8.0,10.0,14.0,14.0,18.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5690704627594818,3.291287160121577,4.0,6.0,8.0,10.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.3,2.2,2.5,3.0,7.0,8.1,10.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,8.740097409064042,9.0,10.0,11.0,15.798039725437825,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0772407046865693,1.3,1.4,1.4361047634988706,1.5,1.5739280052557727,1.5739280052557727});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5739280052557727,1.5739280052557727}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.05,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,3.957403606421238,3.957403606421238,4.0,4.0,10.0,12.0,14.0,16.382610224991176,16.382610224991176,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.957403606421238,3.957403606421238}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.8856343453453412,2.8856343453453412,4.0,4.0,8.0,10.0,12.0,14.0,16.382610224991176,18.129628808825963,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.8856343453453412,2.8856343453453412}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0955579192553242,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,10.0,12.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,4.0,5.2655100630808445,10.0,12.0,14.0,16.229365343481472,16.382610224991176,18.0,19.387299294011015});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,10.330189950938697,15.0,20.0,25.0,25.0,30.0,35.0,40.0,40.0,45.0,45.0,50.0,50.26009016575274,55.0,59.86524667040781,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.02,2.3,4.0,6.0,8.0,10.0,14.0,16.0,16.767545759200633,17.017909644933226,18.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.01,1.04,1.05,1.06,1.06,1.0772407046865693,1.09,1.0955579192553242,1.4,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,2.5,4.4,4.5,4.6,25.155142584904603});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.9,1.0,1.1,1.4,1.5,1.6723797579915873,3.14159,20.122031404033642});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,1.0,1.01,1.02,1.03,1.04,1.06,1.06,1.07,1.0772407046865693,1.09,1.2236675297369042,1.5,4.070661459029383});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,6.0,6.0,8.0,8.44265458853031,10.0,10.0,10.0,12.0,12.0,14.418547049602209,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.28103973290652706,0.8669891442380135,1.2,1.2994894489778384,1.5,1.5050122069252874,6.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5050122069252874}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9659281536235542,1.0,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.09,1.5,9.46529267466774});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,0.9662373014773534,1.5,2.5,4.5,4.5,4.5,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.4232216344489177,0.943395611525982,0.9659281536235542,1.0,1.01,1.02,1.03,1.06,1.07,1.0772407046865693,1.0772407046865693,1.0772407046865693,1.09,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0772407046865693,1.0772407046865693}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.4435944565678805,0.01,0.01,0.02,0.03,0.05,0.05028614760154865,3.0,3.0,4.0,5.846567632615504,12.2,19.576719293639055,19.576719293639055});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01,0.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.047547201476359824,0.5,0.5139198781210071,3.0,4.0,5.0,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,9.0,11.0,13.77605677385521,15.798039725437825,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.07,6.0,8.0,10.0,14.0,15.798039725437825,18.0,20.0,20.0,50.26009016575274});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,3.472532087278931,5.0,5.0,5.068014067992758,5.5,5.5,6.0,6.5,6.599012700484447,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,2.0,3.0,5.0,5.5,5.5,6.5,6.599012700484447,7.0,7.5,8.0,9.0,10.0,11.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.3045571102030344,4.0,6.5530082212075165,8.0,8.0,12.0,14.0,14.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.5,9.53381250714651,10.0,12.2,15.0,20.0,25.0,25.0,30.0,35.0,35.77435826950429,38.06805732654565,40.0,45.0,45.0,50.0,50.26009016575274,55.0,59.86524667040781,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,2.0,4.0,4.0,5.2655100630808445,8.0,10.0,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.8674194929061803,2.0,2.0,4.0,4.5,5.866713664639396,6.029698420802205,8.44265458853031,10.0,12.0,14.0,15.798039725437825,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.0369514424863993,1.04,1.05,1.06,1.06,1.0955579192553242,1.4,1.6199722074463931,7.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.02,3.0,5.5,10.0,10.993269956834816});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.466541278824319,6.599012700484447,10.0,15.0,20.0,25.0,25.0,30.0,32.696672390862496,35.0,40.0,45.0,50.0,50.0,55.0,55.0,55.0,68.29873194324149});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {25.0,25.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {4.0,6.0,6.0,8.0,10.0,12.0,14.0,15.773751428593222,18.0,18.749468845893265,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,8.44265458853031,10.0,12.0,13.788619379218963,14.0,14.0,16.0,16.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5,0.5139198781210071,2.0,3.0,4.0,5.0,5.234353973789352,5.5,5.668034240494638,6.0,6.293798665928614,6.5,6.5,6.599012700484447,7.0,8.269254657391212,10.0,11.0,13.024100136084627,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.5,6.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.030513371238777,2.3,2.3,2.4,4.0,4.0,6.0,8.0,10.0,14.0,14.0,16.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.3,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.0,10.0,11.935743997019085,14.0,16.382610224991176,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.0,4.0,4.5,4.5,6.0,8.0,8.44265458853031,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.8197650718991247,2.0,2.0,4.0,4.5,6.029698420802205,8.44265458853031,10.0,12.0,14.0,15.76994730012607,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.04,0.05028614760154865,0.688267766025751,1.0,2.0,2.356960463661484,3.0,4.0,5.0,7.114467485940238,55.89445078247812});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.05028614760154865}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.158193327872366,8.0,10.0,13.406348657660198,14.0,16.0,16.767545759200633,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.158193327872366}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,2.0,4.0,6.0,6.429181592060958,8.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.429181592060958}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.8398837533018846,2.0,2.0,4.0,4.5,8.44265458853031,8.536569059145345,10.0,10.0,10.0,12.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.9330272852017845,4.0,8.0,10.0,13.064576749502223,14.0,14.0,16.0,16.767545759200633,18.0,20.0,20.0,20.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {14.0,14.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,4.0,4.116320447941627,5.5,6.5,6.897666475955764,7.0,8.0,8.5,9.0,9.0,11.0,16.382610224991176,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {9.0,9.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.5,0.9,1.2,1.3,1.5,1.5,1.5,1.5297371940268396,1.818731078819195});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.00000000001});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.00000000001}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,3.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,100000.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.0,1.0,1.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1,1.1,1.1,1.1,1.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,3.0,4.0,5.0,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-5.0,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2345678901234567,1.2345678901234567});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2345678901234567,1.2345678901234567}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-5.5,-1.0,0.0,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-5.5,-5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,8.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.8,1.0,2.0,3.0,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,2.0,3.0,4.0,5.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,2.5,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,0.0,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-1.0,0.0,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-18.08893288433498,-10.0,-7.0,-5.5,-1.0,0.0,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,2.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.4,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,2.0,4.0,6.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-14.423047706741098,-10.0,-7.0,-5.5,-1.0,0.0,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,6.5,7.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-7.0,-5.5,-5.5,-1.0,0.0,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.4,1.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-7.0,-5.5,-5.5,-0.06417416146671462,0.0,0.05,3.14159,8.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.4716414801909106,1.5,2.5,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4716414801909106,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.01,2.0,4.0,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0994458133327332,1.2,1.3,1.3,1.4,1.5,3.0269522005016203});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.3,1.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.01,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,6.5,7.0,10.0,14.0,14.855086127504585,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.1,1.2,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,0.0,2.9986354234031958,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-20.0,-20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,12.965034001269252,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.8744951186522565,6.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5758086456077687,1.0,1.01,1.02,1.05,1.06,1.06,1.07,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.01250861301074531,0.02,0.03,0.04,0.05,1.0,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01,0.01250861301074531}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,16.00311047108897,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,4.0,6.0,6.0,7.0,8.0,10.0,10.0,12.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,6.0,8.0,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,0.0,3.14159,3.14159,8.0,12.345,30.0,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.4,1.4,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.0,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.06,1.1,1.2,1.2,1.3,1.4,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,4.0,6.0,7.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,14.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5758086456077687,1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-96,-3,53});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-3,53}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,4.0,4.0,6.0,6.5,7.0,10.0,14.0,14.855086127504585,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,6.5,7.0,10.0,12.2,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,0.8,2.0,3.0,4.0,5.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,6.0,7.0,7.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,5.5,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,3.0,4.0,5.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,5.5,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,3.5,4.0,6.0,6.5,7.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.5,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0,1.06,1.1,1.2,1.2,1.3,1.4,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.2,4.0,6.0,8.0,10.0,12.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5712739898819572,0.5758086456077687,0.6805533190435746,1.0,1.01,1.02,1.03,1.04,1.05,1.07});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5712739898819572,0.5758086456077687}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0,20.56256902148515,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,0.8,0.9,1.0,1.1,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,3.5541497590785474,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,8.0,8.5,9.589021834286934,10.0,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5712739898819572,2.0,4.0,6.0,8.0,9.538323525972185,10.0,12.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {18.0,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,4.0,6.0,7.0,7.0,10.0,10.0,12.0,14.0,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,1.5,2.5,2.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,16.0,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,8.0,10.0,14.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.05,1.2,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.01250861301074531,0.02,0.03,0.04,0.05,1.0,1.09,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.01,0.01250861301074531}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,2.0,4.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {15.303486822725638,15.303486822725638}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,3.0,3.0,4.0,5.0,5.5,6.5,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.1,1.2,1.3,1.5,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,0.8,2.0,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,4.0,4.0,6.0,6.5,7.0,10.0,14.0,14.855086127504585,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,1.0,1.01,1.02,1.03,1.04,1.05,1.07,1.09,2.3,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.6073110979187053,4.4,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.022622611806456354,0.03,0.05,1.0,1.1269746014414654,2.0,3.0,4.0,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.022622611806456354}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {10.0,12.2,15.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,55.0,59.84586734141382,59.84586734141382});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {59.84586734141382,59.84586734141382}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,3.159662147541001,6.0,7.0,8.0,10.0,14.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.06144179097710181,1.6073110979187053,4.4,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,9.538323525972185,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,4.0,6.0,6.714969366390512,7.0,10.0,10.0,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.09,1.09}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,10.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0229659469356465,6.0,8.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0229659469356465}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.01,2.0,4.0,6.0,8.5,9.0,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.04,1.05,1.06,1.07,1.08,1.09,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.04,1.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.2,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.61577318250191,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,2.0,4.0,6.0,8.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,5.8744951186522565,6.0,7.0,7.0,8.0,8.0,10.0,14.0,16.0,18.0,20.0,40.0,59.84586734141382});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0994458133327332,2.0,6.0,7.0,7.0,8.0,8.0,10.0,11.290230065355765,14.0,16.0,18.0,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0,1.1,1.2,1.2,1.3,1.4,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5415097875278347,0.8,0.9,1.05,1.1,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.0,8.5,9.0,9.146514817612198,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,16.0,17.737539738329957,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,7.282214606279208,10.0,10.0,11.697133369832247,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.03,0.04,0.5758086456077687,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-5.5,-1.0,0.0,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-5.5,-5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.0229659469356465,6.0,8.0,12.0,12.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,6.0,7.0,7.0,7.0,8.0,10.0,10.0,11.693705971213628,14.0,16.0,18.0,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.8,1.0,2.0,3.0,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,-7.0,-5.5,-1.0,0.0,3.14159,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.03,2.0,4.0,7.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.03,0.04,0.5758086456077687,1.01,1.02,1.03,1.04,1.05,1.06,1.09,9.538323525972185});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.03,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,4.0,6.0,7.0,8.0,10.0,10.0,10.0,12.0,16.0,17.737539738329957,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,2.0,3.0,3.0,4.0,5.0,5.5,6.5,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,0.8,0.8345159491263733,1.0,1.1,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8345159491263733}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0994458133327332,2.0,6.0,7.0,7.0,8.0,8.0,10.0,11.030069920319809,11.290230065355765,14.0,16.0,18.0,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,11.697133369832247,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {11.697133369832247,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,2.0,3.0,4.0,5.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,7.0,8.0,10.0,14.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.05,1.1,1.2,1.3,1.5,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,6.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.06,4.0,6.0,6.5,7.0,10.0,10.0,12.2,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.701501440579012,7.0,10.0,10.0,12.0,14.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,4.0,6.0,7.0,8.0,10.0,10.0,12.0,16.0,17.737539738329957,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,-0.0938649548441084,0.0,2.9986354234031958,3.14159,3.14159,8.0,12.345,14.0,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-20.0,-20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.701501440579012,10.0,10.0,12.0,14.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,6.5,8.0,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.06144179097710181,1.6073110979187053,4.4,4.4,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.06144179097710181,0.9368100559625199,0.9368100559625199,1.6073110979187053,4.4,4.4,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9368100559625199,0.9368100559625199}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5758086456077687,1.0,1.01,1.05,1.06,1.06,1.07,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.05,0.5758086456077687,1.0,1.01,1.05,1.06,1.06,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.06,1.06}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,3.5541497590785474,4.4,4.5,4.6,5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,2.3,4.0,4.0,6.0,8.0,10.0,10.0,12.0,14.0,16.0,16.0,18.0,19.805644956157728});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.03,4.0,7.0,7.0,8.0,10.0,10.0,14.0,14.0,16.0,18.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,4.4,8.0,8.0,12.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,14.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.3561918525384038,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,18.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,1.0,1.02,1.03,1.04,1.05,1.06,1.07,1.09,2.3,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.02,1.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-1.0,0.0,3.0269522005016203,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0269522005016203,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,2.0,3.0,4.0,5.0,5.61577318250191,6.5,7.0,7.5,8.0,8.5,9.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,4.0,6.0,6.714969366390512,7.0,10.0,10.0,14.0,16.0,19.798932046638598,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5,1.5,3.5541497590785474,4.212440367134072,4.4,4.5,4.6,5.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.4716414801909106,1.5,2.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,30.17228227492222});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.04,1.05,1.05,1.06,1.07,1.08,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,0.0,4.0,6.0,7.0,8.0,9.146514817612198,10.0,10.0,12.0,16.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5758086456077687,1.0,1.01,1.01,1.05,1.06,1.06,1.07,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,5.8744951186522565,5.8744951186522565,6.0,7.0,8.0,8.0,10.0,14.0,16.0,18.0,20.0,40.0,59.84586734141382});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.8744951186522565,5.8744951186522565}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.8744951186522565,6.0,8.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.05,2.0,4.0,5.5,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5712739898819572,2.0,4.0,6.0,8.0,9.538323525972185,10.0,12.0,12.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,4.0,6.0,6.0,7.0,8.0,10.0,11.0,12.0,14.0,16.0,16.00311047108897,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,3.0,4.0,5.0,16.0,20.443252094871035});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.03}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,9.538323525972185,11.0,12.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {11.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,6.5,8.0,8.5,10.0,10.0,11.290230065355765,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.05,0.8,6.0,6.5,7.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,16.0,18.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.4716414801909106,1.5,2.5,4.4,4.5,4.6,5.92226678224185});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.4716414801909106,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,12.965034001269252,20.58758307748205});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.2,1.2,1.2,1.4,1.5,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.61577318250191,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-5.5,0.0,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-5.5,-5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,9.538323525972185,10.0,12.0,12.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,5.8744951186522565,5.8744951186522565,6.0,7.0,8.0,8.0,10.0,14.0,16.0,18.0,20.0,40.0,60.35249699488476});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.8744951186522565,5.8744951186522565}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01250861301074531,0.04,2.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {15.303486822725638,15.303486822725638}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.21793066808776018,1.01,2.0,4.0,5.61577318250191,6.0,8.5,9.0,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,15.722587027895802,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.2747322526795788,1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.09,1.09}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.111529158986113,1.2,1.2,1.2,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.21793066808776018,1.01,2.0,2.1,4.0,5.61577318250191,6.0,8.5,9.0,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,15.722587027895802,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,14.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.04,4.0,6.0,7.0,8.0,10.0,10.0,10.0,12.0,16.0,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,3.5,4.4,4.4,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.06,2.0,4.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.06,2.0,4.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,16.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.6,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,14.16179769990585,15.303486822725638,16.0,16.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,4.0,6.0,6.714969366390512,7.0,9.729758978205926,10.0,14.0,16.0,19.798932046638598,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,4.0229659469356465,8.0,8.5,9.589021834286934,10.0,10.0,10.0,12.0,14.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,55.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.111529158986113,1.2,1.2,1.2,1.4,1.5,1.5,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,1.7748618325074756,2.0,3.0,4.0,5.0,5.61577318250191,6.5,7.0,8.0,8.5,9.0,9.538323525972185,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,8.0,12.345,14.16179769990585,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,2.0,3.0,4.0,5.0,5.61577318250191,6.5,7.5,8.0,8.5,8.5,9.0,9.929567956225537,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.5,8.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5712739898819572,2.0,4.0,6.0,8.0,9.538323525972185,10.0,10.0,12.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.111529158986113,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,8.0,10.0,10.0,14.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5632953387482663,0.5632953387482663,0.8,4.0,6.5,7.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.5632953387482663,0.5632953387482663}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.21793066808776018,1.01,2.0,2.1,4.0,5.61577318250191,6.0,8.5,9.0,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,15.722587027895802,16.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,6.0,8.0,10.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,13.419140471954321,14.0,15.303486822725638,16.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01250861301074531,0.016952550727578522,0.04,2.0,5.8744951186522565,6.0,8.0,8.5,8.5,10.0,12.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.5,8.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.111529158986113,1.2,1.2,1.2,1.2,1.4,1.5,1.5,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.06,2.0,2.0,4.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,2.5,2.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.5,2.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.5,6.0,8.0,10.0,12.0,14.16179769990585,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.5,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,4.125317976404242,4.4,8.0,8.0,8.996746373653892,12.345,12.965034001269252,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,12.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.0821671281626561,1.2,1.2,1.2,1.4,1.5,2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.05,0.07168518646226235,0.5,1.5,3.5,4.4});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.07168518646226235}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.5,6.0,8.0,9.85192697433108,10.0,12.0,12.0,12.0,14.16179769990585,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-10.0,-7.0,-5.5,0.0,3.14159,3.14159,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-10.0,-10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.03,2.0,4.0,6.0,8.0,8.5,10.0,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,7.5,8.0,10.0,10.0,14.0,16.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.8,0.9,1.0,1.111529158986113,1.2,1.2,1.2,1.2,1.2,1.338773099099953,1.4,1.5,1.5,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,3.159662147541001,7.0,8.0,10.0,14.0,17.737539738329957,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {17.737539738329957,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.6,6.0,8.0,8.5,10.0,12.0,14.0,14.16179769990585,15.303486822725638,16.0,16.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.6,6.0,8.0,8.5,10.0,12.0,14.0,14.16179769990585,15.303486822725638,15.303486822725638,16.0,16.0,18.0,20.0,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {15.303486822725638,15.303486822725638}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.02,2.0,2.2491103932861414,3.159662147541001,7.0,8.0,10.0,14.0,17.737539738329957,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,2.0,3.0,4.0,5.0,5.5,6.5,7.0,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.06,2.0,4.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {15.303486822725638,15.303486822725638}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,4.5,6.0,8.0,12.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,0.8,0.8345159491263733,1.0,1.1,1.1,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.111529158986113,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,0.9,1.0,1.02,1.1,1.2,1.2,1.3,1.4,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.61577318250191,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,8.0,9.662066208660672,12.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.345}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,-0.8451952774545579,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,30.17228227492222});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,4.4,8.0,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.8,1.0,2.0,3.0,4.0,5.5,6.0,6.5,7.0,8.0,8.5,9.0,11.0,15.722587027895802,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.3561918525384038,0.8,1.0,1.1,1.1,1.2,1.2,1.3,1.4,1.4,1.4,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.1269746014414654,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,5.839067476181994,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5415097875278347,0.8,0.9,1.05,1.1,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.02,1.1,1.2,1.2078775689231043,1.3,1.5,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2078775689231043}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,6.0,7.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-1.0,0.0,3.14159,3.14159,8.0,9.589021834286934,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.06,1.4716414801909106,2.5,4.4,4.4,4.5,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,0.8,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.04,0.05,1.0,3.0,4.0,5.0,16.0,20.443252094871035});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,4.0,6.0,6.0,7.0,8.0,10.0,10.0,12.0,14.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.05,4.4,4.5,4.6,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.04,1.05,1.05,1.06,1.08,1.09,1.6073110979187053});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,4.4,8.0,12.345,30.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.21793066808776018,1.01,2.0,2.1,4.0,5.61577318250191,6.0,8.5,9.0,9.589021834286934,10.0,10.0,12.0,12.0,12.0,14.0,15.303486822725638,15.722587027895802,16.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,1.0,1.01,1.02,1.03,1.04,1.05,1.07,1.09,2.3,19.3401788856025,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {19.3401788856025,19.3401788856025}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,6.0,7.0,8.0,10.0,10.0,14.0,14.451903901388377,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,0.02,2.0,2.2491103932861414,3.159662147541001,7.0,8.0,8.0,10.0,14.0,17.737539738329957,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.02,0.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,1.6073110979187053,2.0,3.0,4.0,5.0,5.61577318250191,6.5,7.0,7.5,8.0,8.5,9.0,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,2.0,4.0,6.0,7.0,8.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,3.14159,4.4,8.0,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-9.98565761369873,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,12.965034001269252,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.0,1.0,1.1269746014414654,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,5.839067476181994,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,4.0,6.0,7.0,8.0,10.0,10.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.5,9.0,10.0,14.0,20.0,20.0,20.56256902148515});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {20.0,20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.022622611806456354,2.0,4.0,6.0,7.0,10.0,10.0,12.0,14.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.0,1.3,2.0,3.0,4.0,5.0,5.177724132812417,5.61577318250191,6.0,6.5,7.5,8.0,8.0,9.0,10.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,7.0,7.282214606279208,10.0,10.0,10.0,11.697133369832247,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,2.0,2.1,2.2,2.3,2.4,2.5,3.0,3.5,4.0,5.0,6.0,7.0,8.0,9.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2,2.3}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.06,1.4716414801909106,2.5,4.4,4.4,4.5,4.6,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,7.0,7.0,8.0,10.0,14.0,16.0,17.15657241220536,20.0,23.462202369042487,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,10.0,12.0,12.345,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {12.0,12.345}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.04,1.05,1.06,1.07,1.08,1.09,1.4302724918976677});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.04,1.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.05,1.0,4.0,5.0,5.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0,5.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,1.141769393086327,2.0,2.0957837440905673,4.0,6.0,7.0,7.5,8.0,10.0,10.0,14.0,16.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.111529158986113,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,6.5,7.0,7.5,8.0,8.5,9.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0994458133327332,2.0,5.839067476181994,6.0,7.0,7.0,8.0,8.0,10.0,11.030069920319809,11.290230065355765,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0,1.1,1.2,1.2,1.2,1.3,1.4,1.4,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.05,4.272365978237809,4.4,4.6,6.5,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.3,1.4,1.4,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,1.0821671281626561,2.0,2.0,4.0,6.0,7.0,8.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.06,4.0,6.0,6.5,7.0,10.0,10.0,10.164258174640661,12.2,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.9368100559625199,1.0,1.4716414801909106,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.0,5.5,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.04,0.9,1.0,1.111529158986113,1.2,1.2,1.2,1.2,1.2,1.338773099099953,1.4,1.5,1.5,1.5052879684662968,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,0.9,1.0,1.1,1.2,1.2,1.3,1.4,1.5,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.9,0.9}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,2.542858051830748,3.14159,3.14159,4.4,8.0,8.0,12.345,30.17228227492222});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01250861301074531,2.0,5.8744951186522565,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {15.303486822725638,15.303486822725638}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.04,0.9,1.0,1.111529158986113,1.2,1.2,1.2,1.2,1.338773099099953,1.4,1.5,1.5,1.5052879684662968,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,14.0,17.644189800821962});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.02}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,4.0,6.5,8.0,8.5,10.0,10.0,11.290230065355765,12.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,55.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,3.0,3.0269522005016203,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,15.303486822725638,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0269522005016203}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-9.98565761369873,-5.5,-1.0,0.0,3.14159,3.14159,4.4,8.0,8.0,12.345,12.965034001269252,12.965034001269252,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,4.0,6.0,7.0,8.0,8.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-3,53});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-3,53}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,1.0,1.3,1.7748618325074756,2.0,4.0,5.0,5.61577318250191,6.5,7.0,8.0,8.5,9.0,9.538323525972185,10.0,12.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,1.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,10.54697726221557,10.805497134389963,12.0,13.42140966570392,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.21793066808776018,0.5712739898819572,1.01,2.1,5.61577318250191,6.0,8.5,9.0,9.589021834286934,9.662066208660672,10.0,10.0,12.0,14.0,15.303486822725638,15.722587027895802,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,8.0,12.345,14.16179769990585,30.0,60.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.07168518646226235,2.0,5.5,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,4.0,6.0,7.0,8.0,10.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0,20.56256902148515,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,6.0,7.0,7.0,7.0,10.0,10.0,14.0,16.0,18.0,20.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.0,1.0,1.1269746014414654,1.4716414801909106,2.0,2.9310236194554102,4.0,5.0,5.5,5.839067476181994,6.0,6.5,7.0,7.5,7.912787863600908,8.5,9.0,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5632953387482663,0.8,0.8,4.0,6.5,7.0,10.0,14.0,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.03,0.04,0.04,0.04,0.05,1.0,3.0,4.0,5.0,16.0,20.443252094871035});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,3.777267213631494,4.0,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.777267213631494,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,0.9,1.0,1.05,1.2,1.3,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,6.0,6.952047495611096,7.0,7.0,8.0,10.0,14.0,16.0,17.15657241220536,20.0,23.462202369042487,23.462202369042487,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.8,3.8551330358860647,6.0,6.0,7.0,10.0,10.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0,20.56256902148515,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.04,1.05,1.06,1.07,1.08,1.09,1.4302724918976677,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.04,1.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.05,1.111529158986113,1.2,1.2,1.4,1.5,3.0269522005016203});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.8,1.0,2.0,3.0,4.0,5.0,5.5,6.0,6.5,7.0,7.199792726774513,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.6551091374202295,1.0,1.01,1.03,1.04,1.04,1.05,1.06,1.07,1.08,1.08,1.08,1.09,1.4302724918976677});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.04,1.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.5758086456077687,1.0,1.01,1.05,1.06,1.09,2.3,30.17228227492222});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,3.14159,4.125317976404242,4.4,8.0,8.0,8.996746373653892,12.345,12.965034001269252});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01250861301074531,0.016952550727578522,0.04,2.0,4.6,5.8744951186522565,6.0,8.0,8.5,8.5,10.0,12.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.5,8.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.2,1.3,1.3,1.4,1.4,1.5,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,0.0,3.14159,3.14159,4.4,7.113599411319828,7.113599411319828,8.0,8.0,12.345,12.965034001269252,20.58758307748205});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,10.54697726221557,10.805497134389963,12.0,13.42140966570392,14.0,15.303486822725638,16.0,16.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,-0.8524065671874532,0.8,0.8,2.0,3.0,4.0,5.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,9.0,10.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-0.8524065671874532,-0.8524065671874532}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,5.8744951186522565,6.0,6.0,6.0,7.0,7.0,7.12406400580325,7.810357871166485,8.0,10.0,14.0,16.0,18.0,20.0,40.0,59.84586734141382});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.022622611806456354,2.0,4.0,6.0,7.0,10.0,10.0,12.0,14.0,14.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.61577318250191,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.5171963354416271,0.8,4.0,4.0,6.0,6.714969366390512,7.0,10.0,10.0,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01,0.02,0.04,0.04,0.04,0.05,1.0,3.0,4.0,4.272365978237809,16.0,20.443252094871035});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.04,0.04}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,0.8,2.0,3.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,-0.8524065671874532,0.8,2.0,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.5,8.0,8.5,9.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-1.0,-0.8524065671874532}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.05,1.05,1.06,1.07,1.08,1.09,1.132725505831892,1.6073110979187053});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.05,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0994458133327332,2.0,6.0,7.0,7.0,8.0,8.0,10.0,11.290230065355765,14.0,14.855086127504585,16.0,18.0,40.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.5,1.5,2.5,4.4,4.5,4.536861868373288,4.6});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.5,4.536861868373288}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.7507135704528902,0.9,1.0,1.05,1.111529158986113,1.2,1.3,5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0,1.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,22.627144745696587,22.644167366046243,22.644167366046243,23.094907457927814});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,4.0,4.0,6.0,6.5,7.0,10.0,14.0,14.855086127504585,16.0,18.0,20.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,4.0,6.0,6.0,7.0,8.0,9.786113047700132,10.0,12.0,16.0,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,1.0,1.4716414801909106,1.8688902893311938,2.9310236194554102,4.0,5.0,6.0,6.5,7.0,7.0,7.5,8.0,8.0,8.5,8.5,9.0,9.146514817612198,10.0,11.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,1.141769393086327,2.0,2.0957837440905673,4.0,6.0,7.0,7.5,8.0,10.0,14.0,16.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0957837440905673}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.8,1.0,2.0,3.0,4.0,4.888716888170878,5.0,5.5,6.0,6.5,7.0,7.199792726774513,7.5,8.0,8.5,9.0,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0,1.01,1.02,1.03,1.04,1.05,1.06,1.07,1.08,1.09,1.09,2.3});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.09,1.09}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.04,0.3240403506571168,0.5758086456077687,1.0,1.01,1.01,1.06,1.06,1.07,1.09});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.01,1.01}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,2.0628035674357235,3.0,3.159662147541001,7.0,8.0,10.0,14.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0628035674357235}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,5.5,6.0,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-10.0,-7.0,-5.5,-1.0,0.0,3.0269522005016203,3.14159,8.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0269522005016203,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.06,1.4716414801909106,2.5,4.4,4.4,4.4,4.5,4.6,6.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.06,2.0,4.0,8.0,8.0,8.5,9.589021834286934,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,16.0,16.351469754902595,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.01250861301074531,0.04,2.0,5.8744951186522565,6.0,8.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,15.303486822725638,16.0,16.0,18.0,18.0,20.0,22.627144745696587,22.644167366046243});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {8.0,8.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-7.0,-7.0,-5.5,-5.5,-5.5,-0.06417416146671462,0.0,0.05,1.5052879684662968,3.14159,8.0,12.345});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.2862128755925808,2.0,4.0,6.0,8.0,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,1.5,1.5,4.4,4.4,4.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.5,1.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,0.07168518646226235,3.14159,3.14159,8.0,12.345,30.0,30.0,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-7.0,-7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,2.0,3.0,5.61577318250191,6.412490479428987,6.5,7.0,7.5,8.0,9.0,10.0,11.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.412490479428987,6.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0,1.1,1.2,1.2,1.3,1.4,1.4,1.5,1.5});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.05,0.05,0.8,6.0,6.5,7.0,10.0,14.0,15.470056628946939,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.05,0.05}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-20.0,-10.0,-7.0,-7.0,-5.5,-1.0,0.0,2.9986354234031958,3.14159,3.14159,8.0,12.345,30.0,50.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-20.0,-20.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,-0.8451952774545579,0.0,3.14159,3.14159,3.1914676303501026,4.4,8.0,8.0,11.982961391265457,30.17228227492222});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.14159,3.14159}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.3561918525384038,2.0,4.0,4.0,6.0,8.0,8.5,10.0,10.54697726221557,10.54697726221557,10.805497134389963,11.693705971213628,12.0,13.42140966570392,14.0,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.0,4.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.5539275007752722,1.0,2.0,3.0,4.0,5.5,6.0,6.5,7.0,7.282214606279208,8.0,8.5,9.0,11.0,15.722587027895802,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.282214606279208}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,5.8744951186522565,5.8744951186522565,6.0,7.0,8.0,8.0,10.0,14.0,16.0,18.0,20.0,40.0,59.84586734141382});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.8744951186522565,5.8744951186522565}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-0.8524065671874532,0.8,0.8,3.0,4.0,5.61577318250191,6.0,6.5,7.0,7.0,7.5,8.0,8.5,9.0,9.555936301193714,10.0,11.0,14.0,14.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.8,0.8}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0,2.0,2.0,3.0,4.0,4.536861868373288,5.0,5.5,6.5,7.0,7.0,7.5,8.0,8.5,10.0,11.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,2.0,3.0,3.0269522005016203,4.0,6.0,6.5,7.0,7.5,8.0,8.5,9.0,10.0,11.0,14.0,15.0,15.303486822725638,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.0,3.0269522005016203}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-5.5,-1.0,0.0,4.4,4.4,8.0,12.345,14.16179769990585,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {4.4,4.4}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,1.0821671281626561,4.0,6.0,8.0,10.0,10.0,10.270542934758373,14.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,4.0,4.2685375147658675,6.0,7.0,8.0,10.0,10.0,14.0,16.0,16.0,18.0,20.0,35.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,1.141769393086327,2.0,2.0957837440905673,4.0,6.0,7.0,7.0,7.5,8.0,10.0,14.0,16.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {7.0,7.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,2.0,4.0,6.0,7.113599411319828,8.0,8.5,9.589021834286934,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,8.0,10.0,11.743186336204177,12.0,16.0,18.0,19.657395792321434,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {11.743186336204177,12.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-1.0,0.8,0.8345159491263733,1.0,1.1,1.1,1.2,1.4,1.5,6.412490479428987});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.1,1.1}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,1.0821671281626561,2.0,3.208558701627241,4.0,8.0,8.5,9.384078545821367,9.589021834286934,10.0,10.0,12.0,13.419140471954321,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,-10.0,-7.0,-5.5,-5.5,-1.0,0.0,3.14159,3.14159,5.839067476181994,8.0,12.345,30.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {-5.5,-5.5}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,12.0,13.419140471954321,14.0,15.303486822725638,16.0,16.0,18.0,22.627144745696587,22.644167366046243,22.644167366046243,24.017042408988246,28.648838627219234});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {16.0,16.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {2.0,4.0,6.0,8.0,8.5,10.0,12.0,14.0,15.303486822725638,16.0,18.0,18.0,22.627144745696587,22.644167366046243,22.644167366046243,23.094907457927814});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {18.0,18.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,2.0,2.0,2.0628035674357235,4.0,6.5,8.5,10.0,10.0,12.0,14.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {-20.0,0.0,0.8,4.0,7.0,8.0,10.0,10.0,10.0,10.0,14.0,16.0,18.0,20.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,1.141769393086327,2.0,2.0957837440905673,4.0,6.0,7.0,7.5,8.0,10.0,14.0,18.0,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0,2.0957837440905673}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.022622611806456354,4.0,6.5,8.0,8.5,10.0,10.0,11.290230065355765,12.0,15.303486822725638,16.0,16.0,18.0,18.0,20.0,55.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {10.0,10.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.0,0.0,0.0,4.0,6.0,7.0,8.0,10.0,10.0,10.0,12.0,16.0,17.737539738329957,18.0,19.3401788856025});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0,0.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.02,2.0,4.0,6.0,6.0,6.952047495611096,7.0,7.9602780711389105,8.0,10.0,14.0,16.0,17.15657241220536,20.0,23.462202369042487,23.462202369042487,24.697501417160133});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {6.0,6.0}, 1e-6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {0.8,0.9,1.0,1.1,1.2,1.2,1.3,1.4,1.4,1.4,1.4,1.5,1.7980687330126581});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.2,1.2}, 1e-6
        );
    }
}

