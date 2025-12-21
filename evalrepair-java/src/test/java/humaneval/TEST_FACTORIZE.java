package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FACTORIZE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(4);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(8);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(57);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3249);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,19,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(185193);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,3,19,19,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(20577);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,19,19,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(18);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(10);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(15);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(28);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1024);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,2,2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(131);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(131).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(33);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1000);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(100);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456789);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,3607,3803).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654321);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,17,17,379721).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1025);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,41).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(11);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1026);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,3,3,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(29);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1027);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(13,79).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(14);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(34);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(13);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(99);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(132);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456790);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5,37,333667).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1023);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,11,31).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456788);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,7,13,17,71,281).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(32);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(31);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(31).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1022);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,7,73).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654320);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,5,37,333667).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456791);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(123456791).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1028);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,257).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456787);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(31,31,128467).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456792);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,3,59,87187).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(27);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(39);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(12);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(30);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483647);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2147483647).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207943);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,11,67,149).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234369);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(13,8633413).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999983);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(999983).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001001);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,31,10784957).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1073741789);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1073741789).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001000);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,5,5,5,1003001).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234370);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5,11223437).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(56);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483646);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,3,7,11,31,151,331).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003000999);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,11,13,41,24439).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207942);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,41,14731).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999984);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,3,83,251).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(79);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(79).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(80);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001002);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,181,631,4391).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(78);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(77);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234368);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,2,2,2,2,3,19,15383).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(83);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(83).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(76);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(75);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234367);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7,16033481).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(52);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234371);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,37411457).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483645);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,19,22605091).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(53);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(53).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234372);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,28058593).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001004);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,27861139).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(101);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(101).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(6);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001005);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,200600201).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1073741788);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,7,2341,16381).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(67);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(67).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456786);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,20576131).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003001003);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(17,59,101,9901).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(47);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(47).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(58);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(26);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,13).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(51);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(55);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(38);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,19).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(37);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(37).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(17);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(17).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(125);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(7919);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(7919).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654322);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,701,704461).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654323);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(987654323).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(123456785);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,24691357).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234366);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,56117183).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999982);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,79,6329).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234365);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,5,23,108439).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483644);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,233,1103,2089).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207944);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,2,3,3,19,883).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1073741790);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,11,47,107,647).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1073741791);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(29,97,381707).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483643);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,715827881).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207945);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,241589).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207946);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,31,19483).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003000998);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,167,1000999).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(112234364);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,11,643,3967).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654324);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,443,185789).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207947);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,13,47,659).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999980);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,5,49999).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999979);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(999979).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999981);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,111109).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654319);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(987654319).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999985);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,7,28571).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483642);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,23,46684427).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2147483641);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2699,795659).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(46);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,23).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999987);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,257,1297).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654325);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5,5,7,337,16747).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1003000997);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(23,317,137567).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654326);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,131,3769673).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(1207948);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,7,7,6163).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999986);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,13,38461).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(987654327);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,11,31,163,5923).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(50);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999978);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,7,29,821).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999988);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,11,22727).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999977);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(11,90907).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(999989);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(19,52631).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(44);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,11).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(43);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(43).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(42);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,7).toArray()
        );
    }
}

