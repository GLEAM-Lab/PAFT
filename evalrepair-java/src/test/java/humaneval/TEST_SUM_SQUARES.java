package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SUM_SQUARES {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,3});
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,4,9});
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,1,1,1,1});
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1});
        org.junit.Assert.assertEquals(
            result, -3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-5,2,-1,-5});
        org.junit.Assert.assertEquals(
            result, -126
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-56,-99,1,0,-2});
        org.junit.Assert.assertEquals(
            result, 3030
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,0,0,0,0,0,0,0,-1});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-16,-9,-2,36,36,26,-20,25,-40,20,-4,12,-26,35,37});
        org.junit.Assert.assertEquals(
            result, -14196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-3,17,-1,-15,13,-1,14,-14,-12,-5,14,-14,6,13,11,16,16,4,10});
        org.junit.Assert.assertEquals(
            result, -1448
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,8,10,12});
        org.junit.Assert.assertEquals(
            result, 1090
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,1,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,3,4,5,6,7,8,9,10});
        org.junit.Assert.assertEquals(
            result, 1039
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 23709
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,5,-6,7,-8});
        org.junit.Assert.assertEquals(
            result, -460
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,8,10,12,14,16,18,20});
        org.junit.Assert.assertEquals(
            result, 7534
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10});
        org.junit.Assert.assertEquals(
            result, 1007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,18,21,24,27,30});
        org.junit.Assert.assertEquals(
            result, 24609
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,1,0,1,0,1,0,1,0,1});
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, 999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,6,19,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 15301
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,6,9,-10});
        org.junit.Assert.assertEquals(
            result, 465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,9,12,5,19,18,2,21,24,27});
        org.junit.Assert.assertEquals(
            result, 21510
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,3,6,12,15,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 23703
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,18,21,24,27,30,21});
        org.junit.Assert.assertEquals(
            result, 24630
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,-8,5});
        org.junit.Assert.assertEquals(
            result, 1004
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 6624
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,18,12,15,18,21,24,27,30});
        org.junit.Assert.assertEquals(
            result, 33747
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,8,10,12,10,10});
        org.junit.Assert.assertEquals(
            result, 1200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,18,21,24,28});
        org.junit.Assert.assertEquals(
            result, 6625
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-8,6,-10});
        org.junit.Assert.assertEquals(
            result, -793
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,3,-8,6,12,15,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 16681
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,22,12,18,21,24});
        org.junit.Assert.assertEquals(
            result, 2719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,1,0,1,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,3,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,9,12,5,19,18,2,21,24});
        org.junit.Assert.assertEquals(
            result, 20781
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-9,7,-8,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, -224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,18,21,24,27,30,21,24});
        org.junit.Assert.assertEquals(
            result, 24654
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,21,24,27,30});
        org.junit.Assert.assertEquals(
            result, 31167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,4,-4,5,-6,7,18,9,-10,-8,5});
        org.junit.Assert.assertEquals(
            result, 1031
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,15,18,21,24,27,12});
        org.junit.Assert.assertEquals(
            result, 23853
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,22,12,18,21,25});
        org.junit.Assert.assertEquals(
            result, 2720
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,2,-4,5,-6,7,-8,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, 998
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,10,12,10,10});
        org.junit.Assert.assertEquals(
            result, 1952
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,14,10,15,21,24,27,23,30});
        org.junit.Assert.assertEquals(
            result, 17195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,2,-2,5,-6,7,-8,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, 986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-9,7,-8,9,7,-8});
        org.junit.Assert.assertEquals(
            result, -207
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-6,7,-8,9,-10,-8,5});
        org.junit.Assert.assertEquals(
            result, -1049
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,9,12,15,18,21,24,27,12});
        org.junit.Assert.assertEquals(
            result, 8466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,1,-2,3,-4,-6,7,-8,9,-10,5});
        org.junit.Assert.assertEquals(
            result, 862
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {23,6,8,10,12,10,10});
        org.junit.Assert.assertEquals(
            result, 2481
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,4,-4,5,-6,7,18,9,0,-8,5});
        org.junit.Assert.assertEquals(
            result, 931
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,3,0,0,8,0,0});
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {9,12,15,18,21,24,27,12});
        org.junit.Assert.assertEquals(
            result, 10458
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {21,6,22,12,18,21,12,24});
        org.junit.Assert.assertEquals(
            result, 6634
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,3,0,23,0,8,0,-1,0});
        org.junit.Assert.assertEquals(
            result, 1067
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,3,6,12,15,18,21,27});
        org.junit.Assert.assertEquals(
            result, 4023
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,30,6,9,12,18,21,24,28,28});
        org.junit.Assert.assertEquals(
            result, 25068
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,6,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,30,6,12,18,21,24,0,28});
        org.junit.Assert.assertEquals(
            result, 28565
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,19,3,-4,-6,7,-8,9,-10,-8,5});
        org.junit.Assert.assertEquals(
            result, -1028
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,3,0,0,0});
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-9,7,-8,9,7,-8,-6});
        org.junit.Assert.assertEquals(
            result, -171
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,-8,3});
        org.junit.Assert.assertEquals(
            result, 1002
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,-6,15,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 14865
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,3,14,0,0,3});
        org.junit.Assert.assertEquals(
            result, 2756
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,30,6,13,18,21,24,0,28});
        org.junit.Assert.assertEquals(
            result, 28590
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,12,15,18,21,24,27,30,21});
        org.junit.Assert.assertEquals(
            result, 34149
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {9,14,15,18,21,24,27,12});
        org.junit.Assert.assertEquals(
            result, 10460
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,5,-6,-6,7,-8,-6});
        org.junit.Assert.assertEquals(
            result, 410
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,-2,3,5,-7,7,-8,1,9,-10,-8,3,5});
        org.junit.Assert.assertEquals(
            result, 247
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,4,-4,5,-6,7,18,9,0,5});
        org.junit.Assert.assertEquals(
            result, 939
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,21,-10,-8,3});
        org.junit.Assert.assertEquals(
            result, 9534
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,30,6,13,18,20,24,0,28});
        org.junit.Assert.assertEquals(
            result, 28589
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,12,18,16,21,24,28});
        org.junit.Assert.assertEquals(
            result, 28433
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,-7,5});
        org.junit.Assert.assertEquals(
            result, 1005
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,8,10,12,14,16,20});
        org.junit.Assert.assertEquals(
            result, 9302
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,3,0,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {30,6,13,18,21,24,0,28});
        org.junit.Assert.assertEquals(
            result, 10556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,30,6,12,18,21,24,28});
        org.junit.Assert.assertEquals(
            result, 6641
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,24,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,3,14,24,19,0,0,3});
        org.junit.Assert.assertEquals(
            result, 3147
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,27,3,0,23,0,8,0,-1,0});
        org.junit.Assert.assertEquals(
            result, 1796
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-9,7,-8,9,7,-8,-6,3});
        org.junit.Assert.assertEquals(
            result, -168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,8,12,15,18,21,24,30,21});
        org.junit.Assert.assertEquals(
            result, 16921
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,9,22,11,18,21,24});
        org.junit.Assert.assertEquals(
            result, 2322
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,-9,6,8,12,18,21,24,28,28,12});
        org.junit.Assert.assertEquals(
            result, 25024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,10,6,9,8,12,15,18,21,24,30,21});
        org.junit.Assert.assertEquals(
            result, 10761
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,22,12,18,21,25});
        org.junit.Assert.assertEquals(
            result, 2713
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,2,-4,5,-6,7,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, -742
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {13,3,-8,6,12,15,18,21,24,27});
        org.junit.Assert.assertEquals(
            result, 16841
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,21,-10,-8,8});
        org.junit.Assert.assertEquals(
            result, 9539
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,-4,5,-6,7,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, -626
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {10,6,9,8,12,15,18,21,24,30,21});
        org.junit.Assert.assertEquals(
            result, 17012
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,3,0,3,0,0,0});
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,4,-4,5,-6,7,18,9,5});
        org.junit.Assert.assertEquals(
            result, 959
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,3,11,14,24,19,0,0,3,0});
        org.junit.Assert.assertEquals(
            result, 1952
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-3,3,-4,5,-6,7,-8,9,-10,-7,5});
        org.junit.Assert.assertEquals(
            result, 1004
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,6,0,0,0,0,0});
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,6,13,10,12});
        org.junit.Assert.assertEquals(
            result, 1195
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,4,-4,5,-6,7,18,0,-8,5,0});
        org.junit.Assert.assertEquals(
            result, 274
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-4,5,-6,7,-8,9,-10,-8});
        org.junit.Assert.assertEquals(
            result, -1052
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,2,22,12,18,21});
        org.junit.Assert.assertEquals(
            result, 6030
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {21,5,22,12,18,21,12,24});
        org.junit.Assert.assertEquals(
            result, 6633
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1674
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 1161
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -915
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, -2851
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 1272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 722682
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11});
        org.junit.Assert.assertEquals(
            result, -718
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5817
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, 1392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5817
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,-14,1});
        org.junit.Assert.assertEquals(
            result, -105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,-9,3,3,4,4,4,4,4,5,5,5,5,3});
        org.junit.Assert.assertEquals(
            result, -451
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,-6,7,-5,-8,9,-10,11,-12,13,-14,1});
        org.junit.Assert.assertEquals(
            result, 315
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 4197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,4,11});
        org.junit.Assert.assertEquals(
            result, 1912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 847682
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 263
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -1492
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-15,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 783899
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,-1,94,50});
        org.junit.Assert.assertEquals(
            result, 839219
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 310
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 5407
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,18,19,-16,20});
        org.junit.Assert.assertEquals(
            result, 7304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,6,19,7,-9,-3,4,11});
        org.junit.Assert.assertEquals(
            result, 2038
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19});
        org.junit.Assert.assertEquals(
            result, 565
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 1287
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 328
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 7109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,9,5,-10,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -311
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7});
        org.junit.Assert.assertEquals(
            result, 4204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,-14,-12});
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,33,6,-4,50,-4,4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, 47449
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,-6,7,-5,-8,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 316
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,-16});
        org.junit.Assert.assertEquals(
            result, 549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,4,11,11});
        org.junit.Assert.assertEquals(
            result, 2033
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,-11,5,6,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 13374
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,49});
        org.junit.Assert.assertEquals(
            result, 614
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,37,10,11,-13,-14,-15,-16,-17,49,19});
        org.junit.Assert.assertEquals(
            result, 50771
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, -4601
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,9,5,-10,-12,13,20,-6});
        org.junit.Assert.assertEquals(
            result, -241
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,7,0,8,-9,-3,10,10});
        org.junit.Assert.assertEquals(
            result, 561
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,-11,5,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 55805
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,20,19});
        org.junit.Assert.assertEquals(
            result, -1131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,6,19,7,-9,-3,4,11,4});
        org.junit.Assert.assertEquals(
            result, 2054
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,7,-5,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,49});
        org.junit.Assert.assertEquals(
            result, -1700
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,3,-4,5,-6,7,-5,-8,9,11,-12,13,-14,1,-14});
        org.junit.Assert.assertEquals(
            result, -2646
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,-5,2,-4,5,-6,7,-8,9,5,-10,-12,13,20,-6});
        org.junit.Assert.assertEquals(
            result, 1092
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,4,11,7});
        org.junit.Assert.assertEquals(
            result, 1961
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,4,7});
        org.junit.Assert.assertEquals(
            result, 924
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,49});
        org.junit.Assert.assertEquals(
            result, 595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 6076
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,88});
        org.junit.Assert.assertEquals(
            result, 1404154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {37,3,-4,-2,5,7,-5,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 2549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, 7005
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {70,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,1,1,72});
        org.junit.Assert.assertEquals(
            result, 793983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 291
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,3,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,13,-14,-12});
        org.junit.Assert.assertEquals(
            result, 1149
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,21,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 10548
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1494139
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, -991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,-16,0,-17,18,19,-16,20});
        org.junit.Assert.assertEquals(
            result, -5019
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,15,7,8,-9,-3,4,11,7});
        org.junit.Assert.assertEquals(
            result, 1975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,-14,-4});
        org.junit.Assert.assertEquals(
            result, -90
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,12,-16,0,-17,18,19,-16,20});
        org.junit.Assert.assertEquals(
            result, 6529
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,1,2,3,4,-11,5,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 55926
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-14,5,-6,7,-5,-8,9,-10,11,-12,13,-14,-12});
        org.junit.Assert.assertEquals(
            result, 218
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,1,-2,3,-14,5,-6,7,-5,-8,9,-10,11,-12,13,-14,58,-15});
        org.junit.Assert.assertEquals(
            result, 192890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-9,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 6156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-11,20});
        org.junit.Assert.assertEquals(
            result, -1123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,21,8,-9,-3,10,11,-9});
        org.junit.Assert.assertEquals(
            result, 10539
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 323
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, -595
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14,10});
        org.junit.Assert.assertEquals(
            result, 864
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,-10,1,8,21,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 678
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-3,-6,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, -800
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1,1});
        org.junit.Assert.assertEquals(
            result, 5408
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,7,8,9,10,11,13});
        org.junit.Assert.assertEquals(
            result, 1466
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 7129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,94,6,1,-4,8,21,8,-9,-3,10,11,-9});
        org.junit.Assert.assertEquals(
            result, -115
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,-15,49,19,49,-16});
        org.junit.Assert.assertEquals(
            result, -3257
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,3,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, 10994
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,20,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 13790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,-18,6,1,7,8,-9,-3,4,11,11,6});
        org.junit.Assert.assertEquals(
            result, 2220
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,11,19,49});
        org.junit.Assert.assertEquals(
            result, -1921
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,-5,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 1060
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,1,7,8,-9,-3,4,11,11});
        org.junit.Assert.assertEquals(
            result, 643
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-14,-15,-16,-17,-17,18,19,-11,20});
        org.junit.Assert.assertEquals(
            result, -2112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 320
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1494227
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,39,45,48,49,50,58,70,64,72,80,82,88,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1494226
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,0});
        org.junit.Assert.assertEquals(
            result, 5797
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-13,-15,-17,20,33,73,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50,45});
        org.junit.Assert.assertEquals(
            result, 1493213
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,12,12,-13,-14,-15,-16,-17,-17,18,19,-16,20});
        org.junit.Assert.assertEquals(
            result, 7305
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 875701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,-1,94,50,50});
        org.junit.Assert.assertEquals(
            result, 841719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,17,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, -2818
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,19,7,-9,-3,4,11,4});
        org.junit.Assert.assertEquals(
            result, 7162
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,8,7,0,8,-9,-3,10,10,10});
        org.junit.Assert.assertEquals(
            result, 1268
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,13,-14,1,-2});
        org.junit.Assert.assertEquals(
            result, -89
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1,1,-3});
        org.junit.Assert.assertEquals(
            result, 5405
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {37,3,-4,-2,5,7,-5,-8,-7,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 1420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7});
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0,2});
        org.junit.Assert.assertEquals(
            result, 12709
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -117
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,-3,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, -4673
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,-12,13,-14,92,-10});
        org.junit.Assert.assertEquals(
            result, 778561
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,17,13,-14,92,-10});
        org.junit.Assert.assertEquals(
            result, 778590
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,45,9,37,10,11,-13,-14,-16,-17,49,19,45});
        org.junit.Assert.assertEquals(
            result, 48890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,33,6,-4,50,-4,4,-4,4,11,12,13,14,16,16,17,18,19,20,-20,-19,51,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, 47553
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,9,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1547381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50,37});
        org.junit.Assert.assertEquals(
            result, 926354
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-9,0,2,16,0,0});
        org.junit.Assert.assertEquals(
            result, 6156
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 6593
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,7,-9,-3,4,11,4});
        org.junit.Assert.assertEquals(
            result, 1723
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, -784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-13,-15,-17,20,33,73,37,40,45,48,49,72,58,70,64,72,80,82,88,92,94,50,45});
        org.junit.Assert.assertEquals(
            result, 1493235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,-9,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 778007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50,37,50,50});
        org.junit.Assert.assertEquals(
            result, 1118516
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,18,19,-16,20});
        org.junit.Assert.assertEquals(
            result, 7269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,-5,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,0,-11,0,0,1,2,3,4,-11,5,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 10968
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 9765
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,15,80,7,8,-9,-3,4,11,7});
        org.junit.Assert.assertEquals(
            result, 7051
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 5804
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 1421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,82,49,39,45,48,49,50,58,70,64,72,80,82,88,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1494271
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,45,9,37,10,11,-13,-14,-16,-17,49,19,45,45});
        org.junit.Assert.assertEquals(
            result, 48935
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,9,-10,11,-12,14,-14,1,-5});
        org.junit.Assert.assertEquals(
            result, 315
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-12,-10,11,-12,13,-14,1});
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,48,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, 951
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 335
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,16,2,2,2,3,3,3,3,4,4,4,3,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 302
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,8,9,10,11,12,-13,-14,-16,-17,-17,18,19,-16,20,7});
        org.junit.Assert.assertEquals(
            result, -213
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,20,19,-17,10});
        org.junit.Assert.assertEquals(
            result, -6034
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,-16,-16,-13});
        org.junit.Assert.assertEquals(
            result, -1392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 778845
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,-16,20,0,-17,18,18,-16,20,-14,6});
        org.junit.Assert.assertEquals(
            result, 5820
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-15,-4,11,12,13,14,15,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, -2716
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,49,7});
        org.junit.Assert.assertEquals(
            result, 663
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,48,49,58,70,64,72,80,82,88,92,94,50,88,58,33});
        org.junit.Assert.assertEquals(
            result, 836748
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 6077
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-11,20,20});
        org.junit.Assert.assertEquals(
            result, 6877
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-15,-16,-17,-17,94,49});
        org.junit.Assert.assertEquals(
            result, -32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,4,5,6,7,8,9,10,11,12,12,14,15,16,17,18,19,20,21,-9,0,2,16,0,0});
        org.junit.Assert.assertEquals(
            result, 6132
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,0,70,64,72,80,82,88,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1509640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {73,1,1,1,1,-9,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,92,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 784094
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-15,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 489
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-3,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, 1898
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,4,4,4,72,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 396
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,1,-3});
        org.junit.Assert.assertEquals(
            result, 778817
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,82,88,-1,33,94,50,50});
        org.junit.Assert.assertEquals(
            result, 973146
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,4,-14,-12});
        org.junit.Assert.assertEquals(
            result, -1620
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,6,-6,7,-8,9,5,-10,11,-12,13,-14,10});
        org.junit.Assert.assertEquals(
            result, 865
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,49,48,49,50,58,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1306988
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,-2,3,-4,-2,5,-6,7,-5,-8,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -2111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,19,7,-9,10,4,11,4});
        org.junit.Assert.assertEquals(
            result, 7175
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,9,10,11,13,2});
        org.junit.Assert.assertEquals(
            result, 2684
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,21,-1,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 10740
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,49,48,49,-7,58,82,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1096417
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,-15,49,19,49,-16,8});
        org.junit.Assert.assertEquals(
            result, -3249
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {13,-2,3,-4,5,-13,-6,7,-8,9,-10,11,-12,13,-14,-12,13});
        org.junit.Assert.assertEquals(
            result, 2395
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {37,3,-4,-2,5,7,-5,-8,-7,9,-10,-13,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 1419
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,18,19,20,19});
        org.junit.Assert.assertEquals(
            result, -1420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,1,2,-15,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 483
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,-11,5,6,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 13374
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,3,3,3,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,9,-10,-13,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, -555
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,20,-14,11});
        org.junit.Assert.assertEquals(
            result, 1403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,3,-4,5,-6,6,-5,-8,9,11,-12,13,-14,1,-14});
        org.junit.Assert.assertEquals(
            result, -2647
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,41,45,48,49,50,58,70,64,72,80,82,88,-1,94,50});
        org.junit.Assert.assertEquals(
            result, 1493246
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,73,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {73,6,1,7,8,-9,-3,4,11,7});
        org.junit.Assert.assertEquals(
            result, 7281
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,11,5,5,5,1,-3});
        org.junit.Assert.assertEquals(
            result, 778938
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-3,-10,11,-12,13,4,-14,-12});
        org.junit.Assert.assertEquals(
            result, -2881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,16,-5,2,-4,5,-6,7,-8,10,5,-10,10,11,17,13,92,-10});
        org.junit.Assert.assertEquals(
            result, 778558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,-4,-10,11,-12,13,-14,92,-10,-8});
        org.junit.Assert.assertEquals(
            result, 778616
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,1,2,2,2,-3,-3,72,-3,-2,-3,-3,-4,-4,-4,92,5,5,5,1,1,-3});
        org.junit.Assert.assertEquals(
            result, 783907
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,49,11,19,49});
        org.junit.Assert.assertEquals(
            result, -1672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,49,40,45,49,48,49,50,58,64,82,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1519891
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 8608
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,-9,-3,10,11,6,6});
        org.junit.Assert.assertEquals(
            result, 1463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,-13,-14,-15,-16,-17,18,19,-11,20});
        org.junit.Assert.assertEquals(
            result, -2329
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {70,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-5,-4,-4,-4,92,5,5,5,5,1,1,72});
        org.junit.Assert.assertEquals(
            result, 793922
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,0,6});
        org.junit.Assert.assertEquals(
            result, 6629
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-9,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,-16,-13});
        org.junit.Assert.assertEquals(
            result, 763
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-14,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 5392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,-17,20,33,37,40,45,48,49,50,58,70,-15,64,72,80,82,88,92,94,88,50});
        org.junit.Assert.assertEquals(
            result, 1425107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,49,10,11,-13,-14,-15,-16,-17,-17,49,49});
        org.junit.Assert.assertEquals(
            result, 115734
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,17,0});
        org.junit.Assert.assertEquals(
            result, 6110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,17,18,19,20,-20,-19,13,-18,-17,-16,-15,-14,-13});
        org.junit.Assert.assertEquals(
            result, -950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 4756
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,20,-15});
        org.junit.Assert.assertEquals(
            result, -1267
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,-7,9,-10,-13,11,-12,20,-14,11});
        org.junit.Assert.assertEquals(
            result, 973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,49,-13,10,11,-13,-14,-15,-16,-17,-17,49,49});
        org.junit.Assert.assertEquals(
            result, 118569
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,-3,-4,-5,-7,-8,-9,-10,-11});
        org.junit.Assert.assertEquals(
            result, -1589
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,9,-10,-13,11,-12,20,-14,-2,-6,5});
        org.junit.Assert.assertEquals(
            result, -396
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,8,-9,-3,10,11,1});
        org.junit.Assert.assertEquals(
            result, 1288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,49,11,19,49,49});
        org.junit.Assert.assertEquals(
            result, -1623
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,-9,1,2,2,2,2,2,-3,-3,-3,92,-3,-4,4,-4,-4,-4,92,5,5,5,5,5,5,5,92});
        org.junit.Assert.assertEquals(
            result, 8039
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,7,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 1084
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,1,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-5,92,11,5,5,5,1,-3,2});
        org.junit.Assert.assertEquals(
            result, 778938
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,-1,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 5819
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,8,7,0,8,-3,10,10,10});
        org.junit.Assert.assertEquals(
            result, 1199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,1,-2,3,-14,5,-6,-8,9,-10,11,-12,13,-14,58});
        org.junit.Assert.assertEquals(
            result, -1437
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,0,6});
        org.junit.Assert.assertEquals(
            result, 6662
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,12,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 431
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-14,-8,9,-10,11,-12,13,-14,13});
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,50,58,70,64,72,80,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 976855
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,9,-10,12,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 343
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,6,-10,1,8,21,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 1733
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,6,-6,7,-8,9,5,-10,11,-12,13,-14,10});
        org.junit.Assert.assertEquals(
            result, 1259
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-12,-4,11,12,13,14,15,17,18,19,20,-20,-19,13,-18,-17,-16,-15,-14,-13,-4});
        org.junit.Assert.assertEquals(
            result, -4910
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-13,-17,20,33,82,49,39,45,48,49,50,58,70,64,72,80,82,88,92,94,88});
        org.junit.Assert.assertEquals(
            result, 1251128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-17,-17,-17,49,19,49,9});
        org.junit.Assert.assertEquals(
            result, 728
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,70,64,72,80,82,88,92,94,88});
        org.junit.Assert.assertEquals(
            result, 852811
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,-1,94,50,50,64});
        org.junit.Assert.assertEquals(
            result, 841783
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-10,-8,9,5,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -3416
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,14,11,-13,-14,-15,-16,-17,-17,49,13,7});
        org.junit.Assert.assertEquals(
            result, 2310
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,18,19,20,19,18});
        org.junit.Assert.assertEquals(
            result, -1096
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,1,7,8,-9,-3,3,11,11});
        org.junit.Assert.assertEquals(
            result, 606
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,10,11,13,2});
        org.junit.Assert.assertEquals(
            result, 2963
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,49,40,45,49,48,49,50,58,21,82,72,80,82,88,94,50});
        org.junit.Assert.assertEquals(
            result, 811766
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,40,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 7960
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {94,6,1,-4,8,21,8,-9,-3,10,-9});
        org.junit.Assert.assertEquals(
            result, 9511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,-16,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, -4297
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,19,19,20,-15});
        org.junit.Assert.assertEquals(
            result, -1230
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,-13,-14,-15,-16,-17,-17,49,19,-14});
        org.junit.Assert.assertEquals(
            result, -2128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {11,4,6,2,1,7,8,-9,-3,3,11,11,-9});
        org.junit.Assert.assertEquals(
            result, 283
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,15,7,8,-9,-3,4,11,7});
        org.junit.Assert.assertEquals(
            result, -240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,2,48,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 316
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,19,-15});
        org.junit.Assert.assertEquals(
            result, 809
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,9,64,72,80,82,88,92,94,88});
        org.junit.Assert.assertEquals(
            result, 852750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-4,-2,5,-6,7,-5,-8,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 839
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,-10,1,8,21,8,-9,-3});
        org.junit.Assert.assertEquals(
            result, 567
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,12,12,-14,-15,-16,-17,-17,18,19,-16,20,-16});
        org.junit.Assert.assertEquals(
            result, -5248
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,-5,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,0,-11,0,0,1,2,3,4,-11,5,7,9,0,9,10,11,12,13,14,15,16,17,18,19,20,21,2});
        org.junit.Assert.assertEquals(
            result, 10989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,40,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 4568
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14,10,13});
        org.junit.Assert.assertEquals(
            result, 3365
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,-9,-3,4,7});
        org.junit.Assert.assertEquals(
            result, 123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,9,64,72,80,82,88,92,94,88});
        org.junit.Assert.assertEquals(
            result, 950912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,-19,6,1,7,8,-9,-3,4,11,11,6});
        org.junit.Assert.assertEquals(
            result, 2219
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {73,1,1,1,1,-9,1,2,2,2,2,45,2,-3,-3,-3,-3,-3,-4,-4,-4,92,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 13845
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0,0,19});
        org.junit.Assert.assertEquals(
            result, 6437
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {73,1,1,1,1,-9,1,2,2,2,2,45,2,-3,-3,-3,-3,-3,-4,-4,-4,92,5,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 13818
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14,10,13,13});
        org.junit.Assert.assertEquals(
            result, 3378
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,7,8,7,0,8,-9,-3,10,10});
        org.junit.Assert.assertEquals(
            result, 1259
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,-12,11,13,-14,92,-10,13});
        org.junit.Assert.assertEquals(
            result, -2685
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,9,72,80,82,88,9,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1468798
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,0,0,0,0,0,0,1,2,20,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 6213
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,20,-14,-14});
        org.junit.Assert.assertEquals(
            result, 1378
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0,1});
        org.junit.Assert.assertEquals(
            result, 7110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,10,-13,-15,-16,-17,-17,94,49});
        org.junit.Assert.assertEquals(
            result, -33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,18,19,-16,20,-16});
        org.junit.Assert.assertEquals(
            result, 7288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,-9,3,3,4,4,4,4,4,5,5,5,4,5,3});
        org.junit.Assert.assertEquals(
            result, -345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-14,1,1,1,2,2,2,2,1,-3,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 5389
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,5,11,12,-13,-14,-15,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -1790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-10,-8,9,5,-10,11,-12,13,-14,2});
        org.junit.Assert.assertEquals(
            result, -3414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 5803
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,9,64,72,80,82,88,92,94,88,50});
        org.junit.Assert.assertEquals(
            result, 977750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,64,72,80,82,88,-1,94,50});
        org.junit.Assert.assertEquals(
            result, 852561
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,7,-8,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -799
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,-5,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -777
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,0,70,64,72,80,82,19,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1502257
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5395
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,3,6,8,7,8,-3,10,10});
        org.junit.Assert.assertEquals(
            result, 1452
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,3,6,8,7,8,-3,10,10,10});
        org.junit.Assert.assertEquals(
            result, 1552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 238
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,18,19,20,-17});
        org.junit.Assert.assertEquals(
            result, -5465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,40,-6,7,-8,-7,9,-10,-13,11,-12,20,-14,11,-6});
        org.junit.Assert.assertEquals(
            result, 2332
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,13,-17,20,33,37,49,40,45,49,48,49,50,58,70,64,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1307016
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,-10,1,8,21,8,-9,-3,8});
        org.junit.Assert.assertEquals(
            result, 9950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 17078
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,19,1,7,6,10,4,11,4});
        org.junit.Assert.assertEquals(
            result, 7975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,1,3,4,5,6,7,8,9,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1247
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-5,14,-1,-11,-15,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,3,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,14});
        org.junit.Assert.assertEquals(
            result, 8346
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,39,-8,9,-3,-10,11,-12,13,4,-14,-12,1});
        org.junit.Assert.assertEquals(
            result, -2836
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,17,13,-14,92,-10,-6});
        org.junit.Assert.assertEquals(
            result, 778626
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,39,45,48,49,50,58,70,64,72,80,46,82,88,92,94,50,88});
        org.junit.Assert.assertEquals(
            result, 1447656
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,16,3,-6,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, 1943
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-18,20,33,37,40,45,48,49,50,58,70,64,9,72,80,82,88,9,92,94,50,58});
        org.junit.Assert.assertEquals(
            result, 1468855
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,9,64,72,80,82,88,92,94,88,50,88});
        org.junit.Assert.assertEquals(
            result, 985494
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,-3,1,1,2,2,2,2,2,-3,72,20,-3,-3,-4,-4,-4,92,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 778842
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,-16,20,0,-17,18,18,-16,20,-14,6,-17});
        org.junit.Assert.assertEquals(
            result, 6109
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-4,-2,5,-6,20,7,-5,-8,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -417
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,5,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,2,16,0,12});
        org.junit.Assert.assertEquals(
            result, 13566
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,-9,2,2,12,2,4,3,3,3,4,4,4,4,4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 2003
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,-5,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,0,-11,0,0,1,2,3,4,-11,5,7,9,0,9,10,11,12,13,14,15,16,17,18,19,20,21,2,21});
        org.junit.Assert.assertEquals(
            result, 11010
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,-15,49,19,49,-16,-16});
        org.junit.Assert.assertEquals(
            result, -3273
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,0,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, -605
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,4,-14,-12,-5});
        org.junit.Assert.assertEquals(
            result, -1625
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,87,20,33,37,40,45,48,50,58,70,64,72,80,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 847962
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,12,-16,0,-17,18,19,-16,20,8});
        org.junit.Assert.assertEquals(
            result, 6537
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,-11,5,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 55805
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,-1,33,49,40,45,49,48,49,50,58,64,82,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1273668
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,-15,9,10,11,12,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, 6552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-12,-6,7,-8,9,-10,11,-12,20,-14,11});
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,1,2,-15,-3,-3,-3,-3,-3,-4,-4,-3,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,-9,-3,4,6});
        org.junit.Assert.assertEquals(
            result, 110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,2,48,2,2,1,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 309
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,9,11,-13,-14,-15,-16,-17,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -1763
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,2,1,2,14,48,2,2,1,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 781050
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,-3,-18,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, 173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,9,72,80,82,88,9,92,94,50,72});
        org.junit.Assert.assertEquals(
            result, 1468870
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,71,64,72,80,82,88,92,93,50});
        org.junit.Assert.assertEquals(
            result, 847822
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,-17,20,33,37,41,40,45,48,50,58,70,-15,64,72,80,82,88,92,94,88,49});
        org.junit.Assert.assertEquals(
            result, 1417524
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,50,58,-18,64,72,80,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 976767
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,0,6,19,7,-9,-3,-4,11,4});
        org.junit.Assert.assertEquals(
            result, 2062
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-14,-17,20,33,37,40,45,48,49,50,58,70,64,72,82,88,-1,33,94,50,50});
        org.junit.Assert.assertEquals(
            result, 973147
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,4,11,11,6});
        org.junit.Assert.assertEquals(
            result, 2039
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,-2,3,-4,-2,5,-6,7,-5,-8,3,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 3288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,-16,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10,-16});
        org.junit.Assert.assertEquals(
            result, -4313
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,1,7,8,-9,-3,4,11,11,3});
        org.junit.Assert.assertEquals(
            result, 646
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,5,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,73,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,2,16,0,12});
        org.junit.Assert.assertEquals(
            result, 18895
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,13,-14,-12,-2});
        org.junit.Assert.assertEquals(
            result, 1153
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-4});
        org.junit.Assert.assertEquals(
            result, 163
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 296
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,40,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 5844
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,5,9,-10,11,-12,7,-14,-12});
        org.junit.Assert.assertEquals(
            result, 666
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,88,9,-10,11,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -2350
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,18,19,-15});
        org.junit.Assert.assertEquals(
            result, 808
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {13,-2,3,-4,5,7,-8,9,-10,11,-12,13,-14,-13,-12});
        org.junit.Assert.assertEquals(
            result, -316
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 6675
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,16,2,2,2,3,3,3,3,4,4,4,3,4,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 366
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,14,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 7108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-6,7,-5,-8,9,-10,11,-12,13,-4});
        org.junit.Assert.assertEquals(
            result, 819
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {5,-2,3,-9,-4,5,-6,7,-14,-8,9,-10,11,-12,13,-14,13});
        org.junit.Assert.assertEquals(
            result, -75
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-14,-15,-16,20,-1,-17,18,18,-16,20,-14,6});
        org.junit.Assert.assertEquals(
            result, 5819
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,5,-6,7,-8,5,-10,11,-12,13,-14,10,13,13,7});
        org.junit.Assert.assertEquals(
            result, 2932
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,50,58,-18,64,1,-4,80,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 874750
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19});
        org.junit.Assert.assertEquals(
            result, -1512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,0,-15,64,72,80,82,19,92,94,50,88,70});
        org.junit.Assert.assertEquals(
            result, 1502242
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,49,10,11,-13,-14,-15,-16,71,-17,49,49,-13});
        org.junit.Assert.assertEquals(
            result, 115991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,-3,-4,-5,-7,-12,-8,-10,-10,-11});
        org.junit.Assert.assertEquals(
            result, -1158
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-4,-2,5,-6,7,-5,-8,9,-10,11,-12,14,-14,1,11});
        org.junit.Assert.assertEquals(
            result, 1103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,-9,3,3,4,4,4,4,4,5,5,4,5,3});
        org.junit.Assert.assertEquals(
            result, -460
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,46,94,6,1,-4,8,21,8,-9,-3,11,-9});
        org.junit.Assert.assertEquals(
            result, 949
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 874927
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-10,-8,9,5,48,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -1212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,-17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 9123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-13,-15,-17,20,33,73,37,40,45,48,49,50,58,70,64,72,80,82,88,94,50,45});
        org.junit.Assert.assertEquals(
            result, 787111
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,8,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-11,20,20});
        org.junit.Assert.assertEquals(
            result, 6878
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,50,58,70,64,72,80,82,88,92,94,50,-17,72});
        org.junit.Assert.assertEquals(
            result, 1350103
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,-17,50,8,9,10,11,12,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, 3572
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,1,1,2,2,2,-3,-3,18,72,-3,-2,-3,-3,-4,-4,-4,92,5,5,5,1,1,-3,72});
        org.junit.Assert.assertEquals(
            result, 382088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,33,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1554989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,36,49,39,45,48,49,50,58,70,64,-13,80,46,82,88,92,94,50,88,36});
        org.junit.Assert.assertEquals(
            result, 1443936
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,6,19,7,-9,-3,4,11,4,-16});
        org.junit.Assert.assertEquals(
            result, 2038
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,82,87,-1,33,94,50,50,33});
        org.junit.Assert.assertEquals(
            result, 950210
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,5,-5,-8,9,-10,11,-3,13,-14,-4});
        org.junit.Assert.assertEquals(
            result, 392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,3,6,8,6,8,-3,10});
        org.junit.Assert.assertEquals(
            result, 325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,8,9,10,12,-13,-14,-16,-17,-17,18,19,-16,20,7});
        org.junit.Assert.assertEquals(
            result, -2128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,45,8,37,10,11,-13,-14,-16,-17,49,19,45});
        org.junit.Assert.assertEquals(
            result, 48873
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,39,-9,9,-3,-10,11,-12,13,4,-14,-12,1});
        org.junit.Assert.assertEquals(
            result, -3053
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,6,-8,19,7,-9,-3,4,11,4,-16});
        org.junit.Assert.assertEquals(
            result, 7180
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,5,-6,7,-8,9,2,5,-10,11,-12,13,-14,10,13});
        org.junit.Assert.assertEquals(
            result, 2229
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,21,8,-9,-3,10,11,1});
        org.junit.Assert.assertEquals(
            result, 10549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,-20,20,10});
        org.junit.Assert.assertEquals(
            result, -4331
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,12,-13,-14,-15,-16,-17,-17,-15,-15,18,19,-16,20,10});
        org.junit.Assert.assertEquals(
            result, -4910
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,10,-13,-15,-16,-17,-17,49});
        org.junit.Assert.assertEquals(
            result, -2479
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,81,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 848132
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,8,-9,-3,10,11,0});
        org.junit.Assert.assertEquals(
            result, 1287
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,2,2,2,14,48,2,2,1,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 781050
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-16,-4,11,12,13,14,15,17,18,19,20,-20,-14,-19,13,-18,-17,-16,-15,-14,-13,-4});
        org.junit.Assert.assertEquals(
            result, -5442
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,6,-6,87,7,-8,9,5,-10,11,-12,-14,10});
        org.junit.Assert.assertEquals(
            result, 1779
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-14,-15,-16,-17,-17,49,19,49});
        org.junit.Assert.assertEquals(
            result, -463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,10,-13,-15,-16,-17,-17,94,-2,49});
        org.junit.Assert.assertEquals(
            result, -2381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,16,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 5368
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,40,19,7,-9,10,4,11,4});
        org.junit.Assert.assertEquals(
            result, 65119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-11,20,20});
        org.junit.Assert.assertEquals(
            result, -1371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,0});
        org.junit.Assert.assertEquals(
            result, 7128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10,-13});
        org.junit.Assert.assertEquals(
            result, -4614
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,3,-3,7,-8,9,-10,11,-12,20,-14});
        org.junit.Assert.assertEquals(
            result, -1681
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,9,-10,12,-12,14,-14,1,12});
        org.junit.Assert.assertEquals(
            result, 355
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,73,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,0,2,16,0,2});
        org.junit.Assert.assertEquals(
            result, 7204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,50,58,-18,-6,1,-4,-13,82,88,92,94,50,-17});
        org.junit.Assert.assertEquals(
            result, 874587
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,37,11,11,-13,-14,-15,-16,-17,49,19});
        org.junit.Assert.assertEquals(
            result, 50772
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,4,49,50,58,64,72,80,82,88,-1,94,50});
        org.junit.Assert.assertEquals(
            result, 742033
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-7,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 778724
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,36,40,45,48,49,50,58,70,64,9,72,80,82,88,9,92,94,72,40});
        org.junit.Assert.assertEquals(
            result, 1468859
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,10,5,-10,11,-12,13});
        org.junit.Assert.assertEquals(
            result, -313
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,8,7,0,8,-9,-3,10,10,10,7});
        org.junit.Assert.assertEquals(
            result, 1275
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,39,3,4,3,3,-9,3,3,4,4,4,4,4,5,5,5,5,3,4,3,5});
        org.junit.Assert.assertEquals(
            result, 404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,-17,20,33,37,40,45,48,49,50,58,70,-15,64,72,80,82,88,94,88,50});
        org.junit.Assert.assertEquals(
            result, 866501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,49,48,49,-7,58,82,70,64,72,80,82,88,-8,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1090559
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,-9,2,3,4,4,4,4,4,5,5,4,5,3});
        org.junit.Assert.assertEquals(
            result, -465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,40,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,0,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,14,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 1422
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,39,45,48,49,50,58,70,64,72,80,82,88,92,88});
        org.junit.Assert.assertEquals(
            result, 722597
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,-12,7,8,9,10,11,-13,-14,-15,-16,-17,49,19,49});
        org.junit.Assert.assertEquals(
            result, 859
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,21,-14,-14,-15,-16,20,0,-17,18,18,-16,20,-14,6,-17});
        org.junit.Assert.assertEquals(
            result, 6143
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,9,-10,-13,11,20,-2,-6,5});
        org.junit.Assert.assertEquals(
            result, -906
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,73,11,19,49});
        org.junit.Assert.assertEquals(
            result, 5650
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,4,5,6,7,8,9,10,11,12,12,14,15,16,17,18,19,20,21,-9,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 6132
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-6,3,-4,5,-6,7,-5,-8,9,-10,11,-12,13,4,-14,-12,-5,4,-12,-6});
        org.junit.Assert.assertEquals(
            result, -4357
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,1,8,21,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 2339
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,41,-13,-14,-15,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 622
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,-10,21,8,-9,-3,6});
        org.junit.Assert.assertEquals(
            result, 964
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,19,49,49});
        org.junit.Assert.assertEquals(
            result, 3015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,8,9,10,11,12,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, 902
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,1,2,-4,-3,-3,-3,-2,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 275
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,-3,1,1,2,2,2,2,2,-7,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 8465
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-5,7,-8,-7,9,-10,-13,11,20,-14,11,3});
        org.junit.Assert.assertEquals(
            result, 1199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,10,11,12,2});
        org.junit.Assert.assertEquals(
            result, 2962
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-3,2,-4,5,-6,7,-8,9,5,-10,-12,13,20,-6,-10});
        org.junit.Assert.assertEquals(
            result, 722
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-4,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-9,0,2,16,0});
        org.junit.Assert.assertEquals(
            result, 4420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,7,-4,5,-6,7,-8,10,5,-10,11,-12,13,-14,92,-10});
        org.junit.Assert.assertEquals(
            result, 778606
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-15,-16,-17,-17,18,19,-11,20,20});
        org.junit.Assert.assertEquals(
            result, -1739
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,-3,-18,10,11,12,-13,-14,-15,-16,-17,-17,-15,18,19,-16,20,10,-16});
        org.junit.Assert.assertEquals(
            result, -3923
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,49,40,45,48,49,48,49,50,58,64,82,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1328293
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,-1,8,-9,-3,10,11,0});
        org.junit.Assert.assertEquals(
            result, 218
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,11,5,5,5,1,-3,71});
        org.junit.Assert.assertEquals(
            result, 783979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-12,-16,-17,-17,-15,49,19,49,-16,-16,-16});
        org.junit.Assert.assertEquals(
            result, -1370
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,12,-13,-14,-15,-16,-17,-17,-15,-15,18,19,-16,20,10,-13});
        org.junit.Assert.assertEquals(
            result, -4923
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-17,20,33,37,40,45,48,49,50,58,70,64,72,80,82,88,92,94,50,10});
        org.junit.Assert.assertEquals(
            result, 876701
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,10,11,13});
        org.junit.Assert.assertEquals(
            result, 2961
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-6,7,-8,9,-10,-13,11,-12,-4,-14,7});
        org.junit.Assert.assertEquals(
            result, -1445
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,12,2,3,3,3,3,11,4,4,4,4,4,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 535
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,19,19,20,-15,-15,7,-15});
        org.junit.Assert.assertEquals(
            result, -4373
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,-12,88,9,-10,11,-12,14,-14,1,9});
        org.junit.Assert.assertEquals(
            result, 3043
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,10,11,12,2,5});
        org.junit.Assert.assertEquals(
            result, 2987
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,3,3,3,-9,2,3,4,4,4,4,4,5,5,4,5,3});
        org.junit.Assert.assertEquals(
            result, 273
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,7,0,8,-9,-3,10,11});
        org.junit.Assert.assertEquals(
            result, 1875
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,4,5,6,7,8,-16,9,10,11,12,13,14,15,16,17,18,19,21,0});
        org.junit.Assert.assertEquals(
            result, 7395
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 7040
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-1,-1,2,17,0});
        org.junit.Assert.assertEquals(
            result, 7135
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,11,4,5,12,6,7,8,10,11,12,2});
        org.junit.Assert.assertEquals(
            result, 853
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,9,64,72,80,64,82,88,92,94,88,50,88});
        org.junit.Assert.assertEquals(
            result, 1403708
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,14,1,1,1,2,2,2,2,2,-3,-3,-3,-2,-3,-4,-4,-14,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, -13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,-5,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,0,-11,0,0,1,2,3,4,-11,5,7,8,0,9,10,11,12,13,14,15,16,17,18,19,20,21,1});
        org.junit.Assert.assertEquals(
            result, 10245
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-8,9,-10,12,-12,14,-14,1,12});
        org.junit.Assert.assertEquals(
            result, 1506
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-2,-3,-4,-5,-7,-8,-9,-9,-11});
        org.junit.Assert.assertEquals(
            result, -1588
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,12,-13,-14,-15,-16,-17,-15,-15,18,19,-16,20,10,-13});
        org.junit.Assert.assertEquals(
            result, 7176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,37,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 203
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-8,9,-10,12,-12,14,9,-14,1,12});
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {70,0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,73,10,11,12,13,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 398574
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,0,0,0,0,0,1,2,20,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,0,0,0});
        org.junit.Assert.assertEquals(
            result, 15391
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14,9,11});
        org.junit.Assert.assertEquals(
            result, 604
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,8,9,10,7,12,-13,-16,-17,-17,18,19,-16,20,7});
        org.junit.Assert.assertEquals(
            result, -2157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {70,0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,73,10,11,12,13,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 18980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,1,-2,3,-14,5,-6,-8,9,11,-12,13,-14,58});
        org.junit.Assert.assertEquals(
            result, -1373
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,7,8,-9,-3,4,11});
        org.junit.Assert.assertEquals(
            result, -619
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {19,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,20,0,0,0,0,0,0,1,2,20,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 6575
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,19,-15,-16,-17,19,19,20,-15,-15,7,-15});
        org.junit.Assert.assertEquals(
            result, -867
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-13,-15,-17,20,33,73,37,40,45,48,49,50,70,64,72,80,82,88,94,50,45});
        org.junit.Assert.assertEquals(
            result, 794387
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,1,2,2,2,-3,-3,72,-3,-2,-3,-3,-4,-4,-4,92,5,5,5,1,1,-3,1});
        org.junit.Assert.assertEquals(
            result, 783908
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,3,-4,5,-6,7,-5,-8,9,11,-12,13,-14,1,-14,7});
        org.junit.Assert.assertEquals(
            result, -2639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,-17,20,33,37,41,40,45,48,50,58,70,-15,64,72,80,82,88,92,94,88,80,49});
        org.junit.Assert.assertEquals(
            result, 1421572
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-8,-8,9,5,-10,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -155
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,1,2,2,2,2,-3,-3,72,-3,-3,-4,-4,-5,92,11,5,5,5,1,-3,2});
        org.junit.Assert.assertEquals(
            result, 1527
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-8,9,-10,12,-12,14,9,-14,12});
        org.junit.Assert.assertEquals(
            result, 1724
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18,-1,0,1,2,3,4,5,6,7,8,9,10,0,11,12,13,14,15,16,17,18,19,20,21,0,7,0});
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,-4,5,-6,7,-8,9,5,-10,11,-12,13,-14,10,13,13,5});
        org.junit.Assert.assertEquals(
            result, 3403
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-12,-15,-17,20,33,36,40,45,48,49,50,58,70,64,9,72,80,82,88,9,92,94,72,40,49});
        org.junit.Assert.assertEquals(
            result, 498030
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,2,-4,5,-6,7,-10,-8,9,5,48,11,-12,13,-14,-6});
        org.junit.Assert.assertEquals(
            result, -1218
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,16,8,10,11,12,2,5});
        org.junit.Assert.assertEquals(
            result, 3194
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-8,20,20});
        org.junit.Assert.assertEquals(
            result, 6880
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,72,-3,-3,-3,-4,-4,-4,92,5,5,5,5,1,1,-3,-3});
        org.junit.Assert.assertEquals(
            result, 8665
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,12,6,7,8,10,11,12,-16,5,12});
        org.junit.Assert.assertEquals(
            result, 2981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-18,-13,19,-15,-16,-17,19,19,20,-15,-15,7,-15});
        org.junit.Assert.assertEquals(
            result, -12092
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,15,7,8,-9,4,11,7});
        org.junit.Assert.assertEquals(
            result, -475
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-15,-17,20,33,37,40,45,48,49,50,58,70,-15,64,72,80,82,88,92,94,88,50,20});
        org.junit.Assert.assertEquals(
            result, 1425127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,9,-6,7,-5,-8,-10,-12,88,9,-10,11,-12,14,-14,1,9});
        org.junit.Assert.assertEquals(
            result, 7055
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,49,40,45,48,50,58,70,64,72,80,82,88,92,94,50,88,58,33});
        org.junit.Assert.assertEquals(
            result, 836749
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,10,-13,-14,-15,-16,-17,-17,49,19,-14});
        org.junit.Assert.assertEquals(
            result, -6211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-9,0,2,16,0,2});
        org.junit.Assert.assertEquals(
            result, 6164
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,-5,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-11,0,0,0,-12,0,0,1,2,3,4,-11,5,7,9,0,9,10,11,12,13,14,15,16,17,18,19,20,21,2,16});
        org.junit.Assert.assertEquals(
            result, 11004
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,49,73,11,19,49,11});
        org.junit.Assert.assertEquals(
            result, 6981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,-6,9,-10,-13,11,-12,20,-14,-2,-6,5});
        org.junit.Assert.assertEquals(
            result, 646
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,49,40,44,49,48,49,50,58,64,82,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1519890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,-9,0,2,16,0,0});
        org.junit.Assert.assertEquals(
            result, 6157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,18,19,20,19,18});
        org.junit.Assert.assertEquals(
            result, -1347
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,49,40,44,49,48,49,50,58,82,64,82,72,80,82,88,92,94,50});
        org.junit.Assert.assertEquals(
            result, 1336142
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,5,-6,7,-8,9,-10,-13,82,11,20,-2,-6,5});
        org.junit.Assert.assertEquals(
            result, -430
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,3,-4,5,-6,7,-5,-8,9,11,-12,13,-14,1,-14,7,1});
        org.junit.Assert.assertEquals(
            result, -2638
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-5,-8,-3,-10,11,-12,13,4,-14,-12});
        org.junit.Assert.assertEquals(
            result, -1692
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,18,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,20,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 14114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,2,2,2,2,2,-3,-3,72,-3,-3,-3,-4,-4,-4,92,11,5,92,5,1,-3,71});
        org.junit.Assert.assertEquals(
            result, 784066
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-13,-14,-15,-16,-13,-17,-17,49,19});
        org.junit.Assert.assertEquals(
            result, -1494
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,-9,3,3,4,4,4,4,5,5,5,4,5,3});
        org.junit.Assert.assertEquals(
            result, -451
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {94,6,1,-4,8,21,8,-9,-3,10,-9,1});
        org.junit.Assert.assertEquals(
            result, 9512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-12,-4,-7,12,13,14,15,17,18,19,20,-20,-19,13,-18,-17,-16,-15,-13,-4});
        org.junit.Assert.assertEquals(
            result, -2818
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {70,0,0,0,0,0,0,0,0,0,0,0,33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,73,10,11,12,13,15,16,17,18,19,20,21,0,7,0,0});
        org.junit.Assert.assertEquals(
            result, 18980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-12,-4,11,12,13,14,15,17,18,19,20,-20,-19,13,-18,-17,-16,-15,-14,-13,-4,14});
        org.junit.Assert.assertEquals(
            result, -4714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,-10,5,1,8,3,8,-9,-3});
        org.junit.Assert.assertEquals(
            result, -664
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,3,48,-13,-14,-15,-16,-17,-17,49,-16,19});
        org.junit.Assert.assertEquals(
            result, -353
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,6,1,1,1,1,1,2,2,2,2,-3,-3,72,-3,-3,-4,-4,-5,92,11,5,5,5,-5,1,-3,2});
        org.junit.Assert.assertEquals(
            result, 1554
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,6,10,11,12,-13,-14,-15,-16,-17,-17,18,19,-16,20,-16});
        org.junit.Assert.assertEquals(
            result, 7243
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,12,12,-13,-14,87,-15,-16,-17,-17,18,19,-16,20,7});
        org.junit.Assert.assertEquals(
            result, 2693
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-3,3,3,-4,5,-6,7,33,-5,-8,9,11,-12,13,-14,1,-14,-6});
        org.junit.Assert.assertEquals(
            result, -838
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,-2,5,-6,7,-5,-8,9,-10,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, 141
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,2,48,2,2,1,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 284
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,-9,-3,11,11});
        org.junit.Assert.assertEquals(
            result, 1422
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,10,11,-13,-14,-15,-16,-17,-17,18,19,-11,20,20,-13});
        org.junit.Assert.assertEquals(
            result, -3568
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,12,-13,-14,-15,-16,-17,-17,18,19,20,12});
        org.junit.Assert.assertEquals(
            result, -1347
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,-9,1,2,2,2,2,2,5,-3,-3,-3,-3,-3,-4,-4,-4,-4,92,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 7764
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,49,50,58,70,64,72,81,82,88,92,94,50,-17,48});
        org.junit.Assert.assertEquals(
            result, 848180
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,12,-13,-14,-15,-16,-17,-17,18,19,20,12,8});
        org.junit.Assert.assertEquals(
            result, -835
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-5,3,-4,-2,5,-5,-8,9,-12,14,-14,1});
        org.junit.Assert.assertEquals(
            result, -275
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,-16,0,6,40,19,7,-9,10,4,11,4,19});
        org.junit.Assert.assertEquals(
            result, 65480
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,8,0,8,-9,-2,10,1});
        org.junit.Assert.assertEquals(
            result, 1168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2});
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {5});
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5});
        org.junit.Assert.assertEquals(
            result, -113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5});
        org.junit.Assert.assertEquals(
            result, 143
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,1});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-5,0,-5,0});
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2});
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, -237
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 169
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 353
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 151
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5227
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,10,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5825
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14});
        org.junit.Assert.assertEquals(
            result, -719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14,18});
        org.junit.Assert.assertEquals(
            result, 5113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5227
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,-16,-17,19,19,20,-14,10});
        org.junit.Assert.assertEquals(
            result, -2523
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 160
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,10,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 182
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,14,8,-14});
        org.junit.Assert.assertEquals(
            result, 1196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,4});
        org.junit.Assert.assertEquals(
            result, -236
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 174
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 1421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,7,9,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1852
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,-16});
        org.junit.Assert.assertEquals(
            result, -599
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,0,8,-3,-8,11,4,7,-3});
        org.junit.Assert.assertEquals(
            result, 514
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,-16,-17,19,19,20,-14,10,12});
        org.junit.Assert.assertEquals(
            result, -2379
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 413
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 159
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,-4,5,-6,-6,7,-8,9,-10,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 864
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,50,58,70,64,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 852723
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,11,12,-13,-14,-15,-16,-17,18,19,20,-14,19});
        org.junit.Assert.assertEquals(
            result, -760
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -5127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,3,4,4,0,4,4,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 405
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 410
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,1,7,0,8,1,-3,-8,11,4,3,1});
        org.junit.Assert.assertEquals(
            result, 1909
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,-16,7,8,9,-16,10,11,12,-13,-14,-15,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 11401
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,88,7,8,9,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-11,-11});
        org.junit.Assert.assertEquals(
            result, -697
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,0,8,-9,5,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 1883
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3,-3});
        org.junit.Assert.assertEquals(
            result, 169
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,17});
        org.junit.Assert.assertEquals(
            result, 6106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,12,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5792
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,9,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14,18,-14});
        org.junit.Assert.assertEquals(
            result, -2848
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 162
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-16,-17,19,19,20,-14,10,11});
        org.junit.Assert.assertEquals(
            result, 1089
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,12,9,-10,11,-12,-13,14,8,-14});
        org.junit.Assert.assertEquals(
            result, -547
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,9,-16,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14,18,-14});
        org.junit.Assert.assertEquals(
            result, 11492
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-8,20,33,37,40,45,48,50,58,70,64,72,80,82,-5,92,94});
        org.junit.Assert.assertEquals(
            result, 171135
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 1164
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,-5,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3,-3,-4});
        org.junit.Assert.assertEquals(
            result, 159
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,6,1,0,8,-9,5,-8,11,4,8});
        org.junit.Assert.assertEquals(
            result, 1325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,9,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14,18,-16,-14,-14});
        org.junit.Assert.assertEquals(
            result, -5546
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,-6,-19,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -133
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,20,3,-4,5,-6,-6,7,-8,9,-10,11,-12,13,-14,-12});
        org.junit.Assert.assertEquals(
            result, 59
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,20,3,-4,5,-6,-6,7,-8,9,-10,11,-12,13,-14,-12,3});
        org.junit.Assert.assertEquals(
            result, 86
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,7,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, -238
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,1,0,8,-9,5,-8,11,4,8});
        org.junit.Assert.assertEquals(
            result, 3479
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,0,8,-3,-8,11,4,7,-3,1});
        org.junit.Assert.assertEquals(
            result, 515
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,-1,8,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, -238
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,20,5,3,-4,5,-6,-6,49,7,-8,9,-10,11,-12,13,-14,-12,3,5});
        org.junit.Assert.assertEquals(
            result, 115231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {4,3,6,1,0,8,-9,5,-8,11,4});
        org.junit.Assert.assertEquals(
            result, -267
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 170
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,7,0,7,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, -237
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,37,13,-14});
        org.junit.Assert.assertEquals(
            result, 1210
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 146
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, -5120
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-16});
        org.junit.Assert.assertEquals(
            result, -858
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 6380
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,4,4,0,4,4,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 356
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-16,-16,-17,18,19,20});
        org.junit.Assert.assertEquals(
            result, 2765
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,18,19,20,19});
        org.junit.Assert.assertEquals(
            result, 1739
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,10,12,-13,-14,-15,-9,7,-17,18,50,19,20,19});
        org.junit.Assert.assertEquals(
            result, 3923
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,6,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,6,-4,-4,-4,-4,5,5,5,5,5,2,1});
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {72,1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 5158
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,4,0});
        org.junit.Assert.assertEquals(
            result, 1421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,-6,7,-8,-8,9,-6,-10,11,-12,-14});
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,50,58,70,64,72,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 984729
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,4,10,0});
        org.junit.Assert.assertEquals(
            result, 1431
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,2,5,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 445
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,33,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,0,8,-3,-8,11,4,7,-3,-3});
        org.junit.Assert.assertEquals(
            result, 511
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,0,8,-8,11,4,-3,0});
        org.junit.Assert.assertEquals(
            result, -416
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 7108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 171
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,6});
        org.junit.Assert.assertEquals(
            result, 1441
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,8,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 683105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,13,1,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-16,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, 2772
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-11,-11,-1});
        org.junit.Assert.assertEquals(
            result, -698
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-4,5,-6,-6,-19,-8,9,-10,11,-12,13});
        org.junit.Assert.assertEquals(
            result, 1148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,-16,-17,19,19,20,-14,10,6});
        org.junit.Assert.assertEquals(
            result, -2487
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,88,7,8,9,10,11,12,13,14,11});
        org.junit.Assert.assertEquals(
            result, 1443
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, 1397
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,10,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 245
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,-10,11,-12,-13,14,8,-14,1});
        org.junit.Assert.assertEquals(
            result, -535
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {4,-9,3,6,1,0,8,-10,5,-8,4});
        org.junit.Assert.assertEquals(
            result, 294
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,1,7,0,8,2,1,-3,-8,11,4,3,1});
        org.junit.Assert.assertEquals(
            result, 173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,10,12,-13,-14,-15,-8,7,-17,18,50,19,20,19});
        org.junit.Assert.assertEquals(
            result, 3924
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {72,1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3,2});
        org.junit.Assert.assertEquals(
            result, 5162
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,3,5,6,7,8,9,10,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1673
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,58,70,64,72,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 852591
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, -22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,7,9,10,11,12,13,14,7});
        org.junit.Assert.assertEquals(
            result, 1901
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,3,1});
        org.junit.Assert.assertEquals(
            result, -236
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-7,-4,5,-6,7,9,-10,11,37,13,-14});
        org.junit.Assert.assertEquals(
            result, -448
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,37,13});
        org.junit.Assert.assertEquals(
            result, 1224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,6,10,11,12,13,14,15,15,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,3,-4,5,-6,7,-8,12,9,-10,11,-12,-13,14,8,-14});
        org.junit.Assert.assertEquals(
            result, 1107
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,0});
        org.junit.Assert.assertEquals(
            result, 5869
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,20,5,3,-4,5,-6,-6,49,7,-8,9,-10,11,-12,13,-14,-12,3,5,-8});
        org.junit.Assert.assertEquals(
            result, 114719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,11,12,-13,8,-15,-16,-17,18,19,20,-14,19});
        org.junit.Assert.assertEquals(
            result, -1414
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,50,58,70,64,72,70,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 1515669
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,72,11,3,1});
        org.junit.Assert.assertEquals(
            result, 373524
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,48,-17,20,33,37,40,45,48,48,50,58,70,64,72,70,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 1249597
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3,1});
        org.junit.Assert.assertEquals(
            result, 174
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,6,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,6,-4,-4,-4,-4,5,5,5,5,5,2,1,2});
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,8,10,11,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 690849
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-16,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, -5317
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2});
        org.junit.Assert.assertEquals(
            result, 170
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-17,-19,-18,-17,-16,-15,-14,-16});
        org.junit.Assert.assertEquals(
            result, 1411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,-17,18,19,20,-14,18,-14,-13});
        org.junit.Assert.assertEquals(
            result, -3911
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,2,2,5,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 429
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,-16,-4});
        org.junit.Assert.assertEquals(
            result, 2639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 378708
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,18,19,20,9});
        org.junit.Assert.assertEquals(
            result, -4391
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,-3,-3,-3,0,-4,-4,-4,-4,5,5,5,5,5,-3,1});
        org.junit.Assert.assertEquals(
            result, 174
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,21,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,-8,11,3,7});
        org.junit.Assert.assertEquals(
            result, 1404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,-10,11,-12,-13,14,8,1,-8});
        org.junit.Assert.assertEquals(
            result, -457
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-4,5,-6,-6,-19,-8,-10,11,-12,13});
        org.junit.Assert.assertEquals(
            result, -727
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,3});
        org.junit.Assert.assertEquals(
            result, 422
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,1,7,0,8,-4,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 664
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-7,2,4,5,6,88,8,8,10,11,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 1886
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-16,-17,18,19,20,9});
        org.junit.Assert.assertEquals(
            result, -823
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,20,-16,-17,19,19,20,-14,10,6,-17});
        org.junit.Assert.assertEquals(
            result, 3318
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,-18,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 1145
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,33,1,1,1,3,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 201
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,-7,4});
        org.junit.Assert.assertEquals(
            result, -243
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,-16,11,12,-14,-15,-16,-17,18,19,20,-14,18,-14,-13,-13});
        org.junit.Assert.assertEquals(
            result, 5230
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,12,-13,-14,-15,-16,-17,18,19,20,-14,19});
        org.junit.Assert.assertEquals(
            result, -1337
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,11,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,33,1,1,1,3,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,-20,5});
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,4,5,6,88,7,8,9,10,11,12,13,58,14,11});
        org.junit.Assert.assertEquals(
            result, 1611
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {49,-2,3,-4,5,-6,7,-8,-10,11,-12,-13,14,8,-14,1});
        org.junit.Assert.assertEquals(
            result, 1865
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 2062
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,20,-16,-17,19,19,20,10,6,-17});
        org.junit.Assert.assertEquals(
            result, 8168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,80,5,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 7545
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-11});
        org.junit.Assert.assertEquals(
            result, -729
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,8,10,11,12,18,13,14,88,12,13});
        org.junit.Assert.assertEquals(
            result, 683574
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,72,11,94,1});
        org.junit.Assert.assertEquals(
            result, 373615
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,7,8,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 4649
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {4,-9,3,6,1,0,8,-10,5,-8,4,4});
        org.junit.Assert.assertEquals(
            result, 298
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,3,-4,5,-6,7,-8,12,8,-10,11,-12,-13,14,8,-14,-4});
        org.junit.Assert.assertEquals(
            result, 826
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,9,-3,72,6,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 5419
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,18,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 487
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,10,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,40,20,21});
        org.junit.Assert.assertEquals(
            result, 6285
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 7754
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 15940
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,2,3,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 293
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,18,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,-9,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, -350
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,40,-8,11,3,7});
        org.junit.Assert.assertEquals(
            result, -276
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,-16});
        org.junit.Assert.assertEquals(
            result, 4015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,2,2});
        org.junit.Assert.assertEquals(
            result, 148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,21,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 126
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,72,11,70,3,1});
        org.junit.Assert.assertEquals(
            result, 373594
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,15,-19,-18,-17,-16,-15,-13});
        org.junit.Assert.assertEquals(
            result, -2958
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,58,70,64,72,-1,80,82,88,92,94,64,72});
        org.junit.Assert.assertEquals(
            result, 989064
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,20,33,37,40,45,48,50,58,70,64,72,80,82,33,92,94});
        org.junit.Assert.assertEquals(
            result, 967719
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,70,0,8,-3,-8,11,4,10,0});
        org.junit.Assert.assertEquals(
            result, 6282
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11});
        org.junit.Assert.assertEquals(
            result, 1405
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,2,2,16,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3,1});
        org.junit.Assert.assertEquals(
            result, 567
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,40,11,3,7});
        org.junit.Assert.assertEquals(
            result, 1452
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,1,7,0,8,-4,-8,11,4,-3});
        org.junit.Assert.assertEquals(
            result, 673
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,3,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 331
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,6,1,0,8,-9,5,-8,11,4,8,8});
        org.junit.Assert.assertEquals(
            result, 1389
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,80,5,-6,7,-8,9,-10,9,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 7554
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,8,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 493
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,45,48,49,58,70,64,72,80,82,88,92,94,64,64});
        org.junit.Assert.assertEquals(
            result, 955738
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,4,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 1165
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,5,-3});
        org.junit.Assert.assertEquals(
            result, 292
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,7,0,7,-9,-3,-8,-6,3,2});
        org.junit.Assert.assertEquals(
            result, -320
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,18,-17,18,19,20,-14,18});
        org.junit.Assert.assertEquals(
            result, -3243
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,-7,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,6,10,11,12,13,14,15,15,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 13317
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,0,8,13,-9,5,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,6,1,-13,8,-9,5,-8,11,4,8});
        org.junit.Assert.assertEquals(
            result, -872
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,13,1,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5,-3,-3});
        org.junit.Assert.assertEquals(
            result, 75
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,72,3,1,72});
        org.junit.Assert.assertEquals(
            result, 749
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,0,8,1,-8,11,4,-3,0});
        org.junit.Assert.assertEquals(
            result, 163
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,-18,-15,9,-16,10,11,12,-13,-14,-15,-16,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, 10375
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 903
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,18,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,6,5,5,-9,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, -349
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,48,50,58,70,64,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 958504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-3,-8,11,4,10,0});
        org.junit.Assert.assertEquals(
            result, 813
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,5,15});
        org.junit.Assert.assertEquals(
            result, 309
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,-7,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,6,10,11,12,13,14,15,15,17,18,19,20,21,0,6});
        org.junit.Assert.assertEquals(
            result, 13353
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,-15,8,9,10,-16,11,12,-14,-15,-16,-17,18,19,20,-14,18,-14,-13,-13});
        org.junit.Assert.assertEquals(
            result, -1023
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,4,4,0,4,4,3,4,5,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 423
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,-16,14});
        org.junit.Assert.assertEquals(
            result, 4211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,18,19,20,6,12});
        org.junit.Assert.assertEquals(
            result, -4892
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,-4,18,19,20});
        org.junit.Assert.assertEquals(
            result, 2818
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,5,-6,7,-8,9,-10,11,37,13,-2});
        org.junit.Assert.assertEquals(
            result, 1222
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 730
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14,-4});
        org.junit.Assert.assertEquals(
            result, 746
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,6,11});
        org.junit.Assert.assertEquals(
            result, 411
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {88,4,3,6,1,0,8,-9,5,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 8047
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,9,-3,82,11,4});
        org.junit.Assert.assertEquals(
            result, 6875
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,16,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5380
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {72,1,1,1,1,1,2,2,2,14,2,-3,-3,-4,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 5350
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-4,5,-6,-6,-19,-8,-11,11,-13,13,-6});
        org.junit.Assert.assertEquals(
            result, -1023
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, -31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,33,1,1,1,3,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,-20,5,1});
        org.junit.Assert.assertEquals(
            result, 168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,2,9,10,11,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 682972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,0,8,13,-9,5,-8,-9,4});
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,-3,-8,6,11,7});
        org.junit.Assert.assertEquals(
            result, 420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,15,-19,-18,-17,-16,-15,-13,15});
        org.junit.Assert.assertEquals(
            result, 417
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14,-4,-12});
        org.junit.Assert.assertEquals(
            result, -982
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,-14,-15,-16,-17,18,19,20,-14,18,-14,-13});
        org.junit.Assert.assertEquals(
            result, -4043
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {8,-2,-4,5,-6,-6,-19,9,-10,11,-12,13});
        org.junit.Assert.assertEquals(
            result, -647
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,11,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-17,-3,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 436
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-9,-3,72,11,1,72});
        org.junit.Assert.assertEquals(
            result, 2053
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,4,11});
        org.junit.Assert.assertEquals(
            result, -225
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,4,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,4,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 352
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,2,9,10,11,7,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 682953
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,7,5,-6,-8,9,-2,-10,11,37,13,9});
        org.junit.Assert.assertEquals(
            result, 561
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,3,5,6,7,8,9,10,11,11,12,13,14});
        org.junit.Assert.assertEquals(
            result, 1658
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,-8,2,11,3});
        org.junit.Assert.assertEquals(
            result, 189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14,-4,-12,13});
        org.junit.Assert.assertEquals(
            result, -969
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {20,-15,-17,20,33,37,40,45,48,48,50,58,70,64,72,70,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 1515925
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,-16,-17,19,19,20,-14,10,12,8,19});
        org.junit.Assert.assertEquals(
            result, 4488
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,1,2,2,-3,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 139
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,18,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,-1,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 480
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,-17,18,19,20,-14,18,-14,-13,18,7});
        org.junit.Assert.assertEquals(
            result, -3580
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,-9,-3,40,11,3,7,6});
        org.junit.Assert.assertEquals(
            result, 1458
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,48,-17,20,33,37,40,45,48,48,50,58,70,64,72,70,80,82,88,92,10,64,70});
        org.junit.Assert.assertEquals(
            result, 1240931
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,7,7,-3,-8,6,11,7});
        org.junit.Assert.assertEquals(
            result, 426
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,9,7,8,9,10,11,12,-13,-14,-15,-16,-17,18,19,20,-14,18,-16,-14,-14,10});
        org.junit.Assert.assertEquals(
            result, -5446
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-7,5,-6,7,9,-10,11,37,13,-14});
        org.junit.Assert.assertEquals(
            result, 2578
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,-7,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,6,10,11,12,13,14,15,15,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, 1165
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,14,5,6,88,8,2,9,10,11,7,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 9179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-17,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, -5318
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,13,-20,-19,-18,-17,-16,-15,-14,-16});
        org.junit.Assert.assertEquals(
            result, -1643
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-11,-3});
        org.junit.Assert.assertEquals(
            result, -720
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,4,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 360
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,1,7,-3,-8,45,6,11,7});
        org.junit.Assert.assertEquals(
            result, -51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,14,10,11,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5966
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,8,-9,-4,-3,72,3,1,72});
        org.junit.Assert.assertEquals(
            result, 11007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,18,1,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,4,5,-3});
        org.junit.Assert.assertEquals(
            result, 478
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,-10,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, -29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 270
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,5,5,4,-3});
        org.junit.Assert.assertEquals(
            result, -34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,3,-4,5,-6,7,-8,12,8,-10,11,-12,-13,14,8,-14,-4,8,-1});
        org.junit.Assert.assertEquals(
            result, 835
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-15,-9,-17,18,19,20,6,45,12});
        org.junit.Assert.assertEquals(
            result, -4715
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,21,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 197
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,8,9,10,11,19,12,-13,-14,-15,20,-16,-17,19,19,20,-14,10,6,11,-17});
        org.junit.Assert.assertEquals(
            result, -7754
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,94,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 9000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-20,6,1,7,0,8,-9,-3,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 155
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,-4});
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,-14,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 379198
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,1,2,3,4,5,6,7,8,6,10,11,12,13,72,14,15,15,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 375581
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,13,45,1,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-11,-4,-4,-4,-4,5,5,5,5,5,5,-3,-3});
        org.junit.Assert.assertEquals(
            result, -1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,-16,10,11,12,-13,-14,-15,-16,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, -565
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14,7});
        org.junit.Assert.assertEquals(
            result, 779
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,48,50,58,50,70,64,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 867990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,33,1,1,1,3,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 185
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,7,7,-9,-3,-8,11,3});
        org.junit.Assert.assertEquals(
            result, 1741
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-4,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,5,2,5,5});
        org.junit.Assert.assertEquals(
            result, -21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {8,-2,-4,5,-6,9,-10,11,-12,13});
        org.junit.Assert.assertEquals(
            result, -1572
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,-5,1,-4,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,5,5,-3,-3,-4,-3});
        org.junit.Assert.assertEquals(
            result, 166
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,2,-3,-3,-3,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,5,15});
        org.junit.Assert.assertEquals(
            result, 229
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,6,1,0,8,-9,5,-8,11,4,8,-8});
        org.junit.Assert.assertEquals(
            result, 1389
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,-17,18,19,-19,-14,18,-13});
        org.junit.Assert.assertEquals(
            result, -3390
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,15,-19,-18,-17,-16,-13,15});
        org.junit.Assert.assertEquals(
            result, -2900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,-13,11,19,-13,-14,-15,-16,-17,19,19,20,-14,10,6});
        org.junit.Assert.assertEquals(
            result, -2744
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {72,1,1,1,1,1,2,2,2,2,2,-3,-3,-4,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3,2,1});
        org.junit.Assert.assertEquals(
            result, 5163
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,14,0,0,0,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5830
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,5});
        org.junit.Assert.assertEquals(
            result, 191
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-8,2,4,5,6,88,8,8,10,11,12,13,14,88,5,5});
        org.junit.Assert.assertEquals(
            result, 1931
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,17,3,-4,5,-6,7,-8,9,-10,4,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, -110
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5490
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,72,11,3,94,1,72,94});
        org.junit.Assert.assertEquals(
            result, 373784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-13,-14,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, -5485
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,4,0,8});
        org.junit.Assert.assertEquals(
            result, 1429
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,18,-2,3,-4,5,-6,-6,7,-8,-8,9,-6,-10,11,-12,-14,18});
        org.junit.Assert.assertEquals(
            result, -2141
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,1,7,0,8,-3,-8,6,11});
        org.junit.Assert.assertEquals(
            result, 1927
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,-12,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5952
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,6,3,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,3});
        org.junit.Assert.assertEquals(
            result, 427
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,7,-6,7,-8,-10,11,-12,13,-14,-14,7});
        org.junit.Assert.assertEquals(
            result, 1269
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,12,8,8,10,11,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 683035
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,2,7,7,-9,-3,-8,-2,11,3});
        org.junit.Assert.assertEquals(
            result, 517
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {4,2,2,3,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,4,5});
        org.junit.Assert.assertEquals(
            result, 427
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,8,1,2,2,2,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,6,5,5,2});
        org.junit.Assert.assertEquals(
            result, 494
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {88,4,3,6,1,0,8,-9,5,-8,11,4,4});
        org.junit.Assert.assertEquals(
            result, 8063
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,11,12,-14,-15,-9,-17,18,19,20,6,45,12,6,-17});
        org.junit.Assert.assertEquals(
            result, 85189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,7,1,7,0,8,-3,-8,11,6});
        org.junit.Assert.assertEquals(
            result, 1442
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 179
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-20,-14,-15,-16,-17,18,19,20,-14,18});
        org.junit.Assert.assertEquals(
            result, 5106
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-13,-14,-15,-16,-17,19,19,20,-14,10,12,-13});
        org.junit.Assert.assertEquals(
            result, -2392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-3,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,48,5,5,-3,-3,2});
        org.junit.Assert.assertEquals(
            result, 2454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,8,9,10,11,12,-14,-15,-16,-17,18,19,20,-14,18,-14,-13,-14,-14});
        org.junit.Assert.assertEquals(
            result, -3508
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,11,1,7,0,8,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 378713
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,8,2,2,2,2,-3,-3,-4,-3,-3,-4,-4,-4,-4,-4,5,5,5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 674
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,-3,-3,-3,0,-4,-4,-4,-4,5,5,5,6,5,-3,1,5});
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,8,1,2,2,88,2,2,-3,-3,-3,-3,-3,-4,-4,-4,-4,-4,5,5,6,1,5,5,2});
        org.junit.Assert.assertEquals(
            result, 681941
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,2,-3,-3,-3,-4,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,5,15,5});
        org.junit.Assert.assertEquals(
            result, 234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,18,19,20,-14,18});
        org.junit.Assert.assertEquals(
            result, -1405
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,7,0,8,-9,-3,72,11,3,1,72});
        org.junit.Assert.assertEquals(
            result, 2019
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,3,5});
        org.junit.Assert.assertEquals(
            result, 289
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,8,8,10,11,12,13,14,88,6});
        org.junit.Assert.assertEquals(
            result, 690855
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,12,8,8,10,11,18,13,14,88,88});
        org.junit.Assert.assertEquals(
            result, 683129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,3,4,4,0,4,4,4,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 328
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-8,1,3,-4,7,5,-6,7,-8,12,9,-10,11,-12,-13,14,8,-14});
        org.junit.Assert.assertEquals(
            result, 896
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,2,1,1,2,-5,2,2,-3,-3,10,-3,-4,-4,-4,-4,-4,5,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 240
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {7,8,9,11,12,-13,8,-15,-16,13,18,19,20,-14,19});
        org.junit.Assert.assertEquals(
            result, -1534
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,79,50,58,70,64,72,80,82,88,92,94,64});
        org.junit.Assert.assertEquals(
            result, 1514436
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-7,5,7,9,-10,11,37,13,-14});
        org.junit.Assert.assertEquals(
            result, 51288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,19,12,-11,-13,-14,-15,20,-16,-17,19,19,20,-14,10,6,-17});
        org.junit.Assert.assertEquals(
            result, 8643
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,5,-3,-8,11,4,10,0});
        org.junit.Assert.assertEquals(
            result, 1940
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,17,3,-4,5,-6,7,-8,9,-10,4,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 1184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,14,5,6,88,8,2,9,10,11,7,12,13,14,88,2});
        org.junit.Assert.assertEquals(
            result, 9187
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-7,2,4,5,-16,6,88,8,8,10,11,12,13,14,88});
        org.junit.Assert.assertEquals(
            result, 4648
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,18,19,20,-14,18,19});
        org.junit.Assert.assertEquals(
            result, -1044
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,0,9});
        org.junit.Assert.assertEquals(
            result, 5950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,-16,10,10,12,-13,-14,-15,-9,7,-17,18,50,19,20,19,10});
        org.junit.Assert.assertEquals(
            result, 3933
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,4});
        org.junit.Assert.assertEquals(
            result, 282
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,-1,8,9,-16,10,11,12,-13,-14,-16,-10,18,19,20});
        org.junit.Assert.assertEquals(
            result, 3334
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {72,1,1,1,1,2,2,2,14,2,-3,-3,-4,-4,-3,10,-4,-4,-4,-4,5,5,5,5,-3,-3});
        org.junit.Assert.assertEquals(
            result, 8157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-3,-8,11,4,0,-8});
        org.junit.Assert.assertEquals(
            result, 1413
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,2,2,2,3,3,3,3,-17,4,4,4,4,4,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 563
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,0,8,-9,-3,-8,11,3,6});
        org.junit.Assert.assertEquals(
            result, -231
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,0,8,-9,-8,11,4,11});
        org.junit.Assert.assertEquals(
            result, 779
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,11,12,13,14,15,16,18,18,19,20,-20,-19,-18,-17,-16,-15,-14,-16});
        org.junit.Assert.assertEquals(
            result, 2637
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1,-2,-3,-4,-5,-6,-8,-9,-10,-11,-11});
        org.junit.Assert.assertEquals(
            result, -954
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,33,37,40,48,50,58,70,14,72,80,82,88,92,94});
        org.junit.Assert.assertEquals(
            result, 1099964
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,10,3,4,5,6,7,8,9,10,11,12,13,70,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5881
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,19});
        org.junit.Assert.assertEquals(
            result, 6251
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,4,4,2});
        org.junit.Assert.assertEquals(
            result, 371
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {4,3,1,0,8,-9,5,-8,11,4});
        org.junit.Assert.assertEquals(
            result, 1887
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,3,-4,2,5,-6,7,-8,9,-10,11,-12,14,8,-14});
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-4,-3,1,1,1,1,2,2,2,2,2,-3,-3,-3,-3,-4,-4,-4,-4,5,5,5,48,5,5,-3,-3,2});
        org.junit.Assert.assertEquals(
            result, 232
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,7,64,8,-3,-8,11,4,-3,-3});
        org.junit.Assert.assertEquals(
            result, 208
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {13,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,10,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 5994
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,-20,-19,-18,-17,-16,-15,-14,-13,-16,-11});
        org.junit.Assert.assertEquals(
            result, -1930
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,2,3,2,2,3,3,3,3,4,4,0,4,4,3,4,4,5,5,5,5,4,2});
        org.junit.Assert.assertEquals(
            result, 364
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,2,-3,-3,-3,-4,-3,-4,-4,-4,-4,5,5,5,5,5,2,-3,2,5,15,5});
        org.junit.Assert.assertEquals(
            result, 332
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,11,12,13,14,15,16,17,18,19,20,79,13,-20,-19,-18,-17,-16,-15,-14,-16});
        org.junit.Assert.assertEquals(
            result, 4532
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,3,-4,5,-6,6,-6,7,-8,9,-10,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 890
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,1,7,0,8,-4,-8,11});
        org.junit.Assert.assertEquals(
            result, 1404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-2,-4,5,-6,-6,7,-8,-10,13,-14});
        org.junit.Assert.assertEquals(
            result, -1007
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,14,0,0,0,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,0,0});
        org.junit.Assert.assertEquals(
            result, 5830
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,21,70,1,1,1,2,2,2,10,2,-3,-3,-3,-3,-3,-4,-2,-4,-4,-4,5,5,5,5,5,5});
        org.junit.Assert.assertEquals(
            result, 4955
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,21,-3,-3,-4,-3,-4,-4,-4,5,5,5,-5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,3,1,7,0,8,-4,-8,11,-4});
        org.junit.Assert.assertEquals(
            result, 1420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,-6,14,-1,-11,-4,-4,-4,-4,-4,11,12,13,14,15,19,16,17,18,19,20,-20,15,-19,-18,-17,-16,-13,15});
        org.junit.Assert.assertEquals(
            result, 15907
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,8,8,-9,-4,-3,72,3,1,72,1});
        org.junit.Assert.assertEquals(
            result, 11008
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,17,3,-4,5,-6,7,-8,10,-11,4,11,-12,13,-14});
        org.junit.Assert.assertEquals(
            result, 1476
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,16,2,-3,21,-3,58,-3,-4,-3,-4,-4,-4,5,5,5,-5,5,5,-3});
        org.junit.Assert.assertEquals(
            result, 3553
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,1,7,8,-3,-8,11,4,10,0});
        org.junit.Assert.assertEquals(
            result, 1171
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,1,1,1,1,2,2,2,2,2,-3,-4,-3,-3,-3,-4,-4,-4,-4,-4,-4,5,2,5,5});
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,48,79,50,58,70,64,21,72,80,82,88,92,94,64,-17});
        org.junit.Assert.assertEquals(
            result, 1322806
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-13,-14,-15,-16,-17,19,20,-14});
        org.junit.Assert.assertEquals(
            result, -911
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,-12,0,0,0,0,0,0,0,0,0,0,-9,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,19,10,11,12,13,14,15,16,17,18,19,20,21,0});
        org.junit.Assert.assertEquals(
            result, 5593
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,19,17,18,19,20,21});
        org.junit.Assert.assertEquals(
            result, 14412
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-17,20,33,37,40,45,48,-10,48,58,70,64,72,80,82,88,92,94,64,40});
        org.junit.Assert.assertEquals(
            result, 984123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-12,-15,-8,20,33,37,40,45,48,50,58,70,64,72,80,-5,92,94});
        org.junit.Assert.assertEquals(
            result, 934415
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,64,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,2});
        org.junit.Assert.assertEquals(
            result, 346
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {3,6,1,7,-9,-3,72,3,1,72});
        org.junit.Assert.assertEquals(
            result, 9705
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {2,4,5,6,88,12,8,8,8,10,11,18,13,14,88,88,4});
        org.junit.Assert.assertEquals(
            result, 690325
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {6,7,8,9,10,11,12,-14,-15,-16,18,19,20,-14,18,8});
        org.junit.Assert.assertEquals(
            result, -1341
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {40,3,6,1,0,-9,5,-8,11,4,8,-8});
        org.junit.Assert.assertEquals(
            result, 2965
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1007() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1,-2,-4,5,-6,-6,-8,9,9,11,-12,13});
        org.junit.Assert.assertEquals(
            result, 722
        );
    }
}
