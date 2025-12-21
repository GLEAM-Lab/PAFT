package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_ORDER_BY_POINTS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,11,-1,-11,-12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-11,1,-12,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1234,423,463,145,2,423,423,53,6,37,3457,3,56,0,46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0,2,3,6,53,423,423,423,1234,145,37,46,56,463,3457}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-11,-32,43,54,-98,2,-3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,-32,-98,-11,1,2,43,54}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,10,2,11,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,6,6,-76,-21,23,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-76,-21,0,4,23,6,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-5,-12,9,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1111,2222,3333,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1111,2222,3333,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {951,-753,824,-444,555}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-753,-444,824,951,555}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1000,-99,0,99,1000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-99,0,1000,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {100,20,300,4,5,60000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100,20,300,4,5,60000}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,50,-100,-200,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-100,10,20,50}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-54,63,-72,81,-90}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-72,-54,27,63,81}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,444,-333,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-555,222,-777,444,666,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,0,-1,-10,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-10,0,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {100,20,300,4,5,60000,20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100,20,20,300,4,5,60000}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,444,-333,222,-111,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-333,-555,222,-777,444,666,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-5,-12,9,15,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,15,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,-1,-10,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-10,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,50,-100,-200,-500,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-100,10,10,20,50}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,-12,9,15,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,15,15,9,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-12,10,9,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1000,-12,10,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,-333,222,-111,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-333,-555,222,-777,666,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,444,-333,222,-111,-111,888,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-111,-333,-555,222,-777,444,666,888,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1111,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1111,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,888,-777,666,-555,444,-333,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-555,222,-777,444,666,667,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-54,-5,-12,9,15,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-54,-12,15,15,9,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1000,0,99,1000,-1000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-1000,0,1000,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-753,824,-444,222,824}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-753,-444,222,824,824}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,-100,-200,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-100,10,20}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-777,-54,-5,-12,9,15,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-54,-12,15,15,-777,9,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,63,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,1,0,-1,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,0,0,1,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,-100,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,-100,10,20}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,-777,666,-555,444,-333,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-555,222,-777,444,666,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,-1,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,-1,1,10,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,0,0,1,10,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,63,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,63,4444,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-5,9,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1111,2222,3333,4444,3333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1111,2222,3333,3333,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,888,-777,666,-555,444,63,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-555,222,-777,63,444,666,667,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,-90,0,-1,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-1,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-12,-1,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-12,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,444,-333,222,-1000,-111,-555}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-111,-333,-555,-555,222,-777,444,666,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-753,824,-444,824}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-753,-444,824,824}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,666,-555,444,-334,222,-111,-111,888,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-111,-334,-555,222,-777,444,666,888,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-99,444,-333,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-99,-111,-333,-777,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {100,20,299,4,5,6,60000,20,299}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100,20,20,4,5,6,60000,299,299}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,888,-777,666,-555,1,444,63,222,-555}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,-555,-555,222,-777,63,444,666,667,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,444,-333,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-111,-333,-777,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {888,-777,-555,444,-333,222,-111,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-333,-555,222,-777,444,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {20,-100,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,-100,20}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,1,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,-100,-199,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,-100,10,20,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-12,-5,-12,9,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,-12,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,2,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,1,0,-1,1,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,0,0,1,1,10,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-5,-12,9,15,15,-12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,-12,15,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,1,0,-1,10,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-1,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,951,-199,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,10,20,951,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,60000,951,-199}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {10,20,60000,951,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,-12,9,6,15,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,6,15,15,9,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,-777,666,-555,444,-333,222,-111,-555}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-555,-555,222,-777,444,666,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-100,444,-333,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-100,-111,-333,-777,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {63,-5,63,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,63,63,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,-777,666,-555,444,-333,222,6,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-555,222,6,-777,444,666,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-89,-54,63,-72,81,-90,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-72,-54,-89,27,63,81,63}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1000,-99,0,99,1000,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-99,0,0,1000,99}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,62}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,62,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,50,-100,-501,-200,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-501,-200,-100,10,20,50}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,-777,666,-555,4,-333,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,4,-555,222,-777,666,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-99,444,-333,-111,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-99,-111,-333,-777,444,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-89,-54,63,-72,667,-90,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-72,-54,-89,27,63,63,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,4444,-5,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,63,4444,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,-12,9,6,15,15,15,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,6,15,15,15,9,4444,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,1,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-89,-54,63,667,-90,-1000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-54,-1000,-89,27,63,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,-100,-99,-199,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-100,-99,10,20,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,888,-777,666,-72,-555,444,63,555,222,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-111,-555,222,-777,63,444,555,666,667,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {10,20,-199,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,10,20,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,-72,-1,1,10,10,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-1,0,0,1,10,10,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,0,0,-1,-10,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-10,0,0,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,-777,-555,-554,444,-333,222,-111,-555}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-333,-554,-555,-555,222,-777,444,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,-5,-12,9,-199,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,-12,15,9,4444,-199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,-1,10,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,0,0,10,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-100,-200,-200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-200,-200,-100}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,0,0,-1,-10,-72,1,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-1,-10,0,0,0,1,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {667,888,-777,666,-72,-555,444,63,555,222,-111,888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-111,-555,222,-777,63,444,555,666,667,888,888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-99,444,-333,-111,444,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-99,-111,-333,-777,444,444,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,-89,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,-89,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1111,4444,2222,3333,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1111,2222,3333,4444,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {2,1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,1,1,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-99,444,-333,-111,444,444,-99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-99,-99,-111,-333,-777,444,444,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1111,4444,2222,3333,3334,4444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1111,2222,3333,3334,4444,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,-753,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,-753,1,2,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {81,27,-54,100,-72,81,-90,81,27}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-72,-54,100,81,27,81,81,27}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-72,-777,666,-100,444,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-72,-100,-333,-777,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,1,0,-1,3333,-1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-1,0,0,1,3333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {4444,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {63,4444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-777,666,-555,444,-333,222,-111,-111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111,-111,-333,-555,222,-777,444,666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-54,-72,81,-90}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-72,-54,27,81}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {27,-89,-54,63,667,-90,-1000,-1000,-999,-1000,-1000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-90,-54,-1000,-1000,-1000,-1000,-89,27,63,-999,667}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-22,-345,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,56789,-15,-68,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,226,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,3,-86420,5,-97531,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,142,-53621,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,11124,-999,6114,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,102,854}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,11124,-999,6114,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,213,-11111,11111,22222,33333,100000,-97531}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,213,-97531,-97531,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-875,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,11124,-999,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-875,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-345,11124,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,53,7,-6,5,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,1,3,-86420,5,-97531,7,53,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,11124,-999,6114,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,101,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-43,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-43,-77,-808,-204,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,-6,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,11124,-999,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,101,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,-346,11124,-999,6114,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-43,38,-204,-206,213,161,-900,53,-77,-901,911,-808,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-43,-77,-808,-204,21,-206,213,161,53,161,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,102,854,-876,-999,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,11124,-999,-999,6114,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,161,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,-1000,200,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,200,-333,500,-345,333,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-8,7,-6,5,0,-4,3,11111,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,0,0,1,3,-86420,5,11111,-97531,7,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,874,161,-900,915,53,-77,-901,911,-808,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-808,-204,21,31,22,-206,213,161,53,38,911,915,874}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-345,6114,-999,-204,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,11124,-999,6114,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,22222,33333,100000,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-33333,22222,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,38,911,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,4,-876,-876,11124,-999,-999,6114,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,21,-205,-22222,213,213,-22222,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,53,-901,910,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,910,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,-901,910,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,910,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,101,21,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,-53621,33333,100000,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-53621,-33333,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,21,161,-900,915,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,21,31,22,-206,213,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-4,-321,0,-23,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,456797,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,31,22,-206,213,161,53,38,911,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,-901,910,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,53,910,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,22222,33333,100000,-39,33333,11111,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-39,-97531,-33333,22222,33333,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-1,-86420,-97531,-8,7,-6,5,0,-4,3,11111,-86419,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-1,0,0,1,3,-86420,5,11111,-97531,7,-86419,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-3,9,-8,-6,5,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-3,-2,0,1,3,-86420,5,-97531,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,67054,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-809,-901,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-809,-204,21,31,-206,213,161,53,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,915,76832,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,137,915,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,3,-6,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,11124,-999,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-999,456,854,23412,11124,-22,3,6114,-999,-876,102,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,3,-876,-999,11124,-999,23412,6114,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,212,213,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,212,-22222,213,213,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11111,22222,33333,-18,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-97531,-18,-33333,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6744,6745,8325,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-816508,8325,874,6744,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-1000,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22223,-11111,11111,22222,33333,100000,22222,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,22222,22222,22223,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-11111,-33333,-22222,-11111,11111,22222,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,-11111,11111,-22222,-33333,22222,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-345,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,-345,11124,-999,6114,6114,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,100000,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,6745,11111,22222,33333,-18,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-18,-33333,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,0,-4,3,-2,1,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,3,-86420,5,-97531,7,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,52,38,-204,-206,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,52,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-901,32,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,31,-206,32,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-86,-85,-129,-34,874,6744,6745,8325,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-86,0,-34,9,-129,-816508,8325,874,6744,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,455,-875,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-345,11124,6114,23413,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,-901,910,-206,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-206,203,-22222,53,910,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,31,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-204,101,21,31,22,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,52,38,-204,-206,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,52,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-808,-204,21,21,31,22,-206,213,161,53,38,911,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-345,47,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,-345,11124,-999,47,6114,6114,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-900,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {161,912,677,766,456798,226,8934,56789,-15,-68,-987,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,-987,161,226,912,766,677,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-23,0,76832,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-4,0,-23,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,25,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22223,22223,-11111,11111,22222,33333,789,22222,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,11111,-22223,-33333,22222,22222,22222,22223,33333,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,102,11124,-345,6114,455,-875,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,102,-875,-345,11124,6114,23413,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-200,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-809,-901,161,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-200,-77,-809,-204,21,31,-206,31,213,161,53,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,-1000,200,-200,500,-500,333,-333,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,200,-333,500,500,-345,333,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,-11111,11111,22222,33333,100000,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-22222,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,213,161,-900,915,53,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,213,161,53,-999,38,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-808,-204,21,21,31,22,-206,213,161,53,38,911,915,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1000,200,500,-333,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,200,-333,500,500}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,-500,-321,76832,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,142,-53621,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,-901,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-3,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-206,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {31,38,-204,-206,213,161,-900,916,53,-77,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-204,31,-206,213,161,53,38,911,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,9999999,67054,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,8325,874,6745,67054,9999999,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,-19,3,6114,-999,-876,102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-19,11124,-999,6114,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,48,-321,-23,76832,-53621,-53622,-500,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,203,142,-53621,-53622,137,48,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,4,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,3,-86420,4,5,-97531,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,24680,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,11111,-22222,-33333,22222,33333,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,914,-77,-901,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-204,21,31,22,-206,213,161,53,38,911,914,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,-16,456798,226,8934,56789,-15,-68,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-16,-987,226,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,142,142,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-22221,-206,213,161,-3,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-206,-22221,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,204,755,-500,-23,0,76832,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-4,0,-23,204,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,13579,-900,456798,53,-901,910,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,53,910,911,13579,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,911,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,38,911,911,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,23413,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,213,161,53,38,911,23413,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-808,-204,21,21,31,22,-206,213,161,53,38,911,911,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,-68,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-345,-987,226,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,-53621,-23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,-23,203,142,-53621,-53621,142,142,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,853,11124,-22,3,6114,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,4,-876,-876,11124,-999,-999,6114,23413,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,226,-19,3,6114,-999,-876,102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {3,102,-876,-19,11124,-999,226,6114,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1000,200,500,-333,22223,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,200,-333,500,500,22223}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-33333,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,142,142,-33333,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,23412,-97531,9,-8,53,7,-6,5,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,1,3,5,-97531,7,53,9,23412,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {161,912,677,766,456798,226,56789,-15,-68,-987,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,-987,161,226,912,766,677,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,0,-4,3,-2,45,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,0,3,-86420,5,-97531,7,9,45,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,755,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,22222,33333,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1001,200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-1001,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-204,-3,456798,53,-901,911,-808,-900,213,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-3,-808,-204,21,-206,-22222,213,213,161,53,161,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,11124,-22,3,6114,-999,-876,-998,102,854,-876,-999,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,-998,11124,-999,-999,6114,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,-68,-986}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-345,226,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-321,-23,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,137,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,6,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-808,-204,21,31,-206,213,6,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11111,22222,33333,-18,33333,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-22222,-97531,-18,-33333,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,23413,11124,-345,-346,6114,-999,-875,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-345,-346,11124,-999,6114,23413,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,161,-900,915,53,-77,910,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,161,53,910,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,915,6,13,-38,79}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,13,-38,24,6,86,915,79,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,856,23413,11124,-345,6114,-999,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-345,11124,-999,6114,23413,456,856}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,142,142,142,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,52,38,-204,-206,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-77,-808,-204,21,31,-206,52,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,11124,-345,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,-345,11124,-999,6114,6114,455,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-999,203,8934,-500,-321,-23,76832,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,-999,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {20,31,-40,22,23412,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-808,20,-204,21,31,22,-206,213,161,53,911,911,23412,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,204,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,204,142,-53621,-53621,142,142,142,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,22223,-900,9,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,9,38,22223,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,-321,-23,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,137}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-3,9,-8,-5,5,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-5,-4,-3,-2,0,1,3,-86420,5,-97531,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,100000,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-22222,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {162,21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,162,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,-1000,200,-200,500,-500,199,333,-333,500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,200,-333,500,500,-345,333,86,199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,-6,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,102,-876,-876,43,11124,-999,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {226,21,31,38,22,-204,-206,213,161,-900,915,53,-77,-901,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,22,-206,213,161,53,226,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,-53621,142,-23,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,-23,203,142,-53621,-53621,142,142,-53621,142,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,11124,-22,3,6114,-999,-876,-998,102,-876,-999,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,-998,11124,-999,-999,6114,456,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22221,-900,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,21,-205,-22221,-22222,213,213,161,53,161,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-22221,-206,213,161,-3,456798,53,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,-808,21,-206,-22221,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,21,31,38,-204,-206,213,161,-900,915,53,39,6,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-808,-204,21,31,-206,213,6,161,53,38,911,39,915,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33332,-22222,-11111,11111,22222,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33332,22222,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,201,-1000,200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-1000,1000,200,201,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,853,22,31,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808,916,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-204,101,21,31,22,31,-206,213,161,53,911,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,-16,456798,226,8934,56789,-15,-68,-987,912}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-16,-987,226,912,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11112,11111,22222,755,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11112,11111,-22222,-33333,22222,22222,33333,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,910,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,203,-22222,53,910,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,53,910,911,-808,910}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,203,-22222,53,910,910,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,-1000,200,-200,500,-500,333,-333,500,-1000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,-1000,200,-333,500,500,-345,333,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8935,-500,203,-23,76832,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-23,203,142,-53621,-53621,137,8935,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,53,-901,910,911,-808,456797}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,910,38,911,456797,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,38,-204,-206,213,161,-900,915,52,-77,-901,911,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,213,52,161,38,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-203,-206,213,161,-900,915,53,-77,-901,-809,-901,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-203,-809,21,31,-206,213,161,53,161,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,161,-900,456798,53,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,161,53,38,911,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {37,21,31,38,22,31,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808,-900,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-204,101,101,21,31,22,31,-206,213,161,53,37,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,-1000,200,-200,500,-500,-22223,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,200,-333,500,-345,-22223,333,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,911,53,-901,910,911,-808,456797}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,910,911,911,456797,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {162,21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,162,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,10,-85,-129,874,6745,8324,9999999,67054,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,10,-129,8324,874,6745,67054,9999999,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-3,9,-6,5,-7,-4,3,-2,1,-7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-7,-6,-4,-3,-2,1,3,-86420,5,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,-6,-999,-876,102,854,456,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,102,-876,-876,43,11124,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,-22221,-206,213,161,-3,456798,53,911,-808,213,-3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,-3,-808,21,-206,-22221,-22222,213,213,161,53,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808,-809}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-809,-204,101,21,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,677,22223,-129,874,6745,8325,67054,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,22223,8325,874,677,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,23413,11124,-345,-346,6114,-999,-875,101,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-345,-345,-346,11124,-999,6114,23413,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,213,161,456799,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-206,-22222,213,161,53,38,911,456798,456799}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {6114,137,8934,-501,-321,76832,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-501,-321,-53621,-53621,137,6114,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-8,7,-6,5,0,-4,3,11111,1,0,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,0,0,1,3,-86420,-86420,5,11111,-97531,7,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,201,-1000,200,-999,500,-500,333,-333,200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-1000,1000,200,200,201,-333,500,-999,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,56789,-15,-68,-987,-68}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-68,-15,-987,226,912,766,677,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,-22221,-206,213,161,-3,456798,53,911,-808,-3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,-3,-808,21,-206,-22221,-22222,213,161,53,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-345,11124,-999,6114,23413,456,855,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-205,213,161,-900,456798,53,-901,102,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-205,102,31,213,161,53,38,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {852,21,31,853,22,31,-204,-809,-206,213,-34,161,-900,915,53,101,-901,911,-808,916,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-34,-204,101,21,31,22,31,-206,213,161,53,911,852,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,138,-321,-23,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,137,138,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,22223,-900,9,53,-901,911,-808,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,21,-206,203,-22222,53,9,38,22223,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,161,-900,915,53,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,161,53,-999,38,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-41,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-41,-808,-204,21,21,31,22,-206,213,161,53,38,911,911,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-76,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-76,-77,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,912,911,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,38,911,911,911,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-999,203,8934,-500,-321,-23,76832,-53621,-53621,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,-999,8934,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,38,-204,-206,213,161,-900,53,-77,-901,911,-808,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-206,213,161,53,161,38,911,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {852,21,31,853,22,31,-204,-809,-206,213,-34,161,-900,915,53,101,-901,911,-808,916,-900,21,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-34,-204,101,21,21,31,22,31,-206,31,213,161,53,911,852,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-33333,137,203,8934,-500,-33334,-321,-23,76832,-53621,-53621,-500,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,142,-33333,-33334,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,213,213,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,213,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,13579,38,-206,213,161,-900,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,161,53,38,911,13579,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {226,21,31,38,-204,-206,213,161,-900,915,53,-77,-901,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,213,161,53,226,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {43,456,854,11124,-22,3,6114,-999,-876,-998,102,854,-876,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,43,-998,11124,-999,-999,6114,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11112,22222,33333,-18,33333,-22222,-33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,11112,-22222,-97531,-18,-33333,-33333,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {457,855,23413,11123,11124,-345,6114,-999,-876,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,11123,11124,-999,6114,6114,23413,457,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,911,456797,-40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-40,-808,-204,21,21,31,22,-206,213,161,53,38,911,911,915,456797,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-3,456798,53,-901,-22223,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-206,-22222,213,213,-22223,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-22222,6745,22222,33333,-18,33333,-22222,-33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,-22222,-97531,-18,-33333,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,-900,915,53,456797,-901,911,-808,911,-204,456797,-40,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-40,-808,-204,-204,21,21,31,22,-206,22,213,161,53,38,911,911,915,456797,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,-6,-999,-876,102,854,456,-876,854}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,102,-876,-876,43,11124,-999,23413,456,456,854,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-999,203,8934,-500,-321,-23,76832,-53621,-53621,8934,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,142,-999,8934,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,23413,11124,-345,6114,-999,-876,101,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,-346,11124,-999,6114,6114,6114,23413,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,-19,3,6114,-999,-876,102,23413}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-19,11124,-999,6114,23413,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {162,21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,213,161,53,162,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,-901,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,53,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,79,-900,915,53,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,53,-999,38,911,38,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-15,912,677,766,-16,456799,226,8934,56789,-15,-987,912}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-15,-16,-987,226,912,912,766,677,8934,56789,456799}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,-53621,-23,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-500,-321,-23,-23,203,142,-53621,-53621,142,142,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-999,456,854,23412,11124,-22,3,-999,-876,102,-53621,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,3,3,-876,-53621,-999,11124,-999,23412,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,213,213,213,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,213,213,161,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,9,53,-901,911,13,-808,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-206,13,203,-22222,53,9,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,-900,456798,53,-901,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,-68,-986,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-345,226,912,766,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,213,52,161,53,38,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,-900,915,53,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,53,-999,38,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,38,22,-204,-206,21,213,161,213,-900,915,53,456797,-901,911,-808,911,456797,-40}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-40,-808,-204,21,21,31,22,-206,213,213,161,53,38,911,911,915,456797,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,853,11124,-22,3,6115,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,4,-876,-876,11124,-999,-999,23413,6115,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-501,-321,-23,0,76832}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-501,-321,0,-23,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-22,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,-53621,-23,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-500,-22,-321,-23,-23,203,142,-53621,-53621,142,142,-53621,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,-6,-999,-876,102,854,456,-876,854,-6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-6,-22,102,-876,-876,43,11124,-999,23413,456,456,854,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53622,-500,142,142,-53621,-23,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-500,-321,-23,-23,203,142,-53621,142,142,-53621,-53622,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,13579,-900,456798,53,-899,13,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,13,203,-22222,53,53,-899,911,13579,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,31,-876,101,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,31,-876,-345,-345,11124,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,31,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,31,-22222,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-3,456798,53,-901,911,-808,213,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,21,-206,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,-998,6114,-999,-876,101,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,-346,-998,11124,-999,6114,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-346,855,23412,11124,-345,6114,-999,-877,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-345,-877,-346,11124,-999,23412,6114,6114,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,2,7,-6,5,4,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,2,3,-86420,4,5,-97531,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,213,161,-900,915,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,213,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,-53621,142,142,142,142,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,-6,-999,-876,102,854,-876,23413}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,11124,-999,23413,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,-17,213,161,-900,915,53,-77,-901,911,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-77,-204,21,30,-206,-17,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,-321,-23,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,142,-53621,-53621,137,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-22221,-206,213,161,45,-3,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-206,-22221,-22222,213,213,161,53,45,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,-987,161,-900,456798,53,911,-808,213,213,213,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,-22222,-987,213,213,213,161,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,11,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,27,23,25,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,11,-13,-35,3,-14,30,-36,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,25,43,8,-19,26,44,9,27,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-901,-39,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,31,-206,213,-39,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11112,11111,755,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11112,11111,-22222,-33333,22222,33333,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,500,333,-333,200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,1000,200,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,38,-204,-206,213,161,-900,53,-77,-901,911,-808,161,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-206,-206,213,161,53,161,38,911,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,-17,213,161,-900,915,53,-77,-901,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-204,21,30,-206,-17,213,161,53,38,49,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,-901,911,-808,-53622,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,161,-53622,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,-6,-999,-876,102,854,-876,23413,-37}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-37,-876,-876,11124,-999,23413,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,455,-129,874,6745,-39,67054,-816508,856}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0,-39,9,-129,-816508,455,874,856,6745,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,3,-6,-999,-876,102,854,-876,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,11124,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,2,-22,3,-6,-999,-876,102,854,853,-876,-37,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,2,3,102,-37,-876,-876,11124,-999,23413,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-8,7,-6,5,0,-4,3,11111,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,0,1,3,-86420,5,11111,-97531,7,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,9,53,-901,911,13,-808,-900,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-206,13,13,203,-22222,53,9,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,912,-206,213,161,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,213,161,53,38,911,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,101,-36,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,-36,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,11124,11124,-345,6114,-999,-876,789,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-345,11124,11124,-999,-999,6114,855,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,-999,-999,-876,102,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,11124,-999,-999,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,101,-36,-901,911,-808,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,-36,31,22,-206,22,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-344,855,11124,-345,47,6114,-999,-204,101,6114,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-344,-345,-345,11124,-999,47,6114,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,9,53,-901,911,13,-808,-900,13,-22222,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-206,13,13,203,203,-22222,-22222,53,9,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,-22222,161,-900,915,38,53,101,-36,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,-36,31,22,-206,213,-22222,161,53,38,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {31,38,-204,-206,213,161,-900,916,52,-77,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-204,31,-206,213,52,161,38,911,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-206,-17,213,161,-900,915,53,-77,-901,911,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-77,21,30,-206,-17,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,226,-19,3,6114,-999,-876,102,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {3,102,-876,-19,11124,-999,-999,226,6114,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,213,161,-900,915,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,213,161,-999,38,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,11111,-22222,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97530,-33333,-22222,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-97530,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-345,-998,6114,-999,-876,101,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,-346,-998,11124,-999,6114,6114,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-999,456,854,23412,11124,-22,4,6114,-999,-876,102,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,102,3,4,-876,-999,11124,-999,23412,6114,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,-6,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,102,-876,-876,11124,-999,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456,-206,203,-900,456798,53,-901,910,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,-22222,53,53,910,456,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-205,31,38,-204,-206,213,161,-900,915,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,-205,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,101,-346,6114,6114,-346}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,-346,-346,11124,-999,6114,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-876,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,-876,-876,11124,-999,6114,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,161,-900,456798,53,-901,911,-808,213,213,213,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,213,161,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,911,-809,-206,-900,915,53,-999,-901,911,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,53,-999,38,911,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-200,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-809,-901,161,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-200,-77,-809,-204,31,-206,31,213,161,53,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,102,854}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,11124,-999,6114,23413,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,456798}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,21,-205,-22222,213,213,-22222,161,53,38,911,456798,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,853,11124,-22,6115,3,6114,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,4,-876,-876,11124,-999,-999,6114,6115,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {67054,30,38,-204,-206,213,161,-900,915,52,-77,-901,911,-808,21,911,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,30,21,-206,213,52,52,161,38,911,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,874,6745,8325,9999999,67054,9999999,6745}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,8325,874,6745,67054,6745,9999999,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,22222,33333,100000,-97531}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-97531,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,-22,3,-6,-999,-876,102,854,-876,456,43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,43,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-875,-37,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-875,-37,-345,11124,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-7,5,0,-4,3,-2,1,-97531}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-7,-4,-2,0,1,3,-86420,5,-97531,7,-97531,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {37,21,31,38,22,31,-204,-809,-206,213,161,-900,915,53,101,226,911,-808,-900,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-808,-809,-204,101,101,21,31,22,31,-206,213,161,53,37,226,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,11124,11124,-345,6114,-999,-876,-16,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-16,-345,11124,11124,-999,-999,6114,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,-816507,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-816507,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {854,23413,23413,11124,-22,3,6114,-999,-876,854,-876,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,-876,-876,-876,11124,-999,6114,23413,23413,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22223,-11111,11111,22222,33333,100000,22222,22222,100000,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,22222,22222,22223,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,-999,-876,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-876,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-68,38,-204,-206,213,161,-900,915,53,6,-901,911,-808,-901,915,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-808,-68,-204,21,21,-206,213,6,161,53,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97530,9,-8,7,213,5,0,-15,3,-2,1,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-2,0,1,3,-86420,-15,5,-97530,213,7,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,-5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-5,-77,-808,-204,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {226,21,31,38,22,-204,-206,161,-900,915,11112,53,-77,-901,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,22,-206,11112,161,53,226,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,101,-1000,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,101,-876,-345,-346,11124,-999,6114,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,213,161,-900,915,53,-901,-39,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,31,-206,213,-39,161,53,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,-22223,456798,53,-901,911,213,-22221,-900,161,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,21,-205,21,-22221,-22222,213,213,-22223,161,53,161,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {22223,-33333,-22222,22223,-11111,11111,22222,33333,100000,22222,22222,100000,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,22222,22222,22223,22223,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,21,52,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,213,52,161,53,38,911,915,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,54,22,-204,-206,213,161,-900,915,53,101,-36,-901,911,-11111,-808,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,-36,-11111,31,22,-206,22,213,161,53,54,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,161,-900,-205,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,-205,31,-206,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,-11111,200,22222,33333,100000,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,200,-11111,-22222,-22222,-22222,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,856,23413,-35,-345,6114,-999,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-35,101,-345,-999,6114,23413,456,856}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33332,-22222,11111,22222,33333,100000,22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,11111,-22222,-33332,22222,22222,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,213,161,-900,915,-77,-901,911,-808,-77}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-77,-204,21,30,213,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,-43,-204,-206,213,161,-900,915,53,-77,-901,911,-808,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-43,-77,-808,-204,21,30,21,-206,213,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,9,53,-901,911,13,-808,-900,13,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-206,13,13,203,-22222,53,53,9,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,25,24,25,26,27,28,29,30,46,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,25,43,8,-19,26,44,9,27,45,28,46,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,678,766,456798,226,8934,56789,-15,-68,-986}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-345,226,912,766,677,678,789,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11112,-33334,22222,33333,914,33333,-22222,-33333,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,11112,-22222,-22222,-97531,-33333,-33333,-33334,22222,914,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,-6,-999,-876,102,854,456,-876,102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,102,102,-876,-876,43,11124,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {852,21,31,853,22,31,-204,-809,-206,213,-34,161,-900,915,53,101,-901,911,916,-900,21,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-809,-34,-204,101,21,21,31,22,31,-206,31,213,161,53,911,852,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-205,21,-22222,38,-206,203,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-205,21,-206,203,-22222,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,25,24,25,26,27,28,29,30,46,31,-32,-33,-34,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,25,43,8,-19,26,44,9,27,45,28,46,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,24680,11111,8324,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,11111,-22222,-33333,33333,8324,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-22221,-206,213,161,-3,456798,53,-901,911,-808,213,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-206,-22221,-22222,213,213,-22222,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,2,-22,3,-6,-999,102,854,-876,-37,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,2,3,102,-37,-876,11124,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,-3,456798,-22223,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,-808,21,-206,-22222,213,213,-22223,161,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,20,53,456797,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,20,21,31,22,-206,213,161,53,38,911,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,-321,-53622,-23,-53621,-53621,-53621,27,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,142,-53621,-53621,-53621,-53622,27,137,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,1,3,-86420,5,-97531,7,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,43,23413,-22,3,-6,-999,-876,102,854,-876,456,43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,43,-999,23413,456,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-22222,6745,11111,22222,33333,-18,33333,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-22222,-97531,-18,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22223,38,11111,22222,33333,100000,22222,22222,100000,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,11111,11111,-22222,-33333,22222,22222,22222,22223,38,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,21,31,38,-204,-206,213,161,-900,915,53,39,6,-901,911,-808,-901,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-901,-808,-204,21,31,-206,213,6,161,53,38,911,39,915,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {852,21,31,853,22,31,-204,-809,-206,213,-34,161,-900,915,53,101,-11111,-901,911,-808,916,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-34,-204,101,21,-11111,31,22,31,-206,213,161,53,911,852,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,-43,-204,-206,213,161,-900,915,53,-77,-901,911,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-43,-77,-204,21,30,21,-206,213,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-3,9,-6,5,-7,-4,3,-2,1,-7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-7,-6,-4,-3,-2,1,3,-86420,5,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,9,52,-901,911,13,-808,-900,13,-22222,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-206,13,13,203,203,-22222,-22222,52,9,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-206,213,161,-900,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,48,-321,-23,76832,-53621,-53622,-500,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53622,137,48,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,226,-876,11123,-19,3,6114,-999,-876,102,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {3,102,-876,-876,11123,-19,11124,-999,-999,226,6114,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,852,11124,-22,3,-6,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,11124,23413,456,852,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {86,-345,911,-1000,200,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,200,-333,500,-345,333,911,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-876,789,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-345,11124,-999,-999,6114,23413,456,855,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,-900,53,-901,911,13,-808,-333,13,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-333,-206,13,13,203,-22222,53,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-205,31,38,-204,-206,213,161,-900,53,-901,911,-808,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,21,-205,31,-206,-206,213,161,53,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,-22,4,-999,-23,-876,102,854,-876,456,43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-23,102,4,-876,-876,43,43,-999,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11111,22222,33333,33333,-22222,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-22222,-97531,-33333,22222,22222,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,39,911,-808,213,213,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-22222,213,213,213,213,161,53,38,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,161,-900,456798,53,-901,911,-808,213,213,213,30,53,-22222,456798}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,30,-206,-22222,213,213,213,-22222,161,53,53,38,911,456798,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,789,855,11124,-345,6114,-876,789,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-345,11124,-999,6114,456,855,789,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-85,86,-98,79,-11,0,6,13,-33332}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-43,-98,-22,-11,0,1,-35,13,24,6,-33332,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-205,204,755,-500,-23,0,24,76832,76831,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-4,0,-23,-205,204,24,142,755,76831,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,21,-205,-22222,213,213,-22222,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,456797}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,21,-205,-22222,213,213,-22222,161,53,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,142,-53621,-53621,142,142,142,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,-986,789,677}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-986,-345,226,912,766,677,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-36,456,854,23413,853,11124,-22,3,6115,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-36,3,102,4,-876,-876,11124,-999,-999,23413,6115,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,137,8934,-500,-321,76832,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-53621,-53621,137,24680,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-22221,-205,-206,213,161,-3,456798,53,-901,911,-808,213,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,-205,-206,-22221,-22222,213,213,-22222,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-33333,137,203,8934,-500,-33334,6115,-23,76832,-53621,-53621,-500,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-23,203,142,-53621,-53621,142,-33333,-33334,137,6115,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,11124,-345,6114,-999,-204,-998,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,-345,-998,11124,-999,6114,6114,455,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-321,137,203,755,-500,-321,-23,0,76832,-53621,-321,755}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-321,0,-321,-23,203,142,-53621,137,755,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,53,-901,910,911,-808,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-206,203,-22222,53,910,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,11124,-22,-204,6114,-999,-876,-998,102,-876,-999,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-204,102,-876,-876,-998,11124,-999,-999,6114,456,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-203,-206,213,161,-900,915,54,-77,-901,-809,-901,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-203,-809,21,31,-206,213,161,161,54,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,11124,23413,853,11124,-22,3,6115,-999,-876,102,854,-876,-999,4,456,854,11124}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,4,-876,-876,11124,11124,-999,-999,11124,23413,6115,456,456,853,854,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,200,500,-500,333,-333,500,333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,1000,200,-333,500,500,333,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,142,-205,213,161,-900,456798,53,-901,911,213,-22222,456797}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,21,-205,-22222,213,213,-22222,142,161,53,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,11,-86420,-97531,9,-8,7,-7,5,0,-4,3,-2,1,-97531}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-7,-4,-2,0,1,11,3,-86420,5,-97531,7,-97531,9,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,912,-206,213,161,-900,915,54,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,31,-206,213,161,54,38,911,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {31,38,22,-204,-809,-206,213,161,-900,915,53,101,-901,911,-808,-809}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-809,-204,101,31,22,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-68,38,-204,-206,213,161,-900,915,53,6,-1001,-901,911,-808,-901,915,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-1001,-808,-68,-204,21,21,-206,213,6,161,53,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,500,915,53,101,-36,-901,911,-808,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-808,-204,101,21,-36,31,22,-206,22,500,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,76832,-53621,-53621,-500,142,142,6745,142,-23,-53621,142}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,-23,203,142,-53621,-53621,142,142,142,-53621,142,137,6745,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456798,-206,203,13579,-900,456798,53,-899,13,911,-16,53,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,21,-206,13,203,-16,-22222,53,53,-899,911,13579,456798,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,456797,911,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,21,-205,-22222,213,213,-22222,161,53,38,911,911,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,500,-86420,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-1000,1000,200,-333,-86420,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {161,32,912,677,766,456798,226,56789,-15,-68,-987,-987,32}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,32,32,-987,-987,161,226,912,766,677,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,8934,-500,-321,76832,-53621,-53622,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,142,-53621,-53621,-53622,137,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,53,910,911,-808,909}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,203,-22222,53,910,38,911,909,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-999,203,86,-500,-321,-23,76832,-53621,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,142,-53621,-53621,-53621,-999,86,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,202,-321,-23,-53621,-53621,-500,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,202,142,-53621,-53621,137}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,102,854,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,11124,-999,6114,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,874,6745,8325,9999999,67054,6745}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,8325,874,6745,67054,6745,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,-807,213,161,-900,456798,53,-901,911,-808,212,213,213,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-807,-808,21,-206,212,-22222,213,213,213,161,53,38,911,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,456798,226,8934,56789,-15,24680,-986,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-986,-345,226,912,677,24680,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,138,-321,-23,6114,-53621,-500,142,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-23,203,142,-53621,142,137,138,6114,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,20,53,456797,-901,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-204,20,21,31,22,-206,213,161,53,38,911,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456796,-206,203,13579,-900,456798,53,-901,910,911,-808,53,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,203,203,-22222,53,53,910,911,13579,456796,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,22223,11124,-345,6114,-999,-204,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-345,11124,-999,22223,6114,6114,456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-809,-206,79,-900,915,53,-999,-901,-808,38,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-809,-204,21,31,22,-206,53,53,-999,38,38,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,2,-22,3,-6,138,-999,-876,102,854,853,-876,-37,456,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,2,3,102,-37,-876,-876,-876,11124,-999,138,23413,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,6114,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,102,4,-876,-876,11124,-999,-999,6114,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,213,161,-900,-3,915,-77,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-3,-77,-808,-204,21,30,213,213,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,-500,11124,226,11123,-19,3,6114,-999,-876,102,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,3,102,-876,11123,-19,11124,-999,-999,226,6114,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-36,-345,47,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-36,-345,-345,11124,-999,47,6114,6114,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,455,-129,874,6745,-39,67054,-816508,856,856}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0,-39,9,-129,-816508,455,874,856,856,6745,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,456798,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-808,21,-206,203,-22222,53,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-34,21,-205,31,38,-204,-206,213,161,-900,53,-901,911,-808,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-34,-204,21,-205,31,-206,-206,213,161,53,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,-43,-204,-206,213,161,-900,915,53,-77,-11111,911,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-43,-77,-204,21,30,-11111,21,-206,213,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-8,7,-6,5,0,-809,3,11111,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,0,-809,1,3,-86420,5,11111,-97531,7,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,-900,53,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-900,-901,21,-205,-22222,213,213,-22222,161,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,-43,-204,-206,213,161,-900,915,53,-77,-901,52,911,-808,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-43,-77,-808,-204,21,30,21,-206,213,52,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,-15,-68,-986,456798}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-345,226,912,766,677,789,8934,456798,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,456798,53,-901,911,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-808,21,21,-206,203,-22222,53,38,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-85,86,13,-98,79,-11,0,6,13,-33332}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-43,-98,-22,-11,0,1,-35,13,13,24,6,-33332,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,43,23413,11124,-22,3,-6,-999,-876,102,854,-876,854}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,11124,-999,23413,456,854,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,853,-23,11124,-22,3,6114,-999,-876,102,854,-876,-999,4,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-23,3,102,4,-876,-876,11124,-999,-999,6114,23413,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,137,-321,-23,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,-86420,-53621,-53621,137}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,6114,-999,-876,102,854,-876,-999,4,456,102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,102,102,4,-876,-876,11124,-999,-999,6114,23413,456,456,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,852,11124,-22,3,-6,-876,102,199,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,11124,23413,456,852,854,199}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {852,21,31,853,22,31,-204,-809,-206,213,-34,161,-900,-899,6114,101,-901,911,-808,916,-900,916}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-34,-204,101,21,31,22,31,-206,213,161,-899,911,6114,852,853,916,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,789,677}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-345,226,912,766,677,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-205,213,161,-900,-200,53,-901,102,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-200,-808,21,-205,102,31,213,161,53,38}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,21,31,38,-204,-206,213,161,-900,915,53,39,7,-901,911,-808,-901,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-901,-808,-204,21,31,-206,213,7,161,53,38,911,39,915,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {161,912,8324,677,766,456798,226,8934,56789,-15,-68,-987,-97530}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,-97530,161,226,912,8324,766,677,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,39,-204,-206,-17,213,161,-900,915,53,-77,-901,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-204,21,-206,-17,213,161,53,39,49,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,911,-809,-206,-900,915,53,-999,-901,911,-807,-808,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-807,-808,-809,-204,21,31,22,-206,53,-999,38,911,911,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-344,855,11124,-36,-345,47,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-36,-344,-345,-345,11124,-999,47,6114,6114,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,-33334,22222,33333,914,33333,-22222,-33333,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,-22222,-22222,-97531,-33333,-33333,-33334,22222,914,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,-999,-999,-876,102,-876,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,11124,-999,-999,-999,23413,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,855,11124,2,-22,3,-6,-999,102,854,-37,456,854}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,2,3,102,-37,11124,-999,23413,456,456,854,854,854,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,54,22,-204,-206,213,161,-900,915,53,101,-36,-901,911,-11111,-808,22,-36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-204,101,21,-36,-11111,-36,31,22,-206,22,213,161,53,54,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,456796,226,8934,56789,-15,-68,-986}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-345,226,912,766,677,789,8934,56789,456796,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,-8,7,-6,5,0,-4,3,102,11111,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,0,1,3,102,-86420,5,11111,-97531,7,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,3,-206,203,-900,456798,53,-901,910,911,-808,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,3,-206,-206,203,-22222,53,910,911,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,22,-204,-206,213,161,-900,915,53,53,914,-77,-901,911,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-204,21,31,22,-206,-206,213,161,53,53,38,911,914,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,999,-1000,200,500,-332,-86420,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,1000,200,-332,-333,-86420,500,333,999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,-321,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-53621,-53621,137}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-205,21,-22222,38,-206,203,-900,456798,53,-900,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-808,-205,21,-206,203,-22222,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,137,8934,-500,-321,8325,-53621,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,-53621,-53621,137,8325,24680,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,766,456798,226,8934,56789,-15,-68,-986,789,-986}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-986,-986,-345,226,912,766,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,24680,-86420,-97531,9,-8,7,-6,5,0,-4,3,-2,45,0,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,0,3,-86420,5,-97531,7,7,9,45,24680,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-205,204,755,-500,-23,0,24,76832,-16,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-4,0,-23,-205,-16,204,24,142,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,23412,-808,-900,456798,-901,911,-808,-53622,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-808,21,-206,-22222,213,213,-53622,38,911,23412,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,-53622,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,2,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,46,47,48,49,50}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,2,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,-53622,-19,26,44,9,27,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,-206,213,161,-900,456798,53,31,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,31,-22222,213,161,53,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,-320,-321,137,203,755,-500,-321,-23,0,76832,-53621,-321,755}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-320,-321,-321,0,-321,-23,203,142,-53621,137,755,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,-53621,33333,100000,33333,11111,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-97531,-53621,-53621,-33333,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-346,855,23412,11124,-345,6114,-999,-877,101,6114,-346}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-345,-877,-346,-346,11124,-999,23412,6114,6114,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,203,161,-900,456799,53,-901,911,-808,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-808,21,-206,203,-22222,161,53,38,911,456799}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22222,38,-206,203,22223,-900,9,53,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-206,203,-22222,53,9,38,22223,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-11111,11111,-53621,33333,100000,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-97531,-53621,-33333,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,6114,-876,-1000,-346,6114,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-876,-346,11124,6114,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,11124,11124,-345,6114,-999,-876,789,-346,-999,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-876,-345,-346,11124,11124,-999,-999,-999,6114,855,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,21,-22222,456798,-206,203,13579,-900,456798,53,-899,13,911,-16,53,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,1,21,-206,13,203,-16,-22222,53,53,-899,911,13579,456798,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,22222,33333,-18,33333,6745}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,-97531,-18,-33333,22222,33333,33333,6745,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,-86420,-97531,9,-8,7,-6,5,0,-4,3,-203,-2,45,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,0,-203,3,-86420,5,-97531,7,9,45,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,43,23413,-22,3,-6,455,-876,102,854,-876,853,456,43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-22,3,102,-876,-876,43,43,23413,455,456,456,853,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-36,-345,47,6114,-999,-204,101,6114,455,-345,855}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-36,-345,-345,11124,-999,47,6114,6114,455,456,855,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {20,-22222,39,-206,213,161,-3,456798,53,-901,911,-808,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,20,-206,-22222,213,213,161,53,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,-807,213,161,-900,456798,53,911,-808,212,213,213,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-807,-808,21,-206,212,-22222,213,213,213,161,53,38,911,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33332,-22222,-11111,11111,22222,755,33333,22222,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33332,22222,22222,33333,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,30,-204,-206,213,161,-900,915,53,-77,-901,-39,52,-875,911,-808,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,-875,213,-39,52,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-206,213,23412,-808,-901,456798,-901,911,-808,-53622,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-901,-808,-808,21,-206,213,213,-53622,38,911,23412,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11112,22222,33333,914,33333,-22222,-33333,-22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22222,11112,-22222,-22222,-97531,-33333,-33333,22222,914,33333,33333,33333,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,67054,-986,30,-204,-206,213,161,-900,915,53,-77,-901,-39,51,-875,911,-808,21,52}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,-875,-986,213,-39,51,52,161,53,911,915,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,161,-900,456798,53,-901,911,213,-22222,-900,53,-900,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-900,-901,21,-205,-22222,213,213,-22222,213,161,53,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-206,213,161,-900,915,53,-77,-901,911,-808,-901,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-808,21,31,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,-1001,23413,11124,6114,-877,-1000,-346,6113,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1000,-1001,-877,-346,11124,6113,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,39,-206,213,161,456797,-3,456798,53,-901,911,-808,213,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-3,-808,21,21,-206,-22222,213,213,161,53,911,39,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-85,86,13,-98,79,56789,-11,0,6,13,-33333,-33332,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-43,-98,-98,-22,-11,0,1,-35,13,13,24,6,-33332,-33333,86,79,56789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13579,-86420,-97531,9,30,-8,7,-6,5,0,-4,3,-203,-2,45,0,22,-4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-4,-2,0,0,-203,30,3,-86420,22,5,-97531,7,9,45,13579}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {161,43,912,677,766,456798,226,56789,-15,-68,-987,-987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,-987,43,161,226,912,766,677,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-15,854,23412,11124,-22,3,6114,-999,-876,102,3,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,3,-15,-876,11124,-999,-999,23412,6114,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-321,8933,-23,-14,-53621,-53621,-22,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-22,-23,-14,203,142,-53621,-53621,137,8933,8934}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,-22223,33334,100000,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-22223,-33333,33333,33334}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,-204,-206,213,161,-900,915,53,-77,-901,911,-808,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-206,213,161,53,911,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22223,38,11111,22222,33333,100000,22222,22222,100001,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100001,11111,11111,-22222,-33333,22222,22222,22222,22223,38,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,-206,203,-900,456798,53,-901,910,-206,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,-206,203,-22222,53,910,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,853,22,31,-204,-809,30,-206,213,161,-900,915,53,101,-901,911,-808,916,-900,-809}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-808,-809,-809,-204,101,21,30,31,22,31,-206,213,161,53,911,915,853,916}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22223,-11111,22222,33333,100000,22222,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,-22222,-33333,22222,22222,22222,22223,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-206,203,-900,456798,-901,910,911,-808,456797,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-808,21,-206,203,-22222,910,38,911,456797,456797,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-345,456798,226,8934,56789,-15,24680,-986,789,677}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-986,-345,226,912,677,24680,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,456797,38,-207,203,-900,456798,53,-901,9999999,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-207,203,-22222,53,38,911,456797,456798,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,39,911,-808,37,213,213,213,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,-808,21,-206,-22222,213,213,213,213,161,53,37,38,911,39,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,56789,-15,-20,-986,789,677}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-20,-15,-986,226,912,766,677,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,212,213,213,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,-206,212,-22222,213,213,213,213,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8933,-321,-23,-53621,-53621,-500,-53621,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-23,203,203,142,-53621,-53621,-53621,137,8933}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,6745,11111,6745,33333,33333,-22222,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {11111,-22222,-22222,-97531,-33333,22222,33333,33333,6745,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,3,6114,-999,-14,102,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,-14,102,11124,-999,6114,23413,456,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,22222,33333,100000,33334}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-33333,22222,33333,33334}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,31,911,-808,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,21,-206,31,-22222,213,-22222,161,53,38,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-11111,33332,-22222,-11111,11111,22222,33333,100000,22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,-11111,11111,-22222,22222,22222,33332,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,11111,22222,33333,100000,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,11111,-22222,-97531,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,8934,-500,-321,-23,8935,76832,-53621,-53621,-500,142,142,-53621,-23,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-500,-321,-23,-23,203,142,-53621,-53621,142,142,-53621,137,8934,8935,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,6745,11111,-97532,22222,457,-5,33333,-18,33333,-22222,6745}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-5,11111,-22222,-97531,-18,-97532,-33333,22222,33333,33333,457,6745,6745}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-345,6114,-999,-875,101,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,101,-875,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,8934,-500,-321,76832,-53621,-53622,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,142,-53621,-53621,-53622,8934,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-43,24,-35,-85,86,-98,79,-11,0,6,13,-33332,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-43,-98,-11,0,1,-35,13,24,6,-33332,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,2,-22,3,-20,-6,-999,-876,102,854,853,-876,-37,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-20,-22,2,3,102,-37,-876,-876,11124,-999,23413,456,456,853,854,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-22223,-33333,-22222,-11111,-22222,11111,-53621,33333,100000,-346,33333,11111,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-22222,-97531,-22223,-53621,-346,-53621,-33333,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-205,213,-900,456798,53,-901,910,213,-22222,-900,53,-900,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-900,-901,21,-205,-22222,213,213,-22222,213,53,53,910,38,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-346,855,23412,11124,-345,6114,33334,-877,101,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {101,-345,-877,-346,11124,23412,6114,6114,33334,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-344,855,11124,-345,47,6114,-999,-204,101,6114,455,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-204,101,-344,-345,-345,11124,-999,47,6114,6114,455,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,38,-204,-206,161,-900,915,53,-77,910,-901,911,-808,-900,910,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-901,-77,-808,-204,21,31,-206,161,53,161,910,910,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-999,456,854,23412,11124,-22,853,3,6114,-999,-876,102,3,456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,3,-876,-999,11124,-999,23412,6114,456,456,853,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,31,-40,22,-204,-206,21,213,161,-900,915,53,37,-901,911,911,-204,456797,-40,22,22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-40,-40,-204,-204,21,21,31,22,-206,22,22,213,161,53,37,911,911,915,456797}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-11111,11111,22222,33333,100000,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,44,-321,-33,27,76832}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-321,-33,203,142,44,27,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-999,456,854,23412,11124,-22,4,6114,-999,-876,102,3,11124}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,102,3,4,-876,-999,11124,-999,11124,23412,6114,456,854}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,854,23413,11124,-22,678,3,6114,-999,-876,102,854,-876}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,3,102,-876,-876,11124,-999,6114,23413,456,854,854,678}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-22222,38,-206,213,161,-900,456798,53,-901,911,-808,212,213,213,213,21,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-808,21,21,-206,212,-22222,213,213,213,213,161,53,38,911,911,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-97531,-33333,-22222,-11111,11111,-53621,33334,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-97531,-53621,-33333,33334}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-12,-3,0,35,998}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3,0,-12,35,998}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {111,222,333,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {111,222,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,2,3,4,5,6,7,8,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-99999999,99999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-99999999,99999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {111111111,-111111111,222222222,-222222222,333333333,-333333333,444444444,-444444444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-111111111,111111111,-222222222,222222222,-333333333,333333333,-444444444,444444444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,10,100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1,10,100}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-1,-10,-100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-10,-100}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-1,10,-10,100,-100}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1,-10,-100,1,10,100}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-98,79,-11,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,13,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,912,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-98,79,-11,0,6,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-902,911,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,53,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-808,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-808,-204,21,30,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-33333,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,203,755,-500,-345,28,-23,-23,0,76832,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,0,-23,-23,203,-345,-53621,28,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-98,79,-11,0,6,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-38,24,6,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-22,11123,-345,6114,-999,-876,101,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,-345,11123,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,912,161,-900,915,-77,-901,911,-68,-808,21,912}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,38,911,912,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-22,11123,-345,6114,-999,-876,101,766,766}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,11123,11124,-999,6114,23413,456,855,766,766}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,78,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,13,-38,24,6,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-98,-11,0,-86420,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-86420,-38,24,-53621}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,13,-38,24,6,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-15,24,-35,-57,-98,79,-11,-35,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,-35,-15,13,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,-77,30,38,-204,-206,213,912,161,-900,915,-77,-901,911,-68,-808,21,912,911,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-77,-808,-204,-68,21,30,21,21,-206,213,161,38,911,911,912,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,54,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,54,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,22222,11111,86,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,-345,11123,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,22222,11111,86,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,11111,-22222,-33333,22222,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,-999,33333,100000,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-33333,-999,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,24,-35,-57,86,-98,79,-11,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,0,1,-35,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,67054,-816508,9999999,-85}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-85,0,9,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-11,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,6,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,24,6,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,6745,8325,67054,-816508,9999999,-129}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,500,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-68,21,30,21,-206,500,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,22222,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,333,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,-333,500,333,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,5,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,3,-86420,5,-97531,7,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,29,30,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,-36,-14,4,-15,22,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,-902,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,2,-68,21,30,21,-206,213,161,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,226,912,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,11111,-98,79,-11,0,6,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,11111,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,-204,-206,213,161,456,-900,915,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,-206,213,161,29,38,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,-33334,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-33334,912,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-22222,-22222,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,203,755,-500,-321,-23,0,76832,-53621,76832}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,141,-53621,137,755,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,6,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,13,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,21,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,161,-900,915,53,-77,-901,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,21,21,-206,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-53621,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,138,76832,-53621,-23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,-23,203,142,-53621,137,138,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-35,-57,-98,79,-11,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,13,-38,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-41,42,43,44,45,46,47,48,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-86420,456798,226,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-86420,-15,226,912,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,6,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,24,6,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,-37}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {23,1,-22,-43,-98,79,-11,0,6,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,23,-38,6,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,11111,-98,79,-11,0,6,-38,0,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-22,-11,0,0,1,-35,11111,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,6,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-38,24,6,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,28,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,2,-68,21,30,21,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-98,79,-11,0,6,-38,0,-43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-43,-22,-11,0,0,1,-35,-57,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {457,855,23413,11124,-22,-345,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,11124,-999,6114,23413,457,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,915,-68,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,21,30,21,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-37,-11111,11111,22222,33333,-53622,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-22222,-53622,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-38,24,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-22,-345,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,11124,-999,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,0,-4,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,0,1,3,-86420,-97531,7,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24,1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,24,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,13,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22223,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-53621,-53621,-33334,22223}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-11111,11111,11111,86,22222,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-33333,22222,86}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,5,0,-36,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-2,0,1,-36,3,-86420,5,-97531,7,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,87,-98,79,-11,78,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,13,-38,24,6,87,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,38,911,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,-57,11111,11111,86,22222,11110,33333,100000,100000,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,100000,-57,-11111,11110,11111,11111,-22222,-33333,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,0,912,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-2,0,1,3,-86420,-97531,7,9,912,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,915,53,-77,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-204,-68,21,21,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,53,-77,-901,911,-808,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-808,-204,21,30,-206,213,161,53,38,911,914}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,-22,-345,6114,-999,-876,101,-999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,-345,-999,-999,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,47,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,44,13,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,13,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,8,-19,26,44,9,27,28,46,47,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,333,-200,500,-500,333,-333,200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,200,-333,500,333,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,28,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,37,-204,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,37,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,11111,-98,79,-11,-41,6,-38,0,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-43,-98,-98,-22,-11,0,1,-35,11111,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,13,-21,23,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,13,31,-37,5,-16,23,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-86420,456798,226,8934,788,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-86420,-15,226,912,677,788,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,333,53,-77,911,-68,-808,21,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-204,-68,21,30,21,-206,-206,213,161,53,333,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,0,-4,3,-2,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,0,1,3,-86420,-97531,7,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,915,6745,8325,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-816508,915,8325,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,915,-68,-900,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,2,21,30,21,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,-53621,-38,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,76832,22222,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,33333,33333,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,-86420,203,142,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,38,911,915,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,-11111,766,456798,-33334,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-11111,-15,-33334,912,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,-97531,9,-8,7,-6,0,-4,3,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,0,3,-86420,-97531,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,-500,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,38,911,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,-97531,9,-8,7,-6,137,-4,3,-2,-2,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,3,-86420,-86420,-97531,7,9,137}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,-8,7,-6,0,-4,3,-2,1,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,0,1,3,-86420,-97531,7,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,53,-43,24,-98,30,79,-11,0,6,-53621,-38,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-2,-43,-98,-11,0,1,30,-38,24,6,-53621,53,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-11111,11111,22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,11111,-22222,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-41,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-41,-204,2,-68,21,30,21,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,788,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,13,-21,23,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,13,31,-37,5,-16,23,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49,788}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,7,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-35,-57,-98,79,-11,0,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,0,1,-35,-57,13,-38,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-43,24,-35,-57,86,-98,3,79,-11,78,0,6,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-11,0,1,-35,-57,3,13,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-22222,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,-22222,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,22222,33333,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,23413,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30,-33}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,23413,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-7,7,-6,0,912,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-6,-2,0,1,3,-86420,-97531,7,9,912,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53622,-38,0,-42,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-42,-43,-98,-22,-11,0,0,-38,24,24,-53622,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,213,161,-900,915,53,-77,-901,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,21,21,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-86420,203,137}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,-86420,203,203,142,137,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,11124,-22,677,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-876,11124,-999,6114,456,677}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,-33334,8934,56789,-15,-97531,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-97531,-33334,912,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-207,-900,915,53,-77,-901,911,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-207,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,38,-204,-206,213,161,-900,914,-902,911,2,-68,79,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-204,2,-68,21,30,21,-206,213,53,161,38,911,914,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,54,-85,-129,874,6745,8325,67054,-816508,9999999,-86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-86,0,54,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,915,677,-86420,456798,227,8934,788,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-86420,-15,227,912,915,677,788,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-11,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,6,-53621,28,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,24,6,-53621,28,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,5,23,-38,50,6,-17,24,-39,42,7,-18,25,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-53621,-500,31,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,0,0,-23,31,203,142,-53621,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-321,-23,0,76832,-53621,-500,31,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,0,-23,31,203,142,-53621,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,54,-129,874,6745,8325,67054,-816508,9999999,-86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-86,0,54,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-41,42,43,44,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-43,24,-35,-57,86,-98,3,79,-11,78,0,7,13,2,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-43,-98,-22,-11,0,1,-35,-57,2,3,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-86420,24,-35,-57,86,-98,3,79,-11,78,0,6,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,-86420,13,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,86,22222,33333,100000,33333,28,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,28,86,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,142,-53621,137,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,54,-129,874,6745,67054,-816508,9999999,-86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-86,0,54,-129,-816508,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,203,755,-500,-321,-23,0,76832,-53621,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,203,141,-53621,137,755,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-13,-35,-57,86,-98,79,-11,1000,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,1,1000,-13,-35,-57,13,-38,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-53620,24,-98,79,-11,0,6,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,-53620,24,6,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,11111,-97,79,-11,-41,6,-38,0,-98,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-97,-43,-98,-22,-11,0,0,1,-35,11111,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,11111,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,203,-207,-500,-321,-23,0,76832,-53621,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,-207,203,141,-53621,137,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,677,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,226,912,766,677,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,54,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,21,-206,213,161,53,54,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,161,-900,915,161,-902,911,200,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,200,21,30,21,-206,213,161,161,38,911,915,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-13,-35,-57,87,-98,79,-11,1000,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,1,1000,-13,-35,-57,13,-38,6,87,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,22,-204,-206,213,161,456,-900,915,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,22,-206,213,161,29,38,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,-345,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,-345,-345,11123,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,24,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,24,-345,11123,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,-40,2,-68,-808,21,915,915,-68,-900,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-40,-808,-204,2,-68,-68,21,30,21,21,-206,213,161,38,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-11,-98,79}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,86,79,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,915,-68,-900,2,911,-204}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,2,-204,21,30,21,-206,213,161,911,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,-97531,9,-8,7,-6,0,-4,3,-2,-2,-97531,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,0,3,3,-86420,-97531,7,-97531,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-11,1,-35,-57,13,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,-999,33333,100000,11111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,11111,-22222,-33333,-999,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,915,53,-77,5,-901,911,-68,-808,21,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,21,21,-206,5,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-5,-7,7,-6,0,912,3,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-6,-5,-2,0,1,3,-86420,-97531,7,9,912,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,-11111,11111,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,22222,33333,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621,-53621,-53621,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-53621,-53621,-53621,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,38,-204,-206,213,500,161,-900,-902,911,2,-68,79,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-204,2,-68,21,30,21,-206,500,213,53,161,38,911,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,755,-22223,22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-22222,-22223,-33333,22222,33333,755}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,-204,-206,213,161,456,-900,915,911,2,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,-206,213,161,29,38,911,456,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,26,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,26,44,9,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,76832,22222,33333,100000,33333,100000,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-22222,-33333,22222,33333,33333,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,22222,33333,100000,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,-22222,-33333,22222,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,79,-11,0,6,-53621,28,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-22,-11,0,0,1,24,6,-53621,28,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,30,-206,213,161,161,38,911,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,6114,-204,-206,213,161,-900,915,53,-77,-901,911,-808,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-77,-808,-204,21,30,-206,213,161,53,911,6114,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,13,-21,23,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,13,31,-37,5,-16,23,23,-38,50,6,-17,24,-39,42,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,161,-902,910,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,910,38,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,203,-207,-500,-321,-40,-23,0,76832,-53622,76832,203,-207}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-40,-321,0,-23,203,-207,203,-207,141,-53622,137,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42,-12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,-12,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,-18,25,43,8,-19,26,44,9,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,-200,-501,755,-500,-321,-23,0,76831,-86420,-321}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-501,-200,-321,0,-321,-23,-86420,142,137,755,76831}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,-876,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,-876,5,23,-38,50,6,-17,24,-39,42,7,-18,25,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,3,915,915,-68,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,30,21,3,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-36,86,-98,79,-11,78,0,7,13,1,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,1,-35,-57,-36,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-43,24,-35,-57,86,-98,3,79,-11,78,6,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-11,1,-35,-57,3,13,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,50,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,5,50,23,-38,50,6,-17,24,-39,42,7,-18,25,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-808,-35,-57,-98,79,-11,0,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-808,-11,0,0,1,-35,-57,13,-38,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,13,-21,23,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-11,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30,-21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-21,-33,-11,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,13,31,-37,5,-16,23,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,-32,-204,-206,213,161,456,-900,915,911,2,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-32,-808,-204,2,-68,21,21,-206,213,161,29,911,456,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,26,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,49,49,50,-14,42,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,11,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,26,44,9,45,28,28,46,29,47,49,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-53622,-53620,24,-98,79,-11,0,6,-53621,-38,0,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,-53620,24,6,24,-53621,-53622,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53622,-38,0,-42,24,-53622}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-42,-43,-98,-22,-11,0,0,-38,24,24,-53622,-53622,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,11111,203,-207,-500,0,141,76832,-53621,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,0,11111,203,-207,203,141,141,-53621,137,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33334,-22222,-37,-11111,11111,22222,33333,-53621,-22222,-22222,-22222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-37,11111,-22222,-22222,-22222,-22222,-53621,-33334,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,85,-98,79,-11,0,6,13,-38,0,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,1,-35,-57,13,13,-38,24,6,85,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,915,-68,-900,2,788,-204}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,2,-204,21,30,21,-206,213,161,911,914,915,915,788}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,47,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,44,13,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,31,-37,13,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,8,-19,26,44,9,27,28,46,47,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {855,-22222,-11111,11111,22222,33333,22222,-11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,-11111,11111,-22222,22222,22222,33333,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,161,-900,914,161,-902,911,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,161,161,38,911,914,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {912,677,-11111,766,456798,-33334,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-11111,-15,-33334,912,766,677,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-41,42,43,44,45,46,47,48,49,50,-14,42,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,24,-345,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,24,-345,11123,11124,-999,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,24,8,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,24,11123,8,11124,-999,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,-902,2,-68,79,21,915,915,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-204,2,-68,21,30,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,-500,-321,-23,0,76832,-53621,137}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,203,142,-53621,137,137,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,-902,2,-68,79,21,915,915,-900,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-900,-902,-204,2,-68,21,30,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,10,-85,-129,874,6745,8325,67054,-816508,9999999,-129,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,10,9,-129,-129,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-22,-345,-41,6114,-999,-876,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-22,101,-876,-345,11124,-999,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,-97531,9,-8,7,-6,0,-4,3,-2,-2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,-2,-2,-2,0,3,-86420,-97531,7,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,-36,203,755,-501,-500,-345,28,-23,-23,0,76832,-53621}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-501,0,-23,-23,-36,203,-345,-53621,28,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,-43,24,-35,-57,86,-98,3,79,-11,78,0,7,13,2,-21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-43,-98,-21,-22,-11,0,1,-35,-57,2,3,13,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,-902,2,-68,79,20,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-204,2,-68,20,21,30,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,53,-204,213,500,161,-900,-902,2,-68,79,21,915,915,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-204,2,-68,21,21,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,-999,11111,-999,33333,100000,11111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,11111,-22222,-33333,-999,-999,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,-17,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-41,42,43,44,45,46,47,48,49,50,-14,42,30,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-17,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,-33334,8934,56789,765,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-33334,912,765,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,27,-204,-206,213,161,-900,915,161,-902,910,-68,-808,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-808,-204,-68,21,30,21,-206,213,161,161,27,910,38,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-22,-15,-16,-17,-18,-19,-20,-21,28,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-22,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-13,-35,-57,86,-98,79,-11,1000,6,13,-38,-13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,1,1000,-13,-35,-57,-13,13,-38,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-35,-57,85,86,-98,79,-11,0,6,13,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,0,1,-35,-57,13,-38,6,85,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,22222,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,-22222,-33333,22222,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {25,1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,6,-37,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,-37,13,-38,24,6,24,25,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,-876,4,457,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,-876,5,23,-38,50,6,-17,24,-39,42,7,-18,25,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49,457}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,-876,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-53621,-40,-41,42,43,44,45,46,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,-876,5,23,-38,50,6,-17,24,42,7,-18,25,-53621,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,25,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,7,13,-38,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,13,-38,24,25,7,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,-500,-321,-23,0,76832,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,0,-23,-86420,203,142,137,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,874,8,6745,8325,67054,9999999,-85}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-85,0,8,9,-129,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-204,-8,7,-6,-4,3,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-4,1,-204,3,-86420,-97531,7,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,200,-43,24,-98,79,-11,0,6,28,0,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-11,0,0,1,200,24,6,28,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,21,915,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,21,21,-206,213,161,53,38,911,38,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0,-11,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-11,-11,1,-35,-57,13,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,-200,500,-500,333,-333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,-333,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,79,-41,42,43,44,45,46,47,48,49,50,29,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,23,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,29,48,49,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,-32,-203,-206,213,161,456,-900,915,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-32,-808,-203,2,-68,21,21,-206,213,161,29,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,-40,2,-68,-808,21,915,915,-68,-900,21,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-40,-808,-204,2,-68,-68,21,30,21,21,-206,213,213,161,38,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,875,-85,-129,874,8,6745,8325,67054,9999999,-85}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,-85,0,8,9,-129,8325,874,875,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,161,38,-204,-206,213,912,161,-900,915,53,-77,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,161,53,38,911,912,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-11111,-22222,-11111,11111,11111,86,22222,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,-11111,11111,11111,-22222,-33333,22222,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,2,-68,79,21,915,915,-900,2,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-204,2,-68,2,21,30,21,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {25,1,-22,-43,24,-35,-22,-57,86,-98,3,79,-11,78,0,6,-37,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-22,-11,0,1,-35,-57,3,-37,13,-38,24,6,24,25,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-33333,-901,911,-68,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,-33333,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,203,-500,-345,28,-23,-23,0,76832,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,0,-23,-23,203,-345,-53621,28,137,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-98,-11,0,-86420,-53621,766,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-86420,24,-53621,766}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,456798,226,8934,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,226,912,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,20,38,-204,-206,213,161,-901,915,161,-902,911,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-902,-808,20,-204,-68,21,30,21,-206,213,161,161,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,-901,-11111,-68,-808,-902,21,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-901,-902,-77,-808,-204,-68,21,30,-11111,21,-206,213,161,53,38,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-98,79,-11,-1,6,13,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-1,-22,-11,0,1,-35,-57,13,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {37,-22,24,-98,79,-11,0,-53621,-38,-38,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,0,1,-38,-38,24,-53621,37,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,76832,22222,-53620,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-53620,-33333,22222,33333,33333,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,9,-85,-129,8324,874,6745,8325,67054,-816508,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-85,0,9,-129,-816508,8324,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,22222,33333,-11111,100000,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,-11111,11111,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-207,-900,915,53,-77,-901,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,21,30,-207,53,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,76831,161,-900,915,161,-902,910,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,161,161,910,38,915,915,915,76831}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-6,1,-43,24,-98,79,-11,0,-53621,-38,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-43,-98,-11,0,0,1,-38,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-11111,-20,-21,44,23,23,24,25,26,-500,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,-11111,30,-36,4,-15,31,-37,5,-16,23,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,44,26,44,9,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,500,161,-900,2,-68,79,21,915,915,-900,2,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-204,2,-68,2,21,30,21,21,-206,500,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,20,38,-204,-206,213,161,-901,915,161,-902,911,-68,-808,21,915,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-902,-808,20,-204,-68,21,30,21,21,-206,213,161,161,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {874,0,54,-129,874,6745,8325,67054,-816508,-86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-86,0,54,-129,-816508,8325,874,874,6745,67054}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,22222,11111,86,22222,33333,100000,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,-33333,22222,22222,86,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-57,-98,79,-11,0,6,13,-38,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,-57,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,-204,-206,213,161,-900,914,-902,911,2,-68,-808,21,915,-68,-900,2,788,-204}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-808,-204,2,-68,-68,2,-204,21,30,21,-206,213,161,911,914,915,788}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,500,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-68,21,30,21,-206,500,213,161,53,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,915,38,-204,-206,213,161,-900,914,161,-902,911,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,21,-206,213,161,161,38,911,914,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0,13,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,13,13,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {30,38,500,-206,213,161,8324,-900,915,53,-77,-901,911,-68,-808,21,161,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-68,30,21,-206,500,213,161,53,161,38,911,911,915,8324}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,45,28,28,46,29,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,333,-200,500,-500,333,-333,200}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,-333,500,333,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,500,-206,213,161,-900,915,53,-77,911,-68,-808,49,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-68,21,30,21,-206,500,213,161,53,38,911,49,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,203,-207,-500,-321,-808,-23,0,76832,-53621,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-808,0,-23,203,-207,203,141,-53621,137,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {99999,-33333,-11111,755,-999,33333,100000,11111,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,-33333,-999,33333,755,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-36,86,-98,79,0,-11,78,0,7,13,1,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,0,-11,0,1,1,-35,-57,-36,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-206,213,500,161,-900,-902,2,79,21,915,915,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,2,21,30,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,20,38,-204,-206,213,161,-901,915,161,-902,911,-68,-808,21,915,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-902,-808,20,-204,-68,21,30,21,-206,213,161,161,38,911,38,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,203,-1,-500,-345,28,-23,200,-23,0,76832,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-1,0,-23,-23,200,203,-345,28,137,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,28,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42,-21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-21,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,7,13,2,-21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-21,-22,-11,0,1,-35,-57,2,3,13,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,22,-204,213,161,456,-900,915,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,22,213,161,29,38,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-77,-43,24,-35,-57,86,-57,-98,79,-11,0,6,13,-38,-11,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-77,-11,0,-11,1,-35,-57,-57,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,28,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,-35,3,-14,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,-902,2,-68,79,21,915,915,-900,-902}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-902,-204,2,-68,21,30,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,86,-98,79,-11,0,6,13,-38,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,13,-38,24,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,0,13,86,-35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,-57,-35,13,13,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,914,161,-902,911,-68,-808,21,915,915,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,21,-206,213,161,161,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-11111,-22222,-11111,11111,86,22222,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,-11111,11111,-22222,-33333,22222,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,213,38,-204,-206,213,161,-900,915,911,2,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,-206,213,213,161,29,38,911,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,855,-900,-902,2,-68,79,21,915,915,20,-900,-902}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-902,-204,2,-68,20,21,30,21,-206,500,213,53,915,915,79,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,47,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,49,-36,-37,-38,-39,-40,-41,42,44,13,46,47,48,49,50,29,-36}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,2,11,-13,3,-14,30,-36,-36,4,-15,22,31,-37,13,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,8,-19,26,44,9,27,28,46,47,29,47,29,48,49,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11110,-22223,22222,33333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-11111,11110,-22222,-22223,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,25,-35,-57,86,-98,79,788,-11,0,6,13,-38,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,13,-38,6,25,86,79,788}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,28,-13,-14,-15,-16,-17,-18,-20,-21,22,-34,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,29,26}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-33,1,10,-12,-34,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,7,-18,25,43,8,26,44,26,9,27,45,28,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-900,333,53,-77,911,-68,-808,21,-206}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-77,-808,-204,-68,21,21,-206,-206,213,161,53,333,38,911}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-86420,-97531,9,-8,7,-6,0,-37,3,-2,-2,-97531,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-2,-2,0,3,3,-86420,-37,-97531,7,-97531,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,789,56789,-15,-68,-987,912}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,226,912,912,766,677,789,8934,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1000,200,333,334,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1000,1000,200,-333,500,333,333,334}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,11111,-43,24,-35,-57,-36,86,-98,79,-11,78,0,7,13,1,-38,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-22,-11,0,1,1,-35,-57,-36,13,11111,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,24,-35,-98,-11,0,-86420,-53621,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,0,0,1,-35,-86420,-38,24,-53621}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,-876,4,457,5,6,-902,8,9,10,141,-12,-13,-14,-15,-17,-18,-19,-21,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,4,29,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-902,-40,-41,-21,-21,-33,1,10,-12,-34,2,-13,-35,3,-14,30,-36,30,4,-15,22,31,-37,4,-876,5,23,-38,50,6,141,-17,24,-39,42,-18,25,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49,457}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,11124,-22,-344,-345,6114,-999,-876,101,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-344,-876,-345,-345,11124,-999,6114,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,11,-12,-14,-15,-16,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,49,-33333,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,-33333,28,29,47,48,49,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,500,-206,213,161,-900,915,53,-78,911,-68,-808,49,21,49}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-78,-68,21,30,21,-206,500,213,161,53,38,911,49,49,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,44,-876,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-17,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-53621,-40,-41,42,43,44,45,46,-876,47,48,49,50,4,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-33,1,10,-12,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,4,-876,5,23,-38,-876,50,6,-17,24,42,7,-18,25,-53621,43,44,8,-19,26,44,9,27,45,28,46,29,47,29,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-206,213,500,161,-900,-902,2,2,79,21,915,915,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,2,2,21,30,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,53,-77,911,-68,-808,21,-901}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,-206,213,161,53,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,161,-902,911,-68,-808,21,915,915,213}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,213,161,161,38,911,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,3,79,-11,78,0,6,23,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,1,-35,-57,3,13,23,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,334,915,677,-86420,456798,227,8934,788,56789,-15,-68,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-86420,-15,334,227,912,915,677,788,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-15,-17,-18,-19,2,13,-21,23,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,47,48,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,-15,13,31,-37,5,23,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,48,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-77,-43,-35,-57,86,-57,-200,79,-11,0,6,37,13,-7,-11,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-200,-43,-22,-77,-11,0,-11,1,-35,-57,-57,13,6,37,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-98,-11,0,-86420,-53621,-38,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,0,1,-35,-86420,-38,24,-53621}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,11111,24,-35,-57,-36,86,79,-11,78,0,7,13,1,-38,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-98,-22,-11,0,1,1,-35,-57,-36,13,11111,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,86,33333,100000,33333,28,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,28,86,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,54,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,21,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-204,-68,21,30,21,21,-206,213,161,53,54,38,911,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,0,76832,-53621,-500,31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,0,-23,31,203,142,-53621,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53621,-38,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {203,-500,-206,28,-23,-23,0,76832,-57,-500,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-500,0,-23,-23,-57,-206,203,28,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,915,38,-204,-206,213,-42,161,-900,914,161,-902,911,-68,-808,21,915,915,38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-42,-808,-204,-68,21,30,21,-206,213,161,161,38,911,38,914,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,20,38,-204,-206,213,161,-901,915,161,-902,911,-68,-809,21,915,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-902,-809,20,-204,-68,21,30,21,21,-206,213,161,161,38,911,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,-15,-38,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-15,-38,-38,24,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {13,1,-22,-43,24,-35,-57,86,-98,79,-11,0,-33,6,13,-38,0,13,0,86,-35}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-33,0,0,1,-35,-57,-35,13,13,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {6114,53,-43,24,-98,-999,30,79,-11,0,-53621,-38,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-2,-43,-98,-11,0,30,-38,24,-53621,53,-999,6114,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,-57,11111,11111,86,22222,11110,33333,100000,100000,100000,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,100000,100000,-57,-11111,11110,11111,11111,-22222,-33333,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,-204,-206,213,161,456,-900,915,911,2,-68,-808,21,-206,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,-206,-206,213,161,29,38,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-33,-19,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,26,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,49,49,50,-14,42,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,-33,1,10,-12,-34,2,11,-35,11,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,26,44,9,45,28,28,46,29,47,49,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-43,24,-35,86,-98,3,79,-11,78,6,13,-38,24}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-11,1,-35,3,13,-38,24,6,24,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-98,-809,-11,0,6,-38,0,-43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-43,-22,-11,0,0,1,-809,-35,-57,-38,24,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,-86420,-97531,9,-8,7,-6,5,0,-36,3,-2,1,-97531}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-2,0,1,-36,3,-86420,5,-97531,7,-97531,9,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {24680,213,-97531,9,-8,7,-6,0,912,-2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-8,-6,-2,0,1,213,-97531,7,9,912,24680}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,915,677,-86420,456798,227,8934,788,20,-15,-68,8934,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {20,-68,-86420,-15,-86420,227,912,915,677,788,789,8934,8934,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,31,101,24,8,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,31,-345,24,11123,8,11124,-999,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,8934,56789,-15,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,226,912,766,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11112,11111,86,22222,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,11112,-33333,22222,22222,86,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-23,-57,86,-98,79,0,-11,78,0,7,13,1,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,0,-11,0,1,-23,1,-57,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {137,203,-500,-345,28,-23,0,76832,-53621,-500}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,0,-23,203,-345,-53621,28,137,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-98,79,-11,0,-53621,-38,0,-22}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-22,1,-38,24,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,9999999,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-53621,-11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,-53621,86,79,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,86,-98,79,-11,0,6,13,-38,-11,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,-11,1,-35,-57,13,-38,24,6,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,911,2,-68,-41,21,-42,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-41,-42,-204,2,-68,21,30,21,-206,213,161,38,911,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,914,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,42,43,44,45,46,-1,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-41,-20,-21,-32,-1,-33,1,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,25,43,8,-19,26,44,9,27,45,28,46,29,47,48,49,914}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {2,3,4,5,6,7,8,9,10,11,-12,-14,-22,-15,-16,-17,-18,-19,-20,-21,28,22,23,24,25,26,27,28,29,30,31,-33,-34,-35,-36,-37,-38,-37,-39,-40,78,42,43,44,45,46,47,48,49,50,-14,42}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-22,-33,10,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,28,46,29,47,48,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,915,677,677,-86420,456798,227,8934,788,20,-15,-68,8934,-86420}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {20,-68,-86420,-15,-86420,227,912,915,677,677,788,789,8934,8934,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,0,24,-35,-57,86,-98,79,-11,-34,6,13,-38,-11,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,0,-11,-11,1,-34,-35,-57,13,-38,24,6,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-22,-43,24,-98,79,-11,0,-53621,-38,0,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,-38,24,-345,-53621,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,915,161,-902,-345,910,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,213,-345,161,161,910,38,915,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-6,1,-22,-43,24,-57,86,-98,79,-11,0,6,13,-38,-11,6,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-6,-43,-98,-22,-11,0,-11,1,-57,13,13,-38,24,6,6,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,-999,11111,-999,33333,100000,11111,11111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,11111,11111,11111,-22222,-33333,-999,-999,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,79,-11,0,6,28,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-22,-11,0,0,1,24,6,28,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {25,1,-22,-43,24,-35,-22,-57,86,-98,3,79,-11,78,0,6,-37,13,-38,24,-98}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-98,-22,-22,-11,0,1,-35,-57,3,-37,13,-38,24,6,24,25,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-23,-57,86,-98,79,0,-11,78,0,7,-86,13,1,-38}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-86,-43,-98,-22,0,-11,0,1,-23,1,-57,13,-38,24,7,86,78,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,23412,11124,-22,11123,-345,6114,-999,-876,101,24,8,6114}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,24,11123,8,11124,-999,23412,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {142,137,203,755,-500,-321,-23,1,0,76832,-53621,-500,31,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-500,-321,0,0,-23,1,31,203,142,-53621,137,755,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,766,456798,226,789,56789,-15,-68,-987,912}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-68,-15,-987,226,912,912,766,677,789,789,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,11110,-98,79,-11,0,6,-38,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-22,-11,0,0,1,-35,11110,-38,24,6,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,500,-206,213,161,-900,915,53,-77,-901,911,-68,-808,21,161,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-68,21,30,21,30,-206,500,213,161,53,161,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,-902,-40,2,-68,-808,915,915,-68,-900,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-40,-808,-204,2,-68,-68,21,30,21,-206,213,161,38,914,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-206,213,-43,161,-900,-902,2,2,79,21,915,915,-900,161}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-43,2,2,21,30,21,-206,213,53,161,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {141,137,202,-207,-500,-321,-808,-23,0,76832,-53621,76832,203}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-321,-808,0,-23,202,-207,203,141,-53621,137,76832,76832}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {30,38,500,-206,213,161,8324,-900,915,53,-77,-901,911,-68,-808,8323,21,161,911}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-68,30,21,-206,500,213,161,53,161,38,911,911,915,8323,8324}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,86,33333,11112,100000,33333,28,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,11112,-33333,28,86,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {789,912,677,456798,-33334,8934,56789,-15,-97531,8934}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-15,-97531,-33334,912,677,789,8934,8934,56789,456798}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,29,38,22,-204,213,161,456,23,-900,915,911,2,-68,-808,21,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-808,-204,2,-68,21,21,22,23,213,161,29,38,911,456,915,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,-345,-345,-345}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,-345,-345,-345,11123,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-77,-43,-35,-57,86,-57,53,-200,79,-11,0,6,86,37,13,-7,-11,86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-7,-200,-43,-77,-11,0,-11,1,-35,-57,-57,13,6,53,37,86,86,86,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,11,-12,-14,-15,-16,-17,26,-18,-19,-20,-21,22,23,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-40,78,42,43,44,45,49,-33333,47,48,49,50,-14,42,29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,1,-12,-34,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,26,-19,26,44,9,27,45,-33333,28,29,47,29,48,49,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,-22,-43,24,-35,-57,-36,86,-98,79,0,-11,78,915,0,7,13,1,-38,-43}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-43,-98,-43,-22,0,-11,0,1,1,-35,-57,-36,13,-38,24,7,86,78,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,22,23,10,24,25,26,27,28,29,30,31,-32,-33,-34,-35,-36,-37,-38,-39,79,-41,42,43,44,45,46,47,48,49,50,29,23}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-20,-21,-32,-33,1,10,-12,10,-34,2,11,-13,-35,3,-14,30,-36,4,-15,22,31,-37,5,-16,23,-38,50,23,6,-17,24,-39,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,29,47,29,48,49,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-19,2,-21,22,23,24,25,26,27,28,30,30,31,-32,-33,-34,-35,-36,-37,-38,-39,-41,42,43,44,45,46,47,49,50,-14,42,30}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-41,-21,-32,-33,1,10,-12,-34,2,11,2,-35,3,-14,30,30,-36,-14,30,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,44,9,27,45,28,46,47,49}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,76831,-900,915,161,-902,910,-68,-808,21,915,915}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-902,-808,-204,-68,21,30,21,-206,161,910,38,915,915,915,76831}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,38,-204,-206,213,161,-899,915,161,-902,911,-68,-987,-808,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-902,-808,-204,-68,21,21,-206,213,-987,161,161,-899,38,911,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1000,-1001,200,-200,500,-500,333,-333}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-500,-200,-1001,1000,200,-333,500,333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11,-12,-14,-15,-16,-17,-18,-33,-19,912,-20,-21,22,23,24,25,26,28,28,29,30,31,-32,-33,-34,26,-35,-36,-37,-38,-39,-40,78,42,43,44,45,46,47,49,49,50,-14,42,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-40,-20,-21,-32,-33,-33,1,10,-12,-34,10,2,11,-35,3,-14,30,-36,-14,4,-15,22,31,-37,5,-16,23,-38,50,6,-17,24,-39,42,42,7,-18,25,43,8,-19,26,26,44,9,45,28,28,46,29,47,912,49,49,78}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,33334,11112,-22223,11111,86,22222,22222,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,-11111,11111,-22222,11112,-22223,-33333,22222,22222,86,33333,33334}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11111,11111,11111,86,22222,912,33333,100000,33333,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,11111,11111,-22222,-33333,22222,912,86,33333,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-207,33333,915,53,-77,-901,911,-808,53}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-901,-77,-808,-204,21,30,-207,53,53,38,911,33333,915}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {-33333,-22222,-11112,11111,22222,33333,-11111,100000,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {100000,100000,-11111,-11112,11111,-22222,-33333,22222,33333}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,53,-204,-206,213,500,161,-900,-902,2,-68,79,21,915,915,-900,-902,21}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-902,-204,2,-68,21,30,21,21,-206,500,213,53,161,915,915,79}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,-34,855,23413,11124,-22,11123,-345,6114,-999,-876,101,24,8,6114,11124}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,-34,101,-876,-345,24,11123,8,11124,-999,11124,6114,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,54,874,6745,8325,67054,-816508,9999999,-86}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-86,0,54,-816508,8325,874,6745,67054,9999999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,76831,161,-900,-6,915,161,-902,910,-68,-808,21,915,915,-900}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-900,-902,-6,-808,-204,-68,21,30,21,-206,161,161,910,38,915,915,915,76831}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {456,855,23413,11124,-22,-345,6114,-999,101}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-22,101,-345,11124,-999,6114,23413,456,855}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {21,30,38,-204,-206,213,161,-900,914,53,-77,-901,911,-808,1000,-808}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-900,-901,-77,-808,-808,1000,-204,21,30,-206,213,161,53,38,911,914}
        );
    }
}
