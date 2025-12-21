package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_IS_HAPPY {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("a");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xyy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("iopaxpoi");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("iopaxioi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("tim");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmpzkfak");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("cadbfe");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("agbebf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is a comment");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("yyyyy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xycxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bacbacb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xxy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbacb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmzpzkfak");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xxyzycxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bacacbacb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("tibacacbacbm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bagbebf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("tibaagbebfcacbacbmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baaacbacb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacbacba comment");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbaacbacbcabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbaacbaccbcabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacbacba commenst");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbacbkfak");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is aao comment");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bat");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is baacbacbbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("x");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("agbbebf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thiis is hbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbaacbaccb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thiis is hb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is baaacbacbbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is baaacbaicbbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("cabcabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("XX");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacbacba coxxmmenst");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacbacba comnnt");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xxbacbacbx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmzpzfak");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("yxycxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbacbbRxtTUe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbabbaacbaccbcabcacbbyxycxyzRxtTUe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("agbebfx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aab this is bacbacba coxxmmenstcabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmpzkafak");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbagbebfxk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacbacba commbenst");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thiabcabcs is baaacbaicbbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmzpzkf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is b abat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this xxis baaacbaicbbatXXX");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("zxyxcxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thish is b abat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aebfx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("acbbaacbaccb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thish i s b abat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bcba comment");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("yyyyyy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this i bacbacba comme");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is hb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xxxx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" t his   thish i s b abatis bat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmzf");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("gabgbbebf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjmzpzkfamk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thiibaacbacbkfaks is hbat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this  i bacbacba comme");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("zbjmzpzfak");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("PQko");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbacbbRxbtTUe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baUe");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this ics bacbacba comnnt");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" t his   thish i  s b abatis bat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bacst");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bRxtTU this is baaacbaicbbate");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbRxtTU this is baaacbaicbbatebaabcbaccb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bjm this ics bacbacba comnntzkf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this is bcba commentt");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("PQkaebfxo");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" tat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thish i sb abat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baacbagbbebfxk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("cadbbjmzffe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this isPQkaebfxo bacbacba comnnt");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" thiagbebfsh i sb abat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("caaaabcaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("tiba t his   thish i s b abatis batcacbacbm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbaacbaccbbcabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("baUee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy(" this  i ba t is baacbacbbatcbacba comme");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("xxx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("yxycxyzxxy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566778899001122334455667788990011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadadbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddadaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566775565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaacaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabc11223344556abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab65677889900abcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("DJjGkGk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcacabcabcabcabcabcabcabcabdcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddcabcabcabcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112283344556677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcdabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("311223344556abcabb65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddcccckaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaababbbccccddddeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabaaaabbbbccccdeeeddddccccbbbbaaaaeabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbabaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvbcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcabcabcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbcccacdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccdbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbdccccddddaaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwerty112233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaeeabcdabcabcabcabcabcabcabcabcabcabcabcabcabccabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddcabcabcabbcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabca11223344556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900bcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcababcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667755656777889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaababbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeffghijklmnopqrstuvwxyzabcdopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbbcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabeedddabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbdbbccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddcbbbbccccdeeeddddccccbbbbaaaaeeeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccdbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertydeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabdddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbcccbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabbcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcababcccaaabbddeefffcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344577889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcabcabcabbcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddccabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabbcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababababababababababababababababababababaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcaaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbabaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccddddabcabcabcabeedddcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvnwxyzabcdehijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabccabcabbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcabcacbcabcabcabcabcabca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabc1122334455b6abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab65677889900abcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcbabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababababababababababababababababababcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaeaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccdbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbcccabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaaaaaabbbbccccdeeeddddccaaadadbbccddeeaaabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("3112233aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd44556abcabb65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcdabcabaaaabbbbccccdeeeddddccccbbbbaaaaeabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccabcabcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcccccdbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbcccabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeee112233445356abcabcabcaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900ddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667775565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667755667788990");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcacabcabbcabcabcbcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcacbcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcababcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaababcababbbbccccabababababababababababababababababaebababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabecabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvbbbccccdeeedaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcdddccccbbbbaaaaeeeedddccccaajZtrAVBJedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaacaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvbbbccccdeeedaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcdddccccbbbbaaaaeeeedddccccaajZtrAVBJedddccccawertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddbaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvwxyrzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabecabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344557667755656777889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcbbbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadadbbccddeaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcbabcabcabcabcabcabcabcabcabbcabcabcabeaabcbcabcabcabcabcabcabcabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcbbbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabcddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcaaabbbbccccdbcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcacbcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghbjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaacabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223634455667075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aba11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabbcabcabcabcadbcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcacabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgabcdefgcdeqwerty112233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbfgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbdddccccaaeeeedddccccaaaaaabbbbccccdeeeddddccccbbbbaaacaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvwxyrzabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabeedddcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbabbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabbbbbccccdbcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcababcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeea112233445566775565677889900bcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddcabcabcabbcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11211223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee67075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvbcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabccabcabbcabcabcababa11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabacabcabcabbcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1aabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab656aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddaaaabbbbccccddddaaaabbbbccccdddd77889900aad4dbbccddeeaabbccddee1223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcabcabcabcabcabeeddaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaababbbccccddddeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeededddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwerty112112233445566775565677889900233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabc1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344abcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcaaabbbbccccdbcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdee45566775565677889900ccabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeedddcaaeeabcdabcabcabcabcabcabcabcabcabcabcabcabcabccabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbdddccccaaeeeedddccccaabcabcabcababcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11228334455667755aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc6677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeededddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabeeabcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddbddccccbbbbaaaaeeeqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghbjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvbeaaaaabbbbccccddddaaaacbbbbccdccddddaaaabbbbccccdddddddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcccacbbbbaaaaeeabcabcabcabcabcacabcabcabcabcabcabcabcabdcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeaeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaaccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddccabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbbaaaaeeeedddccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("kgeaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcaboNtlLNR");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcacbcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcacbcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccaaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddbaaaabbbbccccddddaaaabbbbccccddddcaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaabaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabaaaaabbbbcbcccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababaababababababababdddcabcabcabbcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaabbbbccccbdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabc1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344abcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcaaabbbbccccdbcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefga7889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbfgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcdefghijklmnopqrstuhijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1121122334qwertyuiopasdfghjklzxcvbnmqwertyabacabuiopasdfghjklzxcvb4556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee67075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("3112233aaccckgeaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcaboNtlLNRbcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd44556abcabb65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112237344557667755656777889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddddaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcacbcabcabcabcabcabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("nOyfaZf");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddddaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcaaaaabbbbcbcccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccceeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aba11223344556abcabcabcabcabcabcabcabcabcabaaaaabeccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddcccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccdaabcabdeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaqwerty112233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbaaabbbbdccccddddaaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccaaaaabbbbccccdbcabcabcabcabcabcabeedddcdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445778qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb89900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvbcccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeedddcaaeeababcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11228334455667755aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccdddbdcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc6677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaababbbccc11228334455667755aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccdddbdcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc6677889900cddddeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabbcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabc112233445778qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdafghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccbaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb89900b");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabaeeeedddccccaaeeeedddccccaabcabbcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcaabcabcaaaaaabbbbccccdeeeddddccaaadadbbccddeeaaabcabcabcabcabcabcabcabcabcabcabbcabcabcabbcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeedaaaaabbbbccccdbcabcabcabcabcabcabeedddcdddccccbbbbaaaaeeabcabcabcabcabcabcabcababcabcabcabcabbcabcabcabcadbcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcacabcabcabcabcabcabcabcabdcabcabcabeedddcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab5566775565677889900cabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeceedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaqwerty112233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbaaabbbbdccccddddaaaaaaaaaabbbabababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcbabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddcccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababaaaaabbbbccccdbcabcabcabcabbcabcabeedddccabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb56677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbccccbbbbaaaaaaaaaabcabcabcabbcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffcbcabcaabcabcabcabcabcabcabcabcabcabdddbaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccc112233445778qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbcocccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb89900cddddaaaababbbccccddddeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffcbcabcaabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddccabcabcabcabcabcabcabdddbaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbdddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertydeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11228334455667755aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccdddbdcababcabcabcabcabcabcabcabcabcaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaababbbccccddddeedddcabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabaeeeedabcdefghijklmnopqrstuvwxyrzabcdefghijklmnopqrstuvwxyzddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcabcaaaaababbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcacabcabcabcabcabcabcabcabcabcabcabcabcabcabdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeedddcaaeeababcabcabcabcabcabeedaddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeedabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcdddccccbbbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("3112233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223634455qwerty112112233445566775565677889900233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb667075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("3112233aaccckgeaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddcccddddaaaabbbbccccddddaabbcabcaboNtlLNRbcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd44556abcabb65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcabcabcabcabcaabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaacbbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223634455qwerty112112233445566775565677889900233445566775565677889900uiopasdfghjklzxcvbnm9900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbcccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("jZtrAVBJ");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcabcabcabaaaaabbbbcbcccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababaababababababababdddcabcabcabbcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwerty112112233445566775565677889900233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasvdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("jDJjGkGk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabeedddabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcbabcabcabeedddcabcabbcabcabcabcabcabcabcabcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababbababababababababababababababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcababcbca1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900bcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddc4cccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbeccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeecabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcaaaaabbbbcbcccdeeeddddcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddddaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcaabcdefgabcdefgcdefga7889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbfgabcdefgbcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcaccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccdbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcaabcabcabcbabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabccabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccdeeedaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcababcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababcabcabcabdddcccqwerty112112233445566775565677889900233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbbbbaaaaeeeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccd1122334455667775565677889900dddaaaabbbabcbcabcabcabcabcabcabcabaaaaabbbbcbcccddddaaaabbbbccdccdddcdaaaabbbbccccababababababababababababababababaababababababababdddcabcabcabbcabcabcabbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcbcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcacabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeffghijklmnpqrstuvwxyzabcdopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabaaaabbbbccccdeeeddddccccbbbbaaaaeabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccaccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaacbbbbccccdeeeddabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabddccccbbbbaaaaaaaabbbaaaaabbbccdccddddaaaabbbbccccababababababbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwerty1121122334455667755656778abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccca89900233445566775565677889900uiopasdfghjklzxcvbnmqwertyuiopasvdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbabaaaaaaabbbbccccdeeeddddccccbbbbaaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaababbbccccddddeedddcaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccecdbbbbaaaaeeabcabcabcabcabcabcabcacbcabcabcabcaaaaabbbbcccabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaacbbbbccccddddaaaabbbbccdccddddaaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertydeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvbcabcabbcabcabcababcabaeeeedddccccaaeeeedddccccaabcabbcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmwertlyuiopasdfghjkldzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababababababaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabujiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabababababababababababababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbabbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dca1babcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeedddcaaeeababcabcabcabcabcabeedaddccabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112223344556677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1aabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaaeeeedddccccacabcabcabcabbcabcabcab656aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddaaaabbbbccccddddaaaabbbbccccdddd77889900aad4dbbccddeeaabbccddee1223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcaabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbdddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddbaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefga7889900uiopasdfghjklzxcvbnmqwvertyuiopasdfghjklzxcvbfgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababbbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeffghijklmnpqrstuvwxyabcdeffghijklmnopqrstuvwxyzabcdopqrstuvwxyzzabcdopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmwaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcabertlyuiopasdfghjkldzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1121122334qwertyuiopasdfghjklzxcvbnmqwertyabacabuiopasdfghjklzxcvb4556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee67075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccdaba11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccdddddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabbcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcabcaaaaababbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeddcabcabcabcabcabcabeedddcbcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("pIyuFerT");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcacabcabcabcaaaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcababcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccabcabcabcabcabcabcabcabcabcabcabdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabbcacbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aba11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbedddccccalzxcvbaaaaaaaabbbbcccab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabccabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcacbcabcabcabcabcabcaabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcabcabcabaaaaabbbbcbcccddddaaaabbbbccdccddddaaaabbbbccccabababababababcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabababababababababababaababababababababdddcabcabcabbcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaqwerty11223344556677556s5677889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbaaabbbbdccccddddaaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaababbbccccddddeedddcabcabcaaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababababababaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabujiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabababababababababababababababababdddbcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddcabcabcabcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("rPlIP");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcaaabcabcabcabcabcabcbabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeddcabcabcabcabcabcabeedddcbcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbeccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeecabcabcabcabcabcabbcabcabcababcabNuqZCZBVKR");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcdefgaaabbddeefffbcabcaabcabbcabcabcabcabcabcabcabcabcabeecabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccabcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvbcabcabeedddcaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcacbcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbcccaaabbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababababababaaaaabbbbccccdddccccaabababababababababababababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvwxyzabcde");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddkeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab4556677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabbcabcabcabcadbcabcabcabccaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabccabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababababababababababababababababababababababa11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccddddababdddddaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddababababababababababababababaebababababababddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaacbbbbccccdeeedcdabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabddccccbbbbaaaaaaaabbbaaaaabbbccdccddddaaaabbbbccccababababababbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdadeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdebeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvbcccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabbcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcadcabcabcabeedddcddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcacabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("3112233aaccckgeaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcaboNtlLNRbcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd44551122334455667755656778899006abcabb65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbeccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4d11223634455667075565677889900bbccddeeaabbccddeecabcabcabcabcabcabbcabcabcababcabNuqZCZBVKR");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445778qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabceeeedddccccalzxcvb89900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaababababdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeabcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabababaaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbabaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccddddabababababababababababababababababababababdddcabcabcabcabcabcabbedddcaaeeababcabcabcabcabcabeedaddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababaababababababababababababababababababababdddddaaaaababababdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcccccdeeeddddccccaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccde1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccaaaaabbbbccccdbcabcabcabcabcabcabeedddcdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900eedddadccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcababcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcdefgcdefgabcdefgabcdeaaccccddddadaaabbbbccccddddaaaabbbbccccddddfgcdefgabcccaaabbddeefffabcdefgaaabbddeefffbcabcaabcabbcabcabcabcabcabcabcabcabcabeecabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("QlLJztg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeqwertbabcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcababcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaopasdfghjklzxcvblzxcvbedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("lblEKueCZq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeaaaaabbbbccccddddaaaaababababdddedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566778899001122334455667780011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabbcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11211223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddcccaaeeeedddccccabcabcabbcabcabcababcab5677889900aad4dbbccddeeaabbccddee67075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcaaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbb6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccaaaaabbbdddccccaaeeeedddccccaabcabcabcababcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccaccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("511223344556677556586777889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmde");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccaaadadbbccddaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcaddbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabbeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcccdeeeddddccccbbbbaaaaeea112233445566775565677889900bcabcabcabcabcabcabcabcabcabcabcabcabcabdcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaabbbbccccbbbbaaaaaaaabbbbccccdeeeddbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("IrPlIP");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcbabcabcabcabcabcabcabcabcaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddcccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababaaaaabbbbccccdbcabcabcabcabbcabcabeedddccabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeedddbdccccbbbaaaaabbbdddccccaaeeeedddccccaabcabcabcababcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccabaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbqwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccaaaaabbbbccccdeeeddddccaaadadbbccddaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcabcabcabcabcabcabcabcadcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("FeQYRFWWU");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabccabcabbcabcabcababa11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeedddbbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ab112233445qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb56677556677889900ccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233abababababababababababababababababababababababaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddbcabcabcabeedddcab4577889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcab112423344556abcabcccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeecabcabcabcabcabcabbcabcabcababcabNuqZCZBVKR");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcaabcdefgabcdefgcdefga7889900uiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbfgabcdefgbcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcaccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvbcabcacbcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaaaaaabbbbccccdeeeddddccaaadadbbabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcccddeeaaabcabcabcaaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccddddbcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcccccdeeeddddccccbbbbaaaaeeeedddcccdca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcababcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcababcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgcabcaaaaababbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeddcabcabcabcabcabcabeedddcbcabcabcabcabcabcadcabcabcabeedddcbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaababbbccccddddeedddcabcabcaaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccabaaaaeeeedddccccaabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdbcabcacabcabcabcaaaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566bbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvbabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccabcabcabcabcabcabcabcabcabcabcabdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11211223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeebddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcccqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvbcaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddee67075565677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaccccdabcabcaabcccaaabbddeefffcbcabcaabcabcabcabccabcabcabcabcabcabdddbaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("FeQYRFWWaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcaabcabcabcabbcabcabcabU");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcnOyfaZfabuiopaDJjGkGksdfghjklzxcvbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbdddccccaaeeeedddccccaaaaaabbbbccccdeeeddddccccbbbbaaacaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcccccarPlIPaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabaabcabcabcabcabcabcabcacbcabcabcabcabcabcacabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghbjaaaaabbbbccccdeeeddddccccbbbbaaaabcdeffghijklmnpqrstuvwxyzabcdopqrstuvwxyzaeeeedddccccaklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertydeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddcccccccalzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aba11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeccccddddaaaabbbbccdccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabc11223344556abcabcabcabcabaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabccabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeeabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccdbdddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccdbdddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbabcdefghijklmnopqrstuvnwxyzabcdehijklmnopqrstuvwxyzbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabctabeedddcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaacabbbbccccdbcabcabcabcabcabcaabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcaeeddddccccbbbbaaaaaaaabbbaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("Ia");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcedddccccaccccbbbbaaabaeeeedddcaaeeababcabcabcabcabcabeedadqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbdddccccalzxcvbdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefga7889900uiopasdfghjklzxcvbwnmqwertyuiopasdfghjklzxcvbfgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddd1122aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd3344dcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaaaabbbbccccdeeeddddaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabcabcabcabeedddcedddccccaccccbbbbaaabaeeeedddcaaeeababcabcabcabcabcabeedadqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbacabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccbbbbaaaaeeeedddccccaaeeeedddccccqwe11223344556abcabcabcabbcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvblzxcvbdddccccalzxcvbdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaacbbbbccccddddaaaabbcbbccdccddddaaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcabaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445356abcabcabcaaaaabbbbcbcccdeeeddddcaaaaabbbbccccbdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddaaaaabbbbccccddddaaaaababababdaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddddaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbabcabcabcabcabcabcabcabcabcabcabbcabcabcab6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccdddd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcbabcabcaaaaacbbbbccccddddaaaabbbbccdccddddaaaaabbbbccccddddabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeffghijklmnopqrstuvwxababxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddcaaaaabbbbdccccddddaaaaaaaaaabbbbccccdeeeddddccccbbbbaaabaeeeedddcababababdddcccbbbbaaaaeeabcabcabcabcabcabcabcabcabcbabcabcabcabcabcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcaabccabcdefgabcddddfgcdefgabcdefgaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabecabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("FeQYRFWWaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmbcabcabcaabcabcabcabbcabcabcabU");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddccbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaabcabcabcabcabcabcabcabcaddbcabcabcabcaacceedddccccaaeeeedddccccaabcabcacbcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbcccaaabbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabca11223344556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabc6abcabcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaacaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65677aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeeddddccccaabcabcabcabcabcabcabcabcabcabcabcababcbca1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdaaaaabbbbccccdbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900bcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababcabcabcab889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1abababababababababababababababababababababababaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcababcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeedddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcaaccccddddaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbabaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaaaabbbbccccddddaaaabbbbccaccddddabcabcabcabeedddcab12237344557667755656777889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1aabcab11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab656aaccccdabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabdddaaaabbbbccccddddaaaabbbbccccdddd77889900aad4dbbccddeeaabbccddee1223344qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertydeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabcabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbcdcccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvb556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("puFerT");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabbcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcaabcdefgabcdefgcdefga7889900uiopasdfghjcklzxcvbnmqwertyuiopasdfghjklzxcvbfgabcdefgbcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcaccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvbcabcacbcababcabaaabbbbccccddaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcadcabcabcabeedddcddabbcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccde1122334a4556abcabcabcabcabcabcabcabcabcabaaaaaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccaaaaabbbbccccdbcabcabcabcabcabcabeedddcdaaaaabbbbccccdbcabcabcabcabcabcabeedddceeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900eedaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcddadccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcababcabcabeedddc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556abcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcaaaaaabbbbccccdeeeddddccaaadadbbccddeeaabbccddeebcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeecedddccccaabcabcabcabcabcabbb6567788aaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaababbbccccddddeedddcdd900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcaaaaaabcbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccabcabcabcabccabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvbcccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabadbcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccdccccalzxcvbdccccaaeeeceddabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaaeeeedddccccaaeeeedddccccabcabcabbcabcabcababcabdccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("FeQYRFWWaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeeddqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddcqwertyuiopasdfghjklzxcvbnmqwertlabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcaabcabcabcabbcabcabcabU");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("djZtrAaaccccddddadaaabbbbccccddddaaaabbbbccccddddVBJ");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddbddccccbbbbaaaaeeeqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghbjaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaklzxcvbeaaaaabbbbccccdddddaaaacbbbbccdccddddaaaabbbbccccdddddddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcdabcabaaaabbbbccccdeeeddddccccbbbbaaaaeabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzzxcvbcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcaaaaabbbbccccdeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdbbaaaacabcababcabccccdeeeddddccadddcabcabcabcabcabcabeedddcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233444");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445qwe11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaceabcabcabcabbcabcabcab65h677889900aad4dbbccddeeaabbccddeertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb56677556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("Iabcbcabcabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccdccddddaaaabbbbccccababababababababababababababababababababababababdddcabcabcabcabcabcabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcaaaaaabbbabccccdeeeddddccccbbabcbcabcabcabcabcabcabcabcdabcabaaaabbbbccccdeeeddddccccbbbbaaaaeabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeaeedddccccaaeeeedddcccabcabcabcabcabcacbcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcbabcabcabcaaaaaabbbbccccdaeeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcababcabcabcabcabcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("lblqEKueCZq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabecabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabbcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qaaaaabbbbccccdeeedddaaaaabbbbccccddddaaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcadbcabcabcabcaaccccddddaaaabbbbccccddddaaaabbbbccccddddaababcababbbbccccabababababababababababababababababaebababababeababddddccccbbbbaaaaaaaabbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjklzxcvbbbccccdeeedaaaaabbbbccccdeeeddddccccbbbbaaaaeeaaccccddddaaaabbbbccccddddaaaabbbbccccddddeedddcdddccccbbbbaaaaeeeedddccccaajZtrAVBJedddccccawertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcbbbbaaaaeeeedddccccaaeeeabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabqwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccalzxcvbcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabedddccccabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbabccccdeeeddddccccbbabcbcaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddcaaaaaabbbcbccccdeeeddddccccbbbbaaaaeeeedddccccaabcabcabcabcabcabcaaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcab112233445566775565677889900cabecabcabcabeedddcbcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccaaaaacbbbbccccddddaaaabbbbccdccddddaaaaabbbbccccddddbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("zYKVb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcbcabcabcabcabcabcabcabcabcabcabcabcaaaabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaeeabcabcabcabcabcabcabcabcaaabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabbcabcabcabcabcabcabcabcabeedddcaabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabaabbbbccaccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcacbcabcabcabcabcabcabcabcabcabcabcabbcabcabcababcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("Iabcbcabcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddaaaaabbbbccccdeeeddddccabcccaaabbddeefffccbbbbaaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeceddaabcbcabcabcabcabcabcabcabcabcabcabcabcaaaaacbbbbccccdeeeddabcabcabcaaaaaabbbbccccdaeeeddddccccbbbbaaaaeeabcabcabaaccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabcabcaaaaabbbbccccdeeeddddccccbbbbaaaaeeabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeedddcabcabcabcabcabcabeedddcbcabcabcabcabcabcabcabcabcabcabcabcabcabddccccbbbbaaaaaaaabbbaaaaabbbccdccddddaaaabbbbccccababababababbababababababababababababababababababdddbbddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabaaaaabbbbccccddddaaaabbbbccabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzdxcvbnmqwertyabcabuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aacaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaabbbcccdddeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxyyzzz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccddddaaaabbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgagbcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcababababababababababababababababababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaabbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddedee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcababababababababababababababababababadbabababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("IN");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab788990112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccdddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbcccacddddaaaabbbbccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccddddaaaabbbbcccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcaaaaaaabbbbccccddddaaaabbbbcccccddddbccccddddbcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbcdefgabcdefgcdefgabcabaabcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccddedede");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbdddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1babababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbdqwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1babaababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddddbccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababbabababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabbbbccccddddaaaabbbbccccddddbccccddddaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaddbbccddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab78abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff89900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcagbaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbabababababababab112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab788990112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000ababababababababababababababdecfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1babababababababababababababababababababccdeeeddddabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd1122334455660778899001122233445566778899001eefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccddeeddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbaccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122336445566778899001122334455667788990011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaababbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566778899001312233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcacabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab55667abcabcabcabcabcabcabcabcabcaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddbcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233344556677889900112233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddcdeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbabababababaaddbbccddeeaabbccddeeabababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbabababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaddbbccddedee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbabcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabbccddeeaabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabca9bcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122336445566778899011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbabababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaabadbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233aad3dbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabca9bcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgdefgcdabcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcabefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbcccacddddaaaabbbbccccdadddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdabcccaaabbdddeefffefgcdefgabcdefgabcdefgcdababababababababababababbabababababababababgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112233445556607788992233445566778899001eefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900d9eefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223334455667788adddaaaabbbbccccddddbccccdddd9900112233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899abcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabbbbccccddddaaaabbbbccccddddbccccddddaaabbbbccccddddaaaabbbbccccddbddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwertyugiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900ab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa11223344556677889900112233445566778899b00112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccd445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900d9eefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga1122334abcdefgabcdefgcdefgabcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg34455667abcab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900cabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddedeae");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667aaaaaabbbbccccddddaaaabbbbaccccddddaaaabbbbccccdddddbcabcabcabcabcabcabcabcaabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1bababaqwertyuiopasdfghjklzxcvbnmqwertyugiopasdfghjklzxcvbbababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011223344556677889900112233445566778");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababaabcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgbababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgaabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababababababababbcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabdddaaaabbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaababccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbababababcabcabcabcabcabc8abcabcabcabcaabcccaaabbd1122334455660778899001122233445566778899001eefffbcabcabcabcabcabcabababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcbabcabcabcabcabcabcabcabcababcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899abcabcabcabcacbcabc8abcabcabcabcaabcccaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccddeedede");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abaadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabecdefgabcdefgcdefgabcdefgddefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaddbbccddeeaabbcaabcccaaabbdddeefffcddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgaabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbcrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababababababababbcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbccdde");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd11223qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb3445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccdddabcabcabcabcabcabc8abcabcabcabcaabcccaaabbd1122334455660778899001122233445566778899001eefffbcabcabcabcabcabcabeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeabbccddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889901122334455660778899001122334455667788989001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdefghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455660778899001122334455667788990011b22334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfaaaddbbccddeeaabbcaabcccaaabbdddeefffcddeeghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("o");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011223344556677889900191223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1bababaqwertyuiopasdfghjklzxcvbnmqwertyugiopasdfghjklz112233445566077889900112233445566778899abcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900xcvbbabababababababaqwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvbbababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabacabcabcabaaddbb1ccddeeaabbccddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaa11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabca11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900baaaaabbbbccccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbcaaaddbbccddedeecddeeaabbccddeebcab7889900deefffa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee556677233445900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ZXocn");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaddbbccddeddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaddbbcdee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("oqwertyuiopasdfaaaddbbccddeeaabbcaabcccaaabbdddeefffcddeeghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011202334455667788990019122334455667788990");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabaaabbbbcccbcddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga113223344556677889900112233445566778899001122334455667abcabcabcabc7abcabcabcabacabcabcabaaddbb1ccddeeaabbccddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabaaabbbbcccbcdbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abab11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbabababababbabababababbababababababababddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445aaee566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("nbGgbXWEZ");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijkplabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbabababababaaddbbccddeeaabbccddeeabababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa112233445abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvabcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzwxyzabcdefghijklmnopqrstuvwxyz5667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889901122334455660778899001122334455667788989001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000deefffdefgcdefgabcdefg23344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455660778899001122334455667788990011b22334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889900abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcabcccaaabbd11223344556607d7889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ababa112233445566778899001122334abcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefg4556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbabababababaaddbbccddeeaabbccddeeabababababababababababababababababdecfgabcabababababbababababababababababbabababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccddededde");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223cabcabcabaaddb11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababaabcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgbabababababccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababaubabababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababbababababababababdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1111223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee5566772334459002233445566778899001122334455667788990011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abocccaaabbdddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabbcabcabcabcabcabccabcabaaddbbccddeeaabbccddeebcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("nbGgbXWEqwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvbZ");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbdabcccaaabbd11223344556607788990abcccaaabbd112233112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccd445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900d9eefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbcdefgabcdefgcdefgabcabaawbcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccddddaaaabbdbbcccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaadbbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababdababbabababababbababababababababdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcoqwertyuiopasdfaaaddbbccddeeaabbcaabcccaaabbdddeefffcddeeghjklzxcvbnmqwertyuiopasdfghjklzxcvbabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd11223qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklz112233445566778899001122334455667788990011223344556677889900xcvb3445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabe");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghiabcdefgabcdefgcdefgabcagbaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgcjklmnopqr0stuvwxyzabcdefghijklmnopqrstuvwxyzbabababababababab112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab788990112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000ababababababababababababababdecfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11112233447aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee5566772334459002233445566778899001122334455667788990011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233164455667788990011223344556677889900112233443556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababcabcabcabcacabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab55667abcabcabcabcabcabcabcabcabcaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddbcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcababababababababababaubabababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddb112233164455667788990011223344556677889900112233443556677889900bccdddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababab112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccdabbababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaddbbccddeeaabbcaabcccaaabbdddeefffcddeebcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabca9bcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaabbbbccccdddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbdefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababdababbabababababbababababababaINbabdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabbbbccccddddaaaabbbbccccddddbccccddddaaaaaddbbccddedeebbbbccccddddaaaabbbbccccddbddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdefghjklzxcvbnmq11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900wertqwertyuiopasdefghjklzxcvbnmqwertyuiopasdfghjklzxcvbjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabca11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900baaaaab11223364455667788990011223344556677889900191223344556677889900cabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223cabcabcabaaddb1122334455667788990011223d3445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefg445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889901122334455660778899001122334455667788989001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabbbbcceccddddaaaabbbbccccddddbccccddddaaaaaddbbccddedeebbbbccccddddaaaabbbbccccddbddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababab112233445566077889900112233445566778899001c122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccdabbababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabc8abcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa11223344556677889900112233445566778899b00112a2334455667abcabcabcabcabababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaababbbccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcab3cabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeadeae");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddccccadddaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijkplabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbabababababaaddbbccddeeaabbccddeeabababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaa112233445566778899001312233445900bddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcagbaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbabababagbababababababababababababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababdababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcab3cabcabcabcabcabcabcabcabaad11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900dbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbaaddbbccddeeaabbccddebccccddddaaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("f");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababdababbabababababaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccabababababababababdd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("LJzRm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc85abcabcabcabcaabcccaaabbd11abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbabababababababab22334455660778899001122233445566778899001eefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabaadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabecdefgabcdefgcdefgabcdefgddefgabcdefgabbbbcceccddddaaaabbbbccccddddbccccddddaaaaaddbbccddedeebbbbccccddddaaaabbbbccccddbddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqweraaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddtyugiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddccccadddaabbbbccccdddda4aaabbbbccccddddaaaabbbbccccddddq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccdoqwertyuiopasdfaaaddbbccddeeaabbcaabcccaaabbdddeefffcddeeghjklzxcvbnmqwertyuiopasdfghjklzxcvbdeedede");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455ab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab788990qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb0");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklmnopqrstuvywxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccabaabbdefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabca11223364455667788990011223344556677889900112233445566778baaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab0");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaaaabaadddbbabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabecdefgabcdefgcdefgabcdefgddefgabcdefgabbbbcceccddddaaaabbbbccccdddabcabcabcabbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcabdbccccddddaaaaaddbbccddedeebbbbccccddddaaaabbbbccccddbddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabca1b");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233aad3dbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabca9bcabcabcabcabaaddbbccddeeaabbccddeebcab78899112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab788990112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000efff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbbbccccddddaaaababbbccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddeeaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddccccadddaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ByjXXpGj");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcaaaddbbccddeddeecabcaabcccaaabbd11223344556607788990011223344556677889900112233445566b7abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbaaddbbadddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccddddcddddaaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgagbcabcccaaabbddeefffdefgcdefgaabcdefgabcdefgcdefgabcdefgdefgcdefgabcdefgbcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbcccacddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adabcdefgabcdefgcdefgabcdefgagbcabcccaaabbddeefffdefgcdefgaabcdefgabcdefgcdefgabcdefgdefgcdefgabcdefgbcdefgddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabbcabcabcabcabcabccabcabaaddbbccddeeaabbccddeebcabababababbabababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233aaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa445566077889900112233aaddbbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcde11223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee556677233445900fgcdefgabcdefegagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566778899001122334145900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbcccacddddaaaabbbbcccabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233344556677889900112233445900aaaaaabbbbccccddddaabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaabbdbbcccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd11223344556607788990011223344556677889900112233445566");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122aaaaabbbaaddbbadddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccddddcddddaaaabbb3cabcabcabaaddb11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbcc6ccddddaaaabbbbccccddddaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababab11223344556677889900112233445900babab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("NIN");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababacababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddccccadddaabbbbccccdddda4aaabbbbccccddddaaaabbbbccccddddq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("22334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabbcabcabcabcabcabccabcabaaddbbeccddeeaabbccddeebcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabaaddbbccddedeaefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaabadbbbccccabcccaaabbddeefffddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccdddcdbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("DsrQgZMOa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abbcdefgabcdefgcdefgabcabaabcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdeg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgzrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbbbccccddddaaaababbbccccddddaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgaabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrnbGgbXWEqwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvbZstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababababababababbcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcaaaaabbbaaddbbadddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccddddcddddaaaabbbabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbcddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abocccaaabbdd11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("oqwertyuiopasdfaaaddbbccddeeaabbcaabcccacaabbdddeefffcddeeghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefg4455660778899001abcccaaabbddeefff12233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab7889901122334455660778899001122334455667788989001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabaaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffacabcabcabc9900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaaaaabbbbabababababababababababaddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddeeaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babddddccccbbbbaaaaeeeedddccccadddaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112aaaaabbbbcccacddddaaaabbbbccccdadddaaaabbbbccccddddd233445556607788992233445566778899001eefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbababababcabcabcabcabcabc8abcabcabcabcaabcccaaabbd1122334455660778899001122233445566778899001eefffbcabcabcabcabcambcabababababababababababababababababdefgcbcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcaaddbbccddedeaeabcabaaddbbccddeeaab7bccd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghuvwxyzabcdefghijklmnopqrstuvwxyzbababababcabcabcabcacabcabcabcabcacbcabc8abcqwertyuiopasdefghjklzxcvbnmq11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900wertqwertyuiopasdefghjklzxcvbnmqwertyuiopasdfghjklzxcvbjklzxcvbababaubabababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeqwertyuiopasdfghjklzxcvbnmqaaaaabbbbcccacddddaaaabbbbccccddddaaaabbbbccccdddddweraaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddtyugiopasdfghjklzxcvbfgabcdefgcdefgabcdefgagbcabcccaaabbddeefffdefgcdefgaabcdefgabcdefgcdefgabcdefgdefgcdefgabcdefgbcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("acaddbbccdddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghljklzxcvbnmqgwertyugiovb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("VXtSHThz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaaaddbbccddeeaabbcacddeecddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcaabbccddeebcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccccddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233644556677889900112233445566778899050112233445568");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223364455667788990011223344555667788990011223344556677889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabcccaaabcbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ababa1122334455667788990011223344556677889900112aabcdefgabcdegfgcdefga113223344556677889900112233445566778899001122334455667abcabcabcabc7abcabcabcabacabcabcabaaddbb1ccddeeaabbccddeebcab7889900defg2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaa11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccdcdeeaabbccddeebcab7889900bbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga113223344556677889900112233445566778899001122334455667abcabcabcabc27abcabcabcabacabcabcabaaddbb1ccddeeaacddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddee55667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabaaaaabbbbccccddddaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaabbbcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abaadaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddbbcacddeecccaaabbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeeabcccaaabbddeefffbcab7889900bababababababababababababababbabababababababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccd0112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddccccadddaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeaaaaabbbbccaaeeccddddaaaaaaaabbbbabababababababababababadddeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababbabababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("LJz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa112233445abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvabcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaaabbccddeebcab7889900deefffabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzwxyzabcdefghijklmnopqrstuvwxyz5667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd112233aaaaabbbbccccdeeeddddccccbbabcccaaabbd1122334455669077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa445566077889900112233aaddbbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbaaddbbadddaaabababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccddddcddddaaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddcdabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababababababababeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbababababababababababababaababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababbababbababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrabcabcabcabcabcabc8abcabcabcabcaabcccaaabbd112aaaaabbbbcccacddddaaaabbbbccccdadddaaaabbbbccccddddd233445556607788992233445566778899001eefffbcabcabcabcabcabcabstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdefghjklzxcvbnmq11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900wertqwertyuiopasdefghjklzxcvbnmqwertyuiopasabocccaaabbdd11223344556677889900112233445566778899001122334455667abcabcab4cabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdfghjklzxcvbjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("a112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab78abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff89900addbbccddedee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbcabcabcabc9900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667788990011223344j5566778899001122334455667abcabcabcabcabcabcabca112233445566077889900112233445566778899abcabcabcabcacbcabc8abcabcabcabcaabcccaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabbd112233445566077889900112233445566778899aaaddbbcdeeb001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900bcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgagbcabccccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900abababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzaaaaabbbbccccdeeeddddccccbbabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababaabcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgbabababababcccaabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababab11223344556677889900112233445900babab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abab11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab78899babababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabca11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900baaaaab11223364455667788990011223344556677889900191223344556677889900cabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmn5566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabb2ccddeebcab7889900deefffbcabcabcabcabcabcab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("mm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdeafgabcdefgagbcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabaaabbbbcccbcdbbccccdddabbcdefgabcdefgcdefgabcabaawbcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzfgabcdefgcdefcefgaaabbbbcccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa112233445abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabbcabcabcabcabcabcabcabaaddbbcaaaaabbbbccccdddda1111223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee5566772334459002233445566778899001122334455667788990011223344556677889900aaabbbbccccddddaaaabbbbccccdddddbababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("adddaaaaaaddbbccdddabcabcabcabcabcabc8abcabcabcabcaabcccaaabbd1122334455660778899001122233445566778899001eefffbcabcabcabcabcabcabeeaabbcacddeebabbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbccababa112233445abcdeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabbcabcabcabcabcabcabcabaaddbbcaaaaabbbbccccdddda1111223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd1122334455660778899d00112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee5566772334459002233445566778899001122334455667788990011223344556677889900aaabbbbccccddddaaaabbbbccccdddddbababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababa11223344556677889900112233344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcabaabcdefghicjklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbabababababababab112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab788990112233445566077889900112233445566778899001122334455667abcabcabcabcaabcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddeeaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeeaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abaaaaabbbbccababa11223344556677889900112233abcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff44556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaababccdeeedddaaaaabbbbccccdeeeddddccccbbabcccaaabcbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffadccccbbbbaaaaeeeedddccccadddaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddq45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaddbbccddeeaab7bccddeebcab78899000ababababababababababababababdecfgabcdefgcdefefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223cabcabcabaaddb11223344556677889900112233445566778899001122334455667abcabcabcabaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeaabbccddeebcab7889900bccddeeaab7bccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbqwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1babababababababababababababababababababccdeeeddddabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvbccddeeaabbccddeebcab7889900ab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ZXocaaaaabbbbccccddddaaaabbbbaccccddddaaaabbbbccccdddddn");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdefghjklzxcvbnmq11223344556677889900112bcabcabaaddbbccddeeaabbccddeebcab7889900wertqwertyuiopasdefghjklzxcvbnmqwertyuiopasabocccaaabbdd11223344556677889900112233445566778899001122334455667abcabcaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabca1bb4cabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffdfghjklzxcvbjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbbccdabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("a112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab78abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff899abcccaaabbd112233aaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffa445566077889900112233aaddbbccddeebcab7889900deefff00addbbccddedee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeeeddddccccbbabababababbababababfabcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbababaabcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefgbabababababccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455660778899001122334455667788990011b22334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bcccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ZXoaaaaabbbbccccddddaaaabbbbccccddddbccccddddcaaaaabbbbccccddddaaaabbbbaccccddddaaaabbbbccccdddddn");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgaabababababbabababababcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababab11223344556677889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbcrstuvwxyzabcdefghijklmnopqrsabcccaaabbddLJzRmeeffftuvwxyzabbababababababababbcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("DsrQgZMaaaaabcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbbbccccddddaaaababbbccccddddaaaabbbbccccdddddOa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee4556677889900abcdefgabcdefgcdefgabcagbaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgbbccddeeaabbccddddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("jyNwzIR");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdeffg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccabcdefgabcdefgc112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaadcbbccddeeaabbccddeebcab7889900abcdefgcdefefgyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabca11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900baaaaab112233644556677889900112233445566778899001915223344556677889900cabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455660778899001122334455667788990011b22334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaab7bcccddeebcab7b889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababbababababababababcdefgabcdefgcdefgabcdefgagbcabccccaaabbddeefffdefgcdefgabcdefgab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcadbcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcde11223344aabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccdddeeddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababqwertyuiopasdfghjklzxcvbnmqweraaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddtyugiopasdfghjklzxcvbbabababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbaccccddddaaaadbbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqarstuvwxyzbababababababababababababababababababababababdecfgabcabababababbabababababababababababababababababababdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqraaaaabbbbccccddddaaaabbbbccccdddsabcccaaabbddeeffftuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbca33445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffccccddddddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabaaaaabbbbccccddddaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbc2cddeebcab7889900deefffbcabcabcabcabcabcabaaabbbcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqwaaaaabbbbccababa1122334455667788990011223344556g677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaertyuiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddb1122331644556677488990011223344556677889900112233443556677889900bccdddeeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabaaabbbbabcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffcccbcddddaaaabbbbccccddddaaaabbbbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaa11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabca112233445566077889900112233445566778899001122334455667aaaaaabbbbccccddddaaaabbbbaccccddddaaaabbbbccccdddddbcabcabcabcabcabcabcabcaabcabcabaaddbbccddeeaabbccddeebcab7889900bcabcabcabcabcabaaddbbccdcdeeaabbccddeebcab7889900bbddeefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdefgcdefgabcdefgagbcabcccaaaabcabcabcabbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcabbbddeefffdefgcdefgaabcdefgabcdefgcdefgabcdefgdefgcdefgabcdefgbcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667788990011223344j5566778899001122334455667abcabcabcabcabcabcabca112233445566077889900112233445566778899abcabcabcabcacbcabc8abcabcabcabcaabcccaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyaaaaabbbbccccddddaabcabcabcabcacbcabc8abcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcab3cabcabcabcabcabcabcabcabaad11223344556677889900112233445566778899001122334455667abcabccddd4daaaabbbbccccddddaaaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900dbbccddeeaabbccddeebcab7889900deefffbcabcabcabcabcabcabaaabbbzabbd112233445566077889900112233445566778899aaaddbbcdeeb001122334455667abcabcabcabcabcabcabcabcabcabcabaadbbccddeeaabbccddeebcab7889900bcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdeaaaaabbabbccaaeeccddddaaaaaaaabbbbabababababababababababadddeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aadddbbccdeeddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abc11223344556677889900112233445900deqwertyuiopasdfghjklzxcvbnmqaaaaabbbbcccacddddaaaabbbbccccddddaaaabbbbccccdddddweraaaaabbbbcabcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900d9eefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffcccddddaaaabbbbccccddddaaaabbbbccccdddddtyugiopasdfghjklzxcvbfgabcdefgcdefgabcdefgagbcabcccaaabbddeefffdefgcdefgaabcdefgabcdefgcdefgabcdefgdefgcdefgabcdefgbcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcabcabcabbcabcabcabcabcabccabcabaaddbbccddeeaabbccddeebcabababababbababababababababababababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900bababababababababababababababababababababababababababababababab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("cMcl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaaabbbbccccddddaaaabbbbcccccdddaaddbbccdddeeaabbcacddeedbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbccaaeed");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("qwertyuiopasdfghjklzxcvbnmqweraaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddtayugiopasdfghjklzxcvb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabaaaaabbbbccccdeeeddddccccbbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffacabcabcabcdede");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccababaabcabcabcabbcabcabcabcabcabccabcabaaddbbccddeeaabbccddeebcab1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddcccca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccdabcabcabcabcabcabcabcabcabcabcaabcccaaabbd112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcaaaaaabbbbccccddddaaaabbbbcccccddddbccccdddd0deefffbcabcabcabcabcabcabdddaaaabbbbccccddddbccccdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("ZXoaaaaabbbbccccddddaaaabbbbccccddddbccccddddcaaaaabbbaaaaabcdefghijklabcdefgabcdefgcdefgabcabaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababababababababababababdecfgabcdefgcdefgabcdefgrstuvwxyzabcdefghijklmnopqrsabcccaaabbddeeffftuvwxyzabbbbccccddddaaaababbbccccddddaaaabbbbccccdddddbccccddddaaaabbbbaccccddddaaaabbbbccccdddddn");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaaabababababababababaddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababbababababababababcdefgabcdefgcdefgabcdefgagbcabccccaaabbdgcdefgabcdefgab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("1122334455667788990011223344556677889900112nbGgbXWEZ2334455667abcabcabcabaaaaabbbbcc6ccddddaaaabbbbccccddddaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaabbbbccccddddcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("a112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcaaddbbccddedeaeabcabaaddbbccddeeaab7bccdaaaabbbbccccddddaaaabbb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("WaaddbbccabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabeeaabbcacddeeCfbiR");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233abcdefgabcdefgcdefgabcdefgabcdefgcdefgabcdefg4455660778899ddbbccddeeaab7bccddeebcab78899000");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdefgabcdegfgcdefga1122334abcdefgabcdefgcdefgabcababababababababababababababababababadbababababbabdecfgabcdefgcdefgabcdefg34455667abcab11223344556677889900112233445566778899001122334455667abcabcabcagbcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900cabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900defg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcaaaaaabbbbccababa1122334455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccaaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbcabcabcabc9900deefffccccddddddeepqrstuvwxyzabcdefghijklmnopqrstuvwxyzbababababababababababababaubabababababababababdecfgabcdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("112233445566077889900112233445566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab788990qwertyuiopasdfghjklzx8cvbnmqwertyuiopasdfghabcdefgabcde11223344aaddbbccddeeaabbcacaaaaaabbbbccccddddaaaabbbbcccccddcddbabcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabc9900deefffccccddddddee556677233445900fgcdefgabcdefegagbcabcccaaabbddeefffdefgcdefgabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddadddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddddbccccddddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabca11223364455667788990011223344556677889900112233445566778baaddbbccddeeaabbccddeebcab7889900deefff");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("bddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaddbbcceeaabbcacddee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccddddbddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("LJzmRLm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aabaaabbbbcccbcdbbaaaddbbccddeddeeccccddddaaaabbbbcccbcdddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("11223344556677889900112233445566778899001122334455667abcabcabca11223364455667788990011223344556677889900112abcdefgabcdefgcedefgabcdefgagbcabcccaaabbddeefffdefgcdefgabcdefg23344556677889900baaaaab112233644544556677889900191223344556677889900cabcabcabaadbbccddeeaabbccddeebcab7889900");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcccaaabbddeeffabababababbabababababababababababababababababababf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abcdeaaaaabbbbc3cababa1122334qwertyuiopasdfghjklzxcvbnmqweraaaaabbbbccccddddaaaabbbbccccddddaaaabbbbccccdddddtyugiopasdfghjklzxcvb455667788990011223344556677889900112a2334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900babababababababababababababababababababababccdeeeddddccccbbbbaaaaeeeedddccccafghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("aaaaabbbbcccacddddaaaabbbbcaabaaabbbbabcccaaabbd11223344556607788990abcccaaabbd112233445566077889900112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcabcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefff0112233aaddbbccddeeaabbccddee45566778899001122334455667abcabcabcabcabcabcajyNwzIRbcabcabcabcabaaddbbccddeeaabbccddeebcab7889900deefffcccbcddddaaaabbbbccccddddaaaabbbbccccddddccabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabaaaabbbbccccddddd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_HAPPY.is_happy("abababababbabababababbabababababaadddaaaababbbccccdddaaaaabbbbccccddddaaaabbbbccccddddaaaaabbbbccccddddddbccccddddbaabaaabbbbcccbcdbbccccddddaaaabbbbccccddddababcdefgabcdefgcdefgabcdefgagbcabccccaaabbdgcdefgabcdefgab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}

