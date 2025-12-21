package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_X_OR_Y {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,34,12);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,8,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,33,5212);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1259,3,52);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,-1,12);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3609,1245,583);
        org.junit.Assert.assertEquals(
            result, 583
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(91,56,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,34,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,2,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,2,0);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(11,1,0);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(25,-25,25);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(37,123,456);
        org.junit.Assert.assertEquals(
            result, 123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(113,100,200);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,5,9);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(31,-5,22);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,0,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,20,40);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,99,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,40,20);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(199,99,200);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,100,5);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,500,500);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,40,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(25,-26,25);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(123,499,500);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,9,17);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,123,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(37,122,455);
        org.junit.Assert.assertEquals(
            result, 122
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(37,123,25);
        org.junit.Assert.assertEquals(
            result, 123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,3,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(11,100,201);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,100,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,99,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,20,20);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(36,456,37);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,501,500);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,456,99);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,500,501);
        org.junit.Assert.assertEquals(
            result, 501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,49,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(31,1,31);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1000,62,501);
        org.junit.Assert.assertEquals(
            result, 501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,200,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,122,455);
        org.junit.Assert.assertEquals(
            result, 122
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,19,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,41,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,-26,-26);
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,99,99);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,49,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,18,9);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,1,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,40,99);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,0,3);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(31,500,22);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,101,5);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,3,-26);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(498,501,500);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,-4,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,499,-26);
        org.junit.Assert.assertEquals(
            result, 499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-4,-26,-26);
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,-25,99);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(26,25,26);
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(40,61,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,3,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,199,24);
        org.junit.Assert.assertEquals(
            result, 199
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(32,500,22);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(31,32,22);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,500,22);
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(98,199,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(113,200,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,0,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(501,456,37);
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(19,113,100);
        org.junit.Assert.assertEquals(
            result, 113
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(38,122,455);
        org.junit.Assert.assertEquals(
            result, 455
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(40,0,98);
        org.junit.Assert.assertEquals(
            result, 98
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(37,123,6);
        org.junit.Assert.assertEquals(
            result, 123
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(19,200,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(199,99,-5);
        org.junit.Assert.assertEquals(
            result, 99
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(499,5,20);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,9,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,500,122);
        org.junit.Assert.assertEquals(
            result, 122
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,36,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(113,100,113);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(456,100,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,0,499);
        org.junit.Assert.assertEquals(
            result, 499
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(25,1000,-26);
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,31,1000);
        org.junit.Assert.assertEquals(
            result, 1000
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,456,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(25,27,25);
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(24,200,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(32,31,31);
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,40,41);
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1000,40,501);
        org.junit.Assert.assertEquals(
            result, 501
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,27,-26);
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-3,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(40,62,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,457,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(31,24,22);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(21,-25,200);
        org.junit.Assert.assertEquals(
            result, 200
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(500,22,500);
        org.junit.Assert.assertEquals(
            result, 500
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(41,-26,-26);
        org.junit.Assert.assertEquals(
            result, -26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,56,129);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,2,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,33,5212);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,-100,50);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,0,15);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,17,0);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,56,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-10,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,56,129);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,2,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-9,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-4,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,129,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,9,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-11,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,129,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-9,-10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-6,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,129,-5);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-10,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,-100,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-10,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,56,130);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1234,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,129,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,128,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-7,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,33,7919);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-7,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,56,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,129,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,-11,-11);
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,2,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,5212,1234);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,129,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,129,56);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,-7,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,56,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,49,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,6,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,1235,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,33,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,35,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,9,50);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,49,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,-6,-5);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,131,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-5,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,129,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,128,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-6,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,56,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,1234,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,399,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,4,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(400,399,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,0,1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-10,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,0,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-10,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,48,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(55,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,17,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,51,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,33,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,399,74);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,131,33);
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(55,56,55);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,17,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,-7,1235);
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,33,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,33,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,0,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-10,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,50,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(132,33,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,128,127);
        org.junit.Assert.assertEquals(
            result, 127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-7,8,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,51,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(55,9,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,5211,50);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,6,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(18,129,57);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,2,50);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,5,4);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,33,18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,35,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,-10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,35,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,2,17);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,130,6);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,5,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,129,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(54,57,57);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,4,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,-10,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,57,1);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,5211,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,9,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-9,62,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,129,131);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,-9,33);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,5212,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,-11,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,-11,-11);
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-100,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,0,15);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,1235,1235);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,-100,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,56,6);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,9,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,3,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,17,-7);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,0,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,50,101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,-10,-9);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,35,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,6,5);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,49,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,55,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,128,6);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-9,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,17,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,128,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,56,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,33,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-8,74);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,0,3);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,0,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-4,-6,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(130,10,1235);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,129,-8);
        org.junit.Assert.assertEquals(
            result, -8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,10,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1234,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,17,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,36,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-5,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-11,-11,-11);
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,5212,5);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-10,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-10,52);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,-9,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,4,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,1235,6);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,34,-7);
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,4,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,4,0);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,2,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,-5,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,131,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,399,-5);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7918,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,399,17);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,128,18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,-9,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,48,15);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,5211,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,5,6);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,11,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,0,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,100,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,1,-1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,47,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,16,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,128,-1);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,128,14);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,399,6);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,34,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,9,7920);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,6,130);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,-5,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,1234,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,7920,127);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,57,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,52,1);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,51,1);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,1235,1235);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,7,128);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-5,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,49,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1233,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,50,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-4,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,131,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,399,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1234,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,0,14);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,-9,34);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,9,74);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,5211,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,34,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,57,130);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,2,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-11,4,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,9,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,7918,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,8,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,5,56);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,9,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,3,16);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,8,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,5,17);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,-1,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,2,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,6,129);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-4,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,-4,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,-1,14);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,3,14);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,15,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,0,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-5,3,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,62,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,0,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,62,62);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,2,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(8,10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,5212,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,1,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,60,63);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,73,129);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,35,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,-100,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,35,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,100,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,9,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,17,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-7,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(8,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,7,127);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(32,33,32);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(18,-7,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,-7,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(62,-7,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,7,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,72,72);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,0,61);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,52,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,60,61);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-9,-9,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,9,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,8,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,-6,-5);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,1233,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7919,7920);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,1234,-5);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,52,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,-5,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,-10,-11);
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,34,131);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,49,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(54,39,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,52,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,35,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(11,-8,-9);
        org.junit.Assert.assertEquals(
            result, -8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-4,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,18,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,100,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,7919,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,62,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,5,73);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-7,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,9,73);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-10,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,3,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,56,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,5212,73);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,399,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,9,7920);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(59,52,1);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,18,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,36,72);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,127,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(39,-7,52);
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(47,34,9);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,0,9);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,7,6);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,2,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,130,10);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,6,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(18,132,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,-1,5);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,16,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,17,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,-9,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-4,-11,-11);
        org.junit.Assert.assertEquals(
            result, -11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(39,9,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(63,-5,63);
        org.junit.Assert.assertEquals(
            result, 63
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-7,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(18,399,-5);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7919,33);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,-6,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-5,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(63,35,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(8,9,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,7918,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,49,48);
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-4,-4,-4);
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,129,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,399,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,63,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,128,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,74,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,131,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,-9,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-6,-6,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,34,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,36,-9);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,34,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,73,-10);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,10,8);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,14,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(132,131,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,73,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-9,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(8,129,8);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,-6,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(132,128,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(132,1,-2);
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,-7,49);
        org.junit.Assert.assertEquals(
            result, -7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,74,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,57,1233);
        org.junit.Assert.assertEquals(
            result, 57
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(52,-1,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,55,6);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,62,1);
        org.junit.Assert.assertEquals(
            result, 62
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(55,56,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,-5,130);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,61,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,-100,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(49,4,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(11,-9,2);
        org.junit.Assert.assertEquals(
            result, -9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,-2,1);
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,4,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,131,131);
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,7919,3);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-11,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,34,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-6,5,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,52,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-5,34,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,8,1235);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1232,100,1232);
        org.junit.Assert.assertEquals(
            result, 1232
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,49,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,-4,9);
        org.junit.Assert.assertEquals(
            result, -4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,16,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,1232,1233);
        org.junit.Assert.assertEquals(
            result, 1232
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(132,-9,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(130,131,132);
        org.junit.Assert.assertEquals(
            result, 132
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,49,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,128,49);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,132,131);
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,10,-6);
        org.junit.Assert.assertEquals(
            result, -6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,5,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,0,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,0,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,0,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,1,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,0,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,0,399);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7919,35);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,101,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,6,101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,-100,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7920,35);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,50,2);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,129,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,0,33);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,3,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,72,56);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,399,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,15,17);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,2,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,60,2);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,0,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,5212,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,7920,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,0,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-1,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-1,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,4,-1);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,60,61);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-100,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,2,60);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,73,1);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,34,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,101,56);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,-100,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,16,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,50,61);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,0,101);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,16,15);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,34,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,-100,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,399,129);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,3,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,2,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,10,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-100,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,15,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7920,7919);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,129,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,399,7919);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,-100,128);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,1234,7918);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,2,1234);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,15,73);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,2,60);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7919,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,56,101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,-100,50);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,33,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,-100,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,4,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,33,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,399,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,7,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,128,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,61,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,1,2);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,0,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,0,16);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,16,7);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,56,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7918,61,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,0,1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,-10,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,-100,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,5,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(71,72,7);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,34,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,34,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,4,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,129,130);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,-100,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,-10,6);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,17,-1);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-1,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,101,33);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,73,34);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-1,-1,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,101,-101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,4,60);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,399,-1);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,-5,17);
        org.junit.Assert.assertEquals(
            result, -5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-1,101);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,399,7);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,1235,1234);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,5212,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,0,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7917,1234,7918);
        org.junit.Assert.assertEquals(
            result, 7918
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,14,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,0,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,56,-101);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,128,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-1,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,16,15);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,399,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,34,101);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,1234,-5);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,0,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,33,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,34,6);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,-10,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,-10,130);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,5,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-100,-100,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,33,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,61,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,73,73);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-1,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-101,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-1,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,7,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,56,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,33,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,50,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,50,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,1,100);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,73,-101);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,6,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(16,-101,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,60,3);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,102,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,0,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,-1,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7917,1234,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,-100,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,7,7);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,72,-101);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,72,-100);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,1,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,-1,0);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,34,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,-100,17);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,-10,2);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,9,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,-2,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-2,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,-1,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,-10,130);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(32,32,32);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,10,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,33,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,61,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,-100,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,7,16);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,2,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,399,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,2,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(10,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(4,-10,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,3,4);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,34,-2);
        org.junit.Assert.assertEquals(
            result, -2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,129,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,7,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,130,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,7920,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,-10,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,56,7);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-1,33,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,73,7);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,4,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-100,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,6,7);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,-1,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,33,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,-1,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,35,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,56,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,130,0);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-10,-10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,15,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,103,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,34,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-4,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,5,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(71,74,6);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,128,1233);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,0,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,3,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,1235,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,5212,33);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,16,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,0,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,60,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,-2,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,62,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,56,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,7918,7918);
        org.junit.Assert.assertEquals(
            result, 7918
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,102,127);
        org.junit.Assert.assertEquals(
            result, 127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,16,18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,-100,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,2,1);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(400,2,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,-1,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-2,-1,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,4,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,5212,7920);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(-4,32,32);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,4,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,-10,127);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,7,0);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,2,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,128,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,-1,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,74,74);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,400,35);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,2,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,17,4);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,1,1234);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,399,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(56,128,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(99,-10,-10);
        org.junit.Assert.assertEquals(
            result, -10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,399,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,103,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,34,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,34,1233);
        org.junit.Assert.assertEquals(
            result, 1233
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,101,6);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(14,6,7);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,5,15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,34,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,33,130);
        org.junit.Assert.assertEquals(
            result, 130
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(71,15,15);
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(71,74,-11);
        org.junit.Assert.assertEquals(
            result, 74
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,73,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,14,7917);
        org.junit.Assert.assertEquals(
            result, 7917
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1233,1,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1,100,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,15,14);
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,129,102);
        org.junit.Assert.assertEquals(
            result, 102
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,50,4);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,62,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5211,4,5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,71,7);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6,-1,18);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,-100,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,61,7918);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,130,5210);
        org.junit.Assert.assertEquals(
            result, 5210
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,50,60);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,-100,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,2,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,0,131);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(102,-1,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(103,34,129);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,15,4);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,5,6);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(128,56,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(35,17,16);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(51,56,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(48,1,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7921,7920,7919);
        org.junit.Assert.assertEquals(
            result, 7919
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,4,10);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3,17,103);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,2,1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,4,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,0,6);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,0,4);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(63,62,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,56,7920);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,60,-100);
        org.junit.Assert.assertEquals(
            result, -100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,35,16);
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,-1,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,1235,3);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(11,5211,-2);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(400,-1,100);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(100,11,11);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,399,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5211,5212,33);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5,60,5);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,399,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,102,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,-4,60);
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(60,62,61);
        org.junit.Assert.assertEquals(
            result, 61
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(131,131,0);
        org.junit.Assert.assertEquals(
            result, 131
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,0,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7920,-99,7920);
        org.junit.Assert.assertEquals(
            result, 7920
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,52,5212);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(5212,6,5211);
        org.junit.Assert.assertEquals(
            result, 5211
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1235,56,1235);
        org.junit.Assert.assertEquals(
            result, 1235
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,16,20);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(50,9,9);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(72,1235,50);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,6,0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(9,35,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,7917,7917);
        org.junit.Assert.assertEquals(
            result, 7917
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,1233,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,15,32);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(17,17,16);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15,14,399);
        org.junit.Assert.assertEquals(
            result, 399
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,129,56);
        org.junit.Assert.assertEquals(
            result, 56
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(61,127,1233);
        org.junit.Assert.assertEquals(
            result, 127
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919,7918,7919);
        org.junit.Assert.assertEquals(
            result, 7918
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(129,10,10);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(33,33,34);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7,72,7919);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(57,-10,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(103,-1,15);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1234,50,1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(101,101,6);
        org.junit.Assert.assertEquals(
            result, 101
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(0,2,2);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2,6,1);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(74,73,6);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(18,16,17);
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(73,73,5);
        org.junit.Assert.assertEquals(
            result, 73
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(32,34,32);
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,51,51);
        org.junit.Assert.assertEquals(
            result, 51
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(399,5,128);
        org.junit.Assert.assertEquals(
            result, 128
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(71,5212,6);
        org.junit.Assert.assertEquals(
            result, 5212
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(127,129,129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1007() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(34,131,-1);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
}
