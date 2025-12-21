package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FILTER_BY_SUBSTRING {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "john"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("xxx","asd","xxy","john doe","xxxAAA","xxx")), "xxx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("xxx","xxxAAA","xxx")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("xxx","asd","aaaxxy","john doe","xxxAAA","xxx")), "xx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("xxx","aaaxxy","xxxAAA","xxx")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("grunt","trumpet","prune","gruesome")), "run"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("grunt","prune")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("banana","apple","kiwi","peach")), "a"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("banana","apple","peach")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","pandas")), "py"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("python","numpy")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), ""
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc","bcd","cbd","dbc","cda")), "bc"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abc","bcd","dbc")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("a","ab","abc","abcd","abcde","bcde","cde")), "cd"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abcd","abcde","bcde","cde")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("123","456","789","101112")), "12"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("123","101112")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("cat","dog","elephant","rhinoceros","seagull")), "e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("elephant","rhinoceros","seagull")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishmentarianism","floccinaucinihilipilification")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("moon","stars","sun","planets")), "s"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("stars","sun","planets")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("earth","mars","jupiter","saturn","uranus")), "s"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("mars","saturn","uranus")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","pandas","numpy")), "py"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("python","numpy","numpy")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification","floccinaucinihilipilificatnion")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","pandas")), "antidisestablishmentarianismpy"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion")), "ili12"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisesshmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","sun","floccinaucinihilipilificatioearthn")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilificatioearthn")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("123","456","789","101112")), "122"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishementarianism","floccinaucinihilipilification")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc","bcd","cbd","dbc","cda","cfloccinaucinihilipilificatilinionda")), "bc"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abc","bcd","dbc")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("earth","mars","jupiter","saturn","uranus")), "numpuranusys"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishementarianism","floccinaucinihilipilification","supercalifragilisticexpialidocious")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification","supercalifragilisticexpialidocious")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","pandas")), "antidisestablishmentariasaturnnismpy"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisesshmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion","floccinaucinihilipilifi101112cation")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion","floccinaucinihilipilifi101112cation")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("supercalifragilisticexpialidocious","antidisestablishmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion")), "floccinaucinihilipilificatioearthn"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","s")), "antidisestablishmentariasaturnnismpy"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy")), "antidisestablishmentarianismpy"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("antidisesshmentarianism","floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion")), "ili"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("floccinaucinihilipilification","floccinaucinihilipilificatnion","floccinaucinihilipilificatilinion")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("hello","world","python","numpy","pandas","numpy")), "antidisestablishmentarianismpy"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc","bcd","cbd","dbc","cda","cfloccinaucinihilipilificatilinionda","dcbd")), "bbc"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc","bcd","cbd","dbc","cda","cfloccinaucinihilipilificatilinionda","dcbd","cfloaccinaucinihilipilificatilinionda")), "bbc"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("123","456","789","101112","456")), "12"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("123","101112")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "an"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("San Francisco")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "ox"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The cat in the hat","Green eggs and ham","One fish two fish","Red fish blue fish")), "fish"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("One fish two fish","Red fish blue fish")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","The Lord of the Rings","Star Wars","Inception","Forrest Gump")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "equal."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), ""
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abcdefg")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc(d)e","ba%cd","cde","array","12345")), "(d)"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abc(d)e")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("wsrefgtrh","zxyvtru","asxwaqzx","kjbncxz")), "tr"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("wsrefgtrh","zxyvtru")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump")), " "
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump"," Inception     ")), " "
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump"," Inception     ")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "an"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("San Francisco")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "York"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("New York City")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstitutionx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "created"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "creeated"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "creataed"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"")), "equal."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "ordain"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "nan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","Boston","Los Angeles","San Francisco","Miami","Washington")), "nan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","The cat in the hat","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "nation,"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdeits")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "equ"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg")), "upromoteniversally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The cat in the hat","Green eggs and ham","One fish two fish","Red fish blue fish")), "ffis"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Los Angeles","San Francisco","Miami","Washington")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg","abcdefg")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstituti"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York Ciity","The cat in the hat","New York City","Boston","Los Angeles","Miami","Washington")), "nation,"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Pack my box with five dozen liqugor jugs","The quick brown fox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "created"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "want"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Pack my box with five dozen lisevenquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "ox"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Pack my box with five dozen lisevenquor jugs")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The q uick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstitutionx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","San Francisco","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstitutionx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Pack my box with five dozen lisevenquor jugs","forth","Jackdaws love my big sphinx of quartz")), "ox"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Pack my box with five dozen lisevenquor jugs")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Los Angeles","San Francisco","zebras","Washington")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"")), "eaqual."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington","Miami")), "want"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "New York Citywant"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "Star"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","The Lord of the Rings","Star Wars","Inception","universally")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","cRedemptionread","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "nation,"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcgdefg","aasxwaqzxbcdefg","want","abcdefg","abcdefg","abcdefg")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington")), "New York Citywan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","nWashington","Los Angeles","San Francisco","zebras","Washington")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdeits")), "fortune,"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("B\"Weoston","Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "York"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("New York City")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcgdefg","aasxwaqzxbcdefg","want","abcdefg","abcdefg","abcdefg")), "box"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("peoplbige","abcdefg","abcdefg")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "for"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Pack my box with five dozen liqugor jugs","The quick brown fkjbncxzox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz","Jackdaws love my big sphinx of quartz")), "createdd"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "Citywan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump")), "nation"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","ton","Boston","Los Angeles","San Francisco","Miami")), "York"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("New York City")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "tthese"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","San Francisco","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstitStar Warsutionx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Los Angeles","San Francisco","Miami","Washington")), "nab(((The Dark Knightdthese)cc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","San Francisco","Miami","New York Cicreateddty","Washington","New York Cicreateddty")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","MMiami","New York City","San Francisco","Miami","New York Cicreateddty","Washington","New York Cicreateddty")), "nabc(d)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("an","abcdeits")), "universally"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump")), " l."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States oef America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "City"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("th")), "(((The Dark Knightdtmeaninghese)"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg","abcdefg")), "univerhavely"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"")), "Star Wars"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("daft","UEZ","(((The Dark Knightdthese)","of","New York Ciitypcerfefct")), "RRed fish blue fish"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Pack my box with five dozen liqugor jugs","The quick brown fkjbncxzox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "The quick b over the lazy dog"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz","The quick brown fox jumps ove  zy dog")), "oxx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.","To be or not to be, that is the question.")), "ordain"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","New York City","Boston","Los Angeles","San Francisco","Miami","Washington","Miami")), "daft"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Pack my box with five dozen liqugor jugs","The quick brown fox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Redemption")), "created"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","Boston","Los Angeles","San Francisco","Miami","Washington")), "nann"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz","Pack my box with five dozen liquor jugs")), "createt"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","MMiami","New York City","San Francisco","Miami","New York Cicreateddty","Washington","New York Cicreateddty")), "nabc)e"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Lord of the Rings","Star Wars","Inception","Forrest Gump")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Pack my box with five dozen lisevenquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "quiickox"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz")), "propmtr"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over tPacFour score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are crzyeated equal.he lazy dog","San Francisco","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "oConstittutionx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Thee quick brown fox jumps ove  zy dog","The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","Jackdaws love my big sphinx of quartz","The quick brown fox jumps ove  zy dog")), "oxxNew York Citywan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "abc"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "substring"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("","","")), "substring"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("substring","substring","substring")), "substring"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("substring","substring","substring")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("string","bingo","frost","parka")), "substring"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("","","")), ""
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("","","")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("","a","","b")), ""
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("","a","","b")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("")), ""
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc","bcd","cde","def")), "a"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("abc")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings","Star Wars","posterity,","Forrest Gump")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), "form"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "Green"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The quick brown fox jumps over the lazy dog","Pack my box with five dozen liquor jugs","How vexingly quick daft zebras jump","Jackdaws love my big sphinx of quartz")), "tranquility,ox"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "liberty"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings","union,","posterity,","Forrest Gump","union,")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg")), "m"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("fom","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("fom")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "eqal."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdbefg")), "form"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abbcdefg","fom","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("fom")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","Star Wars","Inception","Forrest Gump")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "libertequal.y"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption"," The Godfather ","The Dark Knight","  The Lord of the Rings   ","   Star Wars"," Inception     ","Forrest Gump")), "Angeles"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami","New York City")), "an"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("San Francisco")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings","Star Wars","posterity,","Forrest Gump")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","San Francisco","Miami")), "libertequal.y"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), "fofm"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami","New York City")), "aan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","The Dark Knight","Star Wars","Inception","Forrest Gump")), "hhe"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abbcdefg","fom","abcdefg","abbcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("fom")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg")), "To be or not to be, that is the question."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfatosacknowlledged,phinxxher","The Dark Knight","The Lord of the Rings","union,","tranquility,oxunion,","posterity,","Forrest Gump","union,")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfatosacknowlledged,phinxxher","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("osafortune,cknowlledged,p","abcdefg","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","justice,The Dark Knight","The Lord of the Rings","and","Inception","Forrest Gump")), "he"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","justice,The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc(d)e","ba%cd","cde","array","12345")), "dozen"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","DCt","The Lord of the Rings","union,","posterity,","Forrest Gump","union,")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("osafortune,cknowlledged,p","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("wsrefgtrh","zxyvtru","asxwaqzx","zxyvtConstitutionru","kjbncxz")), "tr"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("wsrefgtrh","zxyvtru")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("kQEHdzw","for","asxwaqzx","  The Lord of the Rings   ","Mi","its","kZWuN")), "Green"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc(d)e","ba%cd","cde","array","12345","12345")), "Saabc(d)en"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abc(d)e","ba%cd","cde","array","dog")), "doquartuzzen"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","justice,The Dark Knight","The Lord of the Rings","and","Inception","Forrest Gump")), "hhate"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washinestablishon","DC","New York City","Boston","Los Angeles","San Francisco","Miami","New York City")), "an"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("San Francisco")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg")), "rtr"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Dark Knight","The Lord of the Rings","union,","posterity,","Forrest Gump","union,")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Dark Knight","The Lord of the Rings")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfatosacknowlledged,phinxxher","The Dark Knight","The Lord of the Rings","union,","tranquility,oxunion,","posterity,","Forrest Gump","union,")), "ourselvesh"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washinestablishon","DC","New York City","Boston","Los Angeles","San Francisco","Miami","New York City")), "aan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "eqal.osacknsowlledged,phinxx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washinestablishon","DC","New York City","Boston","Los Angeles","San Francisco","Miami","DCC","New York City")), "an"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("San Francisco")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("fI have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"om","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("We the people of the United States of America, in order to form a more perfect union, establish justice, insure domestic tranquility, provide for the common defense, promote the general welfare, and secure the blessings of liberty to ourselves and our posterity, do ordain and establish this Constitution for the United States of America.","To be or not to be, that is the question.","I have a dream that one day this nation will rise up and live out the true meaning of its creed: \"We hold these truths to be self-evident, that all men are created equal.\"","Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.")), "eqal."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "nan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washinestablishon","DC","New York City","Boston","Los Angeles","San Francisco","Miami","DCC","New York City")), "Guoxxplibertequal.yan"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList()), "form"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "tranquility,oxunion,doquartuzzen"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York CitYy","Boston","Los Angeles","San Francisco","Miami")), "liberty"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("abcdefg","abcdefg")), "To be or not to be,  that is the question."
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings","union,","pyeathesersrity,","Forrest Gump","union,")), "h"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("The Godfather","The Dark Knight","The Lord of the Rings","pyeathesersrity,")).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","The Godfather","justice,The Dark Knight","The Lord of the Rings","and","Inception","Forrest Gump")), "hhatethThe"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("The Shawshank Redemption","To be or not to be, that is the quesetion. Godfather","The Godfather","justice,The Dark Knight","The Lord of the Rings","and","Inception","Forrest Gump")), "hhatetmyhThe"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("osafortune,cknowlledged,p","abcdefg","orm","abcdefg")), "fom"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("Washington","DC","New York City","Boston","Los Angeles","San Francisco","Miami")), "tranquility,oxunion,doquartuzLoszen"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList()).toArray()
        );
    }
}

