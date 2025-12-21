package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_MODP {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(3, 5);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1101, 101);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(0, 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(3, 11);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 101);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(30, 5);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(31, 5);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(5, 17);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 23);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 37);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 79);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 89);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(200, 113);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(12, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 23);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 103);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 20);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(37, 37);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(200, 112);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 19);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(3, 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(200, 200);
        org.junit.Assert.assertEquals(
            result, 176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(79, 79);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 20);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 20);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 3);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(23, 200);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(78, 79);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 78);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(5, 5);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 19);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(5, 6);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 78);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(113, 112);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(3, 20);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 20);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 101);
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 101);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 6);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(5, 200);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 21);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(21, 5);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 10);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 21);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 17);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 100);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 20);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(79, 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 10);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 98);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(78, 100);
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(79, 112);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(112, 101);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(112, 20);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 6);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 78);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(79, 200);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(112, 113);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 88);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(112, 112);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(12, 101);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 200);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(80, 50);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(113, 113);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 19);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 20);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(12, 4);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(202, 200);
        org.junit.Assert.assertEquals(
            result, 104
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 200);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 4);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 50);
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(113, 100);
        org.junit.Assert.assertEquals(
            result, 92
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 100);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(200, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 78);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(37, 80);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(88, 21);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(202, 202);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 17);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 5);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 4);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(36, 200);
        org.junit.Assert.assertEquals(
            result, 136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 200);
        org.junit.Assert.assertEquals(
            result, 152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(112, 114);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(88, 97);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 5);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(200, 37);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 18);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(88, 20);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 103);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 21);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 20);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 18);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(21, 103);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(80, 37);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(21, 102);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(36, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 100);
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 99);
        org.junit.Assert.assertEquals(
            result, 67
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(36, 101);
        org.junit.Assert.assertEquals(
            result, 78
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(80, 5);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(36, 78);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 101);
        org.junit.Assert.assertEquals(
            result, 70
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 17);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 1009);
        org.junit.Assert.assertEquals(
            result, 861
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 54321);
        org.junit.Assert.assertEquals(
            result, 31228
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 999983);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 100019);
        org.junit.Assert.assertEquals(
            result, 54811
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 530123);
        org.junit.Assert.assertEquals(
            result, 32374
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 523);
        org.junit.Assert.assertEquals(
            result, 308
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 101);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 9876);
        org.junit.Assert.assertEquals(
            result, 2008
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 54321);
        org.junit.Assert.assertEquals(
            result, 15614
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 523);
        org.junit.Assert.assertEquals(
            result, 283
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 172871);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 999983);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 233);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 54321);
        org.junit.Assert.assertEquals(
            result, 29066
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 999984);
        org.junit.Assert.assertEquals(
            result, 903088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 1000000);
        org.junit.Assert.assertEquals(
            result, 437504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 9875);
        org.junit.Assert.assertEquals(
            result, 7499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 101);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 101);
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 523);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 172870);
        org.junit.Assert.assertEquals(
            result, 123188
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 999999);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 4321);
        org.junit.Assert.assertEquals(
            result, 3499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 172871);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 54321);
        org.junit.Assert.assertEquals(
            result, 33053
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 530123);
        org.junit.Assert.assertEquals(
            result, 447752
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 999999);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 234);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 1000001);
        org.junit.Assert.assertEquals(
            result, 421982
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 234);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 172871);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 1009);
        org.junit.Assert.assertEquals(
            result, 911
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 1000003);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 17);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 172871);
        org.junit.Assert.assertEquals(
            result, 94084
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 172870);
        org.junit.Assert.assertEquals(
            result, 61594
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 172871);
        org.junit.Assert.assertEquals(
            result, 110263
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 100000);
        org.junit.Assert.assertEquals(
            result, 28608
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 172872);
        org.junit.Assert.assertEquals(
            result, 145184
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 54321);
        org.junit.Assert.assertEquals(
            result, 8135
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 233);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 235);
        org.junit.Assert.assertEquals(
            result, 119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 1000002);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 530123);
        org.junit.Assert.assertEquals(
            result, 163011
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 101);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 235);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 50);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 999983);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 172869);
        org.junit.Assert.assertEquals(
            result, 21761
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 523);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 172871);
        org.junit.Assert.assertEquals(
            result, 12294
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 172871);
        org.junit.Assert.assertEquals(
            result, 15297
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 235);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 999999);
        org.junit.Assert.assertEquals(
            result, 399680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 1000000);
        org.junit.Assert.assertEquals(
            result, 410752
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 232);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 172869);
        org.junit.Assert.assertEquals(
            result, 87044
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 9877);
        org.junit.Assert.assertEquals(
            result, 4622
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 524);
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 7);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 524);
        org.junit.Assert.assertEquals(
            result, 172
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(51, 50);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 530123);
        org.junit.Assert.assertEquals(
            result, 146627
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 9875);
        org.junit.Assert.assertEquals(
            result, 7897
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 524);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 9877);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 9876);
        org.junit.Assert.assertEquals(
            result, 4096
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 999999);
        org.junit.Assert.assertEquals(
            result, 822277
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 9877);
        org.junit.Assert.assertEquals(
            result, 6332
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 999985);
        org.junit.Assert.assertEquals(
            result, 469736
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 523);
        org.junit.Assert.assertEquals(
            result, 432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 172871);
        org.junit.Assert.assertEquals(
            result, 86436
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 999998);
        org.junit.Assert.assertEquals(
            result, 635826
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 233);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 9876);
        org.junit.Assert.assertEquals(
            result, 8192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 18);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 1000000);
        org.junit.Assert.assertEquals(
            result, 109376
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 530123);
        org.junit.Assert.assertEquals(
            result, 64748
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9874, 9875);
        org.junit.Assert.assertEquals(
            result, 7159
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 99999);
        org.junit.Assert.assertEquals(
            result, 95825
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 54321);
        org.junit.Assert.assertEquals(
            result, 25463
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 1000001);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 1009);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 523);
        org.junit.Assert.assertEquals(
            result, 260
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 1009);
        org.junit.Assert.assertEquals(
            result, 278
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 999983);
        org.junit.Assert.assertEquals(
            result, 842301
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 9877);
        org.junit.Assert.assertEquals(
            result, 2314
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 999999);
        org.junit.Assert.assertEquals(
            result, 799360
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 530123);
        org.junit.Assert.assertEquals(
            result, 444663
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 54322);
        org.junit.Assert.assertEquals(
            result, 51398
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 231);
        org.junit.Assert.assertEquals(
            result, 134
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 9875);
        org.junit.Assert.assertEquals(
            result, 5394
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 18);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 172870);
        org.junit.Assert.assertEquals(
            result, 143246
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 100000);
        org.junit.Assert.assertEquals(
            result, 14304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 1009);
        org.junit.Assert.assertEquals(
            result, 225
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 530123);
        org.junit.Assert.assertEquals(
            result, 293254
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(102, 1000000);
        org.junit.Assert.assertEquals(
            result, 821504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(51, 1009);
        org.junit.Assert.assertEquals(
            result, 205
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 172869);
        org.junit.Assert.assertEquals(
            result, 89275
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(51, 51);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 172871);
        org.junit.Assert.assertEquals(
            result, 67654
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 1000002);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 524);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 172872);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 1048577);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 17);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 99999);
        org.junit.Assert.assertEquals(
            result, 86777
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 231);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 999984);
        org.junit.Assert.assertEquals(
            result, 686224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 9877);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 999984);
        org.junit.Assert.assertEquals(
            result, 951536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 101);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 999984);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 530122);
        org.junit.Assert.assertEquals(
            result, 170680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 172869);
        org.junit.Assert.assertEquals(
            result, 119651
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 19);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 99999);
        org.junit.Assert.assertEquals(
            result, 31784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 54321);
        org.junit.Assert.assertEquals(
            result, 43687
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 999985);
        org.junit.Assert.assertEquals(
            result, 286997
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 9876);
        org.junit.Assert.assertEquals(
            result, 2680
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 172869);
        org.junit.Assert.assertEquals(
            result, 148402
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 9875);
        org.junit.Assert.assertEquals(
            result, 6286
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 9877);
        org.junit.Assert.assertEquals(
            result, 2671
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 9877);
        org.junit.Assert.assertEquals(
            result, 1534
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 999984);
        org.junit.Assert.assertEquals(
            result, 421552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 9875);
        org.junit.Assert.assertEquals(
            result, 9674
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 9875);
        org.junit.Assert.assertEquals(
            result, 4443
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 172869);
        org.junit.Assert.assertEquals(
            result, 43522
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 1009);
        org.junit.Assert.assertEquals(
            result, 935
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 524);
        org.junit.Assert.assertEquals(
            result, 168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 19);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 4321);
        org.junit.Assert.assertEquals(
            result, 2150
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 17);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 530124);
        org.junit.Assert.assertEquals(
            result, 470600
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 9878);
        org.junit.Assert.assertEquals(
            result, 5002
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 232);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 4322);
        org.junit.Assert.assertEquals(
            result, 1960
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 999984);
        org.junit.Assert.assertEquals(
            result, 337744
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 9875);
        org.junit.Assert.assertEquals(
            result, 5919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 51);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 1000000);
        org.junit.Assert.assertEquals(
            result, 218752
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 1000001);
        org.junit.Assert.assertEquals(
            result, 600001
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 1000000);
        org.junit.Assert.assertEquals(
            result, 106304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 530123);
        org.junit.Assert.assertEquals(
            result, 338375
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 530122);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 1000001);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 172871);
        org.junit.Assert.assertEquals(
            result, 144745
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 523);
        org.junit.Assert.assertEquals(
            result, 444
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 1009);
        org.junit.Assert.assertEquals(
            result, 993
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 530123);
        org.junit.Assert.assertEquals(
            result, 229673
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 100000);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 18);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 522);
        org.junit.Assert.assertEquals(
            result, 430
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 18);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 9878);
        org.junit.Assert.assertEquals(
            result, 9302
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 51);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 233);
        org.junit.Assert.assertEquals(
            result, 142
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 1010);
        org.junit.Assert.assertEquals(
            result, 226
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(6, 530123);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 234);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 172870);
        org.junit.Assert.assertEquals(
            result, 828
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 524);
        org.junit.Assert.assertEquals(
            result, 144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 1009);
        org.junit.Assert.assertEquals(
            result, 692
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 100019);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 524);
        org.junit.Assert.assertEquals(
            result, 348
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 4322);
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9874, 999983);
        org.junit.Assert.assertEquals(
            result, 711984
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 9875);
        org.junit.Assert.assertEquals(
            result, 3091
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 101);
        org.junit.Assert.assertEquals(
            result, 95
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 1048577);
        org.junit.Assert.assertEquals(
            result, 1047553
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 54322);
        org.junit.Assert.assertEquals(
            result, 52340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 999984);
        org.junit.Assert.assertEquals(
            result, 444272
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 9);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 100);
        org.junit.Assert.assertEquals(
            result, 92
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 1000001);
        org.junit.Assert.assertEquals(
            result, 210991
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 9877);
        org.junit.Assert.assertEquals(
            result, 9244
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 235);
        org.junit.Assert.assertEquals(
            result, 204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 100019);
        org.junit.Assert.assertEquals(
            result, 32370
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 1000001);
        org.junit.Assert.assertEquals(
            result, 524288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9874, 9874);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 10);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 1010);
        org.junit.Assert.assertEquals(
            result, 196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 9877);
        org.junit.Assert.assertEquals(
            result, 443
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 1000001);
        org.junit.Assert.assertEquals(
            result, 295394
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 999984);
        org.junit.Assert.assertEquals(
            result, 722128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 172872);
        org.junit.Assert.assertEquals(
            result, 105352
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 4320);
        org.junit.Assert.assertEquals(
            result, 3616
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 524);
        org.junit.Assert.assertEquals(
            result, 288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 1009);
        org.junit.Assert.assertEquals(
            result, 505
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 1000003);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 100000);
        org.junit.Assert.assertEquals(
            result, 94368
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 4320);
        org.junit.Assert.assertEquals(
            result, 1216
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 232);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 999985);
        org.junit.Assert.assertEquals(
            result, 857523
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 530122);
        org.junit.Assert.assertEquals(
            result, 323788
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 235);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 1009);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 1009);
        org.junit.Assert.assertEquals(
            result, 328
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 100);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(236, 236);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 530123);
        org.junit.Assert.assertEquals(
            result, 350858
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 6);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 1010);
        org.junit.Assert.assertEquals(
            result, 784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 172872);
        org.junit.Assert.assertEquals(
            result, 151264
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 236);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 523);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 999983);
        org.junit.Assert.assertEquals(
            result, 847970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 172872);
        org.junit.Assert.assertEquals(
            result, 129656
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 233);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 100);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 172868);
        org.junit.Assert.assertEquals(
            result, 52564
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 1009);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 4322);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 9875);
        org.junit.Assert.assertEquals(
            result, 913
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 522);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 530123);
        org.junit.Assert.assertEquals(
            result, 72289
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 524);
        org.junit.Assert.assertEquals(
            result, 504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 999999);
        org.junit.Assert.assertEquals(
            result, 199840
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 17);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 1000001);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172868, 235);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 530122);
        org.junit.Assert.assertEquals(
            result, 284714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 232);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 233);
        org.junit.Assert.assertEquals(
            result, 117
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 999983);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 9875);
        org.junit.Assert.assertEquals(
            result, 4837
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 523);
        org.junit.Assert.assertEquals(
            result, 121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 999999);
        org.junit.Assert.assertEquals(
            result, 598721
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 54321);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 1048577);
        org.junit.Assert.assertEquals(
            result, 1015809
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 172870);
        org.junit.Assert.assertEquals(
            result, 117232
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 233);
        org.junit.Assert.assertEquals(
            result, 126
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 999983);
        org.junit.Assert.assertEquals(
            result, 1024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 9877);
        org.junit.Assert.assertEquals(
            result, 2395
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 9874);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 9877);
        org.junit.Assert.assertEquals(
            result, 995
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 999985);
        org.junit.Assert.assertEquals(
            result, 870032
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 172872);
        org.junit.Assert.assertEquals(
            result, 57472
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 172873);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 530122);
        org.junit.Assert.assertEquals(
            result, 60602
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 4320);
        org.junit.Assert.assertEquals(
            result, 2432
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 999983);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 100019);
        org.junit.Assert.assertEquals(
            result, 63375
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 18);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 530122);
        org.junit.Assert.assertEquals(
            result, 399484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 9875);
        org.junit.Assert.assertEquals(
            result, 7804
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 54322);
        org.junit.Assert.assertEquals(
            result, 45474
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 172872);
        org.junit.Assert.assertEquals(
            result, 75632
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 235);
        org.junit.Assert.assertEquals(
            result, 147
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 523);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 4322);
        org.junit.Assert.assertEquals(
            result, 1326
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 525);
        org.junit.Assert.assertEquals(
            result, 226
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4319, 4320);
        org.junit.Assert.assertEquals(
            result, 608
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 17);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 999997);
        org.junit.Assert.assertEquals(
            result, 579114
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 54322);
        org.junit.Assert.assertEquals(
            result, 19786
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 9877);
        org.junit.Assert.assertEquals(
            result, 3714
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 530124);
        org.junit.Assert.assertEquals(
            result, 295660
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 530124);
        org.junit.Assert.assertEquals(
            result, 484964
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 18);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172868, 172868);
        org.junit.Assert.assertEquals(
            result, 142792
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 231);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 100000);
        org.junit.Assert.assertEquals(
            result, 9376
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 19);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 9877);
        org.junit.Assert.assertEquals(
            result, 2311
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 999983);
        org.junit.Assert.assertEquals(
            result, 589981
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 19);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 236);
        org.junit.Assert.assertEquals(
            result, 120
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 50);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 9878);
        org.junit.Assert.assertEquals(
            result, 126
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 172871);
        org.junit.Assert.assertEquals(
            result, 47655
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(102, 54322);
        org.junit.Assert.assertEquals(
            result, 23040
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999997, 100019);
        org.junit.Assert.assertEquals(
            result, 88717
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4318, 4320);
        org.junit.Assert.assertEquals(
            result, 2464
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(238, 236);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 52);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 1009);
        org.junit.Assert.assertEquals(
            result, 713
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999997, 18);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 49);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 102);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4323, 999985);
        org.junit.Assert.assertEquals(
            result, 480173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 1010);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 1048575);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 530122);
        org.junit.Assert.assertEquals(
            result, 85340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172868, 172869);
        org.junit.Assert.assertEquals(
            result, 97315
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4323, 4320);
        org.junit.Assert.assertEquals(
            result, 1088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 999999);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 999998);
        org.junit.Assert.assertEquals(
            result, 394018
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 4320);
        org.junit.Assert.assertEquals(
            result, 3872
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 54322);
        org.junit.Assert.assertEquals(
            result, 17956
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 525);
        org.junit.Assert.assertEquals(
            result, 407
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 524);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 232);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(102, 9876);
        org.junit.Assert.assertEquals(
            result, 7708
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 102);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 999998);
        org.junit.Assert.assertEquals(
            result, 598552
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 1000001);
        org.junit.Assert.assertEquals(
            result, 193504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 999983);
        org.junit.Assert.assertEquals(
            result, 695957
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 100001);
        org.junit.Assert.assertEquals(
            result, 39934
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 54323);
        org.junit.Assert.assertEquals(
            result, 14199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 20);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 236);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4318, 19);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 232);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 232);
        org.junit.Assert.assertEquals(
            result, 168
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 9877);
        org.junit.Assert.assertEquals(
            result, 6094
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 236);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 100019);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 54322);
        org.junit.Assert.assertEquals(
            result, 18930
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 172868);
        org.junit.Assert.assertEquals(
            result, 112716
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 172873);
        org.junit.Assert.assertEquals(
            result, 151950
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 52);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 54321);
        org.junit.Assert.assertEquals(
            result, 34427
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 17);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(20, 18);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 172872);
        org.junit.Assert.assertEquals(
            result, 37832
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 1048577);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(236, 102);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 999984);
        org.junit.Assert.assertEquals(
            result, 888544
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 100000);
        org.junit.Assert.assertEquals(
            result, 37504
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 172870);
        org.junit.Assert.assertEquals(
            result, 136558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 9878);
        org.junit.Assert.assertEquals(
            result, 8726
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 17);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 1009);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 530124);
        org.junit.Assert.assertEquals(
            result, 6028
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(238, 99);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 530122);
        org.junit.Assert.assertEquals(
            result, 193438
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 172871);
        org.junit.Assert.assertEquals(
            result, 3224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999997, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 172872);
        org.junit.Assert.assertEquals(
            result, 137720
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 100018);
        org.junit.Assert.assertEquals(
            result, 6970
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 530124);
        org.junit.Assert.assertEquals(
            result, 440812
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 4322);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999997, 17);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 523);
        org.junit.Assert.assertEquals(
            result, 370
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 999997);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 52);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 9878);
        org.junit.Assert.assertEquals(
            result, 2686
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 100000);
        org.junit.Assert.assertEquals(
            result, 15424
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(102, 4321);
        org.junit.Assert.assertEquals(
            result, 709
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 530123);
        org.junit.Assert.assertEquals(
            result, 206135
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 9875);
        org.junit.Assert.assertEquals(
            result, 783
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 521);
        org.junit.Assert.assertEquals(
            result, 476
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 20);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1008, 1009);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 525);
        org.junit.Assert.assertEquals(
            result, 379
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 530124);
        org.junit.Assert.assertEquals(
            result, 485468
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 9878);
        org.junit.Assert.assertEquals(
            result, 4170
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 524);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 1000001);
        org.junit.Assert.assertEquals(
            result, 775373
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 236);
        org.junit.Assert.assertEquals(
            result, 220
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 234);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(236, 172874);
        org.junit.Assert.assertEquals(
            result, 17000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(10, 1000001);
        org.junit.Assert.assertEquals(
            result, 1024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 9876);
        org.junit.Assert.assertEquals(
            result, 2048
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 18);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 1048577);
        org.junit.Assert.assertEquals(
            result, 524288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 1009);
        org.junit.Assert.assertEquals(
            result, 404
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 9874);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 231);
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 172871);
        org.junit.Assert.assertEquals(
            result, 141567
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 9878);
        org.junit.Assert.assertEquals(
            result, 5176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 232);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 172870);
        org.junit.Assert.assertEquals(
            result, 164844
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 1000002);
        org.junit.Assert.assertEquals(
            result, 524288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54319, 54320);
        org.junit.Assert.assertEquals(
            result, 51088
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 999986);
        org.junit.Assert.assertEquals(
            result, 554894
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 9);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 50);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530121, 530122);
        org.junit.Assert.assertEquals(
            result, 361780
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1010, 100018);
        org.junit.Assert.assertEquals(
            result, 93142
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(238, 238);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 100001);
        org.junit.Assert.assertEquals(
            result, 94583
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 1010);
        org.junit.Assert.assertEquals(
            result, 618
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 524);
        org.junit.Assert.assertEquals(
            result, 324
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1008, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 18);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 530122);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 82);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 522);
        org.junit.Assert.assertEquals(
            result, 484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100001, 172871);
        org.junit.Assert.assertEquals(
            result, 6448
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 530123);
        org.junit.Assert.assertEquals(
            result, 217500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 172873);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 233);
        org.junit.Assert.assertEquals(
            result, 204
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 4319);
        org.junit.Assert.assertEquals(
            result, 1129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 17);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 999998);
        org.junit.Assert.assertEquals(
            result, 152150
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100001, 100001);
        org.junit.Assert.assertEquals(
            result, 2048
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 1000003);
        org.junit.Assert.assertEquals(
            result, 244291
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 1011);
        org.junit.Assert.assertEquals(
            result, 832
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 999985);
        org.junit.Assert.assertEquals(
            result, 942811
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 999999);
        org.junit.Assert.assertEquals(
            result, 321304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 172871);
        org.junit.Assert.assertEquals(
            result, 70372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 999984);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 9);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 172873);
        org.junit.Assert.assertEquals(
            result, 125549
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 100001);
        org.junit.Assert.assertEquals(
            result, 37802
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 9878);
        org.junit.Assert.assertEquals(
            result, 252
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(237, 236);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999986, 9875);
        org.junit.Assert.assertEquals(
            result, 6264
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(77, 1010);
        org.junit.Assert.assertEquals(
            result, 162
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 999999);
        org.junit.Assert.assertEquals(
            result, 227273
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(232, 4322);
        org.junit.Assert.assertEquals(
            result, 2808
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 4320);
        org.junit.Assert.assertEquals(
            result, 1472
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 1009);
        org.junit.Assert.assertEquals(
            result, 813
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 172874);
        org.junit.Assert.assertEquals(
            result, 51014
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 524);
        org.junit.Assert.assertEquals(
            result, 224
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100001, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(19, 999986);
        org.junit.Assert.assertEquals(
            result, 524288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(525, 523);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54318, 172873);
        org.junit.Assert.assertEquals(
            result, 126697
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000003, 530122);
        org.junit.Assert.assertEquals(
            result, 39306
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1009, 9);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(77, 172871);
        org.junit.Assert.assertEquals(
            result, 120876
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1008, 234);
        org.junit.Assert.assertEquals(
            result, 118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9, 521);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9874, 530124);
        org.junit.Assert.assertEquals(
            result, 507544
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 1000002);
        org.junit.Assert.assertEquals(
            result, 189256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9875, 54319);
        org.junit.Assert.assertEquals(
            result, 19299
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 54320);
        org.junit.Assert.assertEquals(
            result, 7904
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 522);
        org.junit.Assert.assertEquals(
            result, 356
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 999984);
        org.junit.Assert.assertEquals(
            result, 493216
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 530124);
        org.junit.Assert.assertEquals(
            result, 349484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 999997);
        org.junit.Assert.assertEquals(
            result, 646266
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 17);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 54322);
        org.junit.Assert.assertEquals(
            result, 31650
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 523);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 999986);
        org.junit.Assert.assertEquals(
            result, 21154
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(51, 1011);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 100019);
        org.junit.Assert.assertEquals(
            result, 30896
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(18, 9874);
        org.junit.Assert.assertEquals(
            result, 5420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 521);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 4323);
        org.junit.Assert.assertEquals(
            result, 598
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54323, 54322);
        org.junit.Assert.assertEquals(
            result, 35912
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(52, 52);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 1000004);
        org.junit.Assert.assertEquals(
            result, 8576
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 1009);
        org.junit.Assert.assertEquals(
            result, 960
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(82, 82);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 524);
        org.junit.Assert.assertEquals(
            result, 152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9874, 54321);
        org.junit.Assert.assertEquals(
            result, 7807
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(231, 54322);
        org.junit.Assert.assertEquals(
            result, 35580
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4318, 54321);
        org.junit.Assert.assertEquals(
            result, 38119
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 999986);
        org.junit.Assert.assertEquals(
            result, 82976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 232);
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000002, 172872);
        org.junit.Assert.assertEquals(
            result, 114472
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4322, 4322);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999986, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54318, 231);
        org.junit.Assert.assertEquals(
            result, 190
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 524);
        org.junit.Assert.assertEquals(
            result, 220
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54318, 4319);
        org.junit.Assert.assertEquals(
            result, 491
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 9877);
        org.junit.Assert.assertEquals(
            result, 3166
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(521, 233);
        org.junit.Assert.assertEquals(
            result, 117
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172869, 54321);
        org.junit.Assert.assertEquals(
            result, 11051
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000004, 1000001);
        org.junit.Assert.assertEquals(
            result, 687927
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 530122);
        org.junit.Assert.assertEquals(
            result, 295362
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 54319);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 172869);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530121, 530121);
        org.junit.Assert.assertEquals(
            result, 287684
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(51, 54319);
        org.junit.Assert.assertEquals(
            result, 8727
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4319, 9875);
        org.junit.Assert.assertEquals(
            result, 8163
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 4323);
        org.junit.Assert.assertEquals(
            result, 1684
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 530124);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 1048577);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048578, 1048577);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 18);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172873, 999997);
        org.junit.Assert.assertEquals(
            result, 847027
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100001, 4322);
        org.junit.Assert.assertEquals(
            result, 1676
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 1008);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1, 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(0, 2);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(2, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 2);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(2, 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(0, 100);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 1000000);
        org.junit.Assert.assertEquals(
            result, 842624
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 100000);
        org.junit.Assert.assertEquals(
            result, 54688
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 523);
        org.junit.Assert.assertEquals(
            result, 345
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 234);
        org.junit.Assert.assertEquals(
            result, 176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 100000);
        org.junit.Assert.assertEquals(
            result, 88672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 9877);
        org.junit.Assert.assertEquals(
            result, 2718
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 9878);
        org.junit.Assert.assertEquals(
            result, 1294
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 99997);
        org.junit.Assert.assertEquals(
            result, 82968
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 999983);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 172870);
        org.junit.Assert.assertEquals(
            result, 70352
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 100019);
        org.junit.Assert.assertEquals(
            result, 17558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 100);
        org.junit.Assert.assertEquals(
            result, 84
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 523);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 99997);
        org.junit.Assert.assertEquals(
            result, 65939
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 100);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 234);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 172870);
        org.junit.Assert.assertEquals(
            result, 147012
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 99997);
        org.junit.Assert.assertEquals(
            result, 73621
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 999984);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 54322);
        org.junit.Assert.assertEquals(
            result, 52860
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 234);
        org.junit.Assert.assertEquals(
            result, 118
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 100019);
        org.junit.Assert.assertEquals(
            result, 97608
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 523);
        org.junit.Assert.assertEquals(
            result, 393
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 99997);
        org.junit.Assert.assertEquals(
            result, 31075
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 100020);
        org.junit.Assert.assertEquals(
            result, 84728
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999982, 999982);
        org.junit.Assert.assertEquals(
            result, 11412
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 9876);
        org.junit.Assert.assertEquals(
            result, 1696
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 100);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 999984);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 1000001);
        org.junit.Assert.assertEquals(
            result, 605496
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 100019);
        org.junit.Assert.assertEquals(
            result, 77415
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 235);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 234);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 9878);
        org.junit.Assert.assertEquals(
            result, 7276
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 234);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 99);
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 54321);
        org.junit.Assert.assertEquals(
            result, 22604
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 99);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 234);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 523);
        org.junit.Assert.assertEquals(
            result, 161
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 99997);
        org.junit.Assert.assertEquals(
            result, 60213
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 530123);
        org.junit.Assert.assertEquals(
            result, 3903
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 999984);
        org.junit.Assert.assertEquals(
            result, 806192
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 999998);
        org.junit.Assert.assertEquals(
            result, 425228
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 530122);
        org.junit.Assert.assertEquals(
            result, 166814
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999982, 524);
        org.junit.Assert.assertEquals(
            result, 208
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 524);
        org.junit.Assert.assertEquals(
            result, 416
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 101);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 9878);
        org.junit.Assert.assertEquals(
            result, 2896
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 235);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 999982);
        org.junit.Assert.assertEquals(
            result, 374496
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 99997);
        org.junit.Assert.assertEquals(
            result, 61421
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 7);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 530125);
        org.junit.Assert.assertEquals(
            result, 496429
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999982, 4321);
        org.junit.Assert.assertEquals(
            result, 2768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 100000);
        org.junit.Assert.assertEquals(
            result, 19136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 523);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 234);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999982, 999983);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 100);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 524);
        org.junit.Assert.assertEquals(
            result, 252
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 46);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 15);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 76);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 100);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 1010);
        org.junit.Assert.assertEquals(
            result, 586
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 100000);
        org.junit.Assert.assertEquals(
            result, 77344
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 99998);
        org.junit.Assert.assertEquals(
            result, 56946
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 4321);
        org.junit.Assert.assertEquals(
            result, 1384
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 233);
        org.junit.Assert.assertEquals(
            result, 71
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9877, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 9878);
        org.junit.Assert.assertEquals(
            result, 3576
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 1000000);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 522);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 9876);
        org.junit.Assert.assertEquals(
            result, 4396
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 99997);
        org.junit.Assert.assertEquals(
            result, 68367
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 1048577);
        org.junit.Assert.assertEquals(
            result, 1048575
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 54321);
        org.junit.Assert.assertEquals(
            result, 11785
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 233);
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 999983);
        org.junit.Assert.assertEquals(
            result, 879703
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 99);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 101);
        org.junit.Assert.assertEquals(
            result, 76
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 99996);
        org.junit.Assert.assertEquals(
            result, 2048
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 98);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 4320);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 99997);
        org.junit.Assert.assertEquals(
            result, 44823
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048579, 1048577);
        org.junit.Assert.assertEquals(
            result, 524288
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 99997);
        org.junit.Assert.assertEquals(
            result, 41484
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 523);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 54321);
        org.junit.Assert.assertEquals(
            result, 32768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 1048577);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 999999);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 1000000);
        org.junit.Assert.assertEquals(
            result, 114304
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 1000000);
        org.junit.Assert.assertEquals(
            result, 553152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 100020);
        org.junit.Assert.assertEquals(
            result, 80408
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 999981);
        org.junit.Assert.assertEquals(
            result, 27431
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 54322);
        org.junit.Assert.assertEquals(
            result, 33676
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 99997);
        org.junit.Assert.assertEquals(
            result, 22845
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 522);
        org.junit.Assert.assertEquals(
            result, 226
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 530122);
        org.junit.Assert.assertEquals(
            result, 514784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 4321);
        org.junit.Assert.assertEquals(
            result, 2473
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 9877);
        org.junit.Assert.assertEquals(
            result, 1359
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 999985);
        org.junit.Assert.assertEquals(
            result, 939472
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 54322);
        org.junit.Assert.assertEquals(
            result, 42900
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 9878);
        org.junit.Assert.assertEquals(
            result, 6268
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 234);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 999998);
        org.junit.Assert.assertEquals(
            result, 34814
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530123, 100);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 999999);
        org.junit.Assert.assertEquals(
            result, 898507
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 1048577);
        org.junit.Assert.assertEquals(
            result, 983041
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 46);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 9878);
        org.junit.Assert.assertEquals(
            result, 3134
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 523);
        org.junit.Assert.assertEquals(
            result, 342
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 100018);
        org.junit.Assert.assertEquals(
            result, 56028
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 99);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 99);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 172870);
        org.junit.Assert.assertEquals(
            result, 156742
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 999999);
        org.junit.Assert.assertEquals(
            result, 797015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 234);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 99);
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 1048575);
        org.junit.Assert.assertEquals(
            result, 32768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 99996);
        org.junit.Assert.assertEquals(
            result, 1024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 4321);
        org.junit.Assert.assertEquals(
            result, 3173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 999981);
        org.junit.Assert.assertEquals(
            result, 54862
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 76);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 98);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 9876);
        org.junit.Assert.assertEquals(
            result, 3376
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(521, 1000000);
        org.junit.Assert.assertEquals(
            result, 57152
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 234);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 530125);
        org.junit.Assert.assertEquals(
            result, 334716
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 4320);
        org.junit.Assert.assertEquals(
            result, 3392
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 172870);
        org.junit.Assert.assertEquals(
            result, 8794
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048578, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 1048575);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 7);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 9877);
        org.junit.Assert.assertEquals(
            result, 1990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9879, 9878);
        org.junit.Assert.assertEquals(
            result, 7574
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 530122);
        org.junit.Assert.assertEquals(
            result, 371226
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 524);
        org.junit.Assert.assertEquals(
            result, 172
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(524, 172870);
        org.junit.Assert.assertEquals(
            result, 1656
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 99997);
        org.junit.Assert.assertEquals(
            result, 80105
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 1000000);
        org.junit.Assert.assertEquals(
            result, 598592
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 1048576);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 97);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 530123);
        org.junit.Assert.assertEquals(
            result, 376566
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 54321);
        org.junit.Assert.assertEquals(
            result, 53753
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 172870);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 99999);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 99997);
        org.junit.Assert.assertEquals(
            result, 46121
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(46, 235);
        org.junit.Assert.assertEquals(
            result, 189
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 99999);
        org.junit.Assert.assertEquals(
            result, 90167
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999998, 172870);
        org.junit.Assert.assertEquals(
            result, 165464
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 999982);
        org.junit.Assert.assertEquals(
            result, 641166
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 50);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 99997);
        org.junit.Assert.assertEquals(
            result, 42062
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530125, 999982);
        org.junit.Assert.assertEquals(
            result, 571348
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 100001);
        org.junit.Assert.assertEquals(
            result, 88395
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 1011);
        org.junit.Assert.assertEquals(
            result, 158
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 521);
        org.junit.Assert.assertEquals(
            result, 391
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 1011);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 99998);
        org.junit.Assert.assertEquals(
            result, 73806
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1010, 1010);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 522);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 99995);
        org.junit.Assert.assertEquals(
            result, 88874
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 100020);
        org.junit.Assert.assertEquals(
            result, 60796
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 98);
        org.junit.Assert.assertEquals(
            result, 58
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 9878);
        org.junit.Assert.assertEquals(
            result, 8340
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 9878);
        org.junit.Assert.assertEquals(
            result, 7086
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 1048575);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 530125);
        org.junit.Assert.assertEquals(
            result, 357261
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 100001);
        org.junit.Assert.assertEquals(
            result, 19637
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 530122);
        org.junit.Assert.assertEquals(
            result, 499446
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 999998);
        org.junit.Assert.assertEquals(
            result, 517406
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 530125);
        org.junit.Assert.assertEquals(
            result, 63172
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 99997);
        org.junit.Assert.assertEquals(
            result, 71157
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 530125);
        org.junit.Assert.assertEquals(
            result, 308309
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 101);
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 522);
        org.junit.Assert.assertEquals(
            result, 196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 172872);
        org.junit.Assert.assertEquals(
            result, 143672
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54322, 999984);
        org.junit.Assert.assertEquals(
            result, 85936
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530125, 54321);
        org.junit.Assert.assertEquals(
            result, 36095
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 100);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(88, 88);
        org.junit.Assert.assertEquals(
            result, 80
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 999983);
        org.junit.Assert.assertEquals(
            result, 302459
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 9878);
        org.junit.Assert.assertEquals(
            result, 8730
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 99999);
        org.junit.Assert.assertEquals(
            result, 81073
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 1048577);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172870, 100019);
        org.junit.Assert.assertEquals(
            result, 28531
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 99995);
        org.junit.Assert.assertEquals(
            result, 65536
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000001, 234);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 999985);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 4321);
        org.junit.Assert.assertEquals(
            result, 2454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 99996);
        org.junit.Assert.assertEquals(
            result, 20000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 9877);
        org.junit.Assert.assertEquals(
            result, 3980
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100021, 100021);
        org.junit.Assert.assertEquals(
            result, 6470
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 9878);
        org.junit.Assert.assertEquals(
            result, 7234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100021, 54322);
        org.junit.Assert.assertEquals(
            result, 31478
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100021, 99996);
        org.junit.Assert.assertEquals(
            result, 30968
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 54321);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 9878);
        org.junit.Assert.assertEquals(
            result, 6758
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(521, 17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 1048578);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 1048574);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 1000000);
        org.junit.Assert.assertEquals(
            result, 394368
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(521, 521);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1010, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 172871);
        org.junit.Assert.assertEquals(
            result, 41529
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 15);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048581, 1048580);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 8);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 76);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 172872);
        org.junit.Assert.assertEquals(
            result, 66784
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4319, 99999);
        org.junit.Assert.assertEquals(
            result, 50000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 54321);
        org.junit.Assert.assertEquals(
            result, 16270
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(46, 1048575);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 999981);
        org.junit.Assert.assertEquals(
            result, 513706
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 100018);
        org.junit.Assert.assertEquals(
            result, 43990
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 100000);
        org.junit.Assert.assertEquals(
            result, 94336
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 521);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 100020);
        org.junit.Assert.assertEquals(
            result, 64276
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 1048578);
        org.junit.Assert.assertEquals(
            result, 131072
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 99998);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530124, 100000);
        org.junit.Assert.assertEquals(
            result, 13216
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 1048575);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 999985);
        org.junit.Assert.assertEquals(
            result, 928754
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(14, 15);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999986, 999983);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 97);
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 523);
        org.junit.Assert.assertEquals(
            result, 434
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 1048574);
        org.junit.Assert.assertEquals(
            result, 32768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99995, 99998);
        org.junit.Assert.assertEquals(
            result, 25000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 100001);
        org.junit.Assert.assertEquals(
            result, 1024
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048578, 1048578);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 1048578);
        org.junit.Assert.assertEquals(
            result, 1048574
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 100020);
        org.junit.Assert.assertEquals(
            result, 42064
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99997, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 100001);
        org.junit.Assert.assertEquals(
            result, 76789
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 99999);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 99996);
        org.junit.Assert.assertEquals(
            result, 40
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 99998);
        org.junit.Assert.assertEquals(
            result, 31074
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 530123);
        org.junit.Assert.assertEquals(
            result, 365381
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 99996);
        org.junit.Assert.assertEquals(
            result, 8972
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(522, 54321);
        org.junit.Assert.assertEquals(
            result, 54037
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9879, 1048580);
        org.junit.Assert.assertEquals(
            result, 32768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 100000);
        org.junit.Assert.assertEquals(
            result, 76576
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999983, 100000);
        org.junit.Assert.assertEquals(
            result, 81408
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 77);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 99);
        org.junit.Assert.assertEquals(
            result, 68
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 4321);
        org.junit.Assert.assertEquals(
            result, 3015
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 9876);
        org.junit.Assert.assertEquals(
            result, 3568
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 999998);
        org.junit.Assert.assertEquals(
            result, 32008
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 99999);
        org.junit.Assert.assertEquals(
            result, 23420
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 9879);
        org.junit.Assert.assertEquals(
            result, 6262
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99998, 234);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 100000);
        org.junit.Assert.assertEquals(
            result, 62144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 99999);
        org.junit.Assert.assertEquals(
            result, 31073
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 50);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 99998);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 530121);
        org.junit.Assert.assertEquals(
            result, 45247
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172872, 4321);
        org.junit.Assert.assertEquals(
            result, 2640
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100019, 100020);
        org.junit.Assert.assertEquals(
            result, 82148
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 235);
        org.junit.Assert.assertEquals(
            result, 173
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(49, 50);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100000, 14);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 100019);
        org.junit.Assert.assertEquals(
            result, 19558
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(233, 524);
        org.junit.Assert.assertEquals(
            result, 372
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 523);
        org.junit.Assert.assertEquals(
            result, 144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100021, 530122);
        org.junit.Assert.assertEquals(
            result, 234908
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99, 99997);
        org.junit.Assert.assertEquals(
            result, 60514
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 100021);
        org.junit.Assert.assertEquals(
            result, 3235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048580, 99995);
        org.junit.Assert.assertEquals(
            result, 48626
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(523, 999983);
        org.junit.Assert.assertEquals(
            result, 684619
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 233);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1010, 101);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 232);
        org.junit.Assert.assertEquals(
            result, 96
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100018, 232);
        org.junit.Assert.assertEquals(
            result, 120
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 98);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 99998);
        org.junit.Assert.assertEquals(
            result, 78472
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 9879);
        org.junit.Assert.assertEquals(
            result, 9868
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 1048577);
        org.junit.Assert.assertEquals(
            result, 1048576
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 9878);
        org.junit.Assert.assertEquals(
            result, 438
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(77, 9876);
        org.junit.Assert.assertEquals(
            result, 380
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 99999);
        org.junit.Assert.assertEquals(
            result, 93580
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(50, 49);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 999999);
        org.junit.Assert.assertEquals(
            result, 49960
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100020, 1048578);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 999983);
        org.junit.Assert.assertEquals(
            result, 496454
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 102);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4321, 530123);
        org.junit.Assert.assertEquals(
            result, 379898
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048577, 1048578);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(46, 530122);
        org.junit.Assert.assertEquals(
            result, 17144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 100019);
        org.junit.Assert.assertEquals(
            result, 58102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530125, 99);
        org.junit.Assert.assertEquals(
            result, 65
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 1000000);
        org.junit.Assert.assertEquals(
            result, 554688
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1010, 999986);
        org.junit.Assert.assertEquals(
            result, 572628
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 530123);
        org.junit.Assert.assertEquals(
            result, 200639
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 54322);
        org.junit.Assert.assertEquals(
            result, 26008
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9879, 9880);
        org.junit.Assert.assertEquals(
            result, 3128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(88, 89);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1000000, 54321);
        org.junit.Assert.assertEquals(
            result, 9973
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 999981);
        org.junit.Assert.assertEquals(
            result, 512
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4319, 999982);
        org.junit.Assert.assertEquals(
            result, 3976
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 530125);
        org.junit.Assert.assertEquals(
            result, 397136
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(47, 47);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 102);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048579, 100);
        org.junit.Assert.assertEquals(
            result, 88
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 101);
        org.junit.Assert.assertEquals(
            result, 77
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100002, 100001);
        org.junit.Assert.assertEquals(
            result, 4096
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 4319);
        org.junit.Assert.assertEquals(
            result, 1527
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1011, 521);
        org.junit.Assert.assertEquals(
            result, 196
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54321, 54322);
        org.junit.Assert.assertEquals(
            result, 8978
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 100017);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4320, 9876);
        org.junit.Assert.assertEquals(
            result, 1252
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 9876);
        org.junit.Assert.assertEquals(
            result, 848
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(97, 97);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99999, 1048579);
        org.junit.Assert.assertEquals(
            result, 481790
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9880, 100000);
        org.junit.Assert.assertEquals(
            result, 14176
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 522);
        org.junit.Assert.assertEquals(
            result, 452
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 54320);
        org.junit.Assert.assertEquals(
            result, 47856
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(234, 97);
        org.junit.Assert.assertEquals(
            result, 47
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 234);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(89, 89);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 97);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(99996, 172870);
        org.junit.Assert.assertEquals(
            result, 31876
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9879, 999999);
        org.junit.Assert.assertEquals(
            result, 760040
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 999985);
        org.junit.Assert.assertEquals(
            result, 926108
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999984, 99999);
        org.junit.Assert.assertEquals(
            result, 80335
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(15, 1000001);
        org.junit.Assert.assertEquals(
            result, 32768
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 100021);
        org.junit.Assert.assertEquals(
            result, 90415
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(17, 523);
        org.junit.Assert.assertEquals(
            result, 322
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9876, 999981);
        org.junit.Assert.assertEquals(
            result, 444943
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 523);
        org.junit.Assert.assertEquals(
            result, 376
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999985, 98);
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(98, 530124);
        org.junit.Assert.assertEquals(
            result, 384556
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999986, 999982);
        org.junit.Assert.assertEquals(
            result, 182592
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(46, 46);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048580, 1048580);
        org.junit.Assert.assertEquals(
            result, 256
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(16, 524);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(101, 7);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530125, 47);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999999, 999984);
        org.junit.Assert.assertEquals(
            result, 861056
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100, 100018);
        org.junit.Assert.assertEquals(
            result, 75942
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048574, 88);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(54320, 1048578);
        org.junit.Assert.assertEquals(
            result, 262144
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1012, 1011);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(9878, 7);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(14, 54321);
        org.junit.Assert.assertEquals(
            result, 16384
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(172871, 100019);
        org.junit.Assert.assertEquals(
            result, 57062
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(96, 172870);
        org.junit.Assert.assertEquals(
            result, 164806
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(4318, 1048576);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(89, 100000);
        org.junit.Assert.assertEquals(
            result, 62112
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530122, 999983);
        org.junit.Assert.assertEquals(
            result, 528756
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048575, 99997);
        org.junit.Assert.assertEquals(
            result, 61739
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(235, 530125);
        org.junit.Assert.assertEquals(
            result, 86493
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(8, 236);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(999981, 172870);
        org.junit.Assert.assertEquals(
            result, 163792
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(89, 54322);
        org.junit.Assert.assertEquals(
            result, 18676
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(530125, 530124);
        org.junit.Assert.assertEquals(
            result, 351500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(47, 89);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(100002, 999998);
        org.junit.Assert.assertEquals(
            result, 346584
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048581, 46);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(76, 530123);
        org.junit.Assert.assertEquals(
            result, 203476
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(1048576, 521);
        org.junit.Assert.assertEquals(
            result, 228
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.MODP.modp(7, 9880);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
}
