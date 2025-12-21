package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CYCPATTERN_CHECK {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("xyzw", "xyw");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yello", "ell");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("whattup", "ptut");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("efef", "fee");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abab", "aabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("winemtt", "tinem");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hello", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "cde");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("banana", "nab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("python", "nthy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomatopoeia", "onat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racecar", "race");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississippi", "sis");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffee", "ffeco");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("programming", "ammiprogr");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anagram", "margana");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississipi", "mississipi");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("scdeis", "sis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("python", "nythy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("marganaa", "marganaa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anagram", "anagram");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nthny", "nythny");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ntnabhny", "nthny");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nthnyanagram", "nythny");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagramecar", "race");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagrameca", "race");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("banana", "nthnyanagram");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("pyammscdeisiprogrthon", "pyammiprogrthon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississipi", "mississipionomatopoeia");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("missiissippi", "sis");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("race", "race");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagramecaanagram", "anagram");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississippi", "siss");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffee", "ffolelheco");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("miffecossissipi", "miffescossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ntnabhny", "anagrammiffescossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississispi", "mississispi");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("marganaaffolelheco", "marganaaffolelheco");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississispi", "mississispii");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "cmississipionomatopoeiade");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bananamissiissippi", "nthnyanagram");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffeemississpi", "coffeemississpi");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississispi", "i");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hoeollo", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nythy", "miffecossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomatopoeia", "nythy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefdg", "abcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nthny", "xbQkq");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mnythnyisssissipi", "mississicdepi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagrameca", "racanagrameeca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racecar", "marganaamarganaaffolelheco");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("olelnab", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("marganaaffolelheico", "marganaaffolelheico");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hoeollo", "olelolelnabh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("sffecocdeis", "sis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onamississipit", "onat");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racmarganaamarganaaffolelheco", "rac");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomatopoeia", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagrameca", "racanagrameca");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("b", "nthnyanagram");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("marganaamarganaaffolelhe", "marganaamarganaaffolelheco");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("xbQkq", "xbQkq");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onmargafolelhecoat", "onomatopoeia");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("rac", "racmarganaamarganaaffolelheco");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("", "");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("pyon", "nythy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nythy", "anagrammiffescossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("scmarganadeis", "sis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ammiprogr", "marganaaffolelheco");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdde", "cde");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("scmargeanadeis", "scmarganadeis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("pyon", "nythnythnyy");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomatopoeia", "onomatopoeia");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onat", "sis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffeemississpisis", "sis");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomatopoeia", "olelhh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "cmississispide");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("siss", "iscracecardeis");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ntnabhny", "nthbananany");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("siolelhhs", "siolelhhs");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onamississipit", "onamiffescossissipit");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ffeco", "coffee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdde", "coffee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("fffeco", "coffee");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("sisss", "siiss");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anagraracescmarganadeiscarmmiffescossissipi", "anagraracecarmmiffescossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anagraracescmarganadeiscarmmiffescossisisipi", "anagraracecarmmiffescossissipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ntonamiffescossissipithbfffenany", "nthbfffenany");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("python", "nyth");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("scmarganadeis", "scmarganadeis");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oleelh", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagramecar", "");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("racanagrameeca", "mississispi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cmissipssispide", "cmississispide");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nabb", "nab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("misracanagramecarsissispi", "mississispi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("misracanagramecarsissispi", "mississiispi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffecoffeemississpisianagrams", "siss");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississipi", "mississmisracanagramecarsissispiipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("pyammscdeisiprogrthon", "mississippi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffee", "coffee");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("sisssonamississipit", "siis");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hhelnythyo", "olelh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mississipi", "mississmisracanagramecarsisssispiipi");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("coffeemississpisis", "ssmarganaaffolelhecois");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("marganaaffolelheco", "racanagrameeca");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lmno", "onom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "cdab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulation", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "othmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onom", "onom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "onom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmic", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "njkononm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "thmicgloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonom", "thmicgloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "othmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abecdefg", "abcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonom", "oonom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdb", "abcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "cdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkjl", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "lthmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulation", "thmicgloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abthmicgloacdefghijklm", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonom", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulation", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicefg", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "ationmani");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("othmicgloa", "ationmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdb", "abdcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abecdefg", "vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "onom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmanninom", "ationmanninom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lmono", "onom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdab", "cdab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstuvwx", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzderful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cda", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "ationmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abecdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowl", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "abthmicgloacdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonom", "njknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lmono", "lmono");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cda", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cddb", "abdcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulation", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "abationmaninomecdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmanninom", "aionmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanniino", "aionmannino");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thicgloanjkothmicgloanjkl", "thmicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulacdation", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "logarithmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "onnom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "ononom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaacaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkl", "njknjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkllmonom", "abcdefghijkllmonom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "gabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abationmaninomecdefg", "onom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "abcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbb", "abcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloanjkotthmicgloagabccgloanjkl", "thmicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdb", "cdb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb", "cdb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hithicgloanjkothmicgloanjkljklm", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicefg", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "powerfabthmicgloacdefghijklmul");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderful", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghlijklmnopqrstuvwx", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abwcdefghijklmnopqrstuvwxyz", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "lthabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaamic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrm", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcccccbbaothmiccgloaaacccabcdcbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdab", "cbdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulacdation", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkononm", "njkononm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abecdefg", "abccdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abwcdefghijklmnopqrstuvwxyz", "njkononm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("dcdb", "cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("dcdb", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicthmicgl", "thmicgloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "ationmtann");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninom", "onom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "cdaaionmanniino");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("adbcd", "ababthmicgloacdefghijklmcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abwcdefghijcklmnopqrsthuvwxyz", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "hijklabationmaninomecdefgm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "abc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aaionmanninotii", "aaionmanninotii");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "abdcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcd", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkjl", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "aabationmaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabc", "bbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzderful", "bbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowol", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg", "abcdltabcdefghijklmnopqrstuvwxyzhmicefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkl", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwx", "yzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkjl", "lthmicthmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonooom", "njknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "furporwl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("dabbcd", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "lmno");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cddb", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acbbbcd", "abbbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "ationmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("othmicgloa", "othmicgloa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqaionmanninorstuvwxyz", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "hijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijkl", "ononom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmic", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloanjkotthmicgloagabccgloanjkl", "thmicglbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcoanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonm", "oonm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbotchmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb", "cbdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwx", "abcudefghlijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmtann", "cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbotchmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaaccbaa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abcdhijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "abcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "ationmtann");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "ggabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowl", "abationmaninomecdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulation", "ationman");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "abcd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkl", "hijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmannino", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqaionmanninorstuvwxyz", "njadbcdknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncbbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg", "abcdltabcdefghijklmnopqrstuvwxyzhmicgabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipualation", "ationman");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmaninom", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipualation", "yzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcbd", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdab", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("antionmani", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "njknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcadefghijklm", "cdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmanninom", "ationnninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicglocaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "gabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkmanipulation", "gabcvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "ationmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njadbcdknjk", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkllmonom", "abcdefghijkll");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmannino", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abc", "abc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationnninom", "abthmicgloacdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ababthmicgloacdefghijklmcd", "abcdltabpcdefghijklmnopqrstuvwxyzhmicefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "aabationmvnzrhmweyyvvucserwzggunqinzqkihnbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "njkononm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("adbcd", "abcdefghijlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicglothmicgloabaothmaicgloaaaccccbbaaabcderful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerfabthmicgloacdefghijklmul", "vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaanmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "thicgloanjkothmicgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thimicgloa", "othmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcadefghijklm", "dcdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aaionmanninotii", "cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationnninom", "vnzrhmweyyvvucserwzggaionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmunqinzqkihncxxfchabcdaefghijklmuxjvlquvdnxliraabcdinugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbblaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipation", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "njknjabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaakl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulacdation", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulation", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicmgloa", "abthmicgloacdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ononom", "ononom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "abbcbd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicdac", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmigcgloa", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpornjknjkwl", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefcdaaionmanniinoghijklm", "abcdefcdaaionmanniinoghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ithmicgloanjkotcbdabmicgloagabccgloanjkl", "thmicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopkqrstuvwxyz", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abwcdefghijcklmnopqrsthuvwxyz", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdcabwcdefghijcklmnopqrsthuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefhijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "hijklabationmaninnomecdefgm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklabationmaninomecdefgm", "abcdefghijlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghiklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcadefghijklm", "hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "aabationmvnzrhmweyyvvucserwzggunqinzqkihnbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdceffg", "ggabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninom", "aihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznronmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulacdation", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbdb", "cbbbacccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijkl", "njkononm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmtann", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaacabcdefghijkllmonomaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abkwcdefghijcklmnopqrsthuvwxyz", "abwcdefghijcklmnopqrsthuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccationnninombothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thl", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "njknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninom", "abcdefghijlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbdab", "cbdab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ltbbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabchmic", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aaionmanni", "aaionaionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmmanninotii");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ccbbbacccbbaothmaicgloaaaccccbbaaabcdbda", "abcdefghijklmnopkqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlthlm", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbdab", "cdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmiacgloa", "abthmicgloacdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "yzabcdefghijklmnopqrstuvwbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabcx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaamic", "lthabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaamic");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqnkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqnkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationnninom", "thmigcgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abecdbefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggthmicgloagabcunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abecdbefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "lmono");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "thmicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "fpurpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njabcdefghijklmnopkqrstuvwxyzknjkl", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abijlm", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njadbcdknjk", "abcdefghlijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "lthmabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaaic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipualation", "thmicmgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwx", "acbbbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom", "ationman");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninomationmtann", "cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbotchmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hmicgloa", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmi", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicglbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcoanjkotthmicgloagabccgloanjkl", "cbbbacccbbaothmaicgloaaacccdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abdcbd", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lomno", "lomno");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aioonmannino", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicmmgloa", "thmicmgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkabcdefghijkllmdonom", "abcdefghijkllmonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom", "atiodabbcdnman");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("llthmicdac", "lthmicdac");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thimicgyzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwxloa", "thimicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "cdb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulation", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlltbbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihnrcxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabchmicirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdltabcdefghijklmnopqrstuvwxyzhmicefg", "lmono");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccatiodabbcdnmanbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg", "abcdltabcdefghijklmnopqrstuvwxyzhmicefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb", "cbbbacccbbaothmaicgloaaacccdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njnknjkononmnjk", "njnknjk");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmiacgloa", "aationmaninomcbbbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationnninom", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("llthmicdaationmtannc", "llthmicdac");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbbaaaccccccbbzderfulbaionmanninombaaabc", "bbbaaaaccbbaaaccccabbaaaccccccbbzderfulbaionmanninombaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njadbcdknjk", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaqbcdefghiklm", "vnzrhmwehweyyrnilrxfziojjsvvucserwzaaionmanninotiiggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghiklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("opowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzderfuloonom", "ooonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "aabationmvnzrhmweyyvvucserwzggunqinzqkihnbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccxxfchhuxjvlquvdnxlhirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbdab", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwxcbdab", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aationmaninomcbbbcdabcdefghijklmnopqrstuvwxyz", "njknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "powerful");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "ooonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("othmicabcdefghijklmloa", "othmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("antionmani", "aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("adbcd", "lthmabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaaic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbbacccbbathmaicgloaaaccccbbaaabcdb", "abbcbd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaionnjknjkmanipulationbaaabc", "ationmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaafurpornjknjkwlcccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmcdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "abcdefghijklmcdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdltabcdefghijklmnopqrstuvwxyzhmicgabcfg", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconom", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijkjlabationmaninomecdefgm", "lthabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaamic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "llmno");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbdb", "cdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "lththmicmmgloaic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmcdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "gabrcvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdc", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccatiodabbcdnmanbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "ccdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cddab", "cddab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbotchmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcdb", "abcdefghijklmnonjknjkabcdefghijkllmdonompqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicglocaaaccccbbaaabc", "aionomanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicthmicgl", "nmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abdcaionomanninm", "abdcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaanmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbcbbbacccbbathmaicgloaaaccccbbaaabcdbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncbbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "ooonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbblaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "abcdefghijkll");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abkwcdefghijabcdcklmnopqrsthuvwxyz", "adbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("alam", "abdcbd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nl", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopkqrstuvwxyz", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcd", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpipulacdation", "acbbbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "gabwcdefghijcklmnopqrsthuvwzabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ooonomonom", "onom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijklm", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthcmicefg", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "abcd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlthlm", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccabcdlthmicefgbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccboththimicgyzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwxloac");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaionmanninomationmtannaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcvnzrhmwehweyyrnilrxfziojjsvvucserhwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "gabcvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghiklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmi", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccatiodabbcdnmanbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpornjknjkwl", "cbbbacccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmigcggloa", "thmigcgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg", "abwcdefghijcklmnopqrsthuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ativnzrhmweyyvvucserwzggaionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmunqinzqkihncxxfchabcdaefghijklmuxjvlquvdnxliraabcdinugnaolmshzdonnninom", "vnzrhmweyyvvinugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdcabwcdefghijcklmnopqrsthuvwxyz", "abcdefghijklmcdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "thmiabcdltabpcdefghijklmnopqrstuvwxyzhmicefgcgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmic", "bbbaaaaccbbaaaccccabbaaacccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcbad", "abbcbd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hijkjlabationmaninomecdefgm", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccabcdlthmicefgbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaanmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaabwcdefghijcklmnopqrsthuvwxyzcbbaaacaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaabwcdefghijcklmnopqrsthuvwxyzcbbaaacaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpornjknjkwl", "njkononm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnonjknjkabcdefghijkllmdonompqrstuvwxyz", "abcdefghijklmnonjknjkabcdefghijkllmdonompqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonooom", "oonooom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstuvwbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabcx", "yzabcdefghijklmnopqrstuvwbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabcx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraixnugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkl", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("antiongabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdcmani", "aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkjl", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpvnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdipulacdation", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furbbbaaaaccbbaaaccccabbaaaccccccbbzderfulbaionmanninombaaabcpornjknjkwl", "cbbbacccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicvnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmtann", "ononooom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwxcbdab", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccabcdlthmicefgbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabc", "abcdefghijlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopkqrstuvwxyz", "abcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzderful", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzderful");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("frurpowol", "frurpowol");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdab", "cdabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmanni", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("dcdb", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hmicgloa", "thmicgabcdefgoa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdlthmicebbbaaaaccbbthmicgabcdefgoaaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfg", "bbbaaaaccbbaaaccccabbaaacccccbbcbbbacccbbathmaicgloaaaccccbbaaabcdbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdab", "cdab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcadefghijklm", "cbbbacccbbaothmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloanjkotthmicgloagabccgloanjkl", "thmicgloanjkotthmicgloagabccgloabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabkwcdefghijcklmnopqrsthuvwxyzabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaaccccacbbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("l", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloanjkotthmicgloagabccgloanjkl", "thmlicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaqbcdefghiklmhijklm", "vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaqbcdefghiklmhijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkononm", "nmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abkwpowerfabthmdicgloacdefghijklmulcdefghijcklmnopqrsthuvwxyz", "aabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlm", "ltbbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabchmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicthmicgl", "lththmicmmgloaic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "njknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manilpulation", "oonom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("maanipulation", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpornjknjkwl", "cbbbacccbbaologarithmicthmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aioonmanninom", "obbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaacaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcnom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthbbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmicthmicgl", "njknjkjl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "cdaaiino");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ggabc", "abcdhijahbbcbadklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdrstuvwx", "yzabcdrstuvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabecdefg", "abccdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ooonomonomabijlm", "thmicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("omanipation", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweeyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlthlm", "ationmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onnom", "lthmabababababababababababbbbaaaaccbbaaaccccabbaaacccccaabcdefghijklmnopqrstuvwxyzbbaaaaccccbbaaaaccccbbaaaccccbbaaic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraixnugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraixnugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("on", "onnom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjgnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "abecdbefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmigcggloa", "bbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihncbbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmcdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbacbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "lthmicvnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aioonmanninoaabationmvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninomm", "aioonmanninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaabcacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "thmicgloanjkotthmicgloagabccgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderful", "abbcbd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbcbbbacccbbathmaicgloaaaccccbbaaabcdbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaacccacbbaaabc", "nmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("llthmicdaationmtaonnc", "hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzgguanqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmd", "vnzrhmweyyvvucserwzgguanqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmanninomanpipulationm", "ationmanninom");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmicvnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd", "lthmicvnzrhmweyyvvucserwzggunqinzqkihncxxfchabcdefghijklmuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aationmaninomcbbbcd", "vnzrhmweyyvvucserwzgguanqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaabcdefghijklmnopkqrstuvwxyz", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaabcdefghijklmnopkqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwxcbdab", "abcdefghijklmnopqaionmanninorstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijlthlm", "tationmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcnjadbcdknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbaacaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("othmicabcdefghijklmloa", "thimicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "njknjabcdhijklmkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaathmigcggloaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "abcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdhijahnjknjkbbcbadklm", "abcdhijahbbcbadklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicglothmicgloabaothmaicgloaaaccccbbaaabcderful", "abcdfrurpowcdabbol");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmi", "thmabcdefghijklmnonjknjkabbbbaacaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccdefghijkllmdonompqrstuvwxyzicgl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipuabcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainugnaolmshzderfulbaionmanninombaaabcfglation", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlltbbbaaaaccbbaaaccccavnzrhmweyyvvucserwzggunqinzqkihnrcxxfchhuxjvlquvdnxlirainugnaolmshzdbbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabchmicirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abwcdefghijcklmnopqrsthuvwxyz", "aationmaninomcbbbcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwxcdaaionmanniinocbdab", "abcdefghijklmnopqaionmanninorstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgl", "thmicgl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("althmabababababababababababbbbaaaaccbbaaaccccabbaaacccccabbaaaaccccbbaaaaccccbbaaaccccbbaaic", "cdaaionmanniino");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lmno", "aaionmanninotii");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abdcaionomanninm", "othmicabcdefghijklmloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcudefghlijklmnopqrstuvwx", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccboththimicgyzabcdefghijklmnoabthmicgloacdefghihweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrmqrstuvwxloac");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ccdb", "ccdb");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aioonmannino", "manipoulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmggabcicmmgloa", "thmicmgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationnninnom", "vnzrhmweyyvvucserwzggaionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmunqinzqkihncxxfchabcdaefghijklmuxjvlquvdnxliraabcdinugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaanmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaanmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknjkjl", "abcdlthmicebbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaacabcdcccbbaaaccccbbaaaccccbbaaaccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgoloaaaccccbbaaabcionmanninombaaabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ggabc", "abcdhijahbbcbithmicgloanjkotcbdabmicgloagacbccgloanjkladklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaagunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "lmabcdefghijlmno");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "aabationmaninomecdefgtionationmanninomanpipulationmninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopkqrstuvwxyz", "llthmicdaationmtannc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstuvwx", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdfrurpowcdaabbol", "abcdfrabdcdurpowcdaabbol");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipatiabccbadklmon", "manipatiabcdhijahnjknjkbbcbadklmon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaabationmvnzrhmweyyvvucserwzggunqinzqkihnbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninomaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweeyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdllthmicdaationmtaonncnaolmshzd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcbad", "abationnninnomad");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninomationn", "aionmanninomationmtann");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaabcacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "thmicgloanjkotthmicgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmanninocdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaabationmvnzrhmweyyvvucserwzggunqinzqkihnbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccxxfchhuxjvlquvdnxlirainugnaolmshzdaninomecdefgtionmaninomaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcm", "faabationmaninomecdefgtionationmanninomanpipulationmninomwl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abdcd", "abcd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaacmanpipulationloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "cbbbacccbbaologarithmicthmaicgloaaaccccbbaaabcdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("atnionmaninom", "ationmaninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjgnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklmcccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjgnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklmcccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbd", "cdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "gabcvnzllthmicdacrhmwehweyyrnilrxfziojjsvvucserhwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aionmananinocdab", "cdab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloagabc", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzaaionmanninotiiggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghiklm", "njknjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbcaaaaccbbaaaccccabbaaacccccbbalthmicthmicglaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "bbbcaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "lomno");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxluirainumanipulationzderful", "powvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmainjknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmcgloaaaccccbbaaabcderful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthmic", "lthaionmanninommic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaagunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirjainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("atioanmanninomanpipulationm", "abcdcefffg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbblaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabc", "bbbaaaacbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbaionmanninombaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccnjknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbfurbbbaaaaccbbaaaccccabbaaaccccccbbzderfulbaionmanninombaaabcpornjknjkwlbaothmicgloaaaccccbbaaabcmccbbaaaccccbbaaacccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccnjknjkaionmanninocdbbbbaaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmccbbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconom", "thmigcgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmigcgloa", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "ccdb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcd", "vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraixnugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowowl", "furpowowl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvtwxyz", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("dcdb", "gabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraiznugnaolmshzdc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cbbdab", "obbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaacaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcnom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaacmanpipulationloaaaccccbbaaabc", "aabationmaninomecdefgtionationmanninomanpipulationmninom");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaacccacbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccabbaaaccccbbaaacccacbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdcddbnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklm", "thmicgloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("lthbbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmicthmicgl", "lthbbbaaaaccbbaaaccccabbaaaccccbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmicthmicgl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("atiaonmani", "ationbbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccccbbaaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomm", "onombvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjgnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdabcdefghijklmcccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccccbbaaaaccccbbanaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmmanpipulationicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquhvdnxlirabbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaabcacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcinugnaolmshzd", "thmicgloanjkotthmicgloanjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "ationbbbaaaaionmanninomaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abbcd", "njadbcdknjk");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "cbbdab");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abecdefmag", "abthicgloanjkothmicgloanjklccdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "hijklagm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccpowvnzrhmweyyvvucserwzggunqinzqkabcdefghijklmnopqrstuvwxyzihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccpowvnzrhmweyyvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmaicgloaaaccccbbaaabcderfulbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc", "cdbbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abccd", "abccd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manpvnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdirpulacdation", "manpvnzrhmwehweyyrnilrxfziojjsvvuvcserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdirpulacdation");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "agabvnzrhmwehweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznryyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdconomtionma");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmimanpipulacdationcmmgloa", "thmicmgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmannbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaccccbbaaabcnjadbcdknjkinom", "nmtanbbbaaaaccbbaaaccccabbaaacccccbbaaabbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaabcaccccbbaaaaccccbothmicgloabaaaccccbbaaaccccbbaothmicgloaaaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("", "abc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abc", "");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hello", "loh");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ab", "ba");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcde", "eabcd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aaaaa", "a");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "dabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "dcba");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcabc", "cabcab");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "njjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkl", "njkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powferful", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powferful", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdefgjklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onom", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjklml", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefgjklm", "njjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicghloa", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmvnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzdicghloa", "thmicghloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdeefg", "abcdeefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "yzabcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstuvwx", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "logarithmic");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furabcdefghijklmpowl", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkl", "nljkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmani", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmic", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicghloagabc", "gabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljklefg", "abcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aebcdefg", "yzabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njlogiarithmickl", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furabcdefghijklmpowl", "abcdefghijklmnopqrstuvwxyz");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "yzabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abicdefghijklm", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation", "manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipultationc", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdefghijkanmanilm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanilmnopulationc", "gabmanipultationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("knjkabcdefgjkclml", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljkleationmanifg", "abcdnljkleationmanifg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerful", "abcdeffghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefm", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmani", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcd", "thmicghloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ul", "ul");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "njkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulationc", "gabmanipaulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mthmicgloa", "nnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulationc", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdnljklefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nanmani", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdefm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "njkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmanai", "anmanai");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanilmnopulationc", "gabmanipultatioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdg", "abcdeefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipaulationc", "gabmanipaulationc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowl", "furpowl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefm", "mthmithmicghloagabccgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjklml", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowl", "furpownnjkll");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abklm", "abcdefgjklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbabaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefam", "abcdefam");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjkl", "atioanmaninmuli");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa", "powferful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmanai", "ul");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcanmanidefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkanmanilm", "abcdefghijkanmanilm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcabcdefmlfg", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipaulationc", "abcdnljklefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaacklfg", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcadefgjklml", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powferful", "powferful");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nj", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdeefg", "abcdthmicghloagabceefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abcdefghhijkanmanilm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcfdefg", "yzabcdefcg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghhijkanmanilm", "anmanai");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefgabklmhijklm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "gabmanipultatioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmic", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nj", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaacklfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanonc", "gabmanonc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulltatioc", "gabmanipultatioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicghloagabc", "abcdnljklepowerfulfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipultatioc", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefm", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefgabklmhijklm", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "furpabcanmanidefghijklmowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijabcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "powerfunj");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklm", "abababababacccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipultationnck", "nnjgabmanipultationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrationck", "nnjgabmanipultationnck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpownnjkll", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefcg", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicghloa", "yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdab", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpowull", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmaini", "anmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefggabchijklm", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("onomnjkabcdefgjklml", "lmno");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmaini", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "gabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabcdefghijkanmanilmbcdefghijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipultatioc", "ationmanni");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanonc", "gabmanipultatioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjklml", "abcdefghijkanmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipultationnck", "nnjgabmanipultationnck");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulltatgioc", "thmicghloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcbjkl", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "thmicglofurpowulla");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logaritic", "logarithmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccmanipulationbbaaabcjklanmani", "njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnnnjgabmanipultationckjkl", "mthmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjkclml", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccmanipulationbbaaabcjklanmani", "powerfulnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ul", "uationmannil");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cgabc", "gabnbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmanic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulationc", "gabcdnljklepowerfulfgabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabc", "gabmanipultatioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccmanipulationbbaaabcjklanmani", "abklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefam", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg", "nnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdg", "abcdeeabcdfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmanni", "nbbbaaaaccbaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijgklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipultatioc", "anmanai");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdabb", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abicdefghijkmlm", "anmaini");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipultationck", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acgabacfg", "acgabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdthmicghloagabceefg", "abcdthmicghloagabceefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmic", "cgabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdabb", "abababababababaaaccccbbaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "gabmabnipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powrfunj", "powrfunj");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmayzabcdefcgii", "anmaini");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njlogiarithmickl", "yzabcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccmanipulationbbaaabcjklanmani", "njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccmanipulationbbaaabcjklanmani");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulltatgioc", "hmicghloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa", "abababababacccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "atioanmaninmuli");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmic", "abkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "thmicgloaabkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "thabcdefghhijkanmanilmmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdthmicghloagabceefg", "abcdefghijkanmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmani", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulaanmannitionc", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "njjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabc", "gabmanipultatioccgabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaacccccbbaccccbbaa", "abababababababaaacccccbbaccccbbaa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("alogiarithmic", "logiarithmic");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmani", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefa", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicghloagabc", "abcdnljklepowebrfulfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjklml", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabababababababaaaccbaationnck", "nnjgabmanipultnbbbaabaaccbaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklationnck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("", "ul");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipulthgnaolmshzhdwmnmvznrationck", "nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpownnjkll", "furpownnjkll");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghabcdefghijklmnopqrstuvwxyzijklm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjjkl", "accdabbgabacfgnjjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljklefg", "gabmanipulltatgioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdeffghijklm", "hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhmuxjvlquvdnxlirainugnaolmshzhdwmnmvznr");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "abcanmanidefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hmicghloa", "cgabcthmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkjlm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ulabcdeeabcdfg", "ul");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmana", "anmanagabmanilmnopulationci");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "ationma");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmani", "abcanmanidefghijklmpowerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkanmaniabcdefmlm", "abababababacccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("knjkaefgjkclml", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaakabcjklanmani", "abcanmanidefghijklmpowerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkfurabcdefghijklmpowllm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljkleffg", "abcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mthmithmicghloagabccgloa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("oonom", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "yzabcde");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmic", "nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznrationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefg", "acbgabcfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ul", "ull");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbnnjgabmanipultaa", "powferful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nabcdefgnjkl", "njjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("p", "powferfl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabc", "nnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefgjklm", "abcdefgjklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipultationc", "gabmanipulaticdabbonc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababaabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccabbaaaaccccbbaaccccbbaa", "abababaababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "gabcnjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjjkl", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiaritlhmic", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbcccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdeghijklm", "abcdefgjklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkmabcdefgnjkclml", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "gnabcnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbabaaaccccbbaaaccccbbaa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbabaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefam", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("l", "ull");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abklm", "gabmabnipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ul", "abababababababababababbbbaaaaccbbaaaccccabbabaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaaull");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr", "manilpulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjjkl", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmntopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbabaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdeefg", "yyzagbcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmaini", "abababababacccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("agabmanipulltatiocbcdefa", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "thmicgla");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkkl", "gabcnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation", "manipabababababbabuabababababbbbaaaaccbbaaacccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("alogiarithmic", "alogiarithmic");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithnnjgabmanipultnbbbaabaaccbaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklationnckmic", "logarithmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyycserwzggunqinzqkihnhzduvwx", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefg", "gagabmabnipulationcbc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manilpulatilon", "abcdeefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbbaaaaccccbbaaaccccbbaaabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmani", "aebcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdanljklefg", "manipabababababbabuabababababbbbaaaaccbbaaacccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccgabcthmicgloacccbcccbbaa", "gabmanipulatacgabcfgionc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powerfunj", "abcdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmntopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbabaaabcjkl", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmntopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbabaaabcjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmlmnoani", "ationmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgabmanipfurpownnjkllultationck", "nnjgabmanipultationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanonc", "abcdeeabcdlogariticfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpogabmanoncwull", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkltationnck", "nnjgabmanipultationanck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcanmanidefghijklm", "abcanmanidefghijklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gjabcnjkl", "atioanmaninmuli");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkanmanilm", "furpowull");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmanii", "anmani");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipaulationc", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logaritic", "ul");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipulatilon", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcanmanidefghijklm", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmanii", "logiarithmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabgc", "gabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aebcdefg", "yzadefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaagagabmabnipulationcbcaccccbbaaaaccccbbaaaccccbbaaulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccibbaaaccnnjklccbbaaabcjklefghiajklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkjelm", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccibbaaaccnnjklccbbaaabcjklefghiajnbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcbjklklm", "abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccibbaaaccnnjklccbbaaabcjklefghiajnbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcbjklklm");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yyzagbthmicglafg", "yzabcdeezfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yyzagbthmicglafg", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mtulabcdeeabcdfghmithmicghloagabccgloa", "mtulabcdeeabcdfghmithmicghloagabccgloa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbcbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjkclml", "uationmannil");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvpbcjkl", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulaanmannitionc", "gabmanipulataionc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnnnjgapbmanipultationckjkl", "gabcdnljklepowerfulfgabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulltatgioc", "gabmanipulltatgioc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaaccccbbbabaaaccccbbaaaccccbbaa", "abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaaccccbbbabaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "abababababababababababbbbaaaabcdefgabklmhijklmaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaacccccbbaccccbbaapowferful", "l");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkfurabcdefghijklmpowllm", "abcdecgabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabaccccbbaaaccccbbaaaccccbbaaabcjkl", "nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababaabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccabbaaaaccccbbaaccccbbaa", "abkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkanmanil", "furpowull");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefcg", "abcdefgjklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljkleffgknjkabcdefgjkclml", "abcdefg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("manipabababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaulation", "njkabcadefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabcdefghijkanmanilmbcdefghijklm", "abababaababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "anmanagabmanilmnopulationci");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefklmpowllm", "abcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mtulabcdeeabcdfghmithmicghloagabccgloalogiarithmica", "mtulabcdeeabcdfghmithmicgahmloagabccgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnljkleffgknjkabcdeafgjkclml", "abcdnljkleffgknjkabcdeafgjkclml");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabcdefghijkanmanilmbcdefghijklm", "abcdefghiljklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "anmanagabmanilmnopulationci");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefgjklm", "abcdefgjkljm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcfdefg", "abababababababaaacccccbbaccccbbaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklfg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjbkl", "atmioationmlmnoanianmaninmuli");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ngabmanonc", "gabmanonc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcdefgjklml", "wpowerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkl", "gabmanipultatioccgabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gagabmabnipulationcbc", "gagabmabnipulatiabcdoncbc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjkl", "thmicgloaabkbbbaacaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaaccccbbaccccbbaal", "abcdefghijkanmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbb", "cda");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmicacgabacfg", "nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraainugnaolmshzhdwmnmvznrationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabjkl", "njkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstuvwx", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("cdbb", "yzabcdefghijklmnopqrstuvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiarithmicagabmanipulatacgabcfgionccgabacfg", "nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraainugnaolmshzhdwmnmvznrationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaaccccbbaccccbbaal", "abcdefghijkannjjklmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mtulabcdeeabcdfghmithmicghloagabccgloa", "powerfunj");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijgklm", "uationmannil");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("mtulabcdeeabcdfghmithmicghloagabccgloalogiarithmica", "nnjgabmanipulthweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxliraainugnaolmshzhdwmnmvznrationck");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpownnjkll", "furnbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjklanmanipownnjkll");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcbdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abicdefghijkmaabcdefghijkanmanilmbcdefghijklmlm", "abicdefghijkmaabcdgabmanipultationcefghijkanmanilmbcdefghijklmlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaacccccbbaccccbbaa", "mthmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "abcdefghijkannjjklmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababababababbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbaccgabcthmicgloacccbcccbbaa", "gabmanipulatacgabcfgionc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("atioanmaninmuli", "abcdefghijkannjjklmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkaanmanilmm", "abcdefghijkanmanilmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulcdabtatiocc", "gabmanipulcdabtatiocc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjabcanmanidefghijklmlqcuvdnxlirainugnaolmshzduvwx", "yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abababababababaaaccccbbaccccbbaal", "aabcdefghijkanmanilmbcdefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("l", "manipulatilon");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcdnljklepowerfulfgabmanipulationc", "anmana");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yyzagbthmicglafg", "yyzagbthmicglafg");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("atiionmathmicgloa", "atiionma");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolknjkabcdefgjkclmld");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcpowerfulnjkldeghijklm", "abcdeghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdeeabcdlogariticfg", "om");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicgloa", "yzabcfdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nanmani", "atiaonmani");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("fuwrpowl", "furpowl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnjkl", "bgnabcnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjjkl", "acchmicghloadabbgabacfgnjjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "njkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmianipulcdabtatiocc", "gabmanipulcdabtatiocc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("aabcdefghijkanmanilmbcdefghijklm", "ul");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anmani", "anmani");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiaritlchmic", "logiaritlhmic");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nj", "nj");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmannfurpogabmantiionmaanoncwull", "ul");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnjgnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbcaaaccccbbaaaccccbbaaabcjkltationnck", "abcdefghabcdefghijklmnopqrstuvwxyzijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "powerfunbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvpbcjkll");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbcbbaaaaccabcdefghijklmnopqrstuvwtxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl", "nbbcbbaaaaccabcdefghijklmnopqrstuvwtxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("ationmafurpogabmanoncwull", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhmuxjvlquvdnxlirainugnaolmshzhdwmnmvznr", "njkabcdefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcadefgjklml", "njkabcadefgjklml");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcabcdefghijklmnopqrstuvwxyzdnljklepowerfulfg", "abcdnljklepowerfulfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghiljklm", "thmicgla");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdenljkyzabcdeefglfg", "yzabcdyzabcdefghijklmnopqrstuvwxenljklfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvqnzrhmweyyrnilrxfziojjsvvucserabcbdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcbdefgjklmwzggunqinzqkihncxxfchhuxjvlqatiaonmaniuvdnxlirainugnaolmshzduvwx");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcdnljklepowerfulfgabyzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserabcbdefgjklmwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwxationc", "gabmanipulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpogabmanoncwull", "yzabcfdefg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmic", "manipulation");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("hweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzhdwmnmvznr", "knjkabcdefgjkclml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaaccaccccbbaaabc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("vnzrhmweyyrnilrxfziojjsvvucserwzggunqinfurpowlzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzd", "abcdeeabcdfg");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logarithmicabcdefggabchijklm", "logarithmic");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcpowerfulnjkldeghijklm", "gabmanipaulationc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjhjkl", "acchmicghloadabbgabacfgnjjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijkl", "abcdefghijkl");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvpbcjkl", "gabmanipulltatgioc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaacvnzrhmweyyrnilraccccbbcaaaccccbbaaaccccbbaaabcjkl", "abcdefam");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abicdefghijkmaabcdefghijkanmanilmbcdefjghijklmlm", "abicdefghijkmaabcdgabmanipultationcefghijkanmanilmbcdefghijklmlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaacvnzrhmweyyrnilraccccbbcaaaccccbbaaaccccbbaaabcjkl", "gabmianipulcdabtatiocc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccccmanipulationbbaaabcjklanmani", "powerfulnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipulaanmannitionc", "ggabmanipulataionc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("powlerfulnjkl", "powerfuulnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gjabcnjkl", "nnnnjgapbmanipultationckjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdefghijklmnopqrstuvwxyz", "nnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcanmeanidefghijklm", "abcanmanidefghijklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("logiaritahmic", "abkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gagabmabnipulatiabcdoncbc", "abcdefghabcdefghijklmnopqrstuvwxyzijklabcanmanidefghijklmm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbbaaaccccbbaaaccccbbaaabclm", "njkabcadefgjklml");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabmanipaulationc", "bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccnnjklccbbaaabcjklefghijklm", "abcdnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccibbaaaccnnjklccbbaaabcjklefghnbbcbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkliajklm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thmicglanmanaoa", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nbbbaaaaccbbaaaccccabaccccbbaaaccccbbaaaccccbbaaabcjkl", "powerful");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yzabcdefghijklmnopqrstvnzrhmweyyrnilrxfziojjsvvucserwzggunqinzqkihncxxfchhuxjvlquvdnxlirainugnaolmshzduvwx", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njknbbbaaaaccbbaaaccccabbaaaccccccbbaaaacccncbbaaaccccbbaaaccccccmanipulationbbaaabcjklanmani", "abkbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaacccaaccccbbaaabclm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("bbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaaabc", "thmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("njkabcadefgjklml", "abicdefghijkmaabcdefghijkanmanilmbcdefghijklmlm");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anjknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbaaaaccccbbaaaccccbbaaaccccbbaaaccccbbaakabcjklanmanibcdefghijklm", "thmicghloagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("furpownnjkll", "atmioationmlmnoanianmaninmuli");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("nnnnjgabmanipultationckabcdnljkleffgknjkabcdeafgjkclmljkl", "mthmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("thabcdefghhijkanmanilmmicgonomloa", "thabcdefghhijkanmanilmmicgloa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("gabcnnbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmnopqrstuvwxyzccbbaaaccccbbaaaccccbbaaaccccbbaaabcabcdefmlfgjkl", "gabcnjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("acchmicghloadabbgabacfgnjjkl", "nbbbaaaaccbbaaaccccabbaaacccccbbaaaaccccbbaaaaccabcdefghijklmntopqrstuvwxyzccbbbaaaccccbbaaaccccbbaaaccnnjklccbabaaabcjkl");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("anjknbbbaaaaccbbagabmanipultatiocaaccccabbaaaccccccbbacbbaaaccccbbaakabcjklanmanibcdefghijklm", "thmicghlcgabcthmicgloaoagabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}

