package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CHOOSE_NUM {
    @org.junit.Test(timeout = 1000)
	public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(13, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 12354);
        org.junit.Assert.assertEquals(result, 12354);
    }
    @org.junit.Test(timeout = 1000)
	public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5234, 5233);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(546, 546);
        org.junit.Assert.assertEquals(result, 546);
    }
    @org.junit.Test(timeout = 1000)
	public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(50, 60);
        org.junit.Assert.assertEquals(result, 60);
    }
    @org.junit.Test(timeout = 1000)
	public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 14);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 12);
        org.junit.Assert.assertEquals(result, 12);
    }
    @org.junit.Test(timeout = 1000)
	public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 5);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 1000)
	public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 200);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 2);
        org.junit.Assert.assertEquals(result, 2);
    }
    @org.junit.Test(timeout = 1000)
	public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 14);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 35);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 60);
        org.junit.Assert.assertEquals(result, 60);
    }
    @org.junit.Test(timeout = 1000)
	public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 35);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 6);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 50);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 200);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(200, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(200, 200);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 36);
        org.junit.Assert.assertEquals(result, 36);
    }
    @org.junit.Test(timeout = 1000)
	public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 6);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 199);
        org.junit.Assert.assertEquals(result, 198);
    }
    @org.junit.Test(timeout = 1000)
	public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 14);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(201, 201);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(13, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(199, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 13);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(13, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 12);
        org.junit.Assert.assertEquals(result, 12);
    }
    @org.junit.Test(timeout = 1000)
	public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 14);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(36, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(200, 201);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 201);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 11);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 13);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(200, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(36, 35);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 14);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 2);
        org.junit.Assert.assertEquals(result, 2);
    }
    @org.junit.Test(timeout = 1000)
	public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 50);
        org.junit.Assert.assertEquals(result, 50);
    }
    @org.junit.Test(timeout = 1000)
	public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(200, 199);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(50, 59);
        org.junit.Assert.assertEquals(result, 58);
    }
    @org.junit.Test(timeout = 1000)
	public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 13);
        org.junit.Assert.assertEquals(result, 12);
    }
    @org.junit.Test(timeout = 1000)
	public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 201);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 36);
        org.junit.Assert.assertEquals(result, 36);
    }
    @org.junit.Test(timeout = 1000)
	public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 98);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 200);
        org.junit.Assert.assertEquals(result, 200);
    }
    @org.junit.Test(timeout = 1000)
	public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 50);
        org.junit.Assert.assertEquals(result, 50);
    }
    @org.junit.Test(timeout = 1000)
	public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(60, 59);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(59, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 34);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(201, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 50);
        org.junit.Assert.assertEquals(result, 50);
    }
    @org.junit.Test(timeout = 1000)
	public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(50, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(201, 200);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(201, 199);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(61, 60);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 7);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 3);
        org.junit.Assert.assertEquals(result, 2);
    }
    @org.junit.Test(timeout = 1000)
	public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 19);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 5);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 1000)
	public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 9);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 8);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 33);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 7);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 2000);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 8);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 4);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 1000)
	public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 25);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 27);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 102);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 4);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 1000)
	public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 7);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 25);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 25);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 1999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 1001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 26);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 997);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 9);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 1002);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 98);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 25);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 2001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 1001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 1000);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 25);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 1003);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 3);
        org.junit.Assert.assertEquals(result, 2);
    }
    @org.junit.Test(timeout = 1000)
	public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 997);
        org.junit.Assert.assertEquals(result, 996);
    }
    @org.junit.Test(timeout = 1000)
	public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 62);
        org.junit.Assert.assertEquals(result, 62);
    }
    @org.junit.Test(timeout = 1000)
	public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(62, 62);
        org.junit.Assert.assertEquals(result, 62);
    }
    @org.junit.Test(timeout = 1000)
	public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(104, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 62);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 27);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 997);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 12);
        org.junit.Assert.assertEquals(result, 12);
    }
    @org.junit.Test(timeout = 1000)
	public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 8);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 33);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 24);
        org.junit.Assert.assertEquals(result, 24);
    }
    @org.junit.Test(timeout = 1000)
	public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(70, 70);
        org.junit.Assert.assertEquals(result, 70);
    }
    @org.junit.Test(timeout = 1000)
	public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 62);
        org.junit.Assert.assertEquals(result, 62);
    }
    @org.junit.Test(timeout = 1000)
	public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 19);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 93);
        org.junit.Assert.assertEquals(result, 92);
    }
    @org.junit.Test(timeout = 1000)
	public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 93);
        org.junit.Assert.assertEquals(result, 92);
    }
    @org.junit.Test(timeout = 1000)
	public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 103);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 70);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 1003);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1004, 1003);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(70, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 103);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 1001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 1004);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 70);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 1004);
        org.junit.Assert.assertEquals(result, 1004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 6);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 1000)
	public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(70, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 4);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 1000)
	public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 9);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 1004);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(104, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(62, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1004, 1004);
        org.junit.Assert.assertEquals(result, 1004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 9);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(70, 32);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 99);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 71);
        org.junit.Assert.assertEquals(result, 70);
    }
    @org.junit.Test(timeout = 1000)
	public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 10);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(63, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 25);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(996, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(104, 27);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 35);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 26);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 33);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(34, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(35, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 62);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 63);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(996, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 71);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1003, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(70, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 3);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(72, 71);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(62, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(71, 71);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1004, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(104, 103);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 1004);
        org.junit.Assert.assertEquals(result, 1004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 98);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 1998);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000000, 1000001);
        org.junit.Assert.assertEquals(result, 1000000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 18);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 43);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 43);
        org.junit.Assert.assertEquals(result, 42);
    }
    @org.junit.Test(timeout = 1000)
	public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 17);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 8);
        org.junit.Assert.assertEquals(result, 8);
    }
    @org.junit.Test(timeout = 1000)
	public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 1001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 19);
        org.junit.Assert.assertEquals(result, 18);
    }
    @org.junit.Test(timeout = 1000)
	public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(11, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 1000);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 11);
        org.junit.Assert.assertEquals(result, 10);
    }
    @org.junit.Test(timeout = 1000)
	public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 997);
        org.junit.Assert.assertEquals(result, 996);
    }
    @org.junit.Test(timeout = 1000)
	public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 26);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 997);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 23);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2003, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 29);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 2000);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 2003);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 100);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 101);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 21);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 1000);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2004, 2003);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 16);
        org.junit.Assert.assertEquals(result, 16);
    }
    @org.junit.Test(timeout = 1000)
	public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 17);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 2001);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(30, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(10, 1998);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 31);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 997);
        org.junit.Assert.assertEquals(result, 996);
    }
    @org.junit.Test(timeout = 1000)
	public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 30);
        org.junit.Assert.assertEquals(result, 30);
    }
    @org.junit.Test(timeout = 1000)
	public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 21);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 32);
        org.junit.Assert.assertEquals(result, 32);
    }
    @org.junit.Test(timeout = 1000)
	public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2003, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(43, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 2003);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 27);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 28);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(96, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(99, 25);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 1);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(19, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(3, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 27);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 14);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 101);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
    @org.junit.Test(timeout = 1000)
	public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2004, 31);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 23);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 19);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 22);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 2003);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 15);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(98, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 2003);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 100);
        org.junit.Assert.assertEquals(result, 100);
    }
    @org.junit.Test(timeout = 1000)
	public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2000, 1999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 102);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(29, 1002);
        org.junit.Assert.assertEquals(result, 1002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 99);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 102);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 1001);
        org.junit.Assert.assertEquals(result, 1000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(31, 24);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(25, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 6);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(44, 44);
        org.junit.Assert.assertEquals(result, 44);
    }
    @org.junit.Test(timeout = 1000)
	public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2004, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(9, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 16);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(103, 27);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 18);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(998, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(101, 104);
        org.junit.Assert.assertEquals(result, 104);
    }
    @org.junit.Test(timeout = 1000)
	public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(4, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(24, 2004);
        org.junit.Assert.assertEquals(result, 2004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2001, 104);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(17, 28);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 1000)
	public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(100, 43);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1001, 2004);
        org.junit.Assert.assertEquals(result, 2004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1998, 43);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2002, 999);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(43, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(102, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2003, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1002, 102);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1999, 998);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2003, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 2);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(32, 2001);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1000, 30);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 103);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(999, 1999);
        org.junit.Assert.assertEquals(result, 1998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(43, 43);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(96, 96);
        org.junit.Assert.assertEquals(result, 96);
    }
    @org.junit.Test(timeout = 1000)
	public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(16, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 2002);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 34);
        org.junit.Assert.assertEquals(result, 34);
    }
    @org.junit.Test(timeout = 1000)
	public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(22, 11);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 1000)
	public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(26, 26);
        org.junit.Assert.assertEquals(result, 26);
    }
    @org.junit.Test(timeout = 1000)
	public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(8, 5);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(96, 4);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(15, 20);
        org.junit.Assert.assertEquals(result, 20);
    }
    @org.junit.Test(timeout = 1000)
	public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 8);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 999);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 2000);
        org.junit.Assert.assertEquals(result, 2000);
    }
    @org.junit.Test(timeout = 1000)
	public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(20, 98);
        org.junit.Assert.assertEquals(result, 98);
    }
    @org.junit.Test(timeout = 1000)
	public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(1, 2004);
        org.junit.Assert.assertEquals(result, 2004);
    }
    @org.junit.Test(timeout = 1000)
	public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(997, 997);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(21, 102);
        org.junit.Assert.assertEquals(result, 102);
    }
    @org.junit.Test(timeout = 1000)
	public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(18, 9);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(14, 998);
        org.junit.Assert.assertEquals(result, 998);
    }
    @org.junit.Test(timeout = 1000)
	public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(28, 2003);
        org.junit.Assert.assertEquals(result, 2002);
    }
    @org.junit.Test(timeout = 1000)
	public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(23, 20);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 1000)
	public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(2, 22);
        org.junit.Assert.assertEquals(result, 22);
    }
}

