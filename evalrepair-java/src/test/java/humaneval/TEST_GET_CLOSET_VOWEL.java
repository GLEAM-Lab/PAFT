package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_GET_CLOSET_VOWEL {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yogurt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("full");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("easy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("eAsy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ali");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bad");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("most");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ab");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ba");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("quick");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("anime");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Asia");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Above");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hello");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("cup");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("album");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("mute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("nylon");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jelly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hi");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("try");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("himute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jejellylly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hilljejellylly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("alb");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hilljhejellylly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttrty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("helo");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lalb");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("aabuum");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehilo");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttrjejellyllyt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kilbike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bkike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ccup");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kiill");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("trjejellyllyt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("himuhilljejellyllyte");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhimute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehilohi");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knylonill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bik");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhhimutehimute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhimutehilljhejellyllbiky");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhhimutehimuute");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("halbilljhejellylly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knyloknill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knyonnill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("al");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhimue");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knylonbikill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehello");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knyloknnill");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehhhimutehimutehilohi");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hillhhhimutehimuute");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttrtybike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhhimutehimuuehehilote");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kilil");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hii");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hiylljejellly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hialllhi");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knylonbik");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehhimutehilljhejellyllbiky");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kiliiil");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ljelly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("halbilljhejellyy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("thilljejellylly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knyloll");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("nyhialllhilon");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kiliil");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hillll");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("muthiie");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("heolo");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lnyhialllhilon");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hialllihhi");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knkilbikieylonbikehehi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("eheho");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hiill");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lal");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("mte");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhiue");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hialllhhimutehi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hiilhalbilljhejellyllyl");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("h");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hlialllihhehehoi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("khhimueilbhiilhalbilljhejellyllylike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehjellyo");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lehhello");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ljellly");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jlemuthiielly");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kiihlialllihhehehoill");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lly");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jelely");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jejhhimute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hikillll");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("trthialllihhiy");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knyonnillhhimue");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehehhhimutehimutehilkilbikeohi");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("jlemutly");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("knylonbikilll");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hlikilhialllhhimutehilll");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("lalbkike");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhimutehilljhejellyllbikytmute");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhimutbkikee");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hillhhhimhimuute");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ehlo");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hhhimutehimuuehehilalbkikelote");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxnne");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyiuy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("UVWXYZuvwxya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrtt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdabbkrtfdoiyyiuyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQWERTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtiyyiuy");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkyrtfdoiyyiuy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxnzbcdabbkrtfdoiyyiuyfghijklmnoprszouzzzane");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertyxyzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Mss");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMss");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMbbkrtiyyiuyss");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnoprszuouzzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghoqwerttyjxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzzqaiozzxyzabcDEFghizbcdafghikooxnnejklmnoprszuouzzzazbcdafghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkllmnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghioprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Msss");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEDFghDi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdefabcdzzzqaiozzczbcdafghijklmnoprszuouzzzazeffeedcbafeedcba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkllmnoaprszluouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("iqwertyxyzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdabbkrtfdoiyyiuyfghijklmnoprszouzozza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zjklmnoprstuvEQWERTYqwertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQWERTYTqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abccdeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("s");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeeba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyhzabcDEDFghDi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttrtt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zxyzabcDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnobprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzrtttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeeMssdcbatttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovesmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnoprszuonuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxuxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzrtysMss");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkyyrtfdoiyyiuyy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTYqwerEty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertyxyzabDcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwertyty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzztrtttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("txyzabcDEDFghittuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwertywxeyzzouzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwertzzzszuouzzzazywxeyzzouzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDhEiFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbsMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzae");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzrzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzztrttttxyzabczbsMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwlertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafgghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghijklmnoprtuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeeMxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghissdcbatttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdefabcdzzzqaiozzczzbcdafghijklmnoprszuouzzzazeffeedcbafeedcba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdafghijklqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertyxyzabDcrDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijaklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zxyzabcDEDFghxyzabcDhEiFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzxrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQzbcdabbkrtfdoiyyiuyfghijklmnoprszouzozzarqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabibkrtfdoiyyizbcdafghijklqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzrzzqaiozzzbcdafghijklmnoprszuouzfxyzabcDEFghizzazbbkrtiyyiuykooxnneefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTYqwzzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghioprszuouzzzazerEty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqWwlertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzrtttabcdeffeezbcdabbkrtfdoiyyiuyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnopsrszutttxuxzrtiyouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMs");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdhafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxnzbcdabbkrtfdoiyyzbcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzane");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzahbcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyizzzqaiozzzuysscdafghijklminoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdefftttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqweedcbaerty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMbbkrtiyyzbcdafghijklmnoprstuvwwabcdzrzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyiuyss");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zjklmnoprstuvEQWERTYqwertywxpeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MszxyzabcDEDFghis");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbbkrtfdoiyyiuybcdafghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkbrtiyyiuy");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zfghijkzlmnoprszuonuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnotttxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQzbcdabbkyrtfdoiyyiuyfghijklmnoprszohuzozzarqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFghirzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zfbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zjklmnoprstuvEQWERTYqwertywxezza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttxyzabczbcdafghirrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMabcdzzQWERTYqwertyzqaiozzzbcdafghijklmzuouzfzzazeffeedcbas");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszouzzzacdmafghijklumnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsrtysMss");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Qnohs");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxziqwertyxyzabcDEFghirtysMss");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeeMssdecbatttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwert");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvzbcdafghizbcdabibkrtfdoiyyizbcdafghijklqwertyydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zabzbcdafghijklmnoprszouzzzacdmafghaijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzouzozzarqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzrxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttxyzabczbcdafghirrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghiy");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxzrtty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdzbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzztrttttxyzabczbsMbbkrtiyyiuysscdafghijklmnoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxzrttuy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjqwerttyxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijtttxuxzrtysMssklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qweertty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafaeyzzouzzzaqwerrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffeeMssdecbatttxuxzrtyghi");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyzzzszuouzzzazfeedcba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstusMsvwxUVWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTYqwerEtyy");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghiqjklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghoqwerttyjxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazeffeedcbaRTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qweerty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("stttxuxzztrttttxyzabczbsMbbkrtiyyiuysscdafghijklmnoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbgzxyzabcDEDFghihojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoypvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abccdeffeedczbcdafghijklmnoprstuvQWERTYqwertywxeyzzouzzzzaba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxzzbcdafghijkzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzzzqaiozzzbcdafghijklmnoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuuxzrtty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("txyzahbcDEDFghittuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklmsMbbkrtiyyzbcdafghijklmnoprstuvwwabcdzrzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyiuyssnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvtttxuxzrxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttxyzabczbcdafghirrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghiynpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdaabbkrtfdoiyyiuyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnotttxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzrtttabcdeffeezblmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVttctuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuoubbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnezzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiitttxuxzzrttttiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghiQWERTYqwerEtyyghijklmnoprszuouzzzzazklmnotabdcdeffeedcbattxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghtttxuxzzzrtttijklmnoprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZukvzbcdafghijklmnoprstuvwxeyzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafgghijklmnoprstuvwwxyaeyzzouzzzakqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("sMsss");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulopglbghojxxwnovsmrqajxWXYZurty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfwghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoprstuvwwxyaeyzzouzzzaqkooxnzbcdabbkrtfdoiyyzbcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzanea");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abzddcdefabcdzzzqaiozzczbcdafghijklmnoprszuouzzzazeffeedcbafeedcba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnoprszuouzzzzauz");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("r");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdhafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyiuysscdafghijklmnoprxyhzabcDEDFghDizoukzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghilmnoprstuvwxUVWXYZukvzbcdafzghijklmnoprstuvwxeyzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qqwert");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoprstuvwwxyaeyzzouzzzaqkozbcdafghijklmnoprstuvwxUVWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoxnzbcdabbkrtfdoiyyzbcdafghizbcdafghijklmnoprstuvQWERTYqwertywxeyzzouzzzzajklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzanea");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknxsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkemjxbopglbghojxxwnovsmrqajxsjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvsajxzabcDEFghioprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERzzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvsajxzabcDEFghioprszuouzzzazTYqwlertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafgzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwertytyebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovesmrqajxiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretzbcdafghijklmnoprstuvQWERTYqwertzzzszuouzzzazywxeyzzouzzzzaepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiuqqwertrovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnopurstuvwwxyaeyzzouzzzaqwertyfeedcbabdcdeffeeMxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghissdcbatttxuxzrtya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstttxuxzzzrtttuvwwxyaeyzzouzzzaqwerzbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwertyty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffeedcb");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhawpqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvidzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfwghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaakooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaeaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkbrtttxuxzrtyy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqzaiozzz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghihjklmnoprszuouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhtttuuxzrttyvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaxyhzabcDEDFghDighijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("txyzabcDEDFghittxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmreqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfwghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaq");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiibbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnobprsabcdzrzzqaiozzzbcdafghijklmnoprszuouzfxyzabcDEFghizzazbbkrtiyyiuykooxnneefzbcdafghijklmnoprstuvwwxyaeyzzouzzzabazuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qtweertty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouay");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("o");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzaxzzbcdafghijkzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwaerty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvzbcbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazeffexytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghoqwerttyjxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffeedba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkemjxbopglbghojxxwnovsmrqajxsdknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretzbcdafghijklmnoprstuvQWERTYqwertzzzszuouzzzazywxeyzzouzzzzaepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafaetttxuxzzrtttabcdeffeezbcdabbkrtfdoiyyiuyfghijklmnoprszouzzzayzzouzzzaqwerrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghieoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkybbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnefdoiyyiuyy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQzWERTYTqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzszuouzzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzrtttabcdeffzbcdafghijklmnoprstuvQWERTYqWwlertywxeyzzouzzzamnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafacbcdeffeedcbaghijklmnoypvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkllmnoxyzabczbcdafghijklmnoprtuvwxeyzzouzzzaDEDFghiprszuouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedzjklmnoprstuvEQWERTYqwertywxpeyzzouzzzacba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffeedcbabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoprstuvwwxyaeyzzouzzzaqkooxnzbcdabbkrtfdoiyyzbcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzaneaa");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzszuozuzzuzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffeedbttttxuxzzrttta");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaabcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedzjklmnoprstuvEQWERTYqwertywxpeyzzouzzzacbazabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qweezbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabczbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzaeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zjklmnoprstuvEQWERTYqwertywxeyzzozbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwertyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ahijklmnoprszuouzzzazeffeedcbafeedcba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriuilawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxzaqwertyfghxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghiijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepwertywxpeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEDFFghDi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzDabcDEDF");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxzzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazbopglbgzxyzabcDEDFghihojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifptttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzzzqaiozzzbcdafghijklmnoprszuouzzzazaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttttExuxzzzrttQzbcdabbkrtfdoiyyiuyfghijklmnoprszouzozzarqajxWERTYqwzrttQWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugQWEabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazeffeedcbaRTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghtttxuxzzzrtttijklmnoprszuoubbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiibbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyzbcydafabcdeffeedcbaghijklmnoypvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnezzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertycnvtvlztxxmgwabcdzzzqaiozzzbczzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghieoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeabdcdeffeeMxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghissdcbatttxuxzrtyeba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuTvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqzbcdafghilmnoprstuvwxUVWXYZukvzbcdafzghijklmnoprstuvwxeyzouzzzaaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwaerty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaxyhzabcDEDFghDighijklmnoyprstuvwwxyaeyzzobbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneuzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvtttxuxzrtxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttxyzabczbcdafghirrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghiynpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffebbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhawpqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneeMssdecbatttxuxzrtyghi");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknxsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvidzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfwghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdpeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkemjxbopglbghojxxwnovsmrqajxslmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdxyzabcDEDFghDiafghijklm");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemzjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghiQWERTYqwerEtyyghijklmnoprszuouzzzzazklmnotabdcdeffeedcbattxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnopzbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnotttxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzarstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("hijklmnoprszuouzzzzazklmnotttxuxzzzrttQWERTYqwerzbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwertytyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkirtiyyiuy");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("atttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxbfcdeffeedba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("stttxuxzztrttttxyzabczbsMbbkrtoiyyiuysscdafghijklmnoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghiijklmnoprtuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxzzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazbopglbgzxyzabcDEDFghihojxxwnovsmxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffebbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhawpqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneeMssdecbatttxuxzrtyghirqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zobcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnopzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzarszbcdafghijklmnoprstuvwxUVWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzatuvQWERTYqwlertywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszaouzzzacdmafghijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstuvwwsxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfgdoiyyizbcdafghijklqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffeeMssdecbatttxuxzrtyghiertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqzbcdafghilmnoprstuvwxUVWXYZukvzbcdafzghijklmnoprstuvwxeyzouzzzaaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwaertytttxuxzzrtttabcdeffeezblmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwertyzzouzzzaqwertyfeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvjydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzlzhkemjxbopglbghojxxwnovsmrqajxzzzqaiozzzbcdafghijklmnoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("txyzabcDEDFgDhittuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafgtxyzabcDEDFghittuxzrtyhijklmnoprszouzzzacdmafghijklumnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwertytymnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("IA");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdeffeeMxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafgghijklmnoprstuvwwxyaeyzzouzzzakqwertyfeedcbaurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghissdcbatttxuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEqRTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzszuouzzbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvidzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfwghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdpeffeedcbazzaqwertyzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofdzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepwertywxQnohszzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MszxyzabcDEDFgis");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinpzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprszbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwertyaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxuxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxrvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcMsssdatttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxzzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazbopglbgzxyzabcDEDFghihojxxwnovsmrqajxz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzbcdafghijklmnoprszuouzzzahirtysMss");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeeadcbaghijklmnoyprstuvwwxyaeyzzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzzqaiEFghizbcdafghikooxnnejklmnoprszuouzzzazbcdafghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnoprszqweertyuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghzxyzabcDEDFghiijklmnoprstuvwxUVytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxnzbcdabbkrtfdoiyyzbrcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzane");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknxsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhe");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdatxyzahbcDEDFghittuxzrtyfghijklmnoprszuouzzzazeffeedzjklmnoprstuvEQWERTYqwertywxpeyzzouzzzacba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsMs");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouztttuuxzrttyzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzaxzzbcdafghijkzlzbczbcdafghijkzlmnoprszuouzzzaydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffezzzqaiozzzbcdafghijklmnoprszqweertyuouzzzazedbttttxuxzzrttta");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghozjxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzztrttttxyzabczbsMbbkrtiyyiuysscdafghijkclmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttrtt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbarty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkuriifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdatxyzaertywxpeyzzouzzzacba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxzzbcdafghijkzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnprszuouzzzarttuy");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtiytttrttyiruykooxnne");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzdafghijklmnoprszqweertyuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("e");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghijklmnoprszuouzzzzazklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertylcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEqRTYqwertttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxuxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqwty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYkooxnzbcdabbkrtfdoiyyzbrcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzanenoprstuvwxeyzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffeeMssdecbatttxuxzrtyghiertyfghijklmnoprszuouzzzaziiiiiinprlxfqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("LNFZmHOo");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafacbcdeffeedcbaghijklmnoypvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTkYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvQWERTYqwertzzzszzuzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaouzzzazywxeyzzouzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuozbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzkooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaea");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiabfcdeffeedcbiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Mssss");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmacnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbgwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafacbcdetttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxffeedcbaghijklmnoypvwwxyaeyzzouzzzsaqwerzjklmnoprstuvEQWERTkYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijkzbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuouzalmnoprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertycnvtvlztxxmgwabcdzzzqaiozzzbczzzqaiozzzbcdafghijkzbcdafghijktttxuxzztrttttlmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghieoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydafabcdeffeedczbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzzaijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzzzaqwertyty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiitvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszaouzzzacdmafghijtttxuxzzrtttabcdeffeezbcdabbkrtfdoiyyiuyfghijklmnoprszouzzzaprszuouza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzrzzqaiozzzbcdafghijklmnoprszuouzfxyzabcDEFghizztttrttazbbkrtiyyiuykooxnneefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEqRTYqwerYty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvabcdzzzqaiozzzbcdafghijkzbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuouzalmnoprszuouzzzazeffeedcbayscurovmjxebakretepxhapqjriulopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MszabdcdeffeeMssdcbatttxuxzrtyxyzabcDEDFgis");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzazztrtttt");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhtttuuxzrttyvyscurovmxebakretepxhzbcdafghijklmnoprszuouzzzaapqjriulawnperyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjbbkrtiyyiuyjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmntttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepwertywxpeyzzouzzzaoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoprstuvwwxyaeyzzouzzzaqkooxnzbcdabbkrtfdoiyyzbcdafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzanea");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("stttxuxzztrttttxyzabczbsMbbkrtoiyyiuyssctttxuxzzzrttQzWERTYTqwdafghijklmnoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzzuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmdnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghiQWERTYqwerEtyyghijklmnoprszuouzzzzazklmnotabdcdeffuzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaizozzz");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbartyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQzWERTYzTqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjsjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwtttuzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzaxzzbcdafghijkzlzbczbcdafghijkzlmnoprszuouzzzaydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuyiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsMzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretvepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwertys");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffezzzqaiozzzzzqaiEFghizbcdafghikooxnnejklmnoprszuouzzzazbcdafghijklmnoprszouzzzaafghijklmnoprszqweertyuouzzzazedbttttxuxzzrttta");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaizozz");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQzWERTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghizbcdabbkrtfdoiyyMsstttuxiozmcnrvxaxeeeeekzpzbcdafghijkMsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkemjxbopglbghojxxwnovsmrqajxslmnoprstuvwxeyzzouzzzawiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxsizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzajklmnoprstuvwvwxyaeyzzouzabcdeffeedcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("atttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiizbcdafghijklmnoprszouzzzaiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxbfcdeffeedba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdatxyzahbcDEDFghittuxzrtyfghijklmnoprszuouzzzazeffeedzjklmnoprstuvEQWERTYabbfcdeffeedcbqwertywxpeyzzouzzzacba");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaassxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQzWERTYTw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuryzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkllmnopaprszlpuouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtiyyiuykooxnnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyizzzqaiozzzuysscdafghijklmlinoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdabbkrtfdoiyyiuzyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijaklmnoprszouzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abccdeffeeda");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbartyzzouzzzaqwertyhkemjxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklhmnoprstuvwxUVttctuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuoubbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnezzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprtepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxuxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffeedcbabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeytxyzabcDEDFghittuxzrtyaa");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttQzWERTYqwqwertyxyzabDcrDEFghierty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbzbcdafghijklmsMbbkrtiyyzbcdafghijklmnoprstuvwwabcdzrzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzczzgaqwertyiuyssnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrticyyiuysscdafghijklmnoprstuvwxeyzzouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abdcdefazuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzrtyzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzasMss");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghiqjklmzzzqaiozzzbcdafghijklmnoprszuouzzzaznoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghoqwerttyjxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpmtbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrttuQWRTYqw");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknxsnhptbcttrrrzkurifpqjyypugyhliiiiiizbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwertyiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxtaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuryzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuryzabcDEDFghDijxkiyhfwmbvdtttrttzmssxxpwoaynylrzjklmnoprstuvEQWERTYqwertywxeyzzouzzzalzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtysMssondjofzhhxyhzabcnylrlzhkxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnotttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhtttuuxzrttyvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzaeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqzbcdafgVhilmnoprstuvwxUVWXYZukvzbcdafzghijklmnoprstuvwxeyzouzzzaaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwaertytttxuxzzrtttabcdeffeezblmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszzbcdafghijklmnoprstuvwxUVWXYZukvzbcdafghijklmnoprstuvwxeyzouzzzauouzzzzazklmnoaprszuouzzzazeffeedcbaxyaeyzzouzzzbgaqwaerty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghijklmnoprtuvwxeyzzLNFZmHOoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("OLNFZ");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffeedbabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafgghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbaa");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijklmnoprszuzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbartyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqzbcdafghilmnoprstuvwxUVWXYZukvzbcdafzghijklmnoprstuvwxeyzouzzzaaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuoupzzzazeffeedcbaxyaeyzzouzzzbgaqwaerty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaakooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaeaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxrvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwertyhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertyxyzabDcDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiibbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiizbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjsjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwtttuzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzaxzzbcdafghijkzlzbczbcdafghijkzlmnoprszuouzzzaydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuyiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwertywoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnneinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijklmnoprszaouzzzacdmafghijtttxuxzzrtttabcdeffeezbcdabbkrtfdotiyyiuyfghijklmnoprszouzzzaprszuouza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxtttxuxzzzrttQzWERTYzTqwnne");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqzatttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiizbcdafghijklmnoprszouzzzaiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxbfcdeffeedbaaizozz");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qqwerrt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafgtttxuxzzzrtthijklmnoprszouzzzacdmafghijklumnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffseedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("HtorPc");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmabcdzzzqaiozzzbcdafghijklmnobprsabcdzrzzqaiozzzbcdafghijklmnoprszuouzfxyzabcDEFghizzazbbkrtiyyiuykooxnneefzbcdafghijklmnoprstuvwwxyaeyzzouzzzabazuouzzzazeffeedcbaetepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaoqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqzbcdafghilmnoprstuvwxUVWXYZukvzbcdafzghijklmnotttExuxzzzrttQtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprtepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxuxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWERTYqwprstuvwxeyzouzzzaaiozzzxyzabcDEFghibcdafghijzzzqasiozzzbcdafghijklmnoprszuouzzzzazklmnoaprszuoupzzzazeffeedcbaxyaeyzzouzzzbgaqwaerty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlaztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeffeedcbaondjofzhhvyscurovmxebakretepxhapqjriuilawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("stttxuxzztrttttxyzabczbsMbbkrtoiryyiuysscdafghihjklmnoouzzzaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qtzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjsjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwtttuzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzaxzzbcdafghijkzlzbczbcdafghijkzlmnoprszuouzzzaydafabcdeffeedcbaghijklmnoyprstuvwwxzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatymnoprszuouzzzarttuyiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwertyweertty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttztxuzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabczbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzaeffeedcbaxyaeyzzouzzzgaqwertyxzxrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmabdcdeffeeMssdzabzbcdafghijklmnoprszouzzzacdmafghaijklmnoprszuouzaecbatttxuxzrtynoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zobcdafghijklmnoprstuvhQWERTYqwerWtywxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("DeMLGjH");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijkzlmnoxyzahbcDEFghipsrszutttxuxzrtiyozbcydafabcdeffeeadcbaghijklmnoyprstuvwwxyaeyzzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozzbzbcdafghijkzbcdafghijklmnoprszuouzzzalmnoprszouzzzacdmafghijklmnoprszuouzamcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyxhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzzzqaiozzzbcdafghijklmnoprszuouzzzaz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcdafghijklmnoprszqweertyuouzzzazssMsss");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvtttxuxzrxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknlsnhpbcttxyzabczbcdafghirrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdaxyzabcDEFghizuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghiynpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffeedcbafghijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzaneaa");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcydazbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbartyfacbcdeffeedcbaghijklmnoypvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTkYqwertywxeyzzouzzzaty");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzbcdafghijklmntttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepwertywxpeyzzkooxnzbcdabbkrtfdoiyyiuyfghijklmnoprszouzzzaneouzzzaoprszuouzfzzazefzbcdafghzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaoprstuvwwxyaeyzzouzzzaqkooxnzbcdabbkrtfdoiyyzbcdafgabzddcdefabcdzzzqaiozzczbcdafghijklmnoprszuouzzzazeffeedcbafeedcbahijklmnoprstuvQWERTYqwerWtywxeyzzouzzzaiuyfghijklmnoprszouzzzanea");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzqaiozzzbcMsssdatttuxiozmcnrvxaxeeeeekzpwiktlvbjjxvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxzzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazbopglbgzxsyzabcDEDFghihojxxwnovsmrqajxz");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffeeMssdecbatttxuxzrtyghiertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qtweertwty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpsqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhazbcdafghijklmnoprszuouzzzapqjriulawnpeytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhxyhzabcDEDFghDiurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnehEiFghi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcodafghijklmnoprszuzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbarteyzzouzzzaqwe");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zfghzbcdafghijklmnoprstuvQWERTYqWwlertywxeyzzouzzzaijkzlmnoprszuonuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zzzszzuozuzzuz");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MtttxuxzzzrttQWERTYqwertysbbkyyrtfdoiyyiuyyss");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaauztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyjscurovmxebakrezbcdafghijkllmnopaprszlpuouzzzatepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstusMsvwxUVWXYZuvzbcdafghijklmnoprstuuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvzbcbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertylnylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTYqwertytttuxzrty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzabcdzrzzqaiozzzbcdafghijkIAlmnoprszuzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbartyzzouzzzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbgzxyzabcDzzzzqaiozzxyzabcDEFghizbcdafghikooxnnejklmnoprszuouzzzazbcdafghijklmnoprszouzzzaEDFghihojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqaiozzzxyzabcDEFghibcdatxyabdcdeffeabdcdeffeeMxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqxaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxzabcDEFghissdcbatttxuxzrtyebazaertywxpeyzzouzzzacbza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEabcdzzzoprszuouzfzzazeffeedcbaRTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgyhizbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzttdcbazzaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzztttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzxyzabczbzbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzasMbbkrtiyyizzzqaiozzzuysscdafghijklmlinoprstuvwxeyzzouzzzaDEDFghizrtt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsstttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwtttxuxzrtyzsMssondjofzhhxyhzabcnylrlzhkxbopglbghojxxwnovsmrqajxs");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkirtiyyxytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaabcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedzjklmnoprstuvEQWERTYqwertywxpeyzzouzzzacbazabcDEFghiiuy");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zjklmnoprstuviEQWERTYqwertywxeyzzozbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvzzzzuouzzzazbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwertyuzzza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abccdeffeedzbcdafghizbcdabbkrtfdoiyyizbcdzbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzzaqwertya");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxzzzqaiozzzbcdafghijkzbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzalmnoprszuouzzzazbopglbgzxyzabcDEDFghihojxxwnovsmxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFabdcdeffebbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhawpqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertynylrlzhkemjxbopglbghojxxwnzbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghiQWERTYqwerEtyyghijklmnoprszuouzzzzazklmnotabdcdeffeedcbattxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeyzzouzzzawxyaeyzzouzzzaovsmrqajxkrtiyyiuykooxnneeMssdecbatttxuxzrtyghirqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzztrttQzWERtTYTw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabczbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzbcdafghijklmnoprstuvwxUVWXYZukvzbcdafghijklmnoprstuvwxeyzouzzzazzouyzzzaeffeedcbaxyaeyzzouzzzgaqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcwdafghijkQWEqRTYqwertylmnoprnstuvwtzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyttxuxzrtyUVWXYZuvwza");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrxyzabczbcdafghijklmnoprstuvwxeyzzouzzzaDEDFghirzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxzzzqzatttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiizbcdafghijklmnoprszouzzzaiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscuraovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxbfcdeffeedbaaizozzebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MssszbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertys");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttttExuxzzzrttQzbcdabbkrtfdoiyyiuzbcdafghzxyzabcDEDFghiijklmnoprstuvwxUVytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyyfghijklmnoprszouzozzarqajxWERTYqwzrttQWERTYqw");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabczbcdafghiijklmnoprtuvwxeyzzouzzzbcdafghijklmnoprstuvwxUVWXYZuvzbcbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoayzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdazbcdafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyfghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxnhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlezhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertylnylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnezaDEDFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttztxuzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabczbcdafghijklmnoprstuvwxUVWXYZuvzbcdijklmnoprstuvwxeyzzouzzzawxyaeyzzouyzzzabccdeffeedzbcdafghizbcdabbkrtfdoiyyizbcdzbcdafghijkzlmnopsrszutttxuxzrtiyozbcydafabcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwerzjklmnoprstuvEQWERTYqwertywxeyzzouzzzatyuzzzaqwertyaaeffeedcbaxyaeyzzouzzzgaqwertyxzxrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("MsMzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretvepxhapqjynylrlzhkemjxbopglbghowjxxwnovsmrqajxWXYZuvwxyaeyzzouzzzaqwertys");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdzzzqasMbbkrtiyyzbcdafghijklmnoprstuvwwabcdzrzzqaiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyiuyssiozzzxyzabcDEFghibcdafghijklmnoprszuouzzzazeffeedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxUVzbcdafghijklmnoprstuvwwabcdzzzqaiozzzxyzabcDEFghibcdafghijzzzqaiozzzbcdafghiabcdzzzqaiozzzbcdafghijklmnoprszuouzfzzazefzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyfeedcbajklmnoprszuouzzzzazklmnotttxuxzzzrttQWERTYqwertyprszuouzzzazeffeedcbaxyaeyzzouzzzgaqwertyWXYZuvzbcdafghijklmnoprstuvwxeuyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zabzbcdafghijkttttxuxzzttttlmnoprszouzzzacdmafghaijklmnoprszuouza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("IUhh");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafughijklmnoprstusMsvwxUVWXYZuvzbcdafghijklmnoprstuuvwxeyzzouzzzawxyaeyzzouzzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaakooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaeaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwabcdzzzqaiozzzbcdafghijklmnoprszuouzzzazeulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvabjjvydknsnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaabdcdeffeedcbaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxrvlnufkwcyxyzabcDEDFghDijxkiyhfwmbvdtttrttzmzbcdafghijklmnoprstuvwxUVtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbctbbkrtiyyiuykooxnneWXYZuvwxyaeyzzouzaoqwertyhkemjxbopglbghojxxwnovsmrqajxzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzrtyzbcdafghijklmnoprstuvrQWERTYqwerWtywxeyzzouzzzasMbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmnness");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiitttttExuxzzzrttQzbcdabbkrtfdoiyyiuzbcdafghzxyzabcDEDFghiijklmnoprstuvwxUVytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsbnhpbcttrrrzkurifpqtjyypugyhiiiiiiiizzzqaiozzzbcdafghijklmnoprszuouzzzaziiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcanvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxWXYZuvwxyaeyzzouzaqwertyyfghijklmnoprszouzozzarqajxWERTYqwzrttQWERTYqwiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmnne");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abfcdeffezzzqaiozzzbcddafghijklmnoprszqweertyuouzzzazedbttttxuxzzrttta");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qweezbcydafaibcdeffeedcbaghijklmnoyprstuvwwxyaeyzzouzzzaqwertyrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("qwertyrxyzabDcrDEFgqhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kooxtttxuxzbcdafghijklmnoprstuvwwxyaeyzzouzzzaqwertyWERTYzTqwnne");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdaabbbitttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhptbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwszmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxkrtiyyiuykooxnnebkrtfdoiyyiuyfghijklmnoprszouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttzbzbcdafghijklmnoprszouzzzacdmafghijklmnoprszuozbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzkooxnnzbcdabbkrtfdoiyyizbcdafghijklmnoprstuvwxUVWXYZuvwxyaeyzzouzzzaqwertyuyfghijklmnoprszouzzzaeatty");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("a");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("b");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("aAa");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bb");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("AAAAbbbbb");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ABCabc");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zyx");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("aa");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyxyzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("seRyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzQWERTzbcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxtzQWERTzbcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbRTzbcDEFzyiYqwertyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttyzazbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEzbcydafghijklmnoprstuvwxeyzzouzaFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdefftttxteedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzaFghity");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiiuyoxne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFyiEYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqaiozzzRTzbcDEFzyiYqwertzyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyierty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ztbcdafghijklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkobbkrtfdoiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcDEyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwertyeyzzouzyzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdafgheyzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiuyrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghioiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkobbkrtfdoiyytttxtiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobrbkrtfdoiyyiuyrtfdoiyyykobbkrtfdoiyyiiuyoxunnee");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("KiUHqiz");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyxyz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("BSco");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttztxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRyRBzbRTzbcDEFzyiYqwertyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzodzbcdafgheyzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERRTzbcDEFyiEYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQWERTzbcDEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbccDE");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrttttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrtttoxnn");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytettxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwertyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyitYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktglbghzbcDEFyiojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbccDzbcdafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzaE");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QYPV");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQWE");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDErty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQWERTzbcDEFEyiYqwertYQWERTzbcDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzxyzazbcDEFyiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwertQy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcgdafghzbcdafdgheyzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWErRTzbcDEFzyierty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QEWERTzbcDErtyYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbccDzbcdafzbcdafgheyzzouzzzaghijklmnopazbcdafghijzouzzzarstQWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYyuvwxeyzzouzzzaE");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("UVWXXYZuvwxya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zyzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvsxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazzzqaiozzzbcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcDEFyiQWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafgzza");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyztazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzzrtazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzzat");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyiuzbcdafghQWERTzbcDEFyixyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkobbkrtfdkozbcdafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzaiyytttxtiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuvwxeyyseRyRBzbRTzbcDEFzyiYqwertyDEFyizzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdefftttxteedcbtttuxiozmcnrvxaxeeeeekzpwiktglbghzbcDEFyiojxxwnovdsmrqajxa");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("p");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QEWERTzbcDErtywYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQWERTzbcWDEFEyiYqwertYQWERTzbcDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzayzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwertyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnone");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqaiozzzRqwertzyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabczbcdafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzaDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiduyoxnnekrtfdoiyyyiuyoxnone");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFyiYqwertyYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttx");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiaiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzayzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetx");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRyyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnnepqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwlleyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijxyzazzzqaiozzzbcDEFgEhiklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnnepqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zkobbkrtfdoiyyyiuyoxnnebcdafgheyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffededcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiuyrtfdyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("UVWXwYZuvwxya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tbbkrtfdoiyyztttxuxkobbkrtzzrttt");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTtttxuxtzQWERTzbcDEFyiYqwertyzzrtttzbcDEFyyiYqwertyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayzbcDEFyiYqwertyeyzzouzzzaytettxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzzzzaytettxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnkrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqaiozzzRTzbcDEFzyiYqwertzyDEFyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzz");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QeWERTYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttirrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcgdafghzbcdafdgheyzzouzzzauzzzzafzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnoprstuuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdafgheyzzouzzzauzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdtttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqtajxafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkbrtfdoifyyz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkrtfdoiyyyxyzazbcDEFyiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbDEF");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRyyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfduyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafzbcdafgheyzzouzzzaghigjklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkobbkrtfdxyzababcdeffededcbacDEFghioiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoifyyiuzbcdafghQWERTxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzzzzaytettxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERRTzbcDEFyiEYqweyrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWUVWXYZuvwxya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaDEFyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRyByB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbccDzbcdafzbcdafgheyzzouzzzaghijklmnopazbcdafghijzouzzzarstQWERTzbQWERTzbcDEFyseRBkobbkrtfdoiyyiuyoxnneyiEYqwertycDEFyiYqwertYyuvwxeyzzouzzzaE");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRyByBB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiukzbcdafghQWERTxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayzbcDEFyiYqwertyeyzzouzzzaytettxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zBScobDEF");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzzzrtttttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzbbkrtfdoiyyzodzbcdafgheyzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrrtfdoiyyyiuyoxnnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("seRyRQWERTzbcWDEFEyiYqwertYQWERTzbcDEFyiYqwertYyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRByyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzbzzzqaiozzzRqwertzyDEFyicdafgheyzzozbcdafgheyzzouzzzauzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoixyzazbcDEFyiQWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYyyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayzbcdafzbcdafgheyzzouzzzaghigjklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdafgheyzzouzzzauzzztttuxiozmcnrvxaxeeeeekzpwxiktglbghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bboiyyiuy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("dSJxyzazbcDEFyiXDCfwPU");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrkooxnnetfdoiyxyz");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqysseRyyBiozzzRqwertzyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvzouzzza");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobrbkrtfdoiyyiuyrtrfdoiyyykobbkrtfdoiyyiiuyoxunnee");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkrtfdoiyyyxzbcdafgheyzzozbcdafgheyzzouzzzauzzztttuxiozmcnrvxaxeeeeekzpwxiktglbghojxmrqtajxyzazbcDEFyiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbDseRyRQWERTzbcWDEFEyiYqwertYQWERTzbcDEFyiYqwertYyBDEF");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiysseRyyByyiuyrtfdyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghorjxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzamgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghorjxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayiyyiiuyoxne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQyWERTzbckobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetxDEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFFzzyierty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDrEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcgdafghzbcdafdgheyzzouzzzauzzzzafzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvnlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcgdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozQWERTzbcDErtymcnkrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttzazbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("UVWXwxUya");
        org.junit.Assert.assertEquals("U", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEQWERTYqwertyzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakreteptxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqaajx");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQW");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWErRTzbcDDEFzyierty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiaiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopgzzzqaiozzzlbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzayzzaybcdafghQWERTzbcDEFyiYqwertyeyzztouzzzayapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwikxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghimjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yssRyBBB");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyifghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfdoiyyiuzbcdafghQWERTzbcDEFyixyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzKiUHqizzaytttxuxzzzbbkrtfdoiyyytyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttxttxuxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqtkobbkrtfdoiyyyiuyoxnneajx");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkirtfdoiyyyxyzazbcDEFyiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzfouzzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QeWERTYqwert");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("KadH");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttyzazbcDEFyiQWERRTzbcDEFyiEYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRytttuxiozmcnkrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajxByBB");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiysseRyyByyiuyrtfdyiutyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuttttxuxzzzrtttyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRyyBxyzazbcFyibbkrtfdoiyyiuzbcdbboiyyiuyt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrErrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaDEFyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnnepqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzabkbrtfdoiyxyzabcDEFghi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tbbkrtfdoiyyztttxuxkobbkrtzzrtzbzzzqaiozzzRqwertzyDEFyitt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFzbDEFyiyiYqwertyeyzzouzzzaytttxuxzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWErRTzbcDDEFzyiertty");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffededfcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEgFyiYqweabcdeffededfcbartyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tbbkryseRyyBtfdoiyyztttxuxkobbkrtzzrtzbzzzqaiozzzRqwertzyDEFyitt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzlmnzbcdafzbcdafgheyzzouzzzaghigjklmnoprstuvwxeyzzouzzzaprstuvwxeyzzouzzzaFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEQWERTzbcazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaDEFyiYqwertyerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xattttxuxzzzrtttzazbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkuriiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRyy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazzzazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaqaiozzzbcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqaiozzzRqwerQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwertyFyi");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcDEFy");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzzrtazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfQWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzaFghitywmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzzat");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbkrtfkdoiyyz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxxzzzrtttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttxttxuxztbbkryseRyyBtfdoiytttxuxkobbkrtzzrtzbzzzqaiozzzRqwertzyDEFyittttt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttzrttxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwikQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwertytlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbzbcdafzbcdafgheyzzouzzzaghigjklmnoprstuvwxeyzzouzzzaiyyyiduyoxnnekrtfdoiyyyiuyoxnone");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijxyzazzzqaiozzzbcDEFgEhiklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnnepqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxxyzazbccDzbcdafzbcdafgheyzzouzzzaghijklmnopazbcdafghijzouzzzarstQWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYyuvwxeyzzouzzzaEeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrdSJxyzazbcDEFyiXDCfwPUqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQWazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaE");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzrtttghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkodedcbacDEFghioiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghijklmnvoprstuuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcgdafghzbcdafdgheyzzouzzzauzzzzakobbkrQWERTzbcDEFzyitYqwertyrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WW");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("akeobbkrrtfdoiyyyiuyoxnnebcdtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretebbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxefftttxteedcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwerytyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("UVxWXYZuvwxya");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcgdafghzbcdafdgheyzzouzzzauzzzzakobbkrkobbkrtfdoiysseRyyByyiuyrtfdyiutyoxnnerotfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqysseRyyeBiozzzRqwertzyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknfsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RYQWERTzbcDEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzbbkcrtfdoiyyzodzbcdafgheyzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQWpE");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwertyeyzzouzyzzaybcdafghQWERTzbcDEbFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ztzzzaa");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwikQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwertytlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpbbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaywiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RyB");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxmzzzqaiozzzrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyyiuyoxne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyifghQWERTzbcDEFyiYqwertyeyzzouzzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYkobbkrtfdoiysseRyyByyiuyrtfdyiuyoxnneqwertyeyzzouzzzayssRyBBBytttxuxzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEgFyiYqweabcdxttttxuxzzzrtttzazbcDEFyieffededfcbartyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWErRTzbcDDEFzyierttytttxuxzzzrtttttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekyseRByyBzpwxiktglbghojxxwnovdsmrqaajx");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkirtfdoiyyyxyzazbcDhEFyiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekyseRByyBzpwxiktsmrqaajx");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QEWERTzbYcDErtywYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtkfduyoxnzbDEFne");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeceekzpwxiktglbgQWERTzbcDErtyhojxmzzzqaiozzzrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTtttxuxtzQWERTzbcDEFyiYqwertyzzrtttzbcDEFyyiYqwkobbkrtfdoiyyyiuyoxnneertyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayxeeeeekyseRBByyBzpwxiktsmrqaajx");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEtYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobyrbkrtfdoiyyiuyrtrfdoiyyykobbkrtfdoiyyiiuyoxunnee");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbazabcDEzstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhttztxuxzzzrtttiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdatttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqajxfgheyzzouzzzauzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ZnjGWPk");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("czBScobDEF");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzbbkrtfdoiyyzodzbcdafgheykobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetxzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcgdafghzbcdafdgheyzzouzzzauzzzzafzhhvyscurovmxebakretepxhapqjriulawfnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvnlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tbbkryseRyyBtfdoiyyztttxuxkobbkrtzzrtzbzezzqaiozzzRqwertzyDEFyitt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffQWERTzbQWERTzbcDEFyiEYqwertycDEFyiYqwertYyededfcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzzzqaiozzzRqzwertzyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrttkobbkrrtfdoiyyyiuyoxnneTzbcDEFyiYqwertyzzrtttoxnn");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwertyuyoxnnekrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttyzazb");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiQWERzbcdafgheyzzodzbcdafgheyzzoxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiuzzzauzzzzaTzbcDEFyiEYqwertyuyoxnnekrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbzcdafghezyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazzzqaiozzzbcDEFgEhEi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttxttxuxzzzrztt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEgFyiYqweabcdxttttxuxzzzrtttzazbcDZnjGWPkytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzbbkrtfdoiyyzodzbcdafgheykobbkrtfdxyzabcDazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvzouzzzaghoiyyiuyoxnnetxzzouzzzauzzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRyRBzbRTzbttttxuxzzzrtttcDEFzyiYqwertyDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrrtfdoiyyyzbcdafgheyzzozbcdafgheyzzouzzzauzzztttuxiozmcnrvxaxeeeeekzpwxiktglbghojxmrqtajxiuyoxnnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyiyseRBkobbkrtfdoiyyiuyoxnnebbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxxzzzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekseRyBzrtttyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiaiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzayzzaybcdafghQWERTzbcDEFyiYqwerttxttxuxzzzrtttxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WE");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuUVxWXYZuvwxyaxiozmcnrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Kqiz");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkobbkrtfdxyzababcdeffededcbacDEFghioiQWERTzbcDEFyiYqwertyYyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysextiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdtttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnUVWXYZuvwxyaovdsmrqRYQWERTzbcDEFEyiYqwertYytajxafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttztxuxzzzrtttazbcdafghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdafgheyzzzouzzzauzza");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQyWERTzbckobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetxabcdefftttxteedcbtttuxiozmcnrvxaxeeeeekzpwiktglbghzbcDEFyiojxxwnovdsmrqajxaDEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrErrzkurifpqjyypugyhiiixyrzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaDEFyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkodeodcbacDEFghioiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQWpExyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTtttxuxtzQWERTzbcDEFyiYqwertyzzrtttzbcDEFyyxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzaFghiqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEtYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfty");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozQWERkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnoneovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjygypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzamgwondjofmzhhvyscurovmxebRyBakretepxhaxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghipqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghorjxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("AaXcik");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkodDEFghnne");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("rds");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzamFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttttxuxzzzrtaxyzxyzazbcDEFyiabcDEFgEhizbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzzat");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQyWERTzEbckobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetxDEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdoiyyiuyoxtttuxiozQWERkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnoneovdsmrqajxnne");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwiktglbghoojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyyiuyoxnone");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwikQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvtttxuxzQWERTzbcDEFyiYqwertyzzrtttdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwertytlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurxovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseysseRytttuxiozmcnkrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajxByBBRBkobbkrtfdoiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bbbkrtfdoiyxyz");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERRTzbcDEDFyiEYqweyrty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlfzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERzbcnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkirtfdoiyyyxyzazbcDhEFyiabcDEFgEczBScobDEFhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbghojxxwnovdsmrqtkobbkrtfdoiyyyiiuyoxnneajx");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafgheyzzozbcdafgheyzzouzzzauzzztttuozmcnrvxaxeeeeekzpwxiktglbghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrtfdxyzabcDEzbcydafghijkmnoprstuvwxeyzzouzzzaFghioiyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlfzhkemjxbopglbghojxxwnxjyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzabcDEzbcydafghijklmnoprstuvwxeyzzoiuzaFghi");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdeffQWERTzbzbcgdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnneQWERTzbcDEFyiEYqwertycDEFyiYqwertYyededfcba");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQ");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijxyzazzzqaiozzzbcDEFgEhiklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnbbkrtfdoiyyiuyhpbcttrrrzkurifkobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyyiuyoxnnepqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdpzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwxiktglbhghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QeWERTYqwQert");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QxyzabcDEFgEhiWERTzbcDEFzyiYqwerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("pp");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktzbzzzqaiozzzRqzwertzyDEFyilvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzxyzaxzbcDcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yseRBkodeodcbacDEFoghioiyytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqmrqajxiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbczbzzzqaiozzzRqwerQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwertyFyigdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tbbkryseRyytttuxiozmcnrvxaxazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeeeeekzpwiktglbghojxxwnovdsmrqajxBtfdoiyyztttxuxkobbkrtzzrtzbzezzqaiozzzRqwertzyDEFyitt");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafxghQWERTzbcDEgFyiYqweabcdxttttxuxzzzrtttzazbcDZnjGWPkytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Qrty");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ttUVxWXYZuvwxyatuxiozmcnrvxaxeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("WQWazbcdafghifjzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqahijzouzzzaE");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaabbbkrtfdoiyxyzaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgiheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxrqajxghijzouzzzQWErRTzbcDDEFzyierttytttxuxzzzrtttttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrttta");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttyzaxzbcDEFyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxuxzQWERTzBScobcDEFyiYqwertyzzrttt");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbczbzzzqaiozzzRqwerQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaThzbcDEFyiEYqwertyFyigdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbccDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zbcdafghazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwikxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghimjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeyzzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("abcdefftttxtazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeedcba");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWEQWERTzbcazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaDEFyiYqwertyerty");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpbbkrtfdoiyyyxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyezbcdtttuxiozmcnrvxaxeeeeekzpwxiknUVWXYZuvwxyaovdsmrqRYQWERTzbcDEFEyiYqwertYytajxafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzayzzouzzzaytttxuxzrtttghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxesnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaatqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxxbopglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyzbczbzzzqaiozzzRqwerQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwertyFyigdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnneyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbbzxyzlmnzbcdafzbcdafgheyzzouzzzaghigjklmnoprstuvwxeyzzouzzzaprstuvwxeyzzouzzzaFghiuzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzay");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghzijzouzzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdnzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzzaeeeeekzpwiktglbghojxxwnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiQWERzbcdafzauzzzzaTzbcDEFyiEYqwertyuyoxnnekfrtfdoiyyyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttxtt");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("zttzzzaa");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQWERTzbcDYiEFEyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("RQWERTzbcWDExyzazbcFyibbkrtfdoiyyiuzbbzkrtfdoiyyiuzbcdafghQWERTzbcDEFyyiYqwertyeyzzouzyzzaybcdafghQWERTzbcDEFyiYqwertyeyzzouzzzayFEyiYqwertYQWERTzbcDEFyiYqwertYy");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ysseRyBkobbkrtfdxyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghoiyyiuyoxnnetxyB");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xttttxuxzzzrtttyzazbcDEFzyi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbccDzbcdafzbczdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzaE");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkrttkobbkrrtfdoiyyyiuyoxKiUHqiznneTzbcDEFyiYqwertyzzrtttoxnn");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpbbkrtfdoiyyyxyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyezbcdtttuxiozmcnrvxaxeeeeekzpxyzazbcFyiyseRBkobbkrtfdoiyyiuyoxnnebbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertyeyzzouzzzaytttxuxxzzzrttthwxiknUVWXYZuvwxyaovdsmrqRYQWERTzbcDEFEyiYqwertYytajxafzbcdafgheyzzouzzzaghijklmnoprstuvwxeyzzouzzzayzzouzzzaytttxuxzrtttghojxmrqtajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzbbkirtfdoiyyyxyzazbcDEFyiiabcDEFgEhi");
        org.junit.Assert.assertEquals("E", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("tttuxiozmcnrvxaxeeeeekzpwikttztxuxzzzrtttazbcdafghijzouzzzatglbghzbcDEFyiojxxwjnovdsmrqajx");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbhcdafghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzawTzbcDEFyiEtYtttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovsmrqajxqwertyrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1007() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("kobbkobbkrtfdoiyyyiuyoxnnekrtfdoiyyzbzczbzzzqaiozzzRqwerQWERzbcdafgheyzzodzbcdafgheyzzouzzzauzzzzaTzbcDEFyiEYqwertyFyigdafghzbcdafdgheyzzouzzzauzzzzakobbkrrtfdoiyyyiuyoxnneyiuyoxnne");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1008() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("QWERTzbcDEFzyiYqwerxyzabcDEzbcydafghijklmnopxyzazbcFyibbkrtfdoiyyiuzbcdafghoQWERTzbcDEgFyiYqweabcdxttttxuxzzzrtttzazbcDEFyieffededfcbartyeyzzouzzzaytttxuxzzzrtttrstuvwxey");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1009() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("NZDMITxGSp");
        org.junit.Assert.assertEquals("I", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1010() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxweeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyzbzzzqaiozzzRqzwertzyDEFyiYyuvwxeyzzouzzzaEeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghojxxwnxyzabcDEFgEhiovdsmrdSJxyzazbcDEFyiXDCfwPUqajxghijzouzzza");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1011() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("azbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaxeeeeekzpwiktazbcdafghijzouzzzaazbcdaftttuxiozmcnrvxaUVWXYZuvwxyaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaabbbkrtfdoiyxyzaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwwcyjxkiyhfwmbvdzmssxxpwdoaynylrlzhkemjxbopglbghojxxwnovdsmrqajxghijzzbcdafgiheyzzodzbcdafgheyzzouzzzauzzzzaouzzzalvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaaaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofzhhvyscurovmxebakretepxhapqjriulawnpeyxvlanufkwcyjxkiyhfwmbvdzmssxxrqajxghijzouzzzQWErRTzbcDDEFzyierttytttxuxzzzrtttttxuxkobbkrtfdoiyyiuyoxnnetzQWERTzbcDEFyiYqwertyzzrttta");
        org.junit.Assert.assertEquals("e", result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1012() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("xyzazbcFyibbkrtfdoiyyiuzbcdafghQWERTzbcDEFyiYqwertytttuxiozmcnrvxaxeeeeekzpwiktlvbjjvydknsnhpbcttrrrzkurifpqjyypugyhiiixyzabcDEzbcydafghijklmnoprstuvwxeyzzouzzzaFghiiiiiiiiiiiinprlxfaaauaaaaaaaaztqdwllntofsacsitzzlcnvtvlztxxmgwondjofmzhhvyscurovmxebakretepxhapqjriulawnpeyxvlnufkwcyjxkiyhfwmbvdzmssxxpwoaynylrlzhkemjxbopglbghorjxxwnovdsmrqajxeyzzouzzzaytttxuxzrttt");
        org.junit.Assert.assertEquals("u", result);
    }
}

