package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_MAX_ELEMENT {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(5,3,-5,2,-3,3,9,0,124,1,-10))
        );
        org.junit.Assert.assertEquals(
            result, 124
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(0,0,0,0))
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,-5))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,9,4,5,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,7,6,5,4,3))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(100))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(100,100,99,98,97,96))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,1,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,48,47,46))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,100,48,47,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(101))
        );
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,9,4,5,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,47,47))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,47,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,1,2,9,4,5,6,7,5))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,-2,49,49,47,47,49,47))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(100,100))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(99))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,0))
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,47,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(0,50,49,49,47))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,6,3))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(101,100,100,100))
        );
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,47,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,9,5,6,7,2))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,100,-3))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,9,5,5,6,7,7))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,47,47,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,48,9,4,5,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,1,2,9,4,5,6,7,5,5))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,47,9,4,5,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-3,-4,0,-2))
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,48,9,4,0,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,48,9,8,6,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,9,4,5,6,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,47,3))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,47,46,5,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,47,46,47))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,100,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,100,46,50,49))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,3,98,8))
        );
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(101,100,100))
        );
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,3,2,47,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,5,-3,-4,0))
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-2,-3,0))
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(9,49,49,100,100,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(101,100,100,100,100))
        );
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,2,9,5,6,0,7,2))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,99,2,48,9,4,6,7,2))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,48,9,8,6,7))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,3,98,3,8))
        );
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(9,8,6,6,4,3,98,8))
        );
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-2,-4,-5))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-3,5,-3,-4,0,5))
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,6,47,46,3))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(9,49,49,100,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,47,47,47,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,9,4,5,6,7,4))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,47,2,3,2,47,3,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,47))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,47,5,47,49,47))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,1,2,9,4,5,6,7,5,5,5,6))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,9,4,5,6,7,9))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(100,100,99,98,97))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,9,4,5,7,9))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,47))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,6,3,6,8))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,48,47,47))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-4,-5))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(9,8,98,6,4,3,98,8,3))
        );
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,9,5,5,6,7,7,5))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,48,100,48,47,46))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,47,9,4,5,6,48,7))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(97,100,100,100,100))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,48,9,8,6,7,9))
        );
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,3,99,3,8))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,47,3,6))
        );
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,99,2,48,9,4,6,2,7))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(100,100,99,99,97,100,99,97))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,99,2,48,9,4,6,2,7,6))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,47,50))
        );
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,47,47,49,47))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(8,6,6,4,3,99,3,-4,8))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,99,47))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(50,49,49,100,47,49,46,47,49))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,49,49,47,47,47))
        );
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(49,100))
        );
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,3,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,999997))
        );
        org.junit.Assert.assertEquals(
            result, 999997
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-145,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19))
        );
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,999985,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,3,3,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-145,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,3,17,17,18,19,-95,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,18,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999974))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-6,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,-150,999987,999986,999985,999984,999983,999982,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-145,-5,-4,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-34,-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,10,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,1,-145,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-40,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-4,-145,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,12,12,13,13,13,13,13,14,15,15,17,17,18,19,999976,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999988,999974,999973,999972,999971,999970,999975,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,2,2,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-49,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-6,-5,-49,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,999983,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,16,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-71,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-40,-130,-135,-140,-145,-150,-80,-55,-71))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-90,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999988,999976,999975,999988,999974,999973,999972,999971,999970,999975,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-145,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,16,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,2,2,-49,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999991,999996,999995,999994,999992,999991,999990,999987,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-6,-6,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-35))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,10,14,15,15,3,17,17,18,19,-95,20,3,19))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,17,-6,-5,-5,-5,-6,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-75,-5,-5,-5,-5,-145,-5,-4,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,-130,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,3,5))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999983,2,2,1,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-40))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,14,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,3,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,2,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,-1,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,1,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-49,5,6,16,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,0,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,999992,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,999990,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999990,2,1,3,2,2,2,2,2,999971,2))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,-5,-5,999974,999992,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-150,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,-1,3,14))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,-5,-5,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-6,-5,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,3,2,2,-49,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-105,-5,-145,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-6,-5,-5,-5,-6,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-49,-5,-40))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,18,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,-145,999970,999974))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,17,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-5,-5,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,3,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999990,2,3,1,3,2,2,2,2,-140,2,999971,2))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,5,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-4,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999975,-1,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,16,13,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,14,14,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-7,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-6,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-145,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-105,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-5))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-4,-5,-5,-145,999993,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,17,-6,-5,-5,-5,-6,17,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,16,-6,-5,-5,-5,-6,17,-5,-4,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-6,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-35,-65))
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,999973,1,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,2,2,-49,2,-49))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,17,-6,-5,-5,-5,-6,-5,-5,-4))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,-20,1,1,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-1,10,-100,-1000,10,-100,-100))
        );
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999992,1,3,2,2,1,2,2,2,1))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,2,1,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,3,5,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999988,999976,999975,999988,999974,999974,999972,999971,999970,999975,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,999997,10))
        );
        org.junit.Assert.assertEquals(
            result, 999997
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,999995,-6,-5,-5,-5,-105,-5,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,-20,1,1,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-130))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,999981,-5,-5,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,-5,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,3,9,9,9,9,10,10,12,12,13,13,13,13,13,14,15,15,17,17,18,19,999976,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,3,2,3,-49,-5))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,-1,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,-1,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,2,2,2,-49))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-36,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,999970,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, 999970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-75,-5,-5,-5,-5,-145,-5,-4,-5,-49))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-145,-5,-4,-4,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999979,999978,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,3,2,2,999981,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999998,999996,999995,999994,999993,999992,999971,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,16,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,1,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999996,999977,999988,999976,999975,999988,999974,999973,999972,999971,999970,999975,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,3,17,17,18,19,-95,-1,10))
        );
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-6,-6,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-7,-6,-5,-5,-105,-5,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-49,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-20,1,1,3,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,17,-5,-5,-20,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999985,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-1,10,-100,-1000,10,-100,-100,10))
        );
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,16,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999971,999998,999997,999996,999995,999999,999994,999993,999992,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999979,999978,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-4,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-6,-6,-5,-5,-5,-6,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-6,-5,-5,-49,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(18,-5,-5,-6,-5,-5,-5,-5,-145,-5,-7,-6))
        );
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-6,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,999983,9,9,10,-35,10,10,12,12,13,13,13,13,14,14,15,15,15,17,17,18,19,20,5))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,5,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,999993,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-150,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999976))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(12,1,3,3,5,6,6,6,8,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,999997))
        );
        org.junit.Assert.assertEquals(
            result, 999997
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,5,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,14,14,15,15,999993,17,18,19,20,3,14))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,16,18,-6,-5,-5,-5,-6,17,-5,-4,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,4,-5,-105,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-4,-15,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,999987,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999987
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-145,-5,-5,-4,-145,-125,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-120,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999976,999991))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,999979,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-49,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-80))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,3,2,2,999981,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,3,17,17,18,19,-95,20,3,6))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,17,17,18,19,-95,20,-1,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-7,-5,-5,-5,-5,-4,-7,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999988,999976,999975,999988,999974,999974,999972,999971,999970,999975,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,2,-20,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-5,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-6,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,999983,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-130,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,11,-35,-40,-45,-104,-50,-55,-60,-65,-105,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-5,-95))
        );
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,2,2,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-30,-5,-5,-4,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-75,-5,-5,-5,-5,-145,-5,-4,-5,-6,-4,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-115,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,15,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-6,-6,-5,-5,-5,-6,-6,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,2,1,3,2,2,1,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 999970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-7,-5,-5,-5,-4,-5,-5,-145,-145,999993,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,3))
        );
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999985,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-5,-115))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,999974,2))
        );
        org.junit.Assert.assertEquals(
            result, 999974
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,-135,9,9,9,9,10,10,10,12,12,13,13,13,13,14,14,15,3,17,17,18,19,-95,20,3,6))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-49,-5,-104,-40))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999973,2,3,3,2,2,-49,2))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,8,8,9,9,9,9,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,3,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,1,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,999979,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999988,999976,999975,999988,999974,999973,999972,999971,999970,999975,999978,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,999983,-111,-115,-120,-7,-130,-135,-140,-145,-150,-80,-130,-5,-150))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-15,-20,-25,-30,11,-35,-40,-45,-104,-50,-55,-60,-65,-105,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-100,-5,-95,-95))
        );
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-4,-5,-5,-6,-5,-49,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-145,-5,-145,-4,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,19,1,3,2,2,3,999983,19))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(4,999990,2,3,1,3,14,2,2,2,-140,999989,2,999971,2))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-95,-5,-6,-5,-5,-5,-5,-5,-145,-5,14,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,999971,2,1,3,2,2,1,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-80,-85,-90,-95,-100,999983,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-130,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-125,-6,-5,-5,-6,-6,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,16,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,9,14,15,17,17,18,19,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-111,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999975,-1,7,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-145,-5,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,16,6,8,-71,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,17,17,18,19,20,3,9))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-36,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-79,-105,-110,-115,-120,-125,-130,-140,999970,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, 999970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-150,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999973,2,3,3,2,-49))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-104,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-115))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-49,-80))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,2,1,3,2,2,1,2,2,2,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 999970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,14,13,999977,13,-100,13,14,14,15,15,3,17,17,18,19,-95,20,3,13))
        );
        org.junit.Assert.assertEquals(
            result, 999977
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,-49,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,15,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,17,17,18,999980,-95,20,-1,10))
        );
        org.junit.Assert.assertEquals(
            result, 999980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,999971,2,1,3,2,2,1,2,2,3,1))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,3,17,17,18,15,19,-95,20,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,999984,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,-25))
        );
        org.junit.Assert.assertEquals(
            result, 999984
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,999971,2,1,3,2,2,1,2,2,9,2))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999992,1,3,2,1,2,2,2,1))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,9,-70,-75,-80,-85,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-49,-80))
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,999991,2,1,3,2,2,999981,1,2,2,-25))
        );
        org.junit.Assert.assertEquals(
            result, 999991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,3,2,2,3,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-130,-5,-30,999991,-5,-5,-6,-6,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,999991,1,3,2,2,999981,1,2,2,-25))
        );
        org.junit.Assert.assertEquals(
            result, 999991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,17,-5,-5,-105,-21,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-105,-5,-145,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,-150,999987,999986,999985,999984,999983,999982,999980,999979,999978,999974,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-49,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,19,1,3,2,2,3,999983,3,19))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-101,0,10,-100,-1000,10,-100,-100,10))
        );
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-20,1,1,3,2,2,2,2,2,-20))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-4,-15,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,2,2,2,-49))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-4,-5,-5,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,15,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,-100,13,14,14,15,15,17,17,18,999980,-95,20,-1,10,10,15))
        );
        org.junit.Assert.assertEquals(
            result, 999980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-4,-6,-6,-5,-5,-20,-6))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-7,-6,-5,-5,-120,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,999991,-79,1,3,2,2,999981,1,2,2,-25))
        );
        org.junit.Assert.assertEquals(
            result, 999991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999991,999996,999995,999994,999992,18,999990,999987,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,18,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999974,999985))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,999973,-5,-5,-5,-145,-5,-10,-6))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-5,-150,-5,-145,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,-5,-5,-95,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999979,999977,999976,999975,999974,999973,999972,999971,999970,999976,999991))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,3,2,2,-49,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-150,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,19,1,3,2,2,4,3,999983,19))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999998,999996,999995,999994,999993,999992,999971,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,8,8,9,9,9,9,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,20,3,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-5,-5,-145,-1000,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999991,999996,999995,999994,999992,18,999990,999987,999989,999988,999987,999986,999985,999984,999983,999982,999981,999979,999978,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-5,-4,-5,-49,-5,-40))
        );
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,1,1,1,3,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,8,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,20,3,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-111,-5,-5,-5,-5,999988,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999988
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,3,2,4,2,2,-49,2,-49))
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,999979,-5,-5,-5,-6,999979))
        );
        org.junit.Assert.assertEquals(
            result, 999979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-130,-5,-5,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,-25,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,999992,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-6,-5,-5,-5,-6,-6,-5,-5,-5,-6,-6,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,999971,2,-104,1,3,2,2,1,2,2,3))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-80,52,11,51,99,-40,7,59,-34))
        );
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-10,-5,-5,-6,-5,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,999972,-45,-50,-55,-60,9,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-49,-80))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,2,1,4,2,2,1,1,2,2,2,3,3))
        );
        org.junit.Assert.assertEquals(
            result, 999970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999970,999971,2,1,3,2,2,1,2,2,9,999981))
        );
        org.junit.Assert.assertEquals(
            result, 999981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-5,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-106,-150,-55))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,3,3,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,20,19,1,3,2,2,3,999983,19))
        );
        org.junit.Assert.assertEquals(
            result, 999983
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-70,-15,-20,-25,-30,11,-35,-40,-45,-104,-50,-55,-60,-65,-105,-75,-80,-85,-90,-95,-100,8,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-80,-5,-95))
        );
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999998,999996,999995,999994,999993,999992,999971,999991,999990,999989,-150,999976,999987,999986,999985,999984,999983,999982,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999987))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999975,-1,-79,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-15,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-75,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,5))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,13,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,2,2,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999974))
        );
        org.junit.Assert.assertEquals(
            result, 999974
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,16,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,16,7,6,8,9,10,9,-95,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-15))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,999986,5,6,7,8,9,10,11,12,13,14,15,5,16,17,18,19,20,20))
        );
        org.junit.Assert.assertEquals(
            result, 999986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,999976,19,20,15))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,5,8))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,999976,6,6,8,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,14,14,15,15,15,17,17,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,9,999992,10,11,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,-130,6,8,9,9,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1000,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,999976,19,20,15,19,13,5))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-35,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-15,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,999976,-5,-5,-5,-110,-110))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,999998,6,7,6,8,9,9,8,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,10,15))
        );
        org.junit.Assert.assertEquals(
            result, 999998
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1,-100,-1000,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,21,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998,999978))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,-5,-5,-5,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,7,8,-1,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,999976,-6,-5,-5,-110,-110))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,7,8,9,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,17,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-15))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,5,11))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,8,999990,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,5,7,8,9,999992,10,11,12,13,14,15,16,-40,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,999986,5,6,7,8,9,10,11,12,13,14,999983,5,16,17,18,19,20,20))
        );
        org.junit.Assert.assertEquals(
            result, 999986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,16,8,9,999992,10,11,12,13,14,15,16,17,999976,19,20,15,11,999976,2))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-100,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-25,6,6,6,8,8,9,9,9,9,10,-135,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-100))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-35,-30,-35,-40,-120,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,14,-100,-105,999979,-15,-110,-115,-120,-125,-130,-135,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, 999979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,1,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999975,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-101))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,2,2,2,5))
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,18,19,20,16,12,16))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,11,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1,-100,-1000,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-2,-100,-1000,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,16,10,11,12,13,14,15,16,17,999976,19,20,15,11,20,17))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999974,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,-115,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998,-115))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,21,1,1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,18,7,8,9,10,12,12,14,15,16,17,18,19,20,5,8))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1000,-1000,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,21,1,1,2,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-100,999971,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-25,6,6,6,8,8,9,9,9,9,10,-135,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,14,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,-120,13,13,13,13,14,14,15,15,17,18,19,20,16,12,16))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,999972,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,21,1,1,2,1,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,2,3,5,6,18,7,8,-1,10,11,12,13,14,15,16,17,18,19,20,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-100,-100))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999980,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,7,1,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,5,11))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,21,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,8,9,10,9,9,10,10,10,12,12,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-1000,-1,-100))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,21,1,1,2,1,1,1,1,1,1))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-100))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,12,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,11,12,13,14,15,16,17,999976,19,999979,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(19,999974))
        );
        org.junit.Assert.assertEquals(
            result, 999974
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,4,999998,999974,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,-115,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998,-115))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1,-100,-1000,-1,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,10,6,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,19))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999975,999974))
        );
        org.junit.Assert.assertEquals(
            result, 999975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,12,6,16,12,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,999985,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,11,12,13,14,15,16,17,999976,-60,19,999979,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999984,999983,999982,999981,999980,999979,999977,999976,999975,999974,999973,999972,999971,999970))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-100,-1000,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,7,999990,9,11,12,13,-145,14,15,16,17,18,19,20,999990))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,10,10,13,10,12,12,13,2,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,10,17,18,19,20,9))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,4,999998,999974,999997,999996,999995,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,-115,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998,-116))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,2,2,2,5))
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,-5,-5,-5,-5,-6,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-1,-100))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,10,6,10,10,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,999971,19))
        );
        org.junit.Assert.assertEquals(
            result, 999971
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-6,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,3,-25,999998,6,7,6,8,9,9,8,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,10,15,3))
        );
        org.junit.Assert.assertEquals(
            result, 999998
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,10,13,10,12,12,13,13,13,13,13,14,14,999994,15,15,15,17,17,18,19,20,14))
        );
        org.junit.Assert.assertEquals(
            result, 999994
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,12,13,14,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,-5,-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,6,18,-20,8,999990,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5,-6,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,21,1,1,2,1,1,1,1,1,1,21))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,999992,10,21,12,13,14,15,16,8,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-100,-1000,-1,-1,999982))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,12,6,16,12,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,999985,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,15,16,17,18,19,20,2))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,21,13,4,14,15,16,17,999976,19,20,999991,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,3,5,6,18,7,8,-1,10,11,12,13,14,15,16,17,18,19,20,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-6,-5,17,-4,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,999992,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-115,-1,-100,-1000,-1,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999988,1,2,3,4,5,7,8,999992,10,21,13,4,14,15,17,999976,19,20,999991,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-116,5,6,18,-20,8,999990,9,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-101,-1000,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,3,5,6,18,7,8,-1,10,11,12,13,14,16,17,18,19,20,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-145,3,-25,6,6,6,8,8,9,9,9,10,10,13,12,12,13,2,13,13,13,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,-20,999990,1000000,9,11,12,13,-145,14,15,16,17,18,19,20,2,18))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,7,1,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,-70,4,5,7,8,999992,11,12,13,14,15,16,17,999976,-60,19,999979,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,12,6,16,12,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,-40,14,15,999985,15,17,17,18,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,999992,10,21,12,13,14,15,16,8,17,999976,19,20,15,11,17))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,-1,-100,-100))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,1,21,1,1,2,1,1,1,1,1,1,1,21))
        );
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,999975,8,8,9,9,9,9,10,10,10,12,12,13,13,16,13,13,14,14,15,15,15,17,18,19,20,14))
        );
        org.junit.Assert.assertEquals(
            result, 999975
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-145,3,-25,6,6,6,8,8,9,9,9,10,10,13,12,12,13,2,13,13,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,13,13,13,13,13,14,14,15,999982,-5,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999982
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3,19))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,14,3,-25,6,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,999972,-1,-100))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-100,-100,-100))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,6,6,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-90,-120,-125,-130,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,999977,7,8,999992,10,21,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,18,2,2,2,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,-5,-5,999991,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,-25,6,6,6,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,13,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3,19))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,16,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-90,-120,-125,-130,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,1,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-90,-120,-125,-130,-140,-145,-150,-50))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(0,1))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8,9,10,11,12,13,14,15,16,17,999976,19,20,15))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,13,9,9,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3,19,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,13,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3,19,1))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-5,21,999973,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,18,8,9,9,13,9,9,10,-120,10,12,12,18,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3,19,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,21,13,4,14,15,16,17,19,20,999991,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,1,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999988,1,2,3,4,5,7,8,-120,999992,10,21,13,4,14,15,17,999976,19,20,999991,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,7))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,999986,5,6,7,8,9,10,11,12,13,14,15,5,16,17,18,19,20,20,8))
        );
        org.junit.Assert.assertEquals(
            result, 999986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,1,2,2,1,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,999978,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999978
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,16,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-64,-90,-95,-100,-105,-110,-90,-120,-125,-130,-140,-145,-150,-80))
        );
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-100,999995,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,11,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,11,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,999984,-100,-1000,-1,-1,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,3,5,6,18,7,8,-1,10,11,12,13,14,16,17,18,19,18))
        );
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,999986,13,13,14,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,999992,10,21,13,4,14,15,16,17,19,20,999991))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,12,5,6,18,7,8,9,9,11,12,13,-145,14,15,16,17,18,19,19,9))
        );
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,12,6,16,12,7,6,8,10,9,9,10,10,10,12,12,13,13,13,13,13,-40,14,15,999985,15,17,17,18,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 999985
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-15,-20,-25,-30,-40,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,-145,-150,-15,-25))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1001))
        );
        org.junit.Assert.assertEquals(
            result, -1001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,-90,15,16,17,18,19,20,2))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,999972,14,14,15,15,15,17,17,18,19,20,10))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,14,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-35,1,3,3,-25,6,6,6,8,8,9,9,9,10,10,13,10,12,12,2,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999999,1,15,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,11,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9))
        );
        org.junit.Assert.assertEquals(
            result, 999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1001,1,2,3,4,5,999977,7,8,999992,10,21,12,13,14,15,16,17,999976,19,20,15,11,15,5,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,19,20,13))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,11,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,7))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(0,1,0))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,-5,-5,-5,-6,-5,-6))
        );
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,-60,3,-25,6,16,7,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-120,3,3,-25,6,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,-80,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,-1,12,12,13,13,13,13,13,13,14,14,15,15,13,15,17,17,18,19,20,15,3,8))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999988,999989))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,5,6,6,6,8,8,10,9,9,9,10,10,10,12,12,13,13,13,13,999972,14,14,15,15,15,17,17,18,19,20,8))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999988,1,2,3,4,5,7,8,-120,999992,10,21,13,4,14,15,17,999976,19,20,999991,11,1))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,3,5,7,8,9,999992,10,11,999981,12,13,14,15,16,-40,999976,19,20,15,11,10))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999999,1,15,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,11,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9,11))
        );
        org.junit.Assert.assertEquals(
            result, 999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,999976,19,20,15,19))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,1,2,1,2,2,1,3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,999982,999973,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,-14,-15,-35,-30,-35,-40,-120,-45,-50,-55,-60,-65,-70,-75,-80,-85,-90,-95,14,-100,-105,999979,-15,-110,-115,-120,-125,-130,-135,-140,-145,-150,-125))
        );
        org.junit.Assert.assertEquals(
            result, 999979
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999972,999971,999970,999978,999998))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-145,2,3,4,5,6,-20,999990,9,11,12,13,-145,14,15,16,17,18,19,20,2,18))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12,9,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,9,10,10,13,10,12,12,13,13,9,13,13,13,14,14,15,15,15,17,17,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,13,13,13,13,13,14,14,15,2,999982,-5,17,17,18,19,20,14))
        );
        org.junit.Assert.assertEquals(
            result, 999982
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999999,1,15,3,3,-25,6,7,6,8,9,9,9,9,10,10,-120,10,12,11,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9,11,17))
        );
        org.junit.Assert.assertEquals(
            result, 999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,21,13,4,14,15,16,18,19,20,999991,11,2))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,5,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,7,1,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-5,-10,16,-15,-20,-25,-30,-35,-40,-45,-50,-55,-60,-89,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-90,-120,-125,-130,-105,-140,-145,-150))
        );
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,8,9,10,9,9,10,4,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,999993,14,15,15,15,17,17,18,19,20,15))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,999990,1000000,9,11,12,13,-145,14,999999,15,16,17,18,19,20,12))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,8,9,9,9,9,10,10,13,10,12,12,13,13,13,13,13,999993,14,15,15,-125,15,17,17,18,19,20,15,9))
        );
        org.junit.Assert.assertEquals(
            result, 999993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,12,8,999992,10,11,12,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-5,999978,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999978
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,999989,-100,-14))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-95,2,2,2,999999))
        );
        org.junit.Assert.assertEquals(
            result, 999999
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-100,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,15,15,17,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,8,999992,10,21,13,4,14,15,16,8,18,19,20,999991,11,2))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,16,8,9,999992,10,11,12,13,14,15,16,17,999976,19,20,15,11,999976,2))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,6,-20,8,999990,9,11,12,13,-145,14,15,16,17,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-100,-70,-100,-71))
        );
        org.junit.Assert.assertEquals(
            result, -70
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999984,999982))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,18,2,2,2,3,2))
        );
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,5,7,8,9,999992,10,11,12,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,18,19,20,16,12,16,14))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-20,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-116,5,6,18,-20,8,999990,10,11,12,13,-145,14,15,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,3,999995,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,999982,999973,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,-30,999970,999978,999998,999973))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,-120,-125,-130,-135,-140,15,-145,-150,-15,-130))
        );
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999984,999982,999998))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,999977,999977,7,8,999992,10,21,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999992
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,5))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999997,999996,999995,999994,999993,999992,999991,999990,999989,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999984,999982,999980))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,-24,13,13,13,13,13,14,14,15,15,17,18,19,20,16,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,6,6,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,14,14,15,15,15,17,999981,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-99,-1000,-100,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,15,15,17,17,18,19,20,16,12,6))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-110,-145,-5,-5,-5,-5,999978,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, 999978
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,-99,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,15,3))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,6,8,9,10,9,9,10,10,10,12,12,13,14,13,13,13,14,14,15,15,17,17,18,19,20,7,1,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,999987,-25,6,7,-130,6,8,9,9,9,9,10,10,-120,10,12,12,13,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999987
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,16,7,8,9,10,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,16,7,12))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,3,-50,6,18,7,8,-1,10,11,12,13,14,15,16,17,12,18,19,20,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-116,5,6,18,-20,8,999990,10,9,11,12,13,-145,14,-99,16,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,14,3,-25,6,6,7,6,8,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,2,999986,5,6,7,8,9,10,11,12,13,999983,5,16,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999986
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(2,2,2,2,999973,2,2))
        );
        org.junit.Assert.assertEquals(
            result, 999973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(17,3,-50,6,18,7,8,-1,10,11,12,13,14,17,16,17,12,18,19,20,-1000,18))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(999989,999972,-1000))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999974,999997,999996,999995,999987,999994,999993,999992,999991,999990,999989,999988,-95,999987,999986,999985,999984,999983,-115,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999978,999998,-115,999971))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,6,7,6,8,9,9,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,6,10))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,12,13,13,13,13,999972,14,14,15,15,15,17,17,18,19,20,13))
        );
        org.junit.Assert.assertEquals(
            result, 999972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,-25,6,6,6,8,8,9,9,9,9,10,999988,10,10,12,12,13,13,13,999981,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 999988
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,6,9,9,10,10,10,12,12,13,13,13,13,13,14,14,15,15,15,17,17,18,19,20,9))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-99,-2,-100,-1000,-1000,-1000))
        );
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1,-10,-15,-20,-25,-30,-35,-40,-45,-50,-55,-65,-70,-75,-80,-85,-90,-95,-100,-105,-110,-115,999989,-120,-125,-130,-135,-140,15,-145,-150,-15,-130,-1))
        );
        org.junit.Assert.assertEquals(
            result, 999989
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1000000,999999,999998,999996,999995,999994,999993,999992,999991,999990,999989,999988,999987,999986,999985,999984,999983,999982,999981,999980,999979,999978,999977,999976,999975,999974,999973,999972,999971,999970,999984,999982,999998))
        );
        org.junit.Assert.assertEquals(
            result, 1000000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,5,6,6,6,8,8,10,9,9,9,10,10,10,12,12,13,13,13,13,999972,14,14,15,15,15,17,17,18,999977,20,8))
        );
        org.junit.Assert.assertEquals(
            result, 999977
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,999977,7,8,-2,10,21,12,13,14,15,16,17,999976,19,20,15,11))
        );
        org.junit.Assert.assertEquals(
            result, 999977
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,999976,6,6,8,8,9,9,9,10,10,13,10,12,12,13,13,13,13,14,14,15,15,15,17,17,18,20))
        );
        org.junit.Assert.assertEquals(
            result, 999976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,18,-20,999990,9,11,12,13,19,14,-90,15,16,17,18,19,20,2))
        );
        org.junit.Assert.assertEquals(
            result, 999990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,-30,3,5,6,6,6,8,8,9,9,9,9,10,10,10,12,13,13,16,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,16,7,6,8,9,10,9,9,10,10,5,12,12,13,13,13,13,13,14,14,15,15,17,17,18,19,20,7,1,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1,3,3,-25,6,7,6,8,9,9,9,9,10,10,12,12,13,13,13,13,14,14,15,15,15,17,17,18,19,20))
        );
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
}

