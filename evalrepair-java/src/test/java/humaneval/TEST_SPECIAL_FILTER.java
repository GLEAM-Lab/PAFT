package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_SPECIAL_FILTER {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {5,-2,1,-5}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,-73,14,-15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,109}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {43,-12,93,125,121,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71,-2,-33,75,21,19}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,37,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,99,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,89,-12,77,13,196}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,-35,16,44,-67}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {22,-33,-46,89,-91,128}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {55,-62,7,99,23,18}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,71,-123,39}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,12,22,-76,37}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,153,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,232,324,-876,799}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,89,-12,77,13,196,196}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,37,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71,55,-62,7,99,23,18}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,99,56,104,42,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,37,-71,-91,-18,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,37,-71,-91,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-15,42,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,12,77,13,196,196,89,196}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,37,-71,-35,-25}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,56,104,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,56,104,42,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {104,14,-8,62,72,39}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,56,104,42,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,12,22,12}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,12,22,12}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,12,324,12}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,5,6,-123,39}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,-91,-71,-91,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,152,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,57,-15,42,99,104}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,37,-71,-17}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {44,152,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,56,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {89,-25,9,-91,-71,-91,-71,-18,5}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,-76,99,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,232,324,-877,-876,152,799,324}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,5,6,-76,6}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-8,62,37,6,-76,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71,55,-62,7,99,23,18,99}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {239,39,152,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,154,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,22,-76,37}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,-35,16,44,-67,-67}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,155,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,152,241,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,-91,-67,-71,-91,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,-71}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-15,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {240,39,152,241,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,151,152,240}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,56,104,-339,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,104,42,42,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71,55,-62,7,99,23,18,99,18}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,152,240,39}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71,55,-62,7,99,23,18,71,55}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {239,39,152,-35,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,56,-339,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,56,104,42,104,56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,9,12,37,-71,-35,-25}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-8,6,62,37,6,-76,36,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,89,-12,77,196,196}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,152,241}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {239,39,152,39,240,-339,-339}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {240,39,152,241}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-62,232,324,-877,-876,152,799,324}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,232,324,-877,62,-876,152,799}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,99,56,104,42,99}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,153,99,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,104,152,240,152}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,239,152,39,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,22,-76,37,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-25,9,12,37,-71,-35,-25}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-15,99,56,104,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-15,-123,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,-35,44,-67,-67}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {55,-62,7,23,18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,5,6,-76,6,14}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,-123,39,-8}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,62,-18,6,-76,6,5}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-25,-876,9,37,-71,-18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {55,-62,7,241,99,23,18}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,42,99,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,-35,16,44,-67,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {76,6,89,-12,77,13,196,196}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-16,42,99,56,104,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-15,56,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {57,-23,-15,42,105,104,42,42,44,104,42}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-16,99,56,104,42,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {55,-62,7,24,18}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {22,-33,-46,-91,128}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-23,-15,42,99,154,42,-15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,-8,-18,6,-76,6,6}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {240,39,152,240,-339}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-62,232,324,-46,-876,152,799,324}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,240}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {39,241,240,39}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,-35,62,16,44,-67,42}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,109,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,218,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,21517,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109,-125}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,1111,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,505,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,12,103,15}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,13}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,-2,121,357,1892,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,103,14,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,8,-3,45,21,-2,121,357,1892,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,456,789}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,109,121,1892}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,218,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,21517,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,1111,111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,4,6,8,14,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,788,111,123}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,12,103,14,12,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109,93,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,93,456,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,103,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,109,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,123,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,4,6,8,14,12,6}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,7113,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,-123,93,456,111,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,789,13,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,102,103,104,100,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,21517,789,111,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,504,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,214,13,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,121,109,10,-125,11}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,122,504,789,111,789,504,789}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,357,8518,21517,2123,918,358,357}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,1892,103,15,10}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,455}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,1111,111,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,46,21,-2,121,357,1892,-2,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,104,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,504,789,504}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,414,214,357,8518,21517,2123,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {455,123,789,111,21518,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,101,102,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,120,121,122,214,357,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,103,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,789,13,15,16,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1892,121,122,214,357,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,111,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,7113,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,112,1111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,45,21,109,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,1111,109,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,8518,102,103,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,123,103,15,10}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109,93,11,-12}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,10,-125,11}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,415,357,8518,21517,2123,122,918,2123,21517,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,214,218,8518,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,414,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,-55}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,-123,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,-3,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,122,1111,109,110}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,103,83,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,505,789}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,10,121,109,93,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,505,789,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,10,-125,11,10}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,7113,63,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,6,5,14,12,6}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12,121}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,4,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,6,5,505,12,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,790,505,789,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,8,93,-12,121}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,13,4,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {104,456,-123,93,456,111,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,-55,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,21517,104,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,415,45,357,8518,21517,2123,122,918,2123,21517,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,456,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,21517,100,919}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,104,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,100,102,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {104,456,-123,93,456,110,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,10,-125,11,10,789}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,456,-122}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,505,83,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,790,13,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,790}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,214,13,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,414,214,357,8518,21517,2123,918,2123,21517,214}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,415,789,13,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,112,111,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,-57,84,75,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,-123,93,455,111,456,-123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,13,12,-55,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,-3,111,-3}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,24,10,112,-125,11,11,10,789}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-55,84,83,75,-56,13,12,-55,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {112,-324,456,1111,7113,456,100,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,100,8518,103,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,101,102,101}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,102,100,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,75,-56,214,14}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,103,1892,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,100,102,102,103,104,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,5,14,12,6}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,456,-123,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,21517,789,111,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,93,455,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {357,21518,120,122,414,213,357,8518,21517,2123,918,2123,21517,2123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,1111,4,6,8,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,122,214,357,8518,21518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,93,-12,2123,121,11,121}
        );
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,45,8518,103,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,8,14,10,-324,123,103,15,10}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,100}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {455,123,789,111,121,21518,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {83,102,102,103,104,100,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {103,101,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {64,24,84,75,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,8518,21517,2123,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,-123,93,456,456,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,789,111,789,111,109,789}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,103,1892,15,16,1892,1892}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,504,505,505,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,8518,102,103,104,102,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {99,100,101,102,100,99}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,213,121,109,10,-125,10,10,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,1892,15,16,1892,1892}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,-123,93,93,455,111,456,-123}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,63,214,357,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,8,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,415,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,14,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,45,8518,103,104,505,102,101}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,21516,789,111,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,8518,103,104,102,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,14,14,16,455}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,100,100,102,102,104,6,100}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,-123,102,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,21517,14,16,455}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,8518,-12,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,14,14,16,16,12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,1891,12,103,1892,15,17}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,8518,21517,2123,918,8518,414}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,12,103,14,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109,-123,11}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,415,45,357,8518,21517,2123,122,918,2123,21517,918,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,104,111,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,214,12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,15,75,-56,214,14}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,505,83}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,109,-123,11,109}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,505,83,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-3,123,789,111,789,111,109,789}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,457,1111,7113,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,33}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,357,8518,21517,2123,918,358,357,358}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,102,101}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,21517,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12,11}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,8518,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,357,8518,21517,2123,358,357,358}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-125,14,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,64,-55,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,100,99,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,456,-122,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,788,104,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,7113,1111,1111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,99,100,101,102,100,99}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,102,103,104,10,100,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,457,111,1111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,8518,103,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,111,-125,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,415,21517,2123,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,-55,63,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,21517,100,919,8518}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {505,8,-3,45,21,-2,121,357,1892,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,46,456,789,456,789}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,14,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,11,456,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,21517,920,100,919,8518}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,109}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,14,103,14,12,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {122,505,84,789,-3,111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,1891,12,103,1892,17}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,21,1111,111,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12,121,11}
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,104,14,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,103,-3,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,505,83,101}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,-2,121,357,1892,-2,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,45,13,103,104,505,102,101}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,103,14,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,214,357,8518,21517,2123,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,121,214,357,8518,21517,2123,415,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,109,358,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,218,8518,21517,2123,918,120}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,21,414,214,21516,357,8518,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,11,12,456,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-57,84,75,-56,24,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,13,14,15,16,11,15}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,8,10,12}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,21517,84,75,-56,214,13,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,505,789,102,102,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,213,102,103}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,918,2123,21517,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {122,102}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,10,12,15,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,13,15,16,15}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,1891,12,103,1892,15,17,103}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {122,102,122}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,357,-124,789,456,-123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,15,74,-56,214,14}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {14,11,12,103,14,12,16,14}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,122,109,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,21,414,214,21516,357,8517,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {124,789,111,789,108,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,-3,111,-3,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,1891,12,-123,103,1892,15,17,103}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {357,21518,120,122,414,213,357,8518,21517,2123,918,2123,21517,2123,213}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,14,14,103,12}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {357,120,122,414,213,357,8518,21517,2123,918,2123,21517,2123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,4,8,11,12,6,11}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,14,103,14,12,455,16,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,357,8518,21517,2123,918,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-126,8517,-13,109,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,21518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,122,8518,21517,100,919}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,111,111,456}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,122,109,8518,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,121,83,75,-55,13,12,-55,63,63}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,214,357,8518,21517,2123,121,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,2123,918,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,789,111,789,789,111,109,789}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,123,789,789,111}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,8518,21517,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,918,2123,21517,357}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,1892,16,1892}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,100,99,102,100}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,10,12,15,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,103,1892,15,15,1892,1892}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {83,102,103,104,100,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,11,456,789,111,-123}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,123,103,15,10,63,8}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,12,15,12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,4,8,10,12}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,8518,103,104,102,8518}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,415,21517,2123,918,8518,21517}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,615,45,21,109,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,214,218,8518,21517,2123,918,2123,122,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,120,121,122,214,357,8518,21517,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,213,357,8518,21517,2123,918,2123,21517,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,7,10,12,15,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,214,13,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,-57,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,122,214,74,357,8518,21518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1892,121,122,214,357,21517,8518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-55,13,84,12,-55}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,13,-55}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1891,109,12,103,1892,15,17,103}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,93,104,-55,14,16,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,415,789,14,13,15,16,13}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,5,14}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,8519,414,214,-324,8518,21517,2123,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-55,84,83,12,75,-56,13,12,-55,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12,121,121}
        );
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,414,214,357,8518,21517,2123,918,2123,21517,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,14,103,14,45,455,16,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,8,-4,45,21,-2,121,357,1892,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,93,414,214,-324,415,21517,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103,104,102,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,122,504,789,789,111,789,504,789,122}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,8,14,10,-324,123,103,16,10}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,8518,103,102,101}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,1892,15,16,1891,1892}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,102,103,100,102,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,1892,103,15,10,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,4,8,11,12,6,11,12,11}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {505,8,-3,504,45,21,-2,121,357,1892,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,102,103}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,214,8518,21517,2123,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,10,121,109,93,11,10}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,122,214,357,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,-2,-122,104,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-13,93,121,109,93,11,-12,93,-12,121}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,111,456,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,17,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {99,100,101,102,103,102,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {7,-125,46,1111,109,-125}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,358,8518,21517,2123,358,357,358}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,11,12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,456,456,-122}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-11,-12,93,-125,790,1111,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,8518,102,103,104,102,8518,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {788,4,6,8,14,10,12,103,15}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,122,214,74,357,8518,21518,21517,100,918,121}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8519,21517,918,2123,21517,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,214,13,214}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,918,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-57,84,75,24,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,4,8,11,6,11}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,7,-125,46,1111,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,-55,63,63,83}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,2122,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {124,505,122,504,789,111,789,504,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,101,103,104,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {4,122,414,122,109,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,10,11,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,103,14,15,16,14}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,15,75,-56,214,-124,14}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,122,214,74,357,8518,21518,21517,100,918,121}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,123,789,213,111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,11,12,11}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {919,120,122,414,109,8518,615,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,121,83,75,-55,13,12,-55,63,63,63}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,103,63,1892,15,15,14,16}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,8518,21517,2123,918,414}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,415,-13,21517,918,8518,21517,414}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,456,2123,17,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,7113,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,11,7112,1111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,101,102,101,-122}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,7112,21,103,21517,102,100}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,6,121,109,93,11,-12,93,-12}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,109,108,358,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-55,84,83,75,-56,13,12,-55,63,63,83}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {616,4,5,14}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {104,456,-123,93,456,92,110,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,101,102,101,7112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,214,8518,21517,8,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {99,124,101,102,103,102,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,102,103,104,10,100,102,102,104}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,4,5,14}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,10,12,1111,15,3,10}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,357,8519,21517,918,2123,21517,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,121,214,357,8518,21517,2123,415,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {506,102,505,789,102,123,505,-13,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,6,10,12,15,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,414,8518,21517,2123,918,414}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,357,789,456,-123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,504,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,100,111,-125,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,103,104,100,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,8,14,10,1892,11,103,15,10,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,111,110,456,111,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {46,788,4,6,8,14,10,12,103,15}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,505,789,-13,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-121,101,102,101,7112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-55,84,83,75,-56,13,12,-56,84,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,10,-125,11,121}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-11,93,-125,790,1111,109,1111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,357,8518,21517,2123,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,92,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,214,357,8518,21517,2123,918,2123,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {93,-126,8517,-13,109,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,5,14,4}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,505,121,214,358,8518,21517,2123,358,357,358}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,93,-12,2123,121,11,121,93}
        );
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,93,11,-12,93,-12,121,11,93,11}
        );
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,13,12,15,-324}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,121,109,1111,93,11,-12,93,-12,-12}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,8518,102,103,104,102,105,64,8518,8518}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,84,75,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,415,789,13,-122,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,103,1892,15,15,1892,1892,1892}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,121,109,10,-125,11,10}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {505,8,-3,-13,21,-2,121,357,1892,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {6,100,100,102,102,104,6,100,102}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,121,83,75,-55,13,12,63,63,63}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,357,8518,21517,100,918,121}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,122,214,357,8518,8518,21517,100,918,122}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,123,789,789,111,789}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,17,7113,63,7113}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,123,12,-55,63,63,83}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,357,8518,21517,2123,918,2123,357}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,415,21517,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {505,789,102,123,505,-13,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,456,-123,456,789}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,121,414,214,357,8518,21517,2123,918,2123,21517,918,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,789,456,456,-122,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {8518,103,104,102,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,-123,456,789,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,6,8,99,12,15,-324,15}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-324,8,99,12,15,-324,15}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,100,111,-125,11,109}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,121,615,93,11,-12}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,120,121,122,214,357,8518,21517,2123,357,8518}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,505,121,214,358,21517,-121,358,357,358,358}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,21517,789,12,111,789,111,21517}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,-1,6,8,14,10,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,101,214,-324,415,21517,2123,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,104,102,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {104,456,93,456,111,92,456}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-122,456,92,789,456,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,21517,415,45,357,8518,21517,2123,122,918,2123,21517,918,21517,45}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,8518,21517,2123,918,920}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,11,12,103,14,12,16,14}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,109,615,8519,21517,2123,918,122}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,-324,2122,-13,21517,918,8518,21517,414}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {93,-126,8517,-13,109}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,92,-125,121,109,10,-125,11,121}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {99,100,102,102,103,-56,102,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,92,-125,121,109,10,-125,11,121,109}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,21517,102,103,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,105,122,414,109,615,8519,21517,2123,918,122}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,102,103,102,102,102}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,11,109,789,111,11}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {455,505,122,504,789,789,111,789,112,504,122}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,14,16,455}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,415,357,8518,21517,2123,122,2123,21517,8517,918,2123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {788,4,8,14,10,12,103}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,14,-56,214,13,214}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,789,12,111,111,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,357,789,456,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,121,109,10,-125,11,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,100,14,10,1892,103,15,10,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,3,102,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,13,16,-55,84}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,414,214,8518,21517,2122,918,414}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {4,6,8,14,10,123,103,15,10,63,8}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,16,14}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,93,-125,-125,11,121,109,10,11,11}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,122,122,214,357,8518,21518,21517,100,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,3,5,14}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,789,12,111,111,21517,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,83,75,-56,13,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,21517,-4,102,103,21517}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,457,75,2123,17,456}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,358,63}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {121,504,121,122,214,357,8518,21517,2123,918,358,357,358,357,214}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,93,414,214,-324,415,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {83,120,122,414,214,357,8518,21517,918,2123,21517,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21516,100,101,102,103,21517,104,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {506,102,505,104,789,102,123,505,-13,789}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {102,8518,103,104,102,918,8518}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-55,84,83,75,-56,13,12,63,63}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-2,4,6,100,14,10,1892,103,15,15,10,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,110,8,11,12,6,11,12,11}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,93,-125,122,109,100,111,-125,11}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {64,24,112,84,-121,75,-56,214,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,4,6,5,505,12,6,12,6,6,12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-55,84,83,75,-56,13,12,-55,63,63,83,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,21,22,23,24,25,26,27,28,29,50,51,52,53,54,55,56,57,58,59,91,92,93,94,95,96,97,98,99}
        );
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {0}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-1}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-11}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {20,30,40}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21,31,41}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {19,29,39}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {110,130,150}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {111,131,151}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,1111,7113}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,75,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,15,84,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,15,103,84,75,-56,-12}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,111,111}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,1111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,11}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,24,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,109,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,109,121,357}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,13,14,15,16,11}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,84,75,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,2123,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,21,109,121,357}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,-123,-123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,16,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,-56,10,75}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,21,109,122,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,-125,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,14,-3,45,6,109,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,12}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,45,76,75,13,75}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,-56,21,13,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {75,112,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,112,112,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,615,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,20,21,109,121,357}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,788,111,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,84,75,-56,10,505,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,84,75,-56,10,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,14,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,74,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,75,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,10,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,45,76,75,13,74}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,100,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,75,-56}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,789,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,15,84,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,84,75,-56,10,76}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,-56,13,-56}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,21,13,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,14,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,100,101,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,15,84,20,-56,13,24,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,10,75}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,83,84,75,10,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,24,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {76,32,76,24,84,75,10,1111,75}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,24,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,-124,456,101,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,615,218,8518,21517,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-124,214,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,615,14}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,93,414,214,615,33,218,8518,21517,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,8518,214,615,218,8518,21517,213,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,16,14,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,112,-123,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,74,21517,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,76,24,84,75,11,-56,10,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,85,13,-56}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,23,-56,10,24,10,-56,8518,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,24,103,104,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,1110,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,615,75,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,14,-3,45,109,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,76,24,84,75,10,75}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,615,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,615,218,8518,21517,2123,918,6,615,615,2123}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,121,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,5,-2,14,-3,45,6,109,20,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,7,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,76,15,84,75,-56,13,75}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,456,-123,788,111,-122}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,5,93,414,214,615,33,218,8518,21517,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,45,76,75,13,74}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-3,-12,-3,45,21,109,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,24,103,100}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,24,84,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-2,-3,45,21,109,121,357}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-2,-3,45,21,109,121,357,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-2,-3,-324,45,21,109,121,357,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,24,10,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,121,2123,918,6,615,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,-56,7113,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,8518,120,214,615,218,8518,21517,213}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,85,615,75,-56,13,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,21,109,123,1892}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,6,111,615}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,-12,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,85,-56,75}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,112,112,122,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,-125,75,-56,21,13,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,-12,615,75,-56,13,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,21,24,84,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,75,-56,10,24,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,113,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,101,12}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,-122,456,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-12,77,24,84,75,11,-56,10,-56,10,76}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,74,21517,2123,918,6,615,918}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,119,456,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,63,24,84,75,-56,75,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,7113,121,84,615,75,-56,122}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,-324,456,789,112,-123,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,-56,10,24,10,9,-56,24,24}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,76,75,13,74}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,85,76,24,84,75,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,1110,1111,7113,1111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,-56,10,24,75,7113,84}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,103,2123,-12,918,414}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-3,45,21,109,121,357,1892,45}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {75,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,109,121,357,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,12,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,113,75}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,1111,7113,7113}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,14,112,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,15,5,-2,-3,45,6,109,121,357,1892,6,-2}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,75,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,-56,10,24,75,7113,83,84,76}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,615,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,24,9,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,14,112,113}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,76,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,104,75,45,76,75,13,74}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,24,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,84,32,104,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,104,75,45,76,75,13,75}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {616,63,24,84,615,75,-56,13,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,-56,-3}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-56,-123,456,75,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-123,75,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,790,111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,2123,614,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,112,112,122,789}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,-122,101,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,83,24,75,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,112,112,122,789,113}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {85,75,-56,9,24,-56,24,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,33,6,109,121,357,1892,6,121}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,24,100}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,75,-56,21,13,15,-56}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,84,75,8518,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,112,615,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,20,21,109,121,357,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,789,112,112,122,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,63,24,84,75,-56,75,13,63}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-3,109,45,20,21,63,357}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,109,122,357,6}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,24,24,75}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,21,109,218,357}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {20,76,24,84,75,-56,10,-56,64,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {101,1110,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,2123,614,-12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,12,14,13,14,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,112,112,122,789,113,112}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,83,24,75,-56,-56,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-3,45,21,109,121,357,1892,45,45}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,15,84,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {616,63,24,84,615,75,-56,13,615,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,76,75,77,13,74,75}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,84,75,-56,75,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,613,414,214,615,33,218,8518,21517,2123,614,-12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,14,75,-56,10,10,24,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,75,-56,21,24,84,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,-324,-122,456,218,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,8518,214,615,218,8518,21517,213}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,104,75,45,76,75,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,21517,-12,93,-125,121,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,1111,7113,7113,7113,7113}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,84,75,21,13,15}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,11,23,14,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,455,1111,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,505,23,14,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-3,-12,-3,45,21,108,121,357,1892,213}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,615,75,-56,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,63,15,505,23,14,-56}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,1111,1110,1111,613,7113,8}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {455,15,84,75,21,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {75,33,5,-2,-3,614,6,109,121,357,6}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,616,63,-56,24,84,615,75,-56,13,615,614}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,103,100,101,102,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,-56,14,-56,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,-122,456,63,120}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,21,-3,45,6,121,357,1892,6,45}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,6,111,615,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-12,-3,45,21,109,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,21517}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-3,-12,-3,45,21,121,357,1892}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,790,789,113,14,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,112,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,-122,101,1111,120,101}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,11,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,790,-56,111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,75,-56,24,13,15,-56}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,456}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,112,112,122,789,789,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,1111,7113,1111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1110,7113}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,214,615,33,218,8518,21517,2123,614,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,2122,615,218,8518,21517,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {108,63,121,84,75,-56,122}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,11,75}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,84,-57,8518,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,-57,84,75,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,103,100,101,102,103,104,21517}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,85,76,24,24,84,75,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,615,75,-56,614,13,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,24,24,75,24}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,12,14,13,7113,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,108,-56,10,10,-56}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,121,357,1892,6,-3}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,-123,-123,-123}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,113}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,14,15,16,101,12,12}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,1111,7113,1111}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,13,12,13,14,12,16,12}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,33,6,109,121,357,1892,6,121,-2}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {790,-124,789}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,75,75,-56,21,13,15,-56}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,15,84,20,-56,12,24,-56}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,93,414,214,615,33,218,8518,21517,-12,918,214}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,615,33,218,8518,21517,2123,614,918}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,7113,7113,7113,7113}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,-12,614,615,75,-56,13,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,616,14,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,615,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-3,-123,456,-124,789,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,45,6,109,122,32,6}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,76,93,-124,214,109}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,1111,7113,7113,7113,7113,7113}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-2,-3,45,21,109,121,357,-2}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {62,15,505,23,14,-56,23,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,615,218,8518,21517,2123,790,6,615,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,14,112,113,789}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,14,120,789,113,789,789}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {113,-123,456,790,-56,111}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,-12,77,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,5,615,615,218,74,21517,2123,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {110,-123,456,788,111,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,113,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,2122,615,218,8518,21517,918,6,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,23,-57,-57,84,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,83,24,-56,-56,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,615,113,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,1111,7113,7113,7113,10}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,2123,121,614,-12,918}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,24,84,75,113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,24,112,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,85,84,25,-2,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,21,14,15}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {456,1111,7113,1111,1111}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,788,111,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,615,33,218,8518,21517,2123,614,918,218}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,10,76}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-55,10,24,10,-57,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,111}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,108,-56,10,10,-56,10}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,15,5,-2,62,45,6,109,121,1892,6,-2}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {790,24,23,-57,-56,84,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,75,-56,13,84,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,-56,74}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,24,112,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,83,24,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {16,32,76,24,84,75,-56,10,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,5,-2,14,-3,45,6,109,20,121,357,1892,6,5}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,-12,77,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,24,84,75,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,24,84,615,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-2,-3,45,4,21,109,121,357}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,93,414,214,615,33,218,20,8518,21517,-12,918,33}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,10,10,63}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,9,-12,93,-125,121,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,113,615,14,112,113,112}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,75,-56,10,10,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,85,76,24,24,84,75,-56,10,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {790,24,23,-56,84,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {16,32,76,24,84,75,-56,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {505,789,111,505}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,113,789,113,14}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,85,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,76,45,6,109,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,112,-123,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,114,789,113,615,14,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,2123,918,6,111,6}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,83,24,-55,-56,-56,75,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,214,615,615,218,8518,21517,2123,918,615}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,24,84,112}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,75,-57}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,76,10,10,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {4,6,8,12,15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,11,23,14,-56}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,75,45,76,75,13,74,76}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,-56,75,-56,21,1892,15,-56,-56}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,103,100,101,102,103,104,21517,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,8518,215,615,218,8518,21517,213}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,84,75,85,-56,75,77}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,615,75,-56,614,75,13,614}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,103,2123,-12,918,414,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {616,63,24,84,615,75,-56,13,615,615,24}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {123,505,789,111,111,505}
        );
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {10,12,14,13,7113,15,16,12}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,12,14,15,16,11}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,93,16,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,456,101,788,-122}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,21,109,121,357,-3}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,-2,-3,45,21,109,218,357,-2}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,-56,75,-56,10,24,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {122,108,63,121,123,84,75,-56,122}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,85,84,25,75,-56,13}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {615,616,63,-56,24,84,84,615,76,-56,13,615,614}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15,75,-56,21,32,15,-56,75}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,76,75,77,13,74,75}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,15,84,75,-56,21,13,64,15,13,13,13}
        );
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,615,218,8518,21517,1111,918,615,615}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,111,-123,-122,-123,789}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,-56,10,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {21517,103,100,101,102,103,6,21517,103}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,75,45,76,75,74}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {31,76,24,84,75,-56,10,74}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,12,13,12,918,15,16,11}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-56,456,75,112}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,-3,357,21,109,121,357,1892,45}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,615,93,214,109,109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,-56,13,84}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {12,15,16}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,76,24,63,84,75,-56,10,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,24,84,75,11,75}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,101,24,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {32,76,84,75,-56,10,24,75,7113,84,32}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {11,-12,93,-125,-125,109,-125}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,84,75,-56,10,76}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,21517,615,122,2122,615,218,21517,2123,918,6,616}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-123,456,789,112,-123}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {4,-2,-3,45,6,121,357,1892,6,-3,6}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {31,84,75,-56,64,74}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,15,101,102,5,103,104}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {614,62,101,24,100,100}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,455,45,6,109,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33,5,-2,-3,6,1892,121,357,1892,6}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,83,84,75,10,-56,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {100,24,103,103}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,-56,75,-56,10,24,10,-56,24,10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {24,84,-56,10,24,10,9,-56,11,24,24}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {26,-324,1111,7113}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-124,789,112,112,-124}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {789,-124,789,112}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,-122,101,-324,1111,120,101}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {120,122,414,214,615,33,218,8518,21517,64,614,-12}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {63,24,84,-12,614,615,75,-56,83,13,615}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-325,-324,101,1111,120}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {84,63,14,24,84,75,-56,75,13,63,24}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {-324,456,10,7113,7113,7113,4}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {62,15,84,75,75,-57}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
}

