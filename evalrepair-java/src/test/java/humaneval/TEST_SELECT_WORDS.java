package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SELECT_WORDS {
    @org.junit.Test(timeout=1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Mary had a little lamb", 4);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("little"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Mary had a little lamb", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Mary","lamb"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("simple white space", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Hello world", 4);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("world"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Uncle sam", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Uncle"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("", 4);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("a b c d e f", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("b","c","d","f"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherry", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("apple","banana"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("random words are fun to write", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over the lazy dog", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the cat in the hat", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("the","cat","the","hat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("jingle bells jingle bells jingle all the way", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python is a popular programming language", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test string with multiple words containing different numbers of consonants", 7);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("consonants"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("quack quack goes the duck", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("goes","the"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherry", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("random words are fun to write", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("fun"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programming language", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana chernry", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("apple","banana"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("random words are fun to write", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana chethe cat in the hatrry", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over the lazy dog", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("quack quack goes the duck", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jumps over the lazy dog", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programming languagePython is a popular progrmming language", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("isp"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("appna cherry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps og", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("og"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test string with multiple words containing different numbers of consonants", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("containing","different"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programmia popular progrmming language", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("isp"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("jingle bells jingle bells jingle all the way", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("all","the","way"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banappna cherryana cherry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banappna cherryana cherry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaapple banana chethe cat in the hatrryppna cherryana cherry", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("hatrryppna"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programmia popular progrmming language", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programming language", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("a"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_41() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programmia popular progrmming language", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_42() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular mprogramming language", 7);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_43() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherapple banaapple banana chethe cat ine hatrryppna cherryana cherryry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_44() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana chernry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_45() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banappna cherryana cherr", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_46() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over the lazy dog", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana chethe cat in the hatrry", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("apple","banana"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test sThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoGds containing different numbers of consonants", 7);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("consonants"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Pythion isp a popular programmia popular progrmming language", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("isp"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherapple banaapple banana chethe cat ine hatrrypypna cherryana cherryry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular program ming language", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("ming"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherapple banaapple banana chethe cat ine hatrrypypna cherryana chcerryry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_53() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jumps over the lazy dog", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("the","fox","over","the","dog"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular program ming language", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_55() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaapple banana chethe cat in the hatrryppna cherryana cherry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("in"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over the lazy dog", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("eapple banana chernry", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_58() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherry", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cherry"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("random words are fun to write", 9);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Pythion isp a popular programmia popular progrmming language", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVPython isp a popular program ming languageeR tHe LaZy DoG", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("program","languageeR"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test s tring with multiple words containing different numbers of consonants", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("multiple","numbers"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular program ming language", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Python","program"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test s tring with multiple words containing different numbers of consonants", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("containing","different"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana chernry", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("chernry"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_66() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cheraptple banaapple banana chethe cat ine hatrrypypna cherryana chcerryry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_67() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banana cherPython isp a popular mprogramming languageapple banaapple banana chethe cat ine hatrrypypna cherryana cherryry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("isp","cat"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Thapple banana cherPython isp a popular mprogramming languageapple banaapple banana chethe cat ine hatrrypypna cherryana cherryryE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cherryana"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jumps over the lazy dog", 7);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quic k brown fox jumps over the lazy dog", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaapple banana chethe cat in the hatrryppna cherryana cherry", 5);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("banaapple","cherry"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jgumps over the lazy dog", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("quick","lazy"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_73() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("aeppna cherry", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular program mithe quick browan fox jgumps over the lazy dogng language", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular program ming language", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("a"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over the laapanana chethe cat ine hatrrypypna cherryana chcerryryzy dog", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("ine"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test string with multiplePython isp a popular program ming language words containing different numbers of consonants", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("is","of"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_78() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ther quick browan fox jumps over the lazy dog", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_79() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over tvhe lazy dog", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_80() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaThE qUiCk BrOwN fOx JuMpS oVPython isp a popular program ming languageeR tHe LaZy DoGna cherry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_81() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("eapple banana cher nry", 8);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banappna cherryana cherry", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("jingle bells jingle bellthe quick brown fox jumps over the lazy dog all the way", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("fox","over","the","dog","all","the","way"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_84() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("this is a test sThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoGds containing different numbers of consonants", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("containing","different"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaapple apple banana cherrybanana chethe cat in the hatrryppna cherryana cherry", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("in"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banappna cherryanra cherry", 9);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple baanana chernry", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("chernry"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG", 9);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_89() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programming language", 9);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoGS oVeR tHe LaZy DoG", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_91() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("jingle bells jingle bells jingle all the way", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_92() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVeR tHe LaZy DoG", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("ThE","fOx","oVeR","tHe","DoG"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_93() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("aeppnac cherry", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_94() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("jingle bells jingle bells jingle all t he way", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("all","way"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_95() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jPython isp a popular program mithe qugick browan fox jgumps over the lazy dogng languageumps over the lazy dog", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("a"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_96() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Pythapple banappna cherryana cherron isp a popular mprogramming language", 7);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Pythapple"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_97() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programming language", 2);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("isp"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Python isp a popular programminPython isp a popular programming languagePython is a popular progrmming languageg language", 0);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("a","a","a"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_99() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("apple banaapple apple banana cherrybanana chethe cat in the hatrryppna cherryana cherry", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("cherryana"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("ThE qUiCk BrOwN fOx JuMpS oVPython isp a popular program ming languageeR tHe LaZy DoG", 6);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("oVPython"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick browan fox jPython isp a popular program mithe qugick browan fox jgumps over the lazy dogng languageumps over the lazy dog", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_102() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps  og", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("og"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("the quick brown fox jumps over tvhe lazy dog", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("eapple banana chernry", 7);
    }
}
