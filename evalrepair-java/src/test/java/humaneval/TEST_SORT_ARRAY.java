package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SORT_ARRAY {
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {-2,-3,-4,-5,-6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {-2,-3,-4,-5,-6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,8,16,32}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {32,16,8,4,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111,222,333,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111,222,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,6,8,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,8,6,4,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,32,64,128,256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {256,128,64,32,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1023,511,255,127,63}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1023,511,255,127,63}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,6,8,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,10,8,6,4,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {3,111,221,222,333,444,222,222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,111,221,222,222,222,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {127,32,12,11,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {127,32,12,11,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {3,111,511,222,3,333,444,222,221,222,512}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,111,221,222,222,222,333,444,511,512}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111,15,222,333,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {15,111,222,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,15,3,7,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,3,7,12,15}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,6,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,10,6,4,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,15,3,7,12,12,3,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,3,3,7,12,12,15}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {3,111,511,222,3,333,444,222,222,222,111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {511,444,333,222,222,222,222,111,111,3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {511,16,32,2,128,256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,16,32,128,256,511}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,15,3,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,3,3,12,15}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,100000,3,7,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {100000,12,7,3,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,12,11,9,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,9,11,12,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,2,6,8,10,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,8,8,6,4,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {4,6,10,10}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,10,6,4}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {511,16,32,2,128}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,16,32,128,511}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {127,32,12,11,9,13}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {127,32,13,12,11,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {15,0,10101009,0,100000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,15,100000,10101009}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111,15,222,333,444,333,222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {15,111,222,222,333,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,15,3,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,12,15,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111,222,333,334,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111,222,333,334,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,15,3,12,3,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,12,15,15,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,12,15,3,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,12,12,15,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {3,111,222,333,444,222,222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,111,222,222,222,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,15,3,13,3,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,13,15,15,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,12,15,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {16,15,12,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,9,12,11,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,9,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {32,2,128,128}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {128,128,32,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,8,12,7,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111,222,333,444,444}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111,222,333,444,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {511,16,32,2,128,256,128}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,16,32,128,128,256,511}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,2,128,128}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {128,128,16,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,4,2,6,10,9,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,9,6,4,2,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,8,64,12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,8,12,64}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {333,111,15,222,332,444,333,222}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {15,111,222,222,332,333,333,444}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {12,3,12,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3,3,12,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {511,16,32,2,128,129,128,32}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,16,32,32,128,128,129,511}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {512,16,32,2,128}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {512,128,32,16,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,9,12,11,9,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,9,9,10,11,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,15,16,17,18,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12,13,14,15,16,17,18,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,1111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654322,123456789,777777,111111111,444555666,12312312,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654322,444555666,123456789,123456789,111111111,12312312,9999999,9999999,777777,99999,8888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,15,16,17,17,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12,13,14,15,16,17,17,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,33554431,134217727,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,134217727,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654322,123456789,777778,111111111,444555666,18,12312312,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654322,444555666,123456789,123456789,111111111,12312312,9999999,9999999,777778,99999,8888,18}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,1027,987654322,123456789,777778,111111111,444555666,18,12312312,8888,2097151,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654322,444555666,123456789,111111111,12312312,9999999,9999999,2097151,777778,99999,8888,1027,18}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554432,134217727,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554432,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,2097152,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097152,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,8888,99999,9999999,444555666}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,9999999,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1029,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1029,1028,1027,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654322,123456789,777778,111111111,444555666,17,12312312,8888,99999,9999999,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {17,8888,99999,777778,9999999,9999999,12312312,12312312,111111111,123456789,123456789,444555666,987654322}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455,33554431,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1030,1031,1026,1029,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1027,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1111,111,11111,111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1028,1029,1030,13,1034,1031,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {13,1024,1025,1027,1028,1029,1030,1031,1032,1033,1034}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654322,777777,111111111,444555666,12312312,8888,99999,56,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654322,444555666,123456789,111111111,12312312,9999999,9999999,777777,99999,8888,56}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1023,1025,1026,1027,1029,1030,1031,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1033,1032,1031,1030,1029,1027,1026,1025,1023}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {789,7,7,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {789,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1110,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,11111,1110,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,33554431,0,134217728,134217727,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,134217727,134217727,33554431,16777215,524287,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555665,1029,12312312,111111111,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555665,123456789,123456789,111111111,111111111,12312312,9999999,9999999,777777,99999,8888,1029}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1032,1028,1029,1030,1031,1029,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1032,1031,1030,1029,1029,1028,1027,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1030,1031,1029,1032,1024}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1027,1026,1025,1024,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,8888,99999,9999999,444555666}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,9999999,9999999,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1111,111,11111,111111111,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,111111111,444555666,12312312,8888,99999,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,12312312,12312312,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,8888,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,777777,9999999,9999999,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,11111110,111111111,1111111111,111111,1111,111,11111,111111111,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,11111110,1111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,1111111111,111111111,1111111111,1111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,11111111,1111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111111111,1111111111,1111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,1111111,1111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1030,1031,1032,1024}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1028,1027,1026,1025,1024,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111111,1111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,1111111,1111111,111111,111111,11111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,8888,99999,9999999,444555666,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,9999999,12312312,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,1111111,524287,16777215,134217727,134217727,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,134217727,16777215,16777215,2097151,1111111,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,2,11111111,111111111,1111111111,1033,111111,1110,1111,111,11112,11112}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,111,1033,1110,1111,11112,11112,111111,111111,1111111,11111111,111111111,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777214,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777214,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111111111,1111111111,1111111,1111111111,111111,1111,111,67}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,111111111,1111111,1111111,111111,111111,1111,111,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {99998,9999999,123456789,123456789,777777,111111111,444555665,12312312,8888,99999,9999999,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99998,99999,99999,777777,9999999,9999999,12312312,111111111,123456789,123456789,444555665}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554430,134217727,268435454}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524287,2097151,16777215,33554430,134217727,268435454}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554430,134217727,2097152,268435454}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524287,2097151,2097152,16777215,33554430,134217727,268435454}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9,15,15,56,67,89,143,11111110,789,987,216}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,15,15,56,67,89,143,216,789,987,11111110}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,2097151,524287,16777215,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,524287,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,524286,33554431,268435455,67,33554431,67}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,2097151,524287,524286,67,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,1032,8888,9999999,8888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,8888,8888,777777,9999999,9999999,111111111,123456789,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10000000,123456789,987654321,123456789,777777,111111111,444555665,444555666,12312312,111111111,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,10000000,12312312,111111111,111111111,123456789,123456789,444555665,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {789,7,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {789,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554430,134217727,33554431,2097152,268435454}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524287,2097151,2097152,16777215,33554430,33554431,134217727,268435454}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1034,2097151,524287,16777215,33554431,134217727,524286,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1034,524286,524287,2097151,16777215,33554431,134217727,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,8887,16777215,33554431,134217727,268435455,33554431,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151,2097151,524287,8887}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1030,1031,1029,1032,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1027,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,11111111,111111111,1111111111,111111,1111,111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,111111,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10000000,111111110,123456789,987654321,123456789,777777,111111111,444555665,444555666,12312312,111111111,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,10000000,12312312,111111110,111111111,111111111,123456789,123456789,444555665,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777216,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,16777216,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654322,123456789,777778,111111111,111111,17,12312312,8888,9999999,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {17,8888,111111,777778,9999999,9999999,12312312,12312312,111111111,123456789,123456789,987654322}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10000000,10000000,123456789,1028,123456789,777778,111111111,444555666,17,12312312,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {17,1028,8888,99999,777778,9999999,10000000,10000000,12312312,111111111,123456789,123456789,444555666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111111,1111111,111111,1111,111,11111,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,1111111,1111111,1111111,111111,111111,11111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455,33554431,2097151,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,33554431,134217727,33554430,268435455,33554431,2097151,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,33554431,33554430,16777215,2097151,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524285,2097151,524287,524286,33554431,268435455,67,33554431,67,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,268435455,33554431,33554431,2097151,524287,524286,524285,67,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111,111111,1111,111,11111,1111111,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,1111111,1111111,1111111,1111111,111111,111111,11111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,1033,111111,11111111,1110,1111,111,11112,11112,111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,11111111,1111111,111111,111111,111111,11112,11112,1111,1110,1033,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,9999999,123456789,987654321,123456789,9999998,777777,111111111,444555666,12312312,8888,9999999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,777777,9999998,9999999,9999999,9999999,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,1111111,524287,16777216,134217727,134217727,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,134217727,16777216,16777215,2097151,1111111,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,1029,123456789,777777,12312312,99999,777777}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {123456789,12312312,777777,777777,777777,99999,1029}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777216,33554431,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,33554431,16777216,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,12312311,8888,99999,9999999,444555666,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,9999999,12312311,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,1029,8,777777,12312312,99999,777777}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12312312,777777,777777,777777,99999,1029,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,9999999,123456789,987654321,123456789,9999998,777777,111111111,444555666,12312312,8888,9999999,9999999,123456789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,777777,9999998,9999999,9999999,9999999,12312312,111111111,123456789,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,111111111,11111111,111111111,1111111111,524286,1111,111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,524286,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,134217727,268435455,33554431,2097151,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {143,123456789,987654321,123456789,777777,111111111,444555665,444555666,12312312,111111111,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,444555665,123456789,123456789,111111111,111111111,12312312,9999999,777777,99999,8888,143}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,1028,123456788,777777,111111111,12312312,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {123456788,111111111,12312312,777777,777777,99999,1028}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111111110,1111111111,1111111111,1111111,1111111111,111111,1111,111,67,111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,1111111110,111111111,1111111,1111111,111111,111111,111111,1111,111,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,9999999,123456789,777777,111111111,444555666,12312312,99999,444555666}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {99999,777777,777777,9999999,12312312,111111111,123456789,444555666,444555666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,111111111,444555666,33554432,111111112,8888,99999,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,12312312,33554432,111111111,111111112,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,2097151,524287,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,111111111,444555666,8887,12312312,8888,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,123456789,111111111,12312312,9999999,777777,99999,8888,8887}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,777778,1111111,1111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,1111111,777778,111111,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654320,123456789,777777,111111111,444555666,8888,12312312,8888,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654320,444555666,123456789,111111111,12312312,9999999,777777,99999,8888,8888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,111111111,1111111111,111111,1110,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,111111,111111,11111,1110,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111111111,1024,1111111111,1111111,1111111111,111111,1111,111,67}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,111111111,1111111,1111111,111111,111111,1111,1024,111,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {3,1034,2097150,524287,16777215,33554431,134217727,524286,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,2097150,524287,524286,1034,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,19,111111112,9999999,123456789,987654321,123456789,111111111,444555666,12312312,8888,9999998,8888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,444555666,123456789,123456789,111111112,111111111,12312312,9999999,9999998,8888,8888,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,10000000,777777,111111111,16777214,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111111,16777214,10000000,9999999,777777,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1034,2097151,1032,16777215,33554431,134217727,524286,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1034,524286,2097151,16777215,33554431,134217727,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,16777215,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,16777215,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,134217727,268435455,987,2097151,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,2097151,2097151,524287,987}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,9999999,123456789,987654321,123456789,9999998,777777,111111111,1034,12312312,8888,9999999,9999999,123456789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1034,8888,777777,9999998,9999999,9999999,9999999,12312312,111111111,123456789,123456789,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,16777216,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,16777216,16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,1111112,524287,16777216,134217727,134217727,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,134217727,16777216,16777215,2097151,1111112,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11111,524287,524286,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,524287,524286,11111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1028,1029,1030,1034,1031,1032,1033,1028}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1034,1033,1032,1031,1030,1029,1028,1028,1027,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524286,16777215,33554431,268435454,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435454,33554431,33554431,16777215,2097151,524286}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,1111112,524287,16777216,134217727,134217727,134217726,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,134217727,134217726,16777216,16777215,2097151,1111112,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,10000000,123456789,1028,123456789,777778,111111111,444555666,17,12312312,8888,9999999,777778}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {17,1028,8888,777778,777778,9999999,9999999,10000000,12312312,111111111,123456789,123456789,444555666}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {444555666,9999999,123456789,987654321,123456789,9999998,777777,111111111,444555666,12312312,8888,9999999,9999999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,777777,9999998,9999999,9999999,9999999,9999999,12312312,111111111,123456789,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,33554431,268435455,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {987654321,9999999,123456789,987654321,7,777777,111111111,444555666,1032,8888,9999999,8888,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,987654321,444555666,123456789,111111111,9999999,9999999,9999999,777777,8888,8888,1032,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,134217727,268435455,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,268435455,134217727,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,45,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,2097151,524287,45}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,268435455,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,268435455,33554431,33554431,16777215,2097151,524287,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,1111111111,111111111,1111111111,1111111,111111,1111,111,11111,111111,1111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,111111111,11111111,1111111,1111111,111111,111111,111111,11111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11111,524287,524287,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,524287,524287,11111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111110,111111111,1111111111,1033,111111,11111111,1110,1111,111,11112,11112,111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,11111111,1111111,111111,111111,111111,111110,11112,11112,1111,1110,1033,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777216,524287,16777215,33554431,16777215,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,16777216,16777215,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1030,1031,1029,1024,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1027,1026,1025,1024,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {143,111111,1111111,11111111,111111111,1111111111,111111,1111,111,11112,143}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,11112,1111,143,143,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,111111111,524287,111111111,1111111111,1111,111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,524287,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1030,1031,1029,1032,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1027,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1031,1026,1029,1032,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1029,1028,1027,1026,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555665,444555666,12312312,2097150,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,444555665,123456789,123456789,111111111,12312312,9999999,9999999,2097150,777777,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,14,15,16,17,17,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12,13,14,14,15,16,17,17,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,777777,111111111,444555666,1032,8888,9999999,8888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,8888,8888,777777,9999999,9999999,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1025,1026,1027,1028,1030,1031,1032,16777215,1024}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1030,1031,1032,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111111,1111111,111111,1111,111,11111,1111111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,1111111,1111111,1111111,111111,111111,11111,1111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,16,13,14,14,16,17,18,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,13,14,14,16,16,17,18,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,20,111111111,444555666,9999999,12312312,8888,8887,99999,9999999,444555666}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {20,8887,8888,99999,777777,9999999,9999999,9999999,12312312,111111111,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,33554432,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554432,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1034,2097151,1032,16777215,33554431,1110,524286,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1034,1110,524286,2097151,16777215,33554431,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,111111110,1025,1026,1027,1028,1030,1031,1029,1032,1024}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111110,1032,1031,1030,1029,1028,1027,1026,1025,1024,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,33554431,0,134217728,134217727,134217727,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,134217727,134217727,33554431,33554431,16777215,524287,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1030,1031,1029,1032,1026,1030}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1030,1029,1027,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {99998,9999999,123456789,123456789,777777,444555665,12312312,8888,9999999,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99998,99999,777777,9999999,9999999,12312312,123456789,123456789,444555665}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456790,123456789,987654321,123456789,777777,111111111,444555665,1029,12312312,111111111,9999998,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555665,123456790,123456789,123456789,111111111,111111111,12312312,9999999,9999999,9999998,777777,99999,8888,1029}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,111111111,111111111,1111111111,1111,111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9,15,15,90,56,89,0,143,11111110,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {11111110,789,143,90,89,56,15,15,9,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,8888,99999,134217728,444555666,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,12312312,12312312,111111111,123456789,123456789,134217728,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111111,1111111,111111,1111,111,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,111111111,1111111,1111111,1111111,111111,111111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1026,1027,1028,1029,1030,1031,1029,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1029,1028,1027,1027,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,33554431,134217727,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,16777215,16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11111,524287,524286,33554431,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,33554431,524287,524286,11111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,777777,111111111,444555666,1032,9999999,8888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,8888,777777,9999999,9999999,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1034,2097151,1032,16777214,33554431,1110,524286,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1034,1110,524286,2097151,16777214,33554431,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,20,111111111,444555666,9999999,12312312,8888,8887,99999,444555666}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {20,8887,8888,99999,777777,9999999,9999999,12312312,111111111,123456789,444555666,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,3,11111111,111111111,1111111111,111111,1111,111,11112,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,111111,111111,11112,1111,111,3,3}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1026,1027,1028,1029,1030,1111111,1031,1029,1032,1024,1025}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1024,1025,1025,1026,1027,1027,1028,1029,1029,1030,1031,1032,1111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,2097151,524287,16777215,33554431,268435456}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524287,524287,2097151,16777215,33554431,268435456}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777216,2097150,524287,16777215,33554431,16777215,134217727,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,33554431,16777216,16777215,16777215,2097151,2097150,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {987654321,123456789,987654321,7,777777,111111111,444555666,1032,8888,9999999,8888,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,987654321,444555666,123456789,111111111,9999999,9999999,777777,8888,8888,1032,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,2097151,524287,16777215,33554431,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,2097151,524287,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1028,1030,1031,1029,1032,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111110,11111111,111111111,1111111111,111111,1111,111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,1111110,111111,111111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1111111111,1111111111,1111111,1111111111,111111,1111,111,67,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,111111111,1111111,1111111,1111111,111111,111111,1111,111,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,524287,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,524287,524287,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,33554431,268435455,16777215,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,16777215,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,268435455,33554431,524286,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,16777215,2097151,524287,524286,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,268435455,11111110,33554431,524286,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,16777215,11111110,2097151,524287,524286,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554430,33554431,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,33554430,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097152,524287,16777215,33554431,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,33554431,16777215,2097152,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,45,268435455,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,16777215,2097151,2097151,524287,45}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777216,524287,16777216,16777215,33554431,16777215,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,16777216,16777216,16777215,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1111,111,1029,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,11111,1111,1029,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {16777215,16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,31,524286,16777215,33554431,268435455,11111110,33554431,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,16777215,11111110,2097151,524287,524286,31}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {20}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {20}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,33554431,268435455,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,268435455,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777216,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,16777216,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555666,12312312,2097150,99999,9999999,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,123456789,123456789,111111111,12312312,9999999,9999999,2097150,777777,99999,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,11111111,111111111,1111111111,111111,1110,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,111111,111111,11111,1110,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11111,524287,524286,33554431,33554431,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {33554431,33554431,33554431,524287,524286,11111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {268435454,524287,16777215,33554430,1110,2097152}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435454,33554430,16777215,2097152,524287,1110}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,268435455,16777215,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,16777215,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524288,16777215,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524288,16777215,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777216,33554431,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777216,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111111,1111111,111111,1111,111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,1111111,1111111,111111,111111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1028,1030,1031,1032,1024}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1028,1027,1025,1024,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524288,16777214,16777215,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524288,16777214,16777215,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,111111111,524287,111111111,1111111111,1111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,524287,111111,11111,1111,1111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9,15,15,56,67,89,143,568,789,987,216,89}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,216,143,89,89,67,56,15,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,268435455,16777215,789,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,16777215,16777215,2097151,2097151,524287,789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524288,16777214,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524288,16777214,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1027,1026,1027,1028,1029,1030,1031,1029,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1029,1028,1027,1027,1026,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {33554431,2097151,568,16777215,33554430,134217727,2097152}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {568,2097151,2097152,16777215,33554430,33554431,134217727}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,1034,111111111,444555666,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {444555666,123456789,111111111,9999999,99999,1034}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1025,1026,1027,1030,1031,1029,1032,1026,1030,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1025,1026,1026,1026,1027,1029,1030,1030,1031,1032}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,777777,111111111,444555665,444555666,12312312,2097150,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555666,444555665,123456789,111111111,12312312,9999999,9999999,2097150,777777,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1026,1026,1027,1028,1030,1031,1032,1024,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1032,1031,1030,1028,1027,1026,1026,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654320,123456789,777777,111111111,444555665,444555666,12312312,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654320,444555666,444555665,123456789,123456789,111111111,12312312,9999999,9999999,777777,99999,8888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,268435455,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,16777215,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777216,2097150,33554432,524287,16777216,33554431,16777215,134217727,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554432,33554431,33554431,16777216,16777216,16777215,2097151,2097150,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16777215,33554431,0,134217728,1,134217727,134217727,1027}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,134217727,134217727,33554431,16777215,1027,1,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1027,1026,1027,1028,1029,1030,1031,1029}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1026,1027,1027,1028,1029,1029,1030,1031}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455,33554431,2097151,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,33554431,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,33554431,16777215,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111,111111111,11111111,111111111,1111111111,111111,1111,111,11111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,111111111,11111111,1111111,111111,11111,1111,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,1028,123456789,777777,111111111,12312312,99999,777777,123456789,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1028,99999,777777,777777,777777,12312312,12312312,111111111,123456789,123456789}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,2097151,524287,16777215,45,268435455,16777215,524287}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,16777215,16777215,2097151,2097151,524287,524287,45}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654321,123456789,777777,111111111,444555665,33554430,12312312,2097150,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654321,444555665,123456789,123456789,111111111,33554430,12312312,9999999,9999999,2097150,777777,99999}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1026,1028,1030,1031,1029,1032,1026}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1031,1030,1029,1028,1026,1026,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {524287,16777215,33554431,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10000000,123456789,987654321,123456789,777777,111111111,444555665,444555666,12312312,8888,99999,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,9999999,10000000,12312312,111111111,123456789,123456789,444555665,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,123456789,987654320,123456789,777777,111111111,444555665,444555666,12312312,8888,99999,9999999,123456789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987654320,444555666,444555665,123456789,123456789,123456789,111111111,12312312,9999999,9999999,777777,99999,8888}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,134217726,1111111111,1111111111,1111111,1111111111,111111,1111,111,67,1111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,134217726,1111111,1111111,1111111,111111,111111,1111,111,67}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,19,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217727,33554431,33554431,16777215,2097151,524287,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097152,9999999,123456789,987654321,777777,111111111,444555666,1032,9999999,8888,111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,8888,777777,2097152,9999999,9999999,111111111,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111111,1024,1111111,111111,1111,111,11110,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111111,1111111,1111111,111111,111111,11110,1111,1111,1024,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {777777,1028,777777,12312312,99999,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12312312,777777,777777,99999,99999,1028}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1030,1029,1032,1026,1030,1030}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1032,1030,1030,1030,1029,1027,1026,1026,1025,1024}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,134217727,268435455,33554431,2097152,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097152,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111112,2097149}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2097149,111111112}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777216,2097150,33554432,524286,16777216,33554431,16777215,134217727,33554431,16777215,16777216,2097150}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524286,2097150,2097150,2097151,16777215,16777215,16777216,16777216,16777216,33554431,33554431,33554432,134217727}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {11111,524287,524286,524287}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {524287,524287,524286,11111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {987654321,123456789,555555555,999999999,1000000000}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {123456789,555555555,987654321,999999999,1000000000}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,1,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1,1,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,2,4,8,16,32}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {32,16,8,4,2,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,3,5,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9,7,5,3,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,143,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,143,90,89,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,9,268435455,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,1025,1026,1027,1028,1029,1030,1031,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {16,1025,1026,1027,1028,1029,1030,1031,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,19,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,19,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111110}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111110}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,33554431,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777214,524287,16777215,33554431,134217727,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,16777214,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,268435455,7,7,8,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,8,8,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1027,1028,1029,1030,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1025,1027,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1025,1027,1027,1028,1029,1030,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,1111,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1030,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,7,7,7,8,268435455,7,7,8,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1028,8,8,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,9,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,9,268435455,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,1,1111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,7,8,7,7,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,8,8,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,2097151,524287,16777215,33554431,134217727,268435455,2097151,134217728}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217728,134217728,134217727,33554431,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,777777,89,143,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {777777,987,789,568,567,143,90,89,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1031,1032,1033,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1031,1032,1033,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1030,268435455,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1030,1032,1033,268435455,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,7,7,8,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,8,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,268435455,7,7,8,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,8,8,7,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,8,7,7,8,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,8,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1026,1028,1029,1030,1111111111,1033,1033,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1033,1033,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,134217727,268435455,33554431,134217727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,134217727,33554431,16777215,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,16,17,18,19}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12,13,14,16,17,18,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,8,268435455,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,8,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,1111111111,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,1,1111111111,1111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1111111111,1111111111,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {568,7,7,8,7,7,8,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,8,8,568}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1023,1025,1028,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1033,1032,1030,1029,1028,1028,1027,1025,1023}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1027,7,7,7,7,9,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1027,9,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,8,268435455,7,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,8,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,268435455,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,8,7,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {90,7,7,7,8,7,7,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,8,8,90}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1111111110,268435455,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1032,1033,268435455,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,268435455,7,7,8,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,8,8,7,7,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,7,7,7,8,268435455,7,7,8,6,7,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,7,8,8,1028,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,31,8,268435455,7,7,8,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,31,8,8,7,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1027,1028,1029,1030,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1027,1028,1029,1030,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,7,8,8,7,7,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,8,8,8,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,524287,7,7,268435455,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,524287,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11110,11111111,111111111,1111111111,111111,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,11111,11110,1111,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777215,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,2097151}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1031,10,11,12,13,14,15,568,16,17,18,19,16}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,11,12,13,14,15,16,16,17,18,19,568,1031}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,143,568,789,9999999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9999999,789,568,567,143,90,89,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {9999999,987654321,123456789,777777,111111111,444555666,12312312,8888,12312312}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,777777,9999999,12312312,12312312,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1025,1027,1027,111111,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1025,1027,1027,1030,1032,1033,111111,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,9,31,268435455,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,31,9,8,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,568,789,987,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,90,89,67,56,15,9,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,134217727,268435455,2097151,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777215,2097151,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,90,89,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,268435455,6,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,9,268435455,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,13,7,8,1111,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,13,8,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,18,56,15,16,17,18}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {56,18,18,17,16,15,14,13,12,11,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,11111111,111111111,1111111111,111111,1111,111,567}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,11111111,1111111,111111,111111,1111,567,111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,7,7,7,7,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,7,7,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,16,1024,1026,1028,1029,1030,1031,1032,1033,16,1029,16,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,1033,1032,1032,1031,1030,1029,1029,1028,1026,1024,16,16,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,8,7,7,8,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,8,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,55,67,89,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,90,89,67,55,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {19,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,19}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1027,89,1029,1030,1111111111,1032,1027,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1032,1032,1031,1030,1029,1027,1027,1025,1024,89}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1027,7,7,7,268435455,7,7,8,6,7,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,7,8,1027,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1027,1029,1030,1032,1033,1111111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1029,1030,1031,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,777777,89,143,568,789,987,56,15}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {777777,987,789,568,567,143,90,89,67,56,56,15,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,568,789,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {789,568,567,90,89,67,56,15,9,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,16777214,524287,12312312,33554431,134217727,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,16777214,12312312,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1111111110,268435455,1111111111,1032,1033,1029}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1029,1032,1033,268435455,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,7,8,7,7,8,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,8,8,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16777215,134217727,268435455,33554431,33554430,134217727,16777215}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,134217727,33554431,33554430,16777215,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,6,7,8,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8,7,7,7,7,7,7,7,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,89,7,7,8,268435455,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,8,89,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,7,7,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,7,8,8}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,7,8887,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8887,8,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,90,143,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,143,90,90,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,12,15,56,67,89,568,789,987,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,789,568,567,90,89,67,56,15,12,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,13,7,8,1111,9,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,13,9,8,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,7,8887,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8887,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {8,7,7,7,8,111,7,7,7,7,8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111,8,8,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1029,1031,33554431,1033,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1031,1033,1033,33554431}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10000000,987654321,123456789,777777,111111111,444555666,12312312,8888,99999}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,99999,777777,10000000,12312312,111111111,123456789,444555666,987654321}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,8,8,8,7,7,1033,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,1033,8,8,8,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,268435455,268435455,6,7,7,7,7,268435455}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,268435455,268435455,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,16,1024,1026,1028,1029,1030,1030,1032,1033,16,1029,16,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,1033,1032,1032,1030,1030,1029,1029,1028,1026,1024,16,16,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,6,10,8888,7,9,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8888,10,9,7,7,7,7,7,7,6}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,7,7,7,8,268435455,7,7,8,6,7,6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,8,8,1028,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,8,268435455,7,6,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,7,8,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,8,8887,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {8887,8,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1111111110,268435455,1111111111,1032,1033,268435456,1029}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1029,1032,1033,268435455,268435456,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111113,1111111111,19,1111111110,1111111112,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,19,1111111110,1111111111,1111111112,1111111113}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1111,7,7,8,1111,268435455,7,7,8,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,1111,8,8,8,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,7,8,8,7,1030,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,1030,8,8,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111111,89,7,7,7,7,9,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,111111111,89,9,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,9,268435455,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,31,268435455,7,7,8,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,31,8,7,7,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111111,1111111111,19,2,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,2,19,1111111111,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1031,1025,1026,1027,89,1028,1029,1030,1111111111,1032,1033,1025}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1033,1032,1031,1030,1029,1028,1027,1026,1025,1025,89}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,1111111,111111,11111111,111111112,1111111111,111111,1111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111112,11111111,1111111,111111,111111,111111,1111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1026,1027,1028,1029,1030,1031,1032,1033,1033,1028,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1026,1027,1028,1028,1029,1030,1031,1032,1033,1033,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {10,11,12,13,14,15,568,15,17,18,19,16}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {568,19,18,17,16,15,15,14,13,12,11,10}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,7,7,7,8,268435455,7,7,8,6,7,6,1028}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,7,8,8,1028,1028,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {15,1111111,111111111,1111111111,99999,1111,111,11111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,111111111,1111111,99999,11111,1111,111,15}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1031,33554431,1033,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1031,1033,1033,33554431}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,12,15,56,67,89,568,789,987,789,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,789,789,568,567,90,89,67,56,15,12,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,16,89,568,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,90,89,67,56,16,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,7,7,7,8,268435455,7,6,7,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,8,9,268435455}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2,90,2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {90,2,2}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,90,12,15,1030,67,89,568,789,987,789,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1030,987,789,789,789,568,567,90,89,67,15,12}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,7,7,7,8,268435455,7,7,216,7,7,7,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1028,216,8,8,7,7,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1111111110,268435455,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1032,1033,268435455,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,9,268435455,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,216,1,1111,7,7,8,1111,268435455,7,7,8,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,1111,216,8,8,8,7,7,7,7,7,7,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1111111110,1028,1029,1111111110,268435455,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1032,1033,268435455,1111111110,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,89,1029,1030,143,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,89,143,1024,1025,1027,1029,1030}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16777215,33554431,134217727,268435455,33554431}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217727,33554431,33554431,16777215}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111110,1111111110,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,1111111110,1111111110}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {21,1024,1025,1027,1028,1029,1030,1111111111,1032,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1033,1032,1030,1029,1028,1027,1025,1024,21}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1027,14,89,1029,1030,1111111111,1032,1033,1027}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {14,89,1024,1025,1027,1027,1029,1030,1031,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,89,143,568,789,987,67}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,568,567,143,90,89,67,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,8,8,8,8,7,7,1033,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,1033,8,8,8,8,8,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,16,1024,9999999,1028,1029,1030,1031,1032,1033,16,1029,16,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,9999999,1033,1032,1032,1031,1030,1029,1029,1028,1024,16,16,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {16,1024,1026,1028,1029,1030,1031,1032,1033,16,1029}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {16,16,1024,1026,1028,1029,1029,1030,1031,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,9,268435455,7,7,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,9,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2097151,524287,16777215,33554431,268435455,2097151,2097151}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,33554431,16777215,2097151,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1026,14,89,1029,1030,1111111111,1032,1033,1027}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {14,89,1024,1025,1026,1027,1029,1030,1031,1032,1033,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,12,15,56,67,9,89,568,789,987,789,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,789,789,568,567,90,89,67,56,15,12,9,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1031,10,12,13,14,15,568,16,17,18,19,16,568}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {10,12,13,14,15,16,16,17,18,19,568,568,1031}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,13,7,8,1111,9,268435455,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,13,9,8,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,1027,1028,1029,1111111110,268435455,1111111111,1033}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1027,1027,1028,1029,1033,268435455,1111111110,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {90,7,7,7,8,7,7,8,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,7,7,7,7,7,8,8,90}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {567,9,90,15,56,67,90,143,789,987}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,567,143,90,90,67,56,15,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,9,268435455,7,7,9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,9,9,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111110,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111110,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {6,11,7,7,8,7,6,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6,6,7,7,7,7,7,7,8,11}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {111111,7,7,7,7,8,8,7,7,8,7,7,111111}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {111111,111111,8,8,8,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1027,89,2,1029,1030,1032,1033,1029}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2,89,1024,1025,1027,1029,1029,1030,1031,1032,1033}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1031,1025,1026,14,89,1029,11111111,1030,1111111111,1032,1033,1027,1025}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {14,89,1024,1025,1025,1026,1027,1029,1030,1031,1032,1033,11111111,1111111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {67,2,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {67,2,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,2097151,524287,16777215,134217727,268435455,2097151,134217728}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,134217728,134217728,134217727,16777215,2097151,2097151,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1026,1027,1028,1111111,1029,1030,1032,1031,1033,1031}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1024,1025,1026,1027,1028,1029,1030,1031,1031,1032,1033,1111111}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,524287,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,1,1,524287}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {134217728,16,1024,1026,1028,1030,1029,1030,1031,1032,1033,16,1029,16,1032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {134217728,1033,1032,1032,1031,1030,1030,1029,1029,1028,1026,1024,16,16,16}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1024,1025,1027,89,1029,1030,143,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7,7,89,143,1024,1025,1027,1029,1030}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1111111112,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111112,0}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,216,1,1111,7,7,8,1111,268435455,7,8,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,1111,1111,216,8,8,8,7,7,7,7,7,1}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {789,567,9,90,12,15,56,67,91,89,568,789,987,789}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {987,789,789,789,568,567,91,90,89,67,56,15,12,9}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,1028,1033,7,7,7,10000000,8,268435455,7,7,216,7,7,8,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,10000000,1033,1028,216,8,8,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1031,1025,1026,1027,89,1028,1029,1030,1111111111,1032,1033,1025,1025}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1111111111,1033,1032,1031,1030,1029,1028,1027,1026,1025,1025,1025,89}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {7,7,7,7,8,268435455,7,7,7,7,7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {268435455,8,7,7,7,7,7,7,7,7,7}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {1,0,777777,777777,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,1,777777,777777}
        );
    }
}
