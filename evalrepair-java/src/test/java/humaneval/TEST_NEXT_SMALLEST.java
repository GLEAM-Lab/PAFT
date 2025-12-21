package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_NEXT_SMALLEST {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,1,4,3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,1,0});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-35,34,12,-45});
        org.junit.Assert.assertEquals(
            result, new Integer(-35)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,9,7,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-3,-2,-8,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,2,2,3,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,0,0,0,1,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,9,0,-1,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,15,4,4,3,4,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,5,4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,2,2,3,3,3,3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,9,0,-1,-5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,5,5,-5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,1,2,2,10,2,3,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,4,5,4,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,10,6,9,0,-1,-5,1,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,9,0,-1,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,15,4,4,3,4,4,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,5,2,5,5,1,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,5,5,-5,5,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,2,5,2,5,5,5,1,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,5,5,5,-5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {9,2,2,2,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,-2,10,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,9,15});
        org.junit.Assert.assertEquals(
            result, new Integer(9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {13,10,8,14,9,7});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {3,1,4,2,6,9,0,-1,-5,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,2,2,3,3,3,3,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,4,8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,1,1,3,3,3,3,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,2,5,5,14,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,7,9,7,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,3,1,1,3,3,3,3,2,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,15,4,4,3,4,4,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,6,9,0,-1,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,3,1,1,3,3,3,3,2,2,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,2,5,2,5,5,10,5,1,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,4,4,5,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,6,5,5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,7,9,7,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,2,2,3,3,3,3,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,4,4,4,5,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,7,9,7,7});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,15,4,4,3,4,4,4,4,3,15});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,9,14});
        org.junit.Assert.assertEquals(
            result, new Integer(9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,15,4,4,5,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,5,10,4,4,10});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,7,9,7,15,7});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,9,0,-1,-5,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,9,7,10,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,15,4,4,5,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,5,5,5,-5,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,2,2,3,4,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,9,7,15,9});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,4,4,3,4,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,2,3,2,1,3,3,3,3,2,2,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,-6,9,-5,9,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,15,4,3,4,4,4,4,3,15});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,4,4,7});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,3,4,7});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,9,0,-1,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,7,7,15,7});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,15,4,4,4,4,4,3,15});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,8,6,9,0,-1,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,5,-2,-8,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,8,7,7,9,7,7});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,9,7,15,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,6,9,0,-1,-8,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,3,4,7,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,10,8,14,8,9,7,15,9});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,2,6,9,0,-1,-5,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,-1,4,4,5,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {3,1,4,2,6,0,-1,-5,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,2,2,3,3,2,3,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,5,5,5,1,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,4,6,7});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,-78,7,9,7,15,7});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,3,2,1,2,2,10,2,3,3,3,3});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,4,2,6,9,0,-1,-5,1,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,8,14,10,9,7,10,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,6,10,0,-1,-5,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {7,6,5,3,7});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,10,8,14,9,7,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-5,-3,-8,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {4,4,-1,4,5,5,4,4});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,14,6,5,3,4,7});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {10,14,7,5,10,7,9,7,7});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {8,14,-78,7,9,7,15,7,7});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,15,17,19,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,11,9,7,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-80,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,16,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,15,-110,-30,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,19,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,15,13,11,9,7,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,-80,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,13,16,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,-2,12,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,13,16,12,10,14});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-60,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-2,-2,16,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-70,-80,-90,-100,7,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,-8,-10,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,-1,-2,-6,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,9,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,19,21,12,23,13});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,8,-6,1,9,-1,-10,0,-10,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,9,-1,-10,-2,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-80,-90,-100,7,4,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-30,-30,-61,-69,-80,-9,-90,-100,7,4,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,-2,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,8,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,0,1,1,-1,-2,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,-1,-2,-4,-3,-4,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,0,1,1,-1,-2,12,10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-110,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-80,-90,-100,13,4,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,13,16,12,10,1,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-110,-50,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,1,-1,-2,12,2,1,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,6,-20,-30,12,-61,-70,-80,-90,-100,-110,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,15,13});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,-9,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,-6,5,6,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-2,-2,16,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-20,-30,-40,-50,-60,-80,-90,12,-100,-9,-110,-50,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-7,-61,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,13,11,9,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-70,-2,16,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-90,-100,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-11,-20,-30,-40,-50,-60,-80,-90,-100,-110,-50,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,16,2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,13,15,17,19,21,10,23});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-80,74,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,-60,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-30,11,13,8,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,-60,3,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-69,-30,-40,-50,10,-70,-80,-90,-100,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-2,16,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-19,15,23,13,13,16,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,-20,8,21,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-10,13,8,-60,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {17,11,15,13,13,17,16,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-69,-30,-40,-50,10,-70,-80,-90,-100,-90,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,13,11,9,7,16,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,0,1,1,-2,-1,-2,12,10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,12,14,15,15,15,14});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,1,-1,12,10,2,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,13,15,17,19,21,10,23,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,74,13,16,13,14,15,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-69,-30,-40,-50,10,-70,-80,-90,-100,-90,-50,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,9,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-100,-110,-20,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,1,2,-3,-4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,15,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-7,-61,-70,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,1,-1,-2,12,2,1,-2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,14,15,15,15,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,2,2,3,3,4,5,5,5,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,-1,13,3,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-2,-3,-4,-5,-8,-6,-7,-8,-10,2,-8,3,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,9,10,-1,-2,-3,-4,-5,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-10,-69,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,4,5,5,5,6,7,7,8,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,-3,6,7,9,10,-1,-2,-3,-4,-5,-7,-8,-10,2,-7});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,16,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-69,-60,19,-60,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-90,-100,-110,-10,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,14,15,14});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,13,16,12,10,1,-61,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-60,-80,-90,-100,-110,-50,-10,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,-61,16,12,53,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,13,15,17,19,21,10,23,11,13});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,15,12,14,53,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-1,5,-6,0,9,-1,-10,-10,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-51,17,-40,-50,-61,-70,-80,-90,-100,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,3,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,14,15,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,7,9,8,-80,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-90,-100,-2,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,8,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-80,-110,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,8,-8,-10,2,3,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-7,-90,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,8,1,9,-1,-10,0,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-50,-60,-70,-80,-90,-100,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,15,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,22,5,7,9,11,13,22,15,17,19,21,12,23,13});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-2,17,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-30,8,-60,-80,-7,-90,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,1,9,-1,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,-3,-4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,12,-61,16,12,53,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15,15,11,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,-8,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,-61,16,12,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,9,-80,1,9,-1,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,-20,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-101,-110,-20,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-101)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,19,21,12,23,13,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,13,11,9,7,16,1});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,7,9,8,-81,2,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-50,-60,-70,-80,-90,-100,-90,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-60,3,3,3,4,5,5,5,6,7,7,8,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,13,16,15,12,14,15,15,15,15,14});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,14,11,9,7,16,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,5,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,14,16,-11,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,-1,1,-1,-2,12,2,1,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-30,8,-60,-80,-7,-90,-100,-110,-20,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,2,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,9,-10,0,5});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-90,-110,-10,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,-20,14,16,-11,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,7,9,10,-1,-2,-3,-4,-5,2,-6,-7,-8,-10,2,-8,10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-80,-90,-100,7,4,13});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,5,11,9,7,5,1,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,-11,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,7,9,11,13,22,15,17,19,21,12,23,13});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,15,-110,-30,-90,-50,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10,-51});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-90,-100,7,4,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,1,2,3,3,5,6,-11,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-3,-5,-6,3,-7,-8,-9,-10,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,-80,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-90,11,13,16,-3,15,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-100,-110,-20,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,-2,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,12,14,15,9});
        org.junit.Assert.assertEquals(
            result, new Integer(9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,15,15,11,16});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,2,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,9,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-90,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,13,16,-70,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,-20,8,21,14,15,13});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,13,11,9,7,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-20,15,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,1,3,3,5,6,-11,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,-60,2,0,-1,-2,12,2,1,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,-6,5,6,7,9,10,-1,-2,-3,-4,-5,-6,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-50,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-2,-2,16});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,-60,2,0,0,-30,12,2,1,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,16,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,13,11,-80,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,5,6,7,9,10,-1,-2,-4,-3,-4,-6,-7,-8,-10,2,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-30,11,13,8,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,-61,16,23,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {14,-100,-90,11,13,20,14,15,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-80,74,-100,-110,-10,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,13,15,15,12});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,13,16,-70,12,14,15,15,15,13});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-90,11,13,16,-3,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,15,-61,16,23,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,2,-1,-2,12,2,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,1,2,3,3,5,6,7,9,10,-1,-2,-6,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,8,17,-81,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,8,-6,1,9,-1,-10,0,-10,-80,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-80,-90,-100,-2,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,13,5,6,7,7,8,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,-6,5,7,9,10,-1,-2,-3,-4,-5,-6,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,5,11,9,8,5,1,5,15});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,13,13,16,12,14});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,9,2,3,2,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,-30,-50,-60,-20,-80,-90,-100,-50,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,2,-3,-4,10,2,-61,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,16,14,11,7,16,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,1,2,3,3,5,6,7,9,10,-1,-2,-6,-3,-4,-5,-6,-7,-8,-9,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,-2,12,13,2,1,12});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,2,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,16,2,3,3,4,5,13,5,6,7,7,8,6,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,12,-61,16,12,53,10,-3,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-80,-2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,8,-8,-10,-2,2,3,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-90,-100,7,4,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,74,-2,-2,-60,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-31,-30,-61,-69,-90,-100,7,4,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-20,-8,-10,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-79,-90,-100,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,13,15,17,19,21,10,-80,11});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,-80,15,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,2,3,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,9,-80,9,-1,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-2,2,1,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,13,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,13,-61,-70,-80,-90,-90,-100,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,12,14,8,15,9});
        org.junit.Assert.assertEquals(
            result, new Integer(8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-2,0,16,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,11,8,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-19,-2,2,2,3,3,4,5,5,5,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,8,-6,1,-5,9,-1,-10,0,-10,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,13,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,74,13,16,15,13,14,15,15,15,15,13});
        org.junit.Assert.assertEquals(
            result, new Integer(13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,-50,13,15,17,19,21,10,23,9});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15,15,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-2,17,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-11,-8,-10,2,-8,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-30,11,13,-51,8,14,0,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-100,-110,-20,-70});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-9,-40,-50,-69,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,1,-1,-2,12,2,1,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-70,-2,16,2,3,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,1,2,-3,-4,5,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,5,7,9,10,-1,-2,-3,-101,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,15,-40,-61,16,23,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-40)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,12,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,13,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,11,8,1,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,15,13,11,9,7,5,1,9});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-80,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,15,13,-51,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,0,1,1,-1,12,10,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-9,-40,-50,-69,-70,-80,-90,-100,-110,-10,-9});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,15,12,14,53,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,74,-2,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-30,-61,-69,-91,-100,7,4,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-30,-40,-50,22,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,-4,-4,2});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-51,-30,-40,-50,-60,-70,-80,-100,-110,-10,-51});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-60,-70,-79,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-30,11,1,46,8,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,20,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,11,13,15,17,19,10,23,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,-1,1,-1,1,-1,-2,12,2,1,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-1,1,2,1,-2,0,-2,-2,0,16,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-90,-51,-30,-40,-50,-60,-70,-80,-90,-110,-10,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-100,1,1,0,0,-1,-2,16,2,3,3,4,5,13,5,6,7,7,8,6,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,4,5,5,7,9,10,-1,-2,-3,-101,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,2,2,3,3,4,5,5,5,7,7,8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,9,-1,-10,0,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,9,10,-2,-3,-5,-6,-7,-8,-10,2,3,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,9,2,3,2,3,5,-7,7,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,53,-8,1,-7});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,15,12,14,53,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,6,7,9,10,0,-1,-2,-3,-5,-6,-7,-6,-10,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-30,8,-60,-80,-7,6,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,16,2,3,3,4,5,13,5,6,7,7,8,6,3,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,-4,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,5,-7,7,9,10,-1,-2,-3,-4,-5,2,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,13,14,16,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,5,6,7,10,-1,-2,-3,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-60,-70,-79,-90,-100});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,9,8,-80,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,-61,-51,-30,-40,-50,-60,-70,-80,74,-100,-110,-10,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,15,13,-51,16});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,-20,8,17,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-10,13,8,-60,-80,-90,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-40,-50,-69,-70,-80,-90,-100,-110,-9});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,5,-7,7,9,10,-1,-2,-3,-4,-5,2,19,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,6,7,9,10,-1,-2,-3,-4,-5,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,-61,16,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-69,-90,-100,-110,-20,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-19,15,23,13,13,74,16,12,10,14,15,14});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-90,11,13,16,-3,15,12,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,16,-110,-30,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,13,13,17,12,14});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,-5,-1,-10,0,1,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,12,-61,16,12,53,10,14,15,15,15,10});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-2,-3,-4,-5,-8,-6,-7,-8,-10,2,-8,-9,3,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,-10,-30,8,-60,-80,-7,-90,-100,-110,-20,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-31,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,-20,14,16,15,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,12,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-19,15,23,2,16,12,10,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,-1,1,-1,3,-2,12,2,1,-2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-1,-20,-9,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-1,16,2,3,3,4,5,13,5,6,7,7,8,6,3});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,12,-61,16,12,53,10,-3,15,1,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,14,15,-30,15,11,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-49,-30,-40,-50,-60,-80,-90,-100,-50,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,19,21,12,-40,23,13,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,15,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,19,-80,15,15,15,13,13});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-6,-50,9,11,13,15,17,19,21,23,17});
        org.junit.Assert.assertEquals(
            result, new Integer(-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,16,12,14,15,15,12});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,-7,7,4,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,-20,-30,8,-60,-80,-90,-110,-10,-60,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,13,16,15,12,14,15,15,15,15,14,12});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-50,-30,-10,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-51,17,-40,-50,-61,-70,-80,-90,-100,-90,-61});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-50,17,-40,-50,-61,-70,-80,-90,-100,-90,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-101,12,13,16,19,12,13,15,15,12});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-90,11,13,16,-3,15,12,0,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-69,7,9,-81,2,9,-1,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-69)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-60,-70,-80,-90,-100,-90,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-51,-30,-40,-50,-60,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-20,-30,-40,-50,-60,-80,-90,-100,-2,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-100,1,1,0,0,-1,-2,16,2,3,3,4,5,13,5,6,7,7,8,6,3,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,1,-9,2,3,3,5,6,7,9,10,-1,-2,-6,-3,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,0,10,-1,-2,-3,-4,-5,-6,-7,-8,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,21,13,16,12,10,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-60,-70,-90,-100,-90,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-2,15,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,14,15,15,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-100,-110,-20,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-51,17,-40,-11,-50,-61,-70,-80,-90,-100,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-10,8,-60,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-81,15,13,16,12,14,15,16});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,1,1,1,-3,-4,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-10,-69,-110,-89,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,13,16,12,10,21,15,15,15,16,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,8,-8,-10,2,3,-10,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-90,-100,-80,-110,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,15,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,7,9,11,13,22,15,17,19,21,12,23,13,15});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-51,-30,-40,-50,-60,-70,-80,-100,-110,-10,-51,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,12,2,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,0,-1,-1,-2,-2,2,3,4,5,5,5,6,7,7,8,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-61,11,-101,12,13,16,19,12,13,15,15,12});
        org.junit.Assert.assertEquals(
            result, new Integer(-61)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,-30,-40,-50,-60,-70,-80,-100,-60,-110,-10,-70,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-50,-61,-70,-80,-90,-100,-110,-20,-80,-100});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,18,5,-7,7,9,10,-1,-2,-3,-4,-5,2,19,-6,-7,-8,-10,2,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,-60,2,0,-89,0,-30,12,2,1,-60});
        org.junit.Assert.assertEquals(
            result, new Integer(-60)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-90,-100,-110,-70});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,74,-2,-2,-60,2,0,3,3,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,12,-61,16,53,10,-3,15,1,15,53});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-69,3,9,-81,2,9,-1,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-69)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,1,0,-1,-2,15,16,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,74,1,0,0,-1,-1,74,-2,-2,-60,2,0,3,3,5,5,5,6,7,7,8,74});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,12,21,-61,16,12,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,1,1,1,-3,-4,2,-3,-3,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,74,1,0,0,-1,-1,-2,-2,2,-70,2,3,4,5,5,5,6,7,11,8,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-51,4,-69,-30,-40,-50,10,-70,-80,-90,-100,-90,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,6,-109,-20,-30,12,-61,-70,-80,-90,-100,-110,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-79,-21,-10,-20,-30,-50,-60,-70,-79,-90,-100,-21});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-61,-70,-80,-90,-90,-100,-110,-70,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,8,-6,1,9,-1,-10,0,-10,1,-80,7,-6});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,9,10,-10,0,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,3,5,-7,7,9,10,-2,-3,-4,-5,-8,-6,-7,-8,-10,-7,2,-8,-9,3,1,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,19,21,12,23,13,0});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-51,-10,-20,-9,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-52,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,6,-109,-20,-30,12,-61,-10,-70,-80,-90,-20,-110,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {14,-100,-90,11,13,20,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-51,-60,-80,-90,-100,-50,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,15,13,9,7,5,1,9});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,22,15,17,17,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-11,-20,-50,-61,-70,-80,-90,-100,-110,-20,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,14,-10,13,8,-60,-80,-90,-100,-110,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-10,-101,8,-60,-80,-90,-100,22});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,-70,13,14,13,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-70)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-60,-70,-90,-100,-90,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-9,-51,-30,-40,-50,-60,-70,-80,-90,-100,-110,-10,-51});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-80,-100,10,-110,-10,-70});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-20,-30,-40,-50,-60,-80,-90,12,-100,-9,-110,-50,-10,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,7,9,8,-81,2,9,-90,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-81)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,-6,9,10,-2,-3,-6,-7,-8,-10,2,3,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-90,11,13,-90,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-80,-90,-100,-50,-30,-51,-10,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,15,-61,16,12,53,10,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,5,7,9,10,-1,-2,-3,-2,-101,-4,-5,-6,-7,-8,-10,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,5,6,7,9,10,-1,-2,-3,-5,-6,-7,8,-8,-10,-2,2,3,-10,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,14,15,16,14,16});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,13,16,13,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(13)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,3,3,6,7,9,10,-1,-2,-3,-5,-6,-7,8,-8,-10,-2,2,3,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-5,13,-61,-70,-10,-80,-90,-100,-30,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,8,-60,-80,-90,-110,-10,-60,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-19,46,-51,-30,-40,-50,-60,-70,-21,-80,-90,-100,-110,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,5,-4,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-9,-10,-40,-50,-69,-70,-80,-90,-100,-110,-9,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-60,-70,-79,-90,-100,-100});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-6,-50,-80,11,13,15,17,19,21,23,17});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-9,-9,-51,-30,-40,-50,-60,-70,-80,-90,-4,-110,-10,-51});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {15,13,16,-70,-109,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-70)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,12,13,16,19,12,-80,15,-60,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-60)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-1,16,2,2,3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-50,-70,-80,-90,-10,-69,-110,-89,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,-50,9,11,13,15,3,19,21,10,23,11,13});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,8,-6,1,9,-1,-10,-10,1,-80,7,-6});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-3,-10,-7,-20,-15});
        org.junit.Assert.assertEquals(
            result, new Integer(-15)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,4,3,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-1,-2,-3,-4,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,1,1,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,2,2,3,3,4,4,5,5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,11,9,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,0,-1,-2,2,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-7,-8,-9,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-30,1,9,23,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,0,-2,-1,-2,2,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,9,-1,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,2,3,3,4,5,5,6,7,7,8,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,-50,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,15,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-1,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,0,2,-7,-10,-4,5,-3,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,9,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-1,-2,-1,-21,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,15,13,16,12,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,11,9,6,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,-50,3,3,4,5,5,6,7,7,8,0,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,9,7,5,1,11,11,11});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,3,7,8,2,1,9,-1,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,-50,8,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-1,-2,2,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-1,-2,-1,-21,2,-1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,-20,2,1,-2,-1,-2,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-40,-20,2,1,-2,-1,-2,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,9,7,5,1,11,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,-90,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,8,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,2,-3,-4,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,21,19,17,15,13,11,9,6,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,8,-2,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,14,19,17,15,12,11,9,7,5,1,11,5,7});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,9,13,17,19,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,17,21,19,17,15,13,11,9,7,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-4,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {3,7,8,2,1,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,8,1,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,9,7,-2,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,2,-3,-4,-3,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,-1,-2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,16,-110,3,7,2,1,9,-1,14,0,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,19,17,15,12,11,-2,9,7,5,0,11,5});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-109,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,-20,15,13,16,12,14,15,15,15,14});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {3,-20,-20,-30,-40,-50,-109,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-4,-3,-3,2,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,9,6,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-4,5,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,2,-3,-4,-3,-3,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,7,8,1,9,-1,-10,0,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-9,-3,-4,-5,-6,-7,-8,-9,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-4,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-2,-2,2,9,3,3,4,5,5,5,6,7,-50,8,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-5,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,1,0,-1,-2,8,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-1,-2,2,-2,2,-80,3,4,5,5,5,-8,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,3,7,8,2,1,-50,-1,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,22,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-70,-50,-90,-100,-110,-80});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,19,17,15,12,11,-2,9,7,5,0,11,5,7});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-1,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-30,1,9,23,-10,0,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-30,-2,2,3,3,4,5,5,5,6,7,-50,8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,8,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-1,-2,-1,-21,2,6,-1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,2,3,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,8,1,-30,1,9,23,-10,16,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,15,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-20,3,-3,-4,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-40,-20,2,-2,-1,-2,-2,2,-2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,9,13,17,19,21,23,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-7,-8,-9,-10,9,-6});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,1,9,23,-10,0,-30,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,2,3,3,5,5,6,7,7,8,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,-2,-1,-2,2,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,-20,2,1,-2,-1,-2,2,-2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,-90,1,17});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,7,-2,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,-90,1,17,9});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,15,16,12,-7,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,9,11,13,15,17,19,21});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,-50,3,3,4,5,6,5,6,7,7,8,0,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,-110,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,8,3,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-1,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,2,3,-1,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,1,-1,-2,8,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-2,-1,-2,-1,-21,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,22,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,-8,4,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,10,-1,-10,0,10});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,9,13,17,19,21,23,23,17});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,10,13,17,19,21,17});
        org.junit.Assert.assertEquals(
            result, new Integer(10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5,-3,5,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,21,-40,-50,-60,-70,-80,-90,-100,-110,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-30,-2,2,3,3,4,5,5,5,6,7,-50,8,4,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-100,-50,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,0,-2,-1,-2,2,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-70,-50,-90,-100,-110,-80,-100});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,7,2,9,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-50,-90,-100,-110,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,-2,-1,-2,2,4,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,5,3,-110,8,1,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-3,-8,2,-3,-4,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-29,-1,-2,-2,2,3,3,4,5,5,5,6,7,-50,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-6,1,-5,5,9,13,17,-80,21,23,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-6)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,9,6,5,1,19,21,15});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-50,-90,-100,-110,-30,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,2,1,1,1,-1,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,-20,15,13,16,12,14,15,15,15,14,14});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-2,-20,2,1,-1,-2,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,15,13,16,12,-1,15,14,15,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,2,-91,-109,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,1,9,23,-10,0,-30,19});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-4,-3,-3,2,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,15,13,11,9,7,4,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-5,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,0,0,-1,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-109,23,21,17,15,13,11,9,7,-90,1,17,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-10,-3,-4,-3,-3,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,7,8,11,13,15,17,19,21,23,21});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,2,3,3,4,5,5,6,7,7,8,0,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-80,-90,-91,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-91)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,17,-20,15,13,16,12,14,15,15,15,14,14});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,-20,15,13,16,12,13,15,15,15,14,-20});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,1,2,1,0,-1,-1,2,3});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,15,-1,-2,-1,-21,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,19,17,15,12,11,-2,9,7,5,0,11,5,7,5});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,1,-3,-4,-3,-3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-1,-2,2,-1,-21,2,6,-1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,21,19,17,15,13,11,9,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5,-3,5,1,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-100,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,7,2,-100,9,-1,-10,5,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,5,3,-110,8,1,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,1,9,23,-11,0,-30,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,4,21,19,17,15,13,11,9,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-61,-10,-20,21,-40,-50,-60,-70,-80,-90,-100,-110,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,0,-1,-2,-31,2,3,-1,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,0,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,9,6,5,1,19,21});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,2,3,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,21,7,7,9,-10,5,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,9,6,5,1,19,-31,21,15});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,-30,-40,-50,-109,21,-70,-80,-90,-100,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,16,13,11,9,5,1,11,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,-1,-30,0,9,23,-10,0,23,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,23,1,15,-1,-2,-1,-21,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-110,-80,-90,-100,-110,-90,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,0,-3,-5,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,5,1,13});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,15,13,16,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,1,9,23,-10,0,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,-8,3,22,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-8,-10,-8,4,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,8,1,9,-1,-10,0,-1,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-30,-2,2,3,3,4,5,5,5,6,7,-50,8,5});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,0,3,4,5,6,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-109,23,21,17,15,13,11,9,-109,7,-90,1,17,9});
        org.junit.Assert.assertEquals(
            result, new Integer(-90)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,8,1,9,-1,-10,-10,0,0,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,-11,19,17,15,13,9,9,6,5,1,19,-31,21,15,19});
        org.junit.Assert.assertEquals(
            result, new Integer(-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-5,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,4,21,-100,17,15,13,11,9,7,5,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,1,-2,-21,-2,-1,-21,2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,4,21,19,17,13,11,9,7,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,-50,-1,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,0,-2,2,17});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,17,8,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,-8,-20,3,-3,-4,-11,3});
        org.junit.Assert.assertEquals(
            result, new Integer(-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,-2,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,7,8,9,-1,-10,0,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,8,2,1,-1,14,0});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,-8,3,-5,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {24,21,19,17,15,12,11,9,7,5,1,11,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-40,-20,2,-2,-1,-1,-2,2,-2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,15,23,16,12,14,15,-3,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-40,2,-91,-109,21,-70,-80,-90,-100,-110,-109});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-4,15,13,16,14,12,14,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,7,9,11,13,15,17,19,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(7)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-9,-3,-4,-5,-6,-7,-8,-9,-10,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,21,19,17,15,13,11,9,5,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,1,9,-1,-10,0,-1,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,2,-3,-4,-3,2,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8,-2,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-40,-20,2,-2,-1,-2,-2,2,-2,-2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-20)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,13,11,9,7,4,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,-3,-4,5,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,17,15,13,11,9,7,-90,1});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-9,-10,-8,4,-9});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-9,-3,-4,-5,-6,-7,-8,-9,-10,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,1,1,-2,-1,-2,1,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,4,16,-7,15,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-10,-3,-4,-4,-3,-3,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(-8)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-10,0,1,9,23,-10,0,6,-30});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,-11,19,17,15,13,9,9,6,5,1,13,19,-31,21,15,19});
        org.junit.Assert.assertEquals(
            result, new Integer(-11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,-10,-20,-30,-40,2,-91,-109,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {22,21,19,17,15,13,9,9,6,5,1,19,-31,21,15});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,3,4,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-9,-10,-8,23,4,-9});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,-1,6,6,1,19,-31,21,15});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,2,3,22,5,6,8,22,-1,-2,-3,-4,-5,-6,-8,-10,-8,4,-10});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,-90,17,15,12,11,-2,9,7,5,-80,0,11,5,7,17});
        org.junit.Assert.assertEquals(
            result, new Integer(-80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,-110,-1,-30,0,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,21,7,7,9,5,0});
        org.junit.Assert.assertEquals(
            result, new Integer(3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,5,7,8,9,10,-1,-2,-3,-5,14,-6,-7,-7,-8,-9,-10,9,-6,-5});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-60,-70,-80,-90,-100,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,-110,8,-2,-30,1,9,23,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-30)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-9,-3,-4,-5,-6,-7,-8,-9,-10,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {2,5,3,-110,8,1,1,9,-91,-10,0,23});
        org.junit.Assert.assertEquals(
            result, new Integer(-91)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,-4,15,13,16,12,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(11)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-20,-30,-40,-50,-109,21,-70,-80,-90,-100,-110,-90,-70});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,22,9,13,17,19,21,23,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,20,1,0,1,-1,-2,8,4});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,-50,8,7,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-50)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {21,19,17,15,13,11,9,5,1,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-50,-90,-100,-110,-80,21});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-50,-90,-100,-110,-80,21,-50});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,8,3,-1,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,17,21,19,17,15,13,11,9,7,5,1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-90,-21,-91,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-91)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-2,17,8,11});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,9,10,-1,-2,-9,-3,-4,-5,-6,0,-8,-9,-10,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {20,2,1,0,-1,-2,2,3,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,-90,17,15,12,11,-2,9,7,5,-80,0,7,17,2});
        org.junit.Assert.assertEquals(
            result, new Integer(-80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,19,21,17,15,13,11,9,7,-90,1,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-80,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,-81,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,13,9,9,6,5,1,21,15});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-60,-20,1,1,1,-2,-1,-2,-1,-21,2,-1,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,9,7,-109,1,11});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-5,1,1,2,-4,5,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,15,12,11,8,9,7,5,1,11,5});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,2,-90,17,15,12,11,-2,9,7,5,-80,0,11,5,7,17,12,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-80)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,2,3,-1,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,-29,13,9,9,6,5,1,19,21});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-5,-30,-40,2,-91,-109,21,-70,-80,-90,-100,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-109)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {6,3,7,8,9,-1,-10,1,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {0,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,5,6,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,9,3,4,5,6,8,10,-1,-2,-3,-4,-5,-6,-7,-9,-10,-8,4,-9});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,21,7,7,9,-10,5,0,9});
        org.junit.Assert.assertEquals(
            result, new Integer(0)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,-30,1,9,23,-10,0,0,-30,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,15,13,11,9,7,4,1,11,11});
        org.junit.Assert.assertEquals(
            result, new Integer(4)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,9,13,11,17,19,21,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,9,2,1,10,-1,-10,0,10});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,19,17,16,11,9,5,1,11,19});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-9,-5,-3,-4,-5,-6,-7,-8,-9,-10,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-3,3,-2,-50,3,3,4,5,5,6,7,7,8,0,6});
        org.junit.Assert.assertEquals(
            result, new Integer(-3)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {13,21,19,17,16,11,9,5,1,11,13,2,19});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,3,-2,-50,3,3,4,5,5,6,7,7,8,0,6,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,3,3,-1,-60,-1,2,-2});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {11,14,13,16,12,14,15});
        org.junit.Assert.assertEquals(
            result, new Integer(12)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,21,-40,-50,-60,-70,-80,-90,-100,-110,-90,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,1,0,-1,-2,-81,3,-1});
        org.junit.Assert.assertEquals(
            result, new Integer(-2)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,6,7,8,-20,10,-1,-2,-9,-3,-4,-5,-6,0,-8,-9,-10,-8});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,-1,-1,-2,2,-2,2,3,3,4,5,5,5,7,7,8});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-90,-91,-100,-110,-90});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,21,-70,-50,-90,-100,-110,-80,-100,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-40,-50,-60,-70,-80,-1,-90,-100,-110,-40});
        org.junit.Assert.assertEquals(
            result, new Integer(-100)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5,3,7,8,2,1,-1,-10,0});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,21,17,15,13,11,9,7,5,8,1,13,9});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,3,-3,-5,-3});
        org.junit.Assert.assertEquals(
            result, new Integer(-5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,2,3,4,5,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-7,-8,-9,-10,-7});
        org.junit.Assert.assertEquals(
            result, new Integer(-9)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-8,-100,-10,-3,-4,-4,-3,-3,-4});
        org.junit.Assert.assertEquals(
            result, new Integer(-10)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-10,-20,-30,-51,-40,-50,-80,-91,-110});
        org.junit.Assert.assertEquals(
            result, new Integer(-91)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,0,0,-1,-1,-2,-2,2,3,3,4,5,5,6,7,7,8,7});
        org.junit.Assert.assertEquals(
            result, new Integer(-1)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,1,1,-2,-30,-1,-2,-1,-21,2,1});
        org.junit.Assert.assertEquals(
            result, new Integer(-21)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1,5,9,13,17,19,23,23});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {23,17,21,19,17,15,13,11,9,7,5,1,7});
        org.junit.Assert.assertEquals(
            result, new Integer(5)
        );
    }
}
