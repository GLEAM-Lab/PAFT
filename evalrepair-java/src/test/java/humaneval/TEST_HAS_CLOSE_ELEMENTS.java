package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_HAS_CLOSE_ELEMENTS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.9,4.0,5.0,2.2)), 0.3
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.9,4.0,5.0,2.2)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,5.9,4.0,5.0)), 0.95
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,5.9,4.0,5.0)), 0.8
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1,2.2,3.1,4.1,5.1)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1,2.2,3.1,4.1,5.1)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,5.0,6.5)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.6,0.7,0.8,0.9)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(10.5,20.5,30.5,25.5,40.5)), 4.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7)), 0.2
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,3.6,4.8)), 0.8
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-1.0,-0.5,0.0,0.5,1.0)), 0.3
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,3.0,4.0)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,5.0,6.0)), 4.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0)), 6.6
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,5.0,6.5)), 0.5837785211547324
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,6.0)), 1.4684959831900988
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,6.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0,3.1145064227603365)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,6.6)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,3.0,4.0)), 1.7909669082553559
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-1.0,-0.5,0.0,0.5,1.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.5,2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(10.5,20.5,30.5,25.5,40.5,-1.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,1.4684959831900988,3.0,4.0,5.0,4.0)), 6.6
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0)), 1.4684959831900988
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,3.1145064227603365,6.6)), 0.001597775988153055
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0,0.001597775988153055)), 6.622770022559026
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.7,0.8,0.9)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0)), 1.4453152842907233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,5.0,6.5)), 0.3
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6,7.7)), 0.2
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,5.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0,0.5)), 0.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.0,2.0)), 0.4395081641974091
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,6.5)), 0.3
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,2.4442803957785837,1.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,5.0)), 30.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,5.0,5.40171670636793,5.40171670636793)), 0.3
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.6,0.7,0.8)), 3.1145064227603365
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,6.0)), 1.4684959831900988
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,5.5,4.8)), 2.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6,7.7,5.5)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,6.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,3.0,4.0)), 1.7909669082553559
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0,6.0)), 4.029509770611085
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.622770022559026,4.8)), 3.0791117034371744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,4.5,5.0,6.5,5.51097214523066)), 0.5837785211547324
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0)), 4.8
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,3.1145064227603365,6.6)), 25.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.0,2.0)), 10.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0)), 4.28359856787508
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,6.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8)), 2.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,4.029509770611085,3.0,4.0)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8)), 2.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.220732489926661)), 1.5434921314453987
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-1.0,-0.5,0.0,0.5,1.0)), 3.0791117034371744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0,0.5)), 0.5872031050795127
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(10.5,20.5,30.5,25.5,40.5)), 4.08640576656449
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.7,0.8,0.9)), 0.5956038469909051
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0,3.1145064227603365,3.7502832308571223)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,3.0,4.0)), 6.622770022559026
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(10.5,30.5,25.5,40.5)), 4.08640576656449
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0)), 0.5872031050795127
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0,0.001597775988153055,4.08640576656449)), 6.622770022559026
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,6.0,2.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8,2.4)), 2.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.622770022559026,4.8)), 9.342174793939517
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.4,6.32960401348287,4.8)), 2.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.622770022559026,4.8)), 7.7
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,9.342174793939517,4.0,5.0)), 30.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0)), 6.622770022559026
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.1,0.5,1.0,1.5,2.0,2.7536386742063454)), 0.5872031050795127
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.6,0.7,0.8,0.5956038469909051)), 7.7
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-1.0,1.0,0.0,0.5,1.0)), 0.3
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.0,2.0)), 5.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.0,2.0)), 0.46346457679116604
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,5.0,6.5,0.4395081641974091)), 0.5837785211547324
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6,7.7,5.5)), 3.3
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,2.0,3.0,4.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,6.6,7.7,5.5)), 0.22976043999045262
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.622770022559026,4.8)), 1.5434921314453987
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.622770022559026,4.8)), 1.6376315868318712
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.2,3.3,4.4,5.5,7.7,5.5)), 0.22976043999045262
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.0,0.5,1.0)), 0.3
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8)), 0.22976043999045262
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8,2.4)), 0.22976043999045262
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,3.6,4.8,1.2)), 0.8
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0)), 1.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,4.0,3.1145064227603365,3.7502832308571223,4.814818917148268)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8)), 1.8783433029023973
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.2,2.4,6.32960401348287,4.8,4.8,1.6616978677034633)), 0.09078602525716209
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.5,3.0,3.907675941633249,5.0,6.5,4.5)), 0.6417930585021959
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.9,5.0,6.0,2.518151204418766,2.0)), 2.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-2.0,4.029509770611085,3.0,4.0)), 25.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 0.25
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.0002
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,10.0)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,4.0,5.0,6.0,7.0,0.02)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.0002
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.7151289158513581
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 0.5876482754436165
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,0.01)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,1e-07,0.03,0.04,0.05,0.06)), 0.03
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.0009536407568491921
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,3.0)), 0.0002
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.5815567161870863
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 3.496608712535931
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.001,7.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0001)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.27533868871906764,0.0004,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.03791583967678999,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,2.419821239840023,0.04,0.05)), 0.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0)), 0.7065364188537329
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.05,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0)), 0.23476792155713733
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,10.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 1.4554927325266915
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.5387982733401486
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.06,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,0.05,5.0,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,4.0,5.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.03
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,5.582758456545748,3.1,4.0,5.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,-1.0)), 5.582758456545748
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06)), 3.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,5.403976711699473,10.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.419821239840023,2.0,3.0,4.0,5.0,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,3.0,3.1,0.23476792155713733,4.0,5.0,6.0)), 0.24986270391526247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,2.419821239840023,0.04,0.05,0.05)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.05,0.06)), 2.419821239840023
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.05,0.06,0.01)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,5.403976711699473,10.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4)), 0.0004
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.06,0.01)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.0005,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06)), 1.4554927325266915
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.05,0.06,0.01,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 4.922894421556738
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,0.06,0.01)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,8.0,6.0,8.0,10.0)), 0.04634346891165053
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,27.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.05,0.06)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.27533868871906764,0.0009536407568491921,0.0004,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,-0.27533868871906764,0.04,0.05)), 0.0009536407568491921
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,-1.0)), 0.0002
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.006819962504528854,0.0004,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.201263047726941,6.0,2.0)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.03791583967678999,0.05,0.06)), 0.0005
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.403976711699473,10.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 4.054570532215202
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0,4.0)), 4.553455122105357
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,0.06,0.01)), 1.51437445552473
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,0.05,5.0,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 26.282659737726185
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 1.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.03791583967678999,0.05,0.7065364188537329)), 0.04
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.027867437909801628,0.02,0.03,0.03791583967678999,0.05,0.7065364188537329)), 0.0541052002900725
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,4.0,5.0,6.0,3.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,4.0,5.0,6.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 4.553455122105357
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,2.0,3.0,4.0,5.0,6.0)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,-0.22767713648120685,0.0002,0.0003,0.0004,0.0005)), 4.304215741453683
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0001)), 4.213857109216827
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,-0.27533868871906764,0.0004,0.0005,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.1860965862717294,3.0,4.0,5.0,6.0,7.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.201263047726941,6.0,2.0)), 0.0541052002900725
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0004)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,8.0,6.0,8.0,10.0,8.0)), 0.04634346891165053
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.5,0.01,0.027867437909801628,0.02,0.03,0.03791583967678999,0.05,0.7065364188537329)), 0.0541052002900725
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,3.377369558845854,27.0,-3.5,3.5)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0003)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,5.0733752090151265,0.01,2.9,3.0,3.1,4.0,5.0,6.0)), 4.213857109216827
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,0.06,0.01,0.02)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,4.304215741453683,3.5)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4,4.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,2.5,3.5,4.5)), 1.51437445552473
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.0010156175400534142
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,0.05,5.0,6.0,7.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,2.0606451994556956,27.0,-3.5,3.5)), 0.0002
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,2.0,3.0,4.0,5.0,6.0)), 4.707106369313676
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.02)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,5.403976711699473,10.0,8.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0003,0.0,-1.0,1.0,2.0,3.336555491090113,4.0,27.0,-3.5,3.5,4.0)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.789287426857672
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.601345997419306,3.7751560509542523,0.0003,5.0,3.849505997336694,6.0,7.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,1.4554927325266915)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 0.6094785215808805
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.01227074844619054)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,1.4554927325266915,0.03,0.05)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,0.05,5.0,6.0,7.0)), 5.403976711699473
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.001,0.027867437909801628,0.02,0.03,0.03791583967678999,0.05,0.7065364188537329)), 0.0541052002900725
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,-0.681675841101453,3.0,5.0,6.0,7.0,0.02,1.0)), 0.00997168438031408
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.9946586793360759,0.01,2.9,3.0,3.1,4.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,10.0)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.001,0.027867437909801628,0.02,0.03,0.03791583967678999,0.05,0.7065364188537329)), 4.054570532215202
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.8868666223424293,7.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.006716836510310619,0.04,0.05,0.06)), 0.0003
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 2.6773314921583236
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,0.0003)), 0.789287426857672
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.042389595586331735,0.03791583967678999,0.05,0.06)), 0.0006358241690821189
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.201263047726941,6.0,2.0)), 7.480123341777553
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0,7.0)), 0.49458134691437805
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,-0.681675841101453,3.0,5.0,6.0,7.0,0.02,1.0)), 0.009949556820244546
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,2.601345997419306,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.789287426857672
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 2.6773314921583236
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.05932438898119835,0.04,0.06)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,4.304215741453683,7.0,0.02)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.05,0.06)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,0.0005,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005,0.0004)), 3.538513332792748
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.04197400456083985,0.02,0.03,0.04,0.05,0.01227074844619054)), 3.1860965862717294
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,8.0,10.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.02,0.02)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-0.7729905017969014,2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0,7.0)), 0.49458134691437805
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,26.59683000784765,-3.5,3.5)), 0.5815567161870863
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,0.0010156175400534142,7.0,0.4999502067248638,0.02)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.601345997419306,3.7751560509542523,0.0003,5.0,3.849505997336694,6.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,4.707106369313676,3.5,4.5)), 0.25
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,0.0003)), 0.594009877170475
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0,4.0,8.0)), 4.553455122105357
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,4.707106369313676,3.5,4.5)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.02,0.04)), 1.4178614302725
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.8142288290952835,0.0002,0.0003,0.0004,0.0005)), 0.006716836510310619
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.01227074844619054,3.0,3.1,4.0,5.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.0005,6.0,7.0)), 3.7751560509542523
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.006819962504528854,0.0004,0.0005)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.0003,-0.006819962504528854,0.0004,0.0005)), 0.0004
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.007380301819928131,0.03,0.04,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,3.336555491090113,0.4,4.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,5.0,6.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.893857238944507,0.06,0.01)), 0.0005073629595648167
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,1.0)), 0.2827959124952115
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06,0.0005)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.04197400456083985,0.02,0.03,0.04,0.05,0.01227074844619054)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,0.06)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,5.0,6.0,7.0)), 0.5387982733401486
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4,4.0)), 0.0001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.001,7.0)), 2.4342970911810413
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,5.0,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,3.0,3.1,0.23476792155713733,4.0,5.0,6.0,3.1)), 0.24986270391526247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,2.9127653829256737,6.0,7.0,1.0)), 1.4554927325266915
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,4.0,5.0,6.0,7.0,1.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,0.0005,6.0,7.0,6.0)), 1.9664900052081806
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,1.4554927325266915,0.03,0.05)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(3.1,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 8.017463880968485
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.03791583967678999,0.045686543793516186,0.05,0.7065364188537329)), 0.04
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.02)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,3.977951750230848,0.05,5.0,6.0,7.0)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.001,7.0)), 6.590944440727386e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.02)), 2.08429105386396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.0004,2.0,3.0,4.0,5.0,6.0,0.8868666223424293,7.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,5.0,6.0,7.0)), 1.4554927325266915
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.0009414791763702169
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,3.315607661618798,0.05,5.0,6.0,7.0,2.0)), 0.7065364188537329
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,4.0)), 27.47663087802621
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.1860965862717294,3.0,4.0,5.0,6.0,7.0)), 1.708086464468263
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 3.387037059022768
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.5634647535263566,2.0,8.0,6.0,1.9946586793360759,8.0,10.0,8.0)), 0.04634346891165053
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,5.0,6.0,7.0)), 1.1577330360863296
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06)), 8.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.02,0.02)), 1.755200520787744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.419821239840023,2.0,3.0,4.0,5.0,6.0,7.0)), 0.8508774465041627
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0001)), 4.213857109216827
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5111094718118094,2.5,3.5,4.5)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 2.08429105386396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.08429105386396,2.0,3.0,4.0,5.0,6.0,7.0)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.5625447923410594,1.51437445552473,8.0,10.0,4.0,8.0)), 4.553455122105357
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0004)), 4.38462765702552
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 2.9127653829256737
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.007380301819928131,0.03,0.04)), 0.001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.7229390243163002
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,5.0,6.0,7.0,0.05)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,2.419821239840023,7.0)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.0)), 4.553455122105357
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,4.054570532215202,0.06,0.01,0.06,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,-0.27533868871906764,0.04,0.05)), 0.0011586532919994855
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06,0.03)), 8.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0003,-0.006819962504528854,0.0004,0.0005)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 0.0002
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,2.419821239840023,0.04,0.05,0.05)), 5.0733752090151265
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.01227074844619054)), 1.6744630044015771
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.006819962504528854,0.0004,0.0005,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,4.0,5.0,6.0,2.9)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.059325791236410234,0.05,0.02,0.02)), 1.755200520787744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.05,0.06)), 0.2827959124952115
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.013650230553729176,-0.06780664179497922,0.06)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,5.014828008723355,0.4,0.0003)), 0.0001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.02)), 2.3274149956104866
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.0,5.014828008723355,0.4,0.0003)), 0.0001
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,0.06,0.01,0.02)), 0.4669443330518358
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,0.05,5.0,6.0,7.0,7.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.9402189819540485,6.0,5.014828008723355)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,2.6773314921583236,0.02)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.27533868871906764,0.0009536407568491921,0.0004,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.825003994623336)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.02,0.02)), 1.755200520787744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,6.0,8.0,10.0)), 0.04634346891165053
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,6.0,0.4,4.0)), 5.3502494242670515
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 6.68643143495309
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,0.05,5.0,6.0,0.013650230553729176)), 0.007380301819928131
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.8868666223424293,7.0)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 0.2827959124952115
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,4.5)), 1.0
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,4.304215741453683,3.5)), 3.7751560509542523
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,10.0,4.0)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,10.0)), 6.7444627022613926
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(3.1,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 10.642878332731314
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.5634647535263566,2.0,8.0,6.0,1.9946586793360759,8.0,10.0,8.0)), 0.0010156175400534142
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.825003994623336,0.0003,0.0004,0.0005,0.0003,0.0003)), 0.594009877170475
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.600290365588201
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,-0.8949378651725157,0.03,0.06,0.0005)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.042389595586331735,0.05,0.06)), 0.0006358241690821189
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.399847577172071)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0)), 10.642878332731314
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.9402189819540485,7.399847577172071,5.014828008723355)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,0.0002,6.0,7.0)), 0.6470225461664522
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.05,0.06)), 0.0008004009304922934
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,4.0,5.0,6.0,2.9)), 5.201263047726941
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(3.1,0.0003,-0.006819962504528854,0.0004,0.0005)), 7.399847577172071
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.5634647535263566,2.0,8.0,6.0,1.9946586793360759,10.0,8.0)), 0.0010156175400534142
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0,5.0)), 0.25
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.9444541835001738,0.01,0.03,0.05,0.06)), 2.419821239840023
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,1e-05,5.0,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,0.4999502067248638,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,27.0)), 0.7151289158513581
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,1.4554927325266915,0.03,0.05,0.01)), 1.0360154563405675
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,0.04,2.5)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.9444541835001738,0.01,0.03,0.05,0.06)), 2.3395504526237794
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.05,4.0,5.0,6.0,7.0)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0)), 0.007380301819928131
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,2.0,2.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.0,3.1,5.0,6.0,2.9)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0002,0.0005)), 2.6773314921583236
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 7.225039884550139
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,-1.0,4.269982226498507,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,27.0)), 0.5711414757852395
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,3.0,3.1,0.23476792155713733,4.0,5.0,6.0)), 1.0360154563405675
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,4.0,5.0,6.0,7.0,1.0)), 0.3890763430948263
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.0606451994556956,4.0,0.05,5.0,6.0,7.0,2.0)), 1.102977098003074
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03791583967678999,0.05,0.06,0.01)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,2.3395504526237794,0.4)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.059325791236410234,0.05,0.02,0.02)), 0.027867437909801628
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,4.304215741453683,3.5,3.5)), 3.131534811796164
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.0502891524344419
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.0606451994556956,8.37882881008273,4.0,0.05,5.0,6.0,7.0,2.0)), 1.102977098003074
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.9871331053114625,0.02,5.0,6.0,7.0,0.02,0.02)), 2.08429105386396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.05932438898119835,-0.7326221293497102,0.04,0.06)), 6.183363942162173
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.9871331053114625,0.02,1.0,5.0,6.0,7.0,0.02,0.02)), 2.08429105386396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0)), 10.185523116280718
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,0.0009414791763702169,5.0,6.0,7.0)), 27.193721294621852
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0004)), 3.2821767032590996
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0,7.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 2.9402582316081283
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,5.0,6.0,7.0)), 26.282659737726185
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,5.403976711699473,10.0)), 0.0009414791763702169
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,5.014828008723355,0.0003)), 0.789287426857672
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,-1.0,4.269982226498507,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,27.0)), 0.0003
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02)), 0.042389595586331735
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0,2.0)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,2.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.03791583967678999,0.05,0.06,0.01,0.06)), 4.304215741453683
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,6.0,7.0,0.02)), 0.042389595586331735
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.02,0.03,0.04,1.0360154563405675,0.05,0.01227074844619054)), 0.0003
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,0.04197400456083985,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 0.2827959124952115
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,2.6773314921583236,0.02)), 0.005887799165131287
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.059325791236410234,0.05,0.02,0.02)), 1.4993923432941396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 3.7839809460634433
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0,4.0,8.0)), 5.131388046991181
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-0.7729905017969014,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06)), 8.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.01227074844619054,0.0002,0.0003,0.0004,0.0005)), 0.03791583967678999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,4.707106369313676,3.5,4.5)), 0.9398359014750373
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0)), 0.9558014097399574
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.05,0.06,2.419821239840023)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06)), 3.336555491090113
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.03791583967678999,0.05,0.06)), 3.1860965862717294
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.5263830228573201,0.02)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06)), 0.0006673677650111161
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,7.0,2.0)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,8.37882881008273,0.05,0.06,1.4554927325266915,0.03,0.05)), 0.0008725863467467227
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,0.001,7.0)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,2.75293271310049,4.0,6.0,8.0,10.0,4.0,8.0)), 0.013650230553729176
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,2.0606451994556956,8.37882881008273,4.0,0.05,5.0,6.0,7.0,2.0)), 1.618801007880505
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0)), 0.5387982733401486
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,2.419821239840023,7.0,2.419821239840023)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,-0.06815452088182485,2.9,3.0,3.1,4.0,5.0,6.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.042389595586331735,0.05,0.06)), 1.0847366056573635
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,1.708086464468263,0.0003)), 2.75293271310049
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,5.014828008723355,3.0,4.0,26.59683000784765,-3.5,3.5)), 0.5815567161870863
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.030250000422550983,-0.006819962504528854,0.0004,0.0005)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.0004,0.0005,-0.006819962504528854)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.7096432995314886,2.0,3.0,4.0,0.05,5.0,6.0,2.0,2.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,1.100738298890903,-3.5,4.304215741453683,3.5)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,5.014828008723355,3.0,4.0,26.59683000784765,-3.5,3.5)), 0.9050379093359746
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.01,4.054570532215202,0.06,0.01,0.06,0.06)), 0.006716836510310619
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,0.05,2.0,7.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.4993923432941396,3.1860965862717294,4.0,6.0,8.0,10.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4)), 0.0004122425760694817
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,-0.27533868871906764,3.5,4.5)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0003,-0.006819962504528854,0.0004,0.0005)), 7.399847577172071
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,0.01,0.02,0.02)), 0.8868666223424293
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.399847577172071)), 0.0005073629595648167
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.102977098003074,4.707106369313676,3.5,4.5,4.5)), 0.9398359014750373
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.021833973753664755,0.03,0.03791583967678999,0.06,0.06)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,5.014828008723355,0.0003)), 1.3212198385239968
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,-0.16326763997955143,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 8.061836554982653
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0003,-0.006819962504528854,0.0004,0.0005)), 4.269616913125106
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,-0.27533868871906764,0.0009536407568491921,0.0004,0.0005)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,8.0,6.0,8.0,10.0,8.0)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.825003994623336,0.0003,0.0004,0.0005,0.0003,0.0003)), 5.403976711699473
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.042389595586331735,0.05,3.2821767032590996,0.06)), 0.0006358241690821189
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06,0.03)), 8.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.27533868871906764,0.0004,0.0005,0.0005)), 2.6773314921583236
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.7725607080713995
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 7.70121119631152
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.0)), 0.4331831907404256
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.207007693261625,1.0,2.4342970911810413,3.0,4.0,5.0,6.0,7.0)), 1.0106005504771685
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0,4.0)), 5.131388046991181
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,1.618801007880505,6.0,4.304215741453683,7.0,0.02)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.1860965862717294,3.0,4.0,5.0,6.0,7.0)), 2.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,7.0,0.05)), 3.683063618088875
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,3.0,3.1,0.23476792155713733,4.0,5.0,6.0)), 0.2772899676429811
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,8.37882881008273,1.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.02)), 1.9860730410164709
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,5.4033516333681195,0.4,4.0)), 3.315607661618798
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02)), 0.01227074844619054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.3400273371960676,4.0,6.0,5.4033516333681195,4.0,5.4033516333681195)), 0.0001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.580482925816506,-3.5,3.5,27.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,2.0,3.0,4.118042003638617,5.0,6.0)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.9398359014750373,0.0004,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,6.0,9.216677069885835,8.0,10.0)), 0.04634346891165053
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,-0.22767713648120685,0.0002,0.0003,0.0004,0.0005)), 5.211766856970217
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,2.56619380468057,2.419821239840023,7.0)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.825003994623336,0.5,1.5,2.5,3.5,4.5)), 0.25
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,3.977951750230848,0.05,5.0,6.0,7.0)), 6.632548653669971
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,-0.9072789910697825,0.05,5.0,6.0,7.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.04,6.9402189819540485)), 0.893857238944507
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 27.47663087802621
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,3.377369558845854,27.0,-3.5,3.5)), 0.0004
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02,5.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.6655714742375217,1.0,2.4342970911810413,3.0,0.021833973753664755,0.05,5.0,6.0,0.013650230553729176)), 0.007380301819928131
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06,0.04634346891165053)), 2.679379582047326
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.825003994623336,0.0003,0.0004,0.0005,0.0003,0.0003)), 5.411626898204074
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.006819962504528854,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,2.0,7.0)), 0.5711414757852395
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,6.0,2.0)), 0.022759404545522027
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.02)), 1.755200520787744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,2.9,3.1,4.0,5.0,6.0,2.9)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.02,0.059325791236410234,0.05,0.02,0.02)), 1.4993923432941396
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0003,-0.006819962504528854,0.0004,0.0005)), 4.340828290832549
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,5.403976711699473,10.0,8.0,6.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,-0.27533868871906764,0.0009536407568491921,0.0004,0.0005)), 0.7414707820047213
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0)), 0.44762851805972015
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,1.0360154563405675,0.04,0.05,0.06,1.4554927325266915,0.03,0.05,0.01,0.03)), 1.0360154563405675
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,5.0,6.0,7.0)), 0.802637240504182
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,6.0,8.0,10.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0005,0.0003,0.0003)), 0.6489175574170188
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.5)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,-3.5)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.05932438898119835,0.04,0.06)), 10.790844489872772
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,7.0,2.0,0.05,3.0)), 0.3534420658062394
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,10.0)), 0.9558014097399574
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,0.04,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,2.659980261058331,-1.0,1.0,2.0,0.021833973753664755,4.0,27.0,-3.5,3.5,3.5)), 6.228903746346452
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.255813280022656,6.0,8.0,5.403976711699473,10.0)), 0.7956675398145175
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.24838213403805887,0.02,0.03,0.04,2.6773314921583236,0.02)), 0.005887799165131287
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0002,0.0003,0.0004,0.0004485548180518373,0.0003,0.0003)), 0.594009877170475
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,3.336555491090113,0.0004,0.0005)), 3.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,6.0)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,5.0,6.0,7.0)), 0.4532228429190308
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.9,3.0,3.1,4.0,6.3735257878253915,6.0,2.9)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.02,0.02)), 0.0008004009304922934
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,1e-07,0.03,0.04,0.05,0.06,0.06)), 1.7911713583873752
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.922035319334845,8.37882881008273,4.0,0.05,5.0,6.0,7.0,2.0)), 1.102977098003074
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.03791583967678999,0.893857238944507,0.06,0.01)), 0.0005073629595648167
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,2.5,2.0,3.0,4.0,27.0,-3.5,4.304215741453683,3.5)), 3.7751560509542523
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,5.0,6.0,7.0,0.02,5.0)), 2.3274149956104866
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.601345997419306,3.7751560509542523,0.0003,5.0,3.849505997336694,6.0,7.0)), 0.021833973753664755
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-4.3252207937307645,0.0,-1.0,1.0,2.0,3.0,4.0,-3.580482925816506,-3.5,3.5,27.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.04)), 0.0009414791763702169
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,1.0,2.0,3.0,4.0,27.0,3.5,-1.0)), 5.582758456545748
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,6.7444627022613926,3.0,4.0,-0.9072789910697825,0.05,5.0,6.0,7.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.05,5.0,7.0,2.0)), 0.6470225461664522
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,2.0,5.014828008723355,3.0,4.0,26.59683000784765,-3.5,3.5)), 0.9050379093359746
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.9946586793360759,0.01,0.0005,2.9,3.0,3.1,4.0,6.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,0.05,0.06,1.4554927325266915)), 0.0012719939355331437
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,4.0,0.0005,6.0,7.0)), 1.7911713583873752
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.4,0.3447084736360619,10.0)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005,0.0004,0.0001)), 3.538513332792748
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,-3.5140033340302423,27.0,-3.5,3.5)), 0.0002
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.9620795172535885,3.0,4.0,0.0005,6.0,7.0)), 1.7911713583873752
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.6489175574170188
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0005,0.03,0.06,0.01)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.825003994623336)), 9.90308269933195
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,27.0)), 0.600290365588201
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0001)), 2.9402582316081283
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.9444541835001738
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.218733523206513,6.0,5.4033516333681195,3.5285735945225642,0.4)), 0.00023229691767854852
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,4.707106369313676,3.342595209123399,4.5)), 0.24838213403805887
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.8896291569375017,-0.006819962504528854,0.9398359014750373,0.0004,0.0005)), 7.2430807150773235
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.5634647535263566,2.0,8.0,6.0,1.9946586793360759,8.0,10.0,8.0)), 0.059957016595901566
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.05,0.06)), 1.9664900052081806
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,4.707106369313676,3.5,4.5,4.5)), 0.9398359014750373
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.01,3.0,3.1,0.23476792155713733,5.0,6.0,6.0)), 1.0360154563405675
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.02,0.02)), 1.6364588638792592
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,6.7444627022613926,3.0,4.0,-0.9072789910697825,0.05,5.0,4.426265028179823,7.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,-1.0,4.269982226498507,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,27.0)), 0.17240258123693275
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,8.0,10.0)), 0.02
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.006819962504528854,0.9398359014750373,0.0004,0.0005)), 0.893857238944507
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04,0.04634346891165053,0.06,0.03,0.03)), 8.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,3.336555491090113,0.04,2.6773314921583236,0.02)), 0.005887799165131287
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.825003994623336,0.0003,0.0004,5.904014104282201,0.0005,0.0003,0.0003,0.0005)), 5.403976711699473
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.802637240504182,0.01,0.02,0.03,0.04,0.05,0.02,0.02)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.059325791236410234,0.05,0.02,0.02)), 1.144602497157043
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.8142288290952835,0.0002,0.0003,0.0004,0.0005,0.0003,0.0003)), 0.006716836510310619
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(6.7444627022613926,2.0,4.0,6.0,8.0,10.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,0.02)), 0.021833973753664755
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.05,0.06892408290740569)), 2.419821239840023
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.0,5.0,6.0,7.0)), 26.282659737726185
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,3.0,4.0,0.033961556329515134,5.0,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,7.038704429028608,0.009949556820244546,2.9127653829256737,6.0,7.0,1.0)), 1.4554927325266915
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 0.8548480106066842
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,0.5625447923410594,1.51437445552473,8.0,10.0,4.0,8.0)), 1.100738298890903
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,1.0)), 0.05807174308470063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.0,0.01,0.02,0.03,0.05,0.06)), 0.000867131833869878
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,2.419821239840023,0.03,0.04634346891165053,0.06)), 3.849505997336694
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,5.0,6.0,0.001,7.0,7.0)), 3.7751560509542523
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0005,0.03,0.05932438898119835,0.04,0.06,0.01)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,2.9,0.03,0.04,8.37882881008273,0.05,0.06,1.4554927325266915,0.05)), 1.144602497157043
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.02,3.0,5.0,6.0,7.0,4.207007693261625,0.02)), 0.042389595586331735
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.059325791236410234,0.05,0.02,0.02,0.02)), 1.144602497157043
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-2.8177684712300657,3.5)), 0.789287426857672
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.029170043001495866)), 0.9542865797125952
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.02,0.03,0.04,0.009949556820244546,0.05,0.01227074844619054)), 0.0003
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.27533868871906764,0.0004,0.0005)), 2.6773314921583236
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.06,1.4554927325266915,0.03,0.05)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.4342970911810413,4.0,0.05,5.325152364221977,6.0,7.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,4.707106369313676,3.5,4.5)), 1.3488978560690985
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.7725607080713995,0.01,0.0005,0.013650230553729176,-0.06780664179497922,0.06)), 2.1457170401182233
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.05,0.06)), 3.1860965862717294
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.829071338957891,3.0,4.0,27.0,-3.5,3.5,1.0)), 2.601345997419306
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.0005,6.0,7.0)), 4.437496596436557
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,-0.27533868871906764,0.04,0.05)), 26.59683000784765
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,1.0,2.0,3.0,4.0,27.0,3.5,-1.0)), 5.000839689569684
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,0.0005,6.0,7.0,4.0)), 1.1411672170968274
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.829071338957891,3.0,4.0,27.423951036085555,-3.5,3.5,1.0)), 0.8548480106066842
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 1.755200520787744
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.007380301819928131,0.03,0.04,0.06)), 4.255813280022656
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList()), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,1.5,2.0,2.5,3.0)), 0.25
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList()), 0.1
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,2.0,2.0,2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,1.0,1.0,1.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.7083071514757247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 2.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.0005
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0004,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06,0.06)), 6.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 6.188660714217425e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.25
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 1.058764554720106
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,3.1,0.04,0.05)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,2.5)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,0.25,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 10.360620825036374
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.03651838361176652
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,2.5)), 1e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.8648911287584085,0.04,0.05,0.06)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(8.295393364433108e-05,0.0001,0.0002,0.0003,0.0004849742100830799,0.0005)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 0.7083071514757247
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,3.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.03651838361176652
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 0.000548796898517503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.369218129512683,27.0,-3.5,3.5,2.9779710358778804)), 1.058764554720106
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 3.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,3.0,3.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,5.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 4.193063041333624
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.46351556489778956
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.7320067664244609,0.05,0.06)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,2.5)), 1.4543394246565962
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 0.8425562127638513
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,2.5,0.0005)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004)), 9.79457777984249e-06
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004,0.0005,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.5976080106510826,3.0,4.0,5.0,2.3835494666772767,6.0,7.0,4.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.0129477300365736,0.8648911287584085,8.295393364433108e-05,0.05,0.06,0.05)), 0.6516471400282701
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.5976080106510826,3.0,4.0,0.0003,5.0,2.3835494666772767,6.0,7.0,4.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,0.0)), 0.03651838361176652
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,1.0,2.0,3.0,5.0,6.0,7.0)), 6.188660714217425e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.4789370733342704,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.34173466739005054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.9737832702287503,0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.05)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,0.5,1.5,2.5,3.5,4.5)), 0.8425562127638513
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(-0.5687577928549921,0.02,0.03,0.7830519816499151,0.05)), 2.448487275020626
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.7320067664244609,2.0,3.0,4.0,5.0,6.0,7.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.026252400299697134,0.04,0.05,0.06)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,5.0,6.0,7.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0004,0.0005,0.0005)), 0.34173466739005054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0,1.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.7320067664244609,0.05,0.06)), 1.8768547940848141
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(6.0,1.0,2.0,3.0,5.0,6.0,6.628754599790156)), 6.188660714217425e-08
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.2,0.06)), 0.0005
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.05)), 0.24915745094654063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.05)), 0.25
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0036344781111617,5.0,6.0,7.0)), 0.01
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0004,0.0005,0.0005)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,-0.18624228324769193,0.0005,0.0005)), 0.34173466739005054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0003,0.0004,0.0005,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.24915745094654063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 6.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724)), 1.1599131633343557e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,5.0)), 4.535382522457198
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0,-1.0)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.39978460419272444,0.0001,0.0002,0.0003069198215320421)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,2.0,3.0,4.0,5.0,6.0,7.0)), 2.3835494666772767
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 0.038336138077083304
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.7320067664244609,0.05,0.06)), 3.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.0)), 0.0002
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,0.038336138077083304,27.0,-3.5,1.0,2.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,5.0,0.02,0.8648911287584085,0.04,0.05,0.06)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,0.25,2.0,3.0,4.0,26.131925753714437,3.5,2.0)), 10.360620825036374
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0,-1.0)), 6.551485608067754
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,0.0)), 0.027058224311019348
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,3.1,0.04,-0.6675338170546472)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.24915745094654063,0.0004,0.0005)), 2.3835494666772767
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.7320067664244609,2.0,3.0,4.0,5.0,6.0,7.0)), 4.369218129512683
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,3.0,4.0,27.0,-3.5,3.5)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,3.0036344781111617,0.05,0.06)), 0.9413670070035324
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06,0.06)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,-0.5226764317934198,0.06)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.963196087815385,4.0,5.0)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.6316080215521163e-05,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,-0.5687577928549921)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 0.001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.49573144003113767,0.0003,0.0004,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.5)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,0.038336138077083304,27.0,-3.5,1.0,2.0)), 4.508041211533442
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.001,4.0,5.0,6.0,7.0,4.0,3.0)), 4.895244991168478
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,3.0,4.0,5.0,6.0,7.0)), 4.193063041333624
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,-0.16633421178266497)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.06)), 0.03
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.0)), 0.0001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,0.03,0.25,2.0,3.0,4.0,26.131925753714437,3.5)), 10.196572439827747
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,-0.15838574353129323,0.02,0.04,0.19855506282254765)), 0.8688009538391689
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,10.0)), 0.03
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.30040935056104573,1.5,3.5,4.5)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.8648911287584085,0.04,0.05,0.06)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765,0.19855506282254765)), 0.038336138077083304
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.06)), 0.03651838361176652
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0005,2.5)), 1.3415761364417404e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.6516471400282701
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.05)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,3.0,3.0)), 3.3079084352327763
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,4.508041211533442,3.0,4.0,27.0,-3.5,3.5)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,-1.0,0.0003,-0.18624228324769193,0.0005,0.0005)), 0.34173466739005054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.05)), 0.3601068642901701
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.7083071514757247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,5.297027774100714,4.0,6.0,8.0,10.0,2.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.03,0.06)), 0.3646604168795644
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.2,0.0001,0.06)), 0.0005
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,3.0036344781111617,0.05,0.06)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.963196087815385,4.0,5.0)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,26.894236797260636,-3.5,3.5)), 2.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.027058224311019348,0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.2337339304353026)), 0.0001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.24915745094654063,0.0004,0.0005)), 2.1338227658168414
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,5.0,6.0,7.0,4.0,3.0)), 0.6516471400282701
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.1790457336152256,1.0,3.0,4.0,27.0,-3.5,3.5,-1.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0,4.0,3.0,3.0,3.0)), 4.35968221414135
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0004,0.7830519816499151,0.0005,0.0005)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,-3.5,0.06,0.06)), 6.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,-0.15838574353129323,0.02,0.04,0.19855506282254765)), 1.3659999377482905
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0004,0.7830519816499151,0.0005,0.0005,0.0005,0.0004)), 1.058764554720106
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,5.0,4.0,4.0)), 3.75736209595818
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.7830519816499151,0.04,0.05,0.06)), 6.628754599790156
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.3646604168795644,0.02,0.04,0.05,0.06)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.05)), 0.6596019358748902
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.278701849044938,2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724)), 0.4721319649371413
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,-0.5687577928549921,0.01)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,-0.1725130799260981,0.01)), 0.6998622328872788
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,3.1,0.04,-0.6675338170546472)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.01)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,0.5,3.0,4.0,27.0,-3.5,3.5)), 0.7083071514757247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.8425562127638513
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,3.0)), 27.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.49573144003113767,0.0003,0.0004,0.0005)), 0.4721319649371413
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,7.480929430338095,5.932113294381724)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,4.320267231190421,2.0,3.0,4.0,5.0,6.0,7.0,8.963196087815385,4.0,5.0)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.0,3.1,0.04,-0.6675338170546472)), 0.4489610242046808
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9779710358778804,5.0,6.0,7.0,4.0,3.0)), 0.15194559879904446
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,-0.6675338170546472,3.5,6.188660714217425e-08)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,3.0036344781111617,0.05,0.06)), 6.188660714217425e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.0005,3.1,0.04,-0.6675338170546472)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.27655008252474683,0.0003,0.0004,0.0005)), 0.4721319649371413
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0004,0.7830519816499151,0.0005,1.5,0.0005,0.0005,0.0004,0.0005)), 1.058764554720106
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0)), 1.4543394246565962
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.9236125030833611,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 0.00046679034231423134
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 4.35968221414135
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.06)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 0.8688009538391689
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,-0.15838574353129323,6.0,7.0)), 1.6347671280320832
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.19855506282254765,0.02,0.02)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.60147586581634,8.0,10.0)), 1.058764554720106
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,1.5,2.5,3.5,4.5)), 0.8425562127638513
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.04)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 2.2853262845343103
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,0.0003069198215320421,-3.5,3.5)), 0.03651838361176652
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.0004849742100830799,0.04,0.05,0.06)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 0.0006401492478098946
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.7830519816499151,1.5,2.5,3.5,4.5)), 2.546056560331472
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,1.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.9,0.0002,0.0004)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,1.5,0.0004,0.0005)), 1e-05
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 17.62685224168221
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,-0.16633421178266497)), 26.894236797260636
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.49573144003113767,0.0003,0.0004)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(6.0,1.0,2.0,3.0,5.0,6.0,6.628754599790156)), 6.60147586581634
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,2.5,3.5,4.5)), 2.1338227658168414
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.001,4.0,5.0,6.0,7.0,4.0,3.0,4.0)), 4.895244991168478
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724,5.932113294381724)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,0.25,2.0,3.0,4.0,27.0,-3.5,3.5)), 4.320267231190421
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,2.5)), 10.196572439827747
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9,3.0,3.1,4.0,5.0,6.0,4.0)), 0.2
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,3.0,4.0,6.0,7.0,1.0)), 4.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,-0.2596313061937332,0.03,0.7320067664244609,0.05,0.06)), 0.01
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.0129477300365736,0.8648911287584085,0.028469429733457938,8.295393364433108e-05,0.05,0.06,0.07357941163309117)), 2.448487275020626
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,2.293054850153645,1.0,2.0,6.551485608067754,0.5,3.0,4.0,27.0,-3.5,3.5)), 0.5067916393688855
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.05)), 0.0129477300365736
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04)), 0.001355158686300474
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,0.01,-3.5,3.5,2.0,-1.0)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,1.0,2.0,3.0,4.0,6.0,7.0)), 6.188660714217425e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 0.0007523447834387034
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.6316080215521163e-05,0.0002,0.0003,0.000217866811863406,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,8.963196087815385,2.5,0.0001)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,-0.15838574353129323,6.0,7.0)), 1.5873257099119467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.5976080106510826,3.0,4.0,0.0003,5.0,2.3835494666772767,6.0,7.0,4.0)), 10.576387435085449
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.06)), 0.24915745094654063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 5.217263160604513e-06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.8319124631222921,0.0004,0.0005,8.963196087815385,2.5,0.0001)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.06,0.01)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,4.5,2.0,3.0,4.0,10.0,6.0,7.0,8.963196087815385,4.0,5.0)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,0.5,1.5,2.5,3.5,4.5)), 0.8670068029182352
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,4.862049768627548,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.5,4.862049768627548)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06,0.05)), 0.6700689435351999
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.001,4.0,5.0,6.0,7.0,4.0,3.0)), 4.19635402796494
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.9779710358778804,5.0,6.0,7.0,4.0)), 0.15194559879904446
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.8319124631222921,0.0004,2.293054850153645,0.0005,2.5,0.0001)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.05)), 0.0007523447834387034
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,2.293054850153645,1.0,2.0,6.551485608067754,0.5,3.0,4.0,27.0,-3.5,3.5)), 0.15962354277733998
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,3.0036344781111617,0.05,-0.15838574353129323,0.06)), 4.235601995851823e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.1884230532937705
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0003,0.0004,0.0005,0.0005,0.0001)), 1e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 4.19635402796494
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.963196087815385,4.0,5.0,5.0)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.6509268804873074,0.01,0.02,0.03,0.7320067664244609,0.05,0.06)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,3.0,4.0,5.0,6.0,0.4,7.0,4.0)), 4.193063041333624
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.029259605557749088)), 2.2853262845343103
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.027058224311019348,0.0001,0.0002,0.0003,0.0006401492478098946,0.0005,0.0005)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.6700689435351999,1.0,2.0,3.0,4.0,5.0,5.2880862432816444,7.0,8.963196087815385,4.0,5.0,5.0)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,4.862049768627548,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.5)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.48528650783474536,0.0001394108335292097,0.0004,0.7830519816499151,0.0005,0.0005)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,0.5,1.5,2.5,3.5,4.5,2.546056560331472)), 0.8670068029182352
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05)), 3.0036344781111617
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05)), 0.6596019358748902
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(12.782206302056885,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 6.197009991875982
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.2337339304353026,6.0)), 0.0001
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.00021046356442728928,0.0001,0.0002,-0.49573144003113767,0.0003,0.0004)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,2.016188570538227,3.0,5.0,6.0,7.0)), 0.008289598692317044
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0,6.188660714217425e-08)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.15962354277733998,0.0005)), 0.15194559879904446
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,4.554151651658612,7.0,5.932113294381724)), 0.27170830572348736
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,3.5,0.0)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.05,-0.5687577928549921,0.01)), 1.025567025768271
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.19855506282254765,0.02)), 0.000548796898517503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0,2.0)), 10.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.5377076279022561
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,4.0,5.0,6.0,7.0,4.0,3.0,3.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,0.5976080106510826,3.0,4.0,5.0,2.3835494666772767,6.0,7.0,4.0)), 4.605516620713152
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.17466430323995194
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,4.5,2.0,3.0,4.0,10.0,6.0,7.0,8.963196087815385,4.0,5.0,6.0)), 0.00021046356442728928
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0,-1.0)), 10.375423940437729
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004,0.0005,0.0005)), 1.258526307128289e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724,5.932113294381724,5.932113294381724)), 7.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,4.862049768627548,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 0.7690733466089933
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.03)), 0.0007523447834387034
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,-1.0)), 0.5377076279022561
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724,7.0)), 1e-07
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0003,0.0004,0.0005,0.0005,0.0001,0.0003)), 1e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.025810774039815212,0.04,0.05,0.06)), 3.3079084352327763
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.426546370607161,3.0,4.0,27.0,-3.5,3.5,3.5)), 0.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,5.0,4.0,4.0,7.0)), 5.361067326145201
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06)), 0.24915745094654063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,0.0005)), 17.62685224168221
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.709144679909934e-05,0.0002,0.0003,0.000217866811863406,10.360620825036374,0.0004,2.5,0.0003,10.360620825036374)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.6316080215521163e-05,0.0002,0.0003,0.000217866811863406,10.360620825036374,0.0004,0.0005,2.5,0.0003,0.0007771726708529467,10.360620825036374)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.554151651658612,0.02,0.03,0.04,0.05)), 3.0036344781111617
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.027058224311019348,0.0001,0.0002,0.0003,0.0006401492478098946,0.0005,0.0005,0.0005)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.8688009538391689,0.04,0.05,0.06,0.06)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 5.932113294381724
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765,0.01)), 0.8688009538391689
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0004,0.0005,0.0007771726708529467,0.0005)), 0.0129477300365736
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.361067326145201,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5)), 1.3415761364417404e-07
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02)), 4.193063041333624
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.9737832702287503,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0,-1.0)), 10.375423940437729
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,-0.09112009829948176,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,2.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,0.03,0.25,2.0,3.0,4.0,26.131925753714437,3.5)), 0.8648911287584085
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,0.0004,27.0,0.01,-3.5,3.5,2.0,-1.0,-1.0)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005,8.963196087815385,2.5)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0003,0.0004,0.0005,0.0005,0.0001,0.0003)), 1.4084871604544225e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.03,0.055920116891141534,0.06)), 0.00046679034231423134
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 4.605516620713152
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,0.5,1.5,2.5,0.07357941163309117,3.5,4.5,2.546056560331472)), 0.8670068029182352
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.04,0.05,0.06,0.06,0.06)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,-0.6675338170546472,3.5,6.188660714217425e-08,3.5)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.9429851565684986,0.02,0.05,0.06)), 5.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 1.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.5976080106510826,3.0,4.0,0.0003,5.0,2.3835494666772767,6.0,7.0,4.0)), 2.016188570538227
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 1.1237222218893332
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,5.297027774100714,4.0,6.0,10.0)), 0.4
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,5.932113294381724,7.0,5.932113294381724,2.7988043965985527)), 2.9
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.7988043965985527,2.0,3.0,4.0,5.0,5.932113294381724,7.0,5.932113294381724)), 0.03
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.19855506282254765,0.02,0.04,0.19855506282254765)), 1.3659999377482905
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,0.0004,27.0,0.01,-3.5,2.0,-1.0,-1.0)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.027058224311019348,0.0001,0.0002,0.0003,0.0004,0.0005,0.0005,0.0005)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.2,0.0001,0.06)), 0.0006477611300912572
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,4.0,5.0,6.0,7.0,4.0,3.0)), 2.9704822295205475
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,4.0,5.0,6.0,7.0,4.0,3.0,3.0)), 3.4247215250962464
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.963196087815385,4.0,5.0,5.0,8.963196087815385)), 0.9404814236833526
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.8648911287584085,0.04,0.9109419404486887,0.05,0.06)), 1.6936908783494355
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,-3.5,3.5)), 2.188339151118696
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,0.5,1.5,2.5,3.5,4.5,2.546056560331472)), 0.6099166929571569
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(6.628754599790156,0.02,0.03,0.04,0.05)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,4.0,26.894236797260636,-3.5,3.5)), 2.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,5.0,5.932113294381724,7.0,5.932113294381724)), 0.8648911287584085
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,0.0003069198215320421,-3.5,3.5)), 0.8425562127638513
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.2,0.06)), 0.0003117156621997555
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,3.5,0.02,0.03,0.022911737757520884,0.05)), 4.859769869019803
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,-0.6791689619001537,0.02,0.03,0.04,0.05,0.06)), 0.06
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0004,0.0005,0.0005)), 4.5
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.4
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.7830519816499151,0.04,0.05,0.06,0.05,0.01)), 6.628754599790156
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.7851321679403163,0.05)), 0.0007771726708529467
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.05061822472212914,0.06,0.01)), 0.9236125030833611
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04)), 2.293054850153645
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,4.0,3.0,3.0,7.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 1.0784243887241944
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 5.2880862432816444
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,3.1,0.04,0.05)), 0.055920116891141534
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.8932460669743824e-05,0.0002,0.0003,0.0004,0.0005,0.0005)), 0.1884230532937705
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,2.121475900327617,0.05,0.06)), 12.782206302056885
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(7.327698262552655e-05,0.24915745094654063,-0.49573144003113767,0.0003,0.0004)), 0.0008183165574820457
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,0.06,3.0,4.0,5.0,7.0)), 4.193063041333624
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.8648911287584085,0.04,0.05,0.7851321679403163,0.06,0.8648911287584085)), 0.9737832702287503
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.4789370733342704,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 0.0129477300365736
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.04)), 0.0005172209537761298
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.10215110330888037
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 3.80230126436164
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,5.297027774100714,4.0,6.0,8.0,10.0,2.0)), 0.4194505759272462
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.8688009538391689,0.0003,0.24915745094654063,0.0004,0.0005)), 2.1338227658168414
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0003,0.0004,0.0005,0.0005,0.0001,0.0003,0.0003)), 1.4084871604544225e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.3993502229658934
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,3.610794371373272,6.0,7.0,0.8688009538391689,3.0,3.2337339304353026,6.0)), 4.554151651658612
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,3.0,3.0,4.0)), 3.4789370733342704
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,0.5,3.0,4.0,27.0,-3.5,3.5)), 0.9164049075273353
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.0,3.1,0.04,4.320267231190421)), 0.4489610242046808
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.9,0.0002,0.0004)), 0.06551718965331986
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,3.0,0.0003)), 5.932113294381724
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.027058224311019348,0.0001,0.0002,0.0003,4.320267231190421,0.0004,0.0005,0.0005,0.0004)), 0.05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.9236125030833611,0.0005,0.0005)), 0.34173466739005054
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.06)), 1.9255680498201777
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 0.7923707008984809
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05,0.06,0.04,0.01)), 0.24915745094654063
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0,4.831203365732389,1.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.03,0.04,0.05)), 0.7083071514757247
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.6732530490080072
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(5.6316080215521163e-05,0.0002,0.0003,10.360620825036374,0.0004,0.0005,2.5,0.0003,10.360620825036374)), 0.000864368171540714
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5,4.0)), 3.80230126436164
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.0004,0.0005)), 0.2366548975305903
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,0.05,0.06)), 3.80230126436164
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.546056560331472,1.5,2.5,3.5,4.5)), 0.9748345950231323
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,4.0,0.0004,0.0005,0.0005)), 1.258526307128289e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,1.5,0.0004849742100830799,2.5,3.5,4.5)), 0.05766460375946958
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,4.369218129512683,6.0,7.0,4.0,0.7690733466089933,3.0)), 10.360620825036374
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,3.4789370733342704,2.0,3.0,4.0,5.0,3.1,6.0,7.0)), 0.4721319649371413
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(4.554151651658612,0.02,0.03,0.04,0.05)), 3.307663458004549
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 0.5803213720025598
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0,-1.0,1.0,2.0,3.0,4.0,27.0,-3.5,3.5)), 3.75736209595818
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.5,0.7830519816499151,1.5,2.5,3.5,4.5)), 2.9252594886571455
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,7.0,4.0,3.0,3.0,3.0,4.0)), 4.35968221414135
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(2.0,3.0,0.2366548975305903,5.932113294381724,7.0,5.932113294381724)), 3.6353279062810095
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0003,0.0004,0.0005,0.0005,0.0001,0.0003,0.0003,0.0003)), 1.4084871604544225e-05
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,-0.49573144003113767,0.0003,0.0004)), 0.008289598692317044
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.01,0.02,0.03,0.04,3.0036344781111617,0.05,-0.15838574353129323,0.06)), 2.8139825387707576e-08
        );
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(6.0,1.0,2.0,3.0,5.0,6.0)), 8.427615438201482
        );
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(0.0001,0.0002,0.0003,0.9236125030833611,0.0005)), 0.10215110330888037
        );
        org.junit.Assert.assertEquals(result, true);
    }
}

