package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_ROUNDED_AVG {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 5);
        String desired = "11";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 13);
        String desired = "1010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(964, 977);
        String desired = "1111001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(996, 997);
        String desired = "1111100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(362, 496);
        String desired = "110101101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(350, 902);
        String desired = "1001110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(197, 233);
        String desired = "11010111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5, 5);
        String desired = "101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 1);
        String desired = "1";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3, 9);
        String desired = "110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(25, 35);
        String desired = "11110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10, 30);
        String desired = "10100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 200);
        String desired = "10010110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(15, 15);
        String desired = "1111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10, 10);
        String desired = "1010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(50, 100);
        String desired = "1001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(30, 200);
        String desired = "1110011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3, 101);
        String desired = "110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(35, 35);
        String desired = "100011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(50, 50);
        String desired = "110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4, 9);
        String desired = "110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3, 6);
        String desired = "100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9, 9);
        String desired = "1001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(6, 6);
        String desired = "110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(25, 25);
        String desired = "11001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 200);
        String desired = "1100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(16, 30);
        String desired = "10111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(6, 7);
        String desired = "110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(14, 15);
        String desired = "1110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 30);
        String desired = "10010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 2);
        String desired = "10";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(16, 16);
        String desired = "10000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(49, 49);
        String desired = "110001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(101, 200);
        String desired = "10010110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(201, 201);
        String desired = "11001001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 7);
        String desired = "100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 10);
        String desired = "110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(15, 25);
        String desired = "10100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4, 4);
        String desired = "100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(14, 32);
        String desired = "10111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 10);
        String desired = "1000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 12000);
        String desired = "10101011111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 1000);
        String desired = "1000100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 5000);
        String desired = "111110100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99998, 100003);
        String desired = "11000011010100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 20000);
        String desired = "11101010011000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 20000);
        String desired = "10110011101100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 12001);
        String desired = "1011110100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 3000);
        String desired = "101110111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100003, 100003);
        String desired = "11000011010100011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 3001);
        String desired = "101110111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2999, 3001);
        String desired = "101110111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(20000, 20000);
        String desired = "100111000100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 1000);
        String desired = "1111101000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000000, 1000000);
        String desired = "11110100001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3001, 3001);
        String desired = "101110111001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999999, 999999);
        String desired = "11110100001000111111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 12000);
        String desired = "1011101110000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 3001);
        String desired = "10111011101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 100);
        String desired = "1100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999999, 1000001);
        String desired = "11110100001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99998, 100000);
        String desired = "11000011010011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100002, 100003);
        String desired = "11000011010100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(75, 75);
        String desired = "1001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5000, 5000);
        String desired = "1001110001000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 54322);
        String desired = "110101000011010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99, 99);
        String desired = "1100011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54321, 54321);
        String desired = "1101010000110001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999998, 999999);
        String desired = "11110100001000111110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(101, 1000);
        String desired = "1000100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10, 11);
        String desired = "1010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99997, 99997);
        String desired = "11000011010011101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(789012, 789012);
        String desired = "11000000101000010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000000, 1000001);
        String desired = "11110100001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2999, 2999);
        String desired = "101110110111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98765, 98765);
        String desired = "11000000111001101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 12001);
        String desired = "1110101001100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999998, 999998);
        String desired = "11110100001000111110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54320, 54321);
        String desired = "1101010000110000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98, 12000);
        String desired = "1011110100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12000, 12000);
        String desired = "10111011100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 19997);
        String desired = "10011101000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100001, 100001);
        String desired = "11000011010100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100000, 100000);
        String desired = "11000011010100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(20001, 20001);
        String desired = "100111000100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 1000);
        String desired = "111110101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98, 99);
        String desired = "1100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(101, 101);
        String desired = "1100101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 54320);
        String desired = "110101001001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9999, 9999);
        String desired = "10011100001111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(75, 11999);
        String desired = "1011110010101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98, 98);
        String desired = "1100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10001, 10001);
        String desired = "10011100010001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12001, 12001);
        String desired = "10111011100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(789013, 789013);
        String desired = "11000000101000010101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(73, 92);
        String desired = "1010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100001, 100004);
        String desired = "11000011010100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54320, 54320);
        String desired = "1101010000110000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 5000);
        String desired = "100111000100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100000, 100001);
        String desired = "11000011010100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 3002);
        String desired = "101110111001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99, 20001);
        String desired = "10011101000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54321, 54323);
        String desired = "1101010000110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19998, 20000);
        String desired = "100111000011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 3000);
        String desired = "11111010000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99998, 99998);
        String desired = "11000011010011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3001, 20000);
        String desired = "10110011101100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 20001);
        String desired = "10011100010001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000001, 1000001);
        String desired = "11110100001001000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 101);
        String desired = "1100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 99);
        String desired = "110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 92);
        String desired = "101111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100002, 100002);
        String desired = "11000011010100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4999, 20001);
        String desired = "11000011010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54322, 54322);
        String desired = "1101010000110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12000, 19998);
        String desired = "11111001111111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9, 75);
        String desired = "101010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(789011, 789011);
        String desired = "11000000101000010011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2999, 54321);
        String desired = "110111111110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100004, 100004);
        String desired = "11000011010100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 100);
        String desired = "110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2999, 54322);
        String desired = "110111111110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 19998);
        String desired = "10011101000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100001, 100003);
        String desired = "11000011010100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 12000);
        String desired = "1110101001100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 54323);
        String desired = "110101000011010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2998, 2998);
        String desired = "101110110110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(789014, 789014);
        String desired = "11000000101000010110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4998, 4999);
        String desired = "1001110000110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10, 100);
        String desired = "110111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(75, 9999);
        String desired = "1001110101101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(11999, 11999);
        String desired = "10111011011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 999);
        String desired = "111110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19997, 19997);
        String desired = "100111000011101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98, 11998);
        String desired = "1011110100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99, 19999);
        String desired = "10011101000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 102);
        String desired = "1100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 3000);
        String desired = "10111011100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19996, 20000);
        String desired = "100111000011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999, 4999);
        String desired = "101110110111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5000, 19997);
        String desired = "11000011010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99997, 100000);
        String desired = "11000011010011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 1000);
        String desired = "1000100111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999997, 999997);
        String desired = "11110100001000111101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 19998);
        String desired = "10011101000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98765, 99997);
        String desired = "11000010000110101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5001, 19999);
        String desired = "11000011010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19999, 19999);
        String desired = "100111000011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999, 999);
        String desired = "1111100111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123456, 123456);
        String desired = "11110001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10, 20002);
        String desired = "10011100010110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99997, 99999);
        String desired = "11000011010011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(11998, 11998);
        String desired = "10111011011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99999, 99999);
        String desired = "11000011010011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99996, 99998);
        String desired = "11000011010011101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 999);
        String desired = "1000100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 54322);
        String desired = "110111111110101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(998, 998);
        String desired = "1111100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98766, 98766);
        String desired = "11000000111001110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(74, 11998);
        String desired = "1011110010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 54320);
        String desired = "110101001001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5002, 12000);
        String desired = "10000100110101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5001, 10000);
        String desired = "1110101001100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 73);
        String desired = "100101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 2999);
        String desired = "10111011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12001, 20001);
        String desired = "11111010000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19996, 19996);
        String desired = "100111000011100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98, 10000);
        String desired = "1001110111001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99, 2999);
        String desired = "11000001101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(93, 5001);
        String desired = "100111110011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(66, 66);
        String desired = "1000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99998, 99999);
        String desired = "11000011010011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 20000);
        String desired = "10100100000100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54323, 54323);
        String desired = "1101010000110011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999, 1001);
        String desired = "1111101000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 10000);
        String desired = "10011100010000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123455, 123457);
        String desired = "11110001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 20001);
        String desired = "11101010011000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10001, 20000);
        String desired = "11101010011000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10003, 10003);
        String desired = "10011100010011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123455, 123455);
        String desired = "11110001000111111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98764, 98765);
        String desired = "11000000111001100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123454, 123455);
        String desired = "11110001000111110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98765, 100003);
        String desired = "11000010000111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98762, 98763);
        String desired = "11000000111001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10002, 20000);
        String desired = "11101010011001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98763, 98763);
        String desired = "11000000111001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98764, 98764);
        String desired = "11000000111001100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123457, 123457);
        String desired = "11110001001000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(20000, 54320);
        String desired = "1001000100101000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 20002);
        String desired = "10011101000011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1001, 1001);
        String desired = "1111101001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98767, 98767);
        String desired = "11000000111001111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10002, 10002);
        String desired = "10011100010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5001, 5001);
        String desired = "1001110001001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4999, 20002);
        String desired = "11000011010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(101, 54321);
        String desired = "110101001001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 54321);
        String desired = "111110110100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1002, 1003);
        String desired = "1111101010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 10002);
        String desired = "1010101111101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4998, 19999);
        String desired = "11000011010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5, 54321);
        String desired = "110101000011011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98763, 99998);
        String desired = "11000010000110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98764, 99998);
        String desired = "11000010000110101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10003, 54321);
        String desired = "111110110100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1002, 1002);
        String desired = "1111101010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999, 9999);
        String desired = "1010101111011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 10002);
        String desired = "10011100010001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(20002, 20002);
        String desired = "100111000100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10000, 54320);
        String desired = "111110110100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98762, 98762);
        String desired = "11000000111001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123454, 123454);
        String desired = "11110001000111110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(789010, 789010);
        String desired = "11000000101000010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1003, 1003);
        String desired = "1111101011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54318, 54318);
        String desired = "1101010000101110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123458, 123458);
        String desired = "11110001001000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5001, 12000);
        String desired = "10000100110100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10001, 54321);
        String desired = "111110110100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(67, 67);
        String desired = "1000011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 5001);
        String desired = "100111000101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12000, 54320);
        String desired = "1000000110001000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1002, 11999);
        String desired = "1100101100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(21, 99);
        String desired = "111100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98761, 100003);
        String desired = "11000010000110110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 5003);
        String desired = "100111000110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5, 1003);
        String desired = "111111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(98769, 98769);
        String desired = "11000000111010001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10001, 10004);
        String desired = "10011100010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9999, 10003);
        String desired = "10011100010001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 1001);
        String desired = "1000100110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100, 20000);
        String desired = "10011101000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 1002);
        String desired = "1111101001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(68, 101);
        String desired = "1010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9998, 10003);
        String desired = "10011100010000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10001, 11999);
        String desired = "10101011111000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12000, 12001);
        String desired = "10111011100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000002, 1000002);
        String desired = "11110100001001000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(998, 20002);
        String desired = "10100100000100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 4);
        String desired = "11";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(22, 20002);
        String desired = "10011100011100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123456, 123457);
        String desired = "11110001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(123455, 123458);
        String desired = "11110001001000000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(99996, 100001);
        String desired = "11000011010011110";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(100000, 100004);
        String desired = "11000011010100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(54319, 54319);
        String desired = "1101010000101111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(998, 11999);
        String desired = "1100101100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 9998);
        String desired = "1001110111010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 54320);
        String desired = "110101000011000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10004, 10004);
        String desired = "10011100010100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1003, 3001);
        String desired = "11111010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(2, 54320);
        String desired = "110101000011001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(3000, 20001);
        String desired = "10110011101100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(101, 20000);
        String desired = "10011101000010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4999, 4999);
        String desired = "1001110000111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5002, 5002);
        String desired = "1001110001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 999);
        String desired = "111110111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(9997, 10003);
        String desired = "10011100010000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5000, 5001);
        String desired = "1001110001000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 7);
        String desired = "111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(102, 12000);
        String desired = "1011110100011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(999, 20002);
        String desired = "10100100000100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(19999, 20001);
        String desired = "100111000100000";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1000, 54318);
        String desired = "110110000001011";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(10003, 54315);
        String desired = "111110110011111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(12002, 12002);
        String desired = "10111011100010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(97, 97);
        String desired = "1100001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(4997, 19999);
        String desired = "11000011010010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(11998, 12000);
        String desired = "10111011011111";
        org.junit.Assert.assertEquals(result, desired);
    }
}
