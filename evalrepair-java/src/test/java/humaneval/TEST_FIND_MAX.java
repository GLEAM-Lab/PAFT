package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FIND_MAX {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"name","of","string"}
        );
        org.junit.Assert.assertEquals(
            result, "string"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"name","enam","game"}
        );
        org.junit.Assert.assertEquals(
            result, "enam"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaaaaa","bb","cc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaaaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"play","this","game","of","footbott"}
        );
        org.junit.Assert.assertEquals(
            result, "footbott"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"we","are","gonna","rock"}
        );
        org.junit.Assert.assertEquals(
            result, "gonna"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"we","are","a","mad","nation"}
        );
        org.junit.Assert.assertEquals(
            result, "nation"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"this","is","a","prrk"}
        );
        org.junit.Assert.assertEquals(
            result, "this"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b"}
        );
        org.junit.Assert.assertEquals(
            result, "b"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"play","play","play"}
        );
        org.junit.Assert.assertEquals(
            result, "play"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuvwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abacbdce","edcbacba","dbcaebda"}
        );
        org.junit.Assert.assertEquals(
            result, "abacbdce"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcc","dddeee","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbcc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","bcd","def","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcd","bcde","cdef","defg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","bbbb","cccc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hello"}
        );
        org.junit.Assert.assertEquals(
            result, "hello"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyz","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","defg"}
        );
        org.junit.Assert.assertEquals(
            result, "defg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaa","bbb","ccc","aaa"}
        );
        org.junit.Assert.assertEquals(
            result, "aaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hellfffo"}
        );
        org.junit.Assert.assertEquals(
            result, "hellfffo"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcc","aabbdbabcdcaebdacc","dddeee","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbdbabcdcaebdacc","dddeee","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"pqr","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuvwxyz","qrstuvwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyyyz","xyyz","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"rpqr","xyz","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hello","hello"}
        );
        org.junit.Assert.assertEquals(
            result, "hello"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","aabbcc","defg"}
        );
        org.junit.Assert.assertEquals(
            result, "defg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyz","aaaa","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","aaaa","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hellfff","hellfffo","hellffbbbfo"}
        );
        org.junit.Assert.assertEquals(
            result, "hellffbbbfo"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"llo"}
        );
        org.junit.Assert.assertEquals(
            result, "llo"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","aaaaa","aaaa"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyabcdefgz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyabcdefgz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","bcd","def","bbcd","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"rpqr","xyz","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","bcd","bbcd","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","haaaaaello","helloxyz","helloyxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","aabbcc","bcd","def","xyyyzbcd","bbcd","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "xyyyzbcd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuvwxyz","qrstuedcbacbavwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuedcbacbavwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","baabbcccd","def","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "baabbcccd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaa","haaaaaello","bbb","ccc","aaa"}
        );
        org.junit.Assert.assertEquals(
            result, "haaaaaello"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuvwxbbbyz","qrstuvwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxbbbyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyyyz","abcdefg","qrstuyz","qrstuvwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyyyzbchelloyxyzd","abc","aabbcc","bcd","def","xyyyzbcd","bbcd","efqrstuvwxbbbyzg"}
        );
        org.junit.Assert.assertEquals(
            result, "efqrstuvwxbbbyzg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abacdbdce","edcbacba","dbcaebda"}
        );
        org.junit.Assert.assertEquals(
            result, "abacdbdce"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyabcdefgz","helaabbccloxyabcdefgz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helaabbccloxyabcdefgz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyyyz","xyyz","efgxyyz","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "efgxyyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zxyz","xyz","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcc","aabbdbabcdcaebdacc","dddeee","fff","fff","dddeee","aabbdbabcdcaebdacc"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcrpqrdefg","qrstuvwxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcrpqrdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","hellffbbbfohelloxyz","aaaa","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hellffbbbfohelloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyz","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qpqr","pqr","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","bcd","bbcd",""}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbdbabcdcaebdacc","abc","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"pqr","pqr","qr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","haaaaaello","helloxyz","helloyxyz","haaaaaello"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","bbbb","cc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaa","haaaaaello","bbb","aa","aaa"}
        );
        org.junit.Assert.assertEquals(
            result, "haaaaaello"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcc","aabbdbabcdcaebdacc","dddeee","fff","fff","dddeee","aabbdbabcdcaebdaccabcdefg","dddeee"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdaccabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyabcdefgz","abacdbdce","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyabcdefgz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbdbabcdcaebdacc","abc","ff","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"bbbb","cc"}
        );
        org.junit.Assert.assertEquals(
            result, "bbbb"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","bbbb","cc","bbbb"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","ccccc","cccc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abacdbdce","edcbeacba"}
        );
        org.junit.Assert.assertEquals(
            result, "abacdbdce"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcc","aabbdbabcdcaebdacc","dddeee","aabbdbabcdcaebdaccdabcdefg","fff","fff","dddeee","aabbdbabcdcaebdaccabcdefg","dddeee"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdaccabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zhelloxyz","helloxyabcdefgz","helaabbccloxyabcdefgz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helaabbccloxyabcdefgz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcc","abc","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyxz","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcd","bcde","cdef","defg","abcd"}
        );
        org.junit.Assert.assertEquals(
            result, "abcd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","bcd","dbcaebda","bbcd","efg","bbcd"}
        );
        org.junit.Assert.assertEquals(
            result, "dbcaebda"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","cccc","cccc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"bcde","cdef","defg"}
        );
        org.junit.Assert.assertEquals(
            result, "bcde"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zhelloxyz","helloxyz","aaaa","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zhelloxyz","helloxyz","aaaa","helloxyz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","haaaaaello","aa","helloxyz","helloyxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","baabbcccd","def"}
        );
        org.junit.Assert.assertEquals(
            result, "baabbcccd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qpqr","pqr","pqqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dddeee","aacdcaebdacc","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aacdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuvwxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"pqr","qr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"defg"}
        );
        org.junit.Assert.assertEquals(
            result, "defg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zxyz","xyz","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcc","qrstuedcbacbavwxyz","abc","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuedcbacbavwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrstuvwxyz","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbdbabcdcaebdacc","ff","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaebdacc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ef","abc","abc","baabbcccd","def","efg"}
        );
        org.junit.Assert.assertEquals(
            result, "baabbcccd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaa","helaabbccloxyabcdefgz","bbbb","ccc","aaa","aaa"}
        );
        org.junit.Assert.assertEquals(
            result, "helaabbccloxyabcdefgz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloyxyz","haaaaaello","helloxyz","helloyxyz","bbcd","bbcd"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abbbcdc","aabbcbbbbc","defdg"}
        );
        org.junit.Assert.assertEquals(
            result, "abbbcdc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcd","cdef"}
        );
        org.junit.Assert.assertEquals(
            result, "abcd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbcbbbbc","defdg"}
        );
        org.junit.Assert.assertEquals(
            result, "defdg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aabbdbabcdcaeb","dddeee","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aabbdbabcdcaeb"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"helloxyz","aaaa","helloxydbcaebdaz","helloxyz","helloxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "helloxydbcaebdaz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","abbbcdc","ff","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "abbbcdc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dddeee","aacdcaebdac","fff"}
        );
        org.junit.Assert.assertEquals(
            result, "aacdcaebdac"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc","aaaaa"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"zxyz","xyz","pqr","pqr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qr","pqr"}
        );
        org.junit.Assert.assertEquals(
            result, "pqr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ac","abc","bcd","def","efg","abc"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","efghip","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","tac","act"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","elderberry","fig","grape","date"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xy","yx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xy","yx","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","xyx","wyx","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abckiwidefg","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "zyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","m","yx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape","hwmnop","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","ana","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"r","tac","act"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","wyx","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","j","v"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","m","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","xyx","wyx","xky","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","grape","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "grape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","m","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","banana","kiwi","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","yx","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"r","tac","act","r","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxy","xyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxy","xyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrsturv","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","iHaTethis","aaappleddzz","e","f","g","h","titd","i","j","k","lsupersonic","mhwmnop","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","gg","h","i","j","zyxk","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","g","h","haaappleddzz","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","u","z"}
        );
        org.junit.Assert.assertEquals(
            result, "haaappleddzz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"orange","grape","banana","","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","aaappleddzz","s","t","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","tit"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "zyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","yx","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","j","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abckiwidefg","hijklmnop","qrstuv","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","ana","banana","riwi","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hiijklmnop","abcdefg","hijklmnop","qrstuv","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hiijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hiijklmnop","abcdefg","hijklmnop","qrstuv","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hiijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","xy","yx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglce","eAgLe","iHaTethis","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","xyx","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","elderberry","fig","o","date"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","banana","riwi","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","","m","n","o","p","q","r","aaappleddzz","s","t","u","v","w","x","y","ana","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","banana","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","actyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "actyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wxyz","iHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "zyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","","m","n","o","p","q","r","aaappleddzz","s","t","u","v","w","x","y","ana","cabcdeapefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdeapefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","cbad","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","j","eAgLe","iHaTethis","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xiHaTethisyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethiss","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","xy","xyx","wyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","tac","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "tac"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xy","yx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","banana","date","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abckiwidefg","hijklmnop","qrstuv","abcxkydefg","wxyz","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","cabcdefg","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"tac","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "tac"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","grape","ana","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","","cherry","elderberry","fig","o","date"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdHXs9s1Qg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg","i"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","qcabcdHXs9s1Qg","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","zyx","xy","xy"}
        );
        org.junit.Assert.assertEquals(
            result, "zyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ta","wyx","yzyx","yxiHaTethisyxx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxiHaTethisyxx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","grape","xyxx"}
        );
        org.junit.Assert.assertEquals(
            result, "grape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","datze","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx","zyx","xy"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","yx","hijklmnop","qrstuv","abcgdefg","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","grape","ana","banana","bb","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iHaTethis","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"titd","yx","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "titd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abckiwidefg","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","l","m","n","o","p","q","r","s","t","u","v","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"d","wxy75XPBFq19","iHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "wxy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","grape","aana","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","act"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","iHaTethis","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","abcgdefg","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","banana","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "abcgdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","supersonic","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","yxhwmnop","xy","yx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxhwmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","xy","supersonic","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrsturv","quv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","apeAgLee","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","abcgdefg","wxxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","cabcdefg","pear","ape","xylophone","ape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ha","b","c","d","e","f","g","h","haaappleddzz","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","u","z"}
        );
        org.junit.Assert.assertEquals(
            result, "haaappleddzz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","wxxyz","iHaTethis","iHaTethis","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhwmnop","hijklmnop","qrsturv","quv","wxyz","b"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat"}
        );
        org.junit.Assert.assertEquals(
            result, "cat"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","ha"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","wy75XPBFq19","txy","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","banana","riwi","pear","ana","orange"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iHaTethis","pear","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","gefghip","h","i","j","k","l","m","n","o","p","xx","q","r","aaappleddzz","s","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhwmnop","hijklmnop","qrsturv","quv","wxyz","b","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","actyxv","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","iHaTethiselderberry","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiselderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","zyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","xyx","zyx","xnyx","xnyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"orange","grape","banana","","pear","pear","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"","apple","orange","abanana","grape","ana","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrsturv","wxyz","b"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","wu","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","tit","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","cbad","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z","x"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","yxhwmnop","xy","yx","wyx","yx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxhwmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","s","wy75XPBFq19","txy","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"arbcdefg","qrstuv","wxyz","wxyz","arbcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "arbcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cba"}
        );
        org.junit.Assert.assertEquals(
            result, "cba"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"kiwi","tac","act","r","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","b"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","wyx","zyx","xyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","xy","abcxkydefg","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","gg","h","i","j","k","l","m","n","o","p","qcabcdHXs9s1Qg","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","eAgLe","iHaTethis","o"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","Eadategle","iHaTethis","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","z"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLcbadee","geAgLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"r","tac","act","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","xy","sutpersonic","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "sutpersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","cbad","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z","x","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","f","g","h","i","j","k","l","m","n","p","q","r","s","t","wu","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hiijklmnop","supersonic","apple","orange","grape","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "hiijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","Egle","iHaTeth","eAgLe","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTeth"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","abcdef","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","cbad","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","","v","w","x","y","z","x","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","xyx","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "xky"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"lmcnop","abcdefg","lmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxy","xyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","cbad","e","f","g","h","titd","zyxkz","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z","k","k"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","k","l","","m","n","o","p","q","r","aaappleddzz","s","t","u","ee","v","w","x","y","ana","cabcdeapefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdeapefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","abcxkydefg","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","tit","v","w","x","z"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","xy","xy","supersonic","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","bbanana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","kiwi","pear","ape","xylophone","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iHaTethis","eAgLe","iqHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iqHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglexyx","iHaTethiss","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","banana","riwi","pear","ana","riwi"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","xy","xyx","wyx","xyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","eAgLe","iHaTethis","y","o"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape","hwmnop","qcabcdHXs9s1Qg","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"osupersonic","o","yzyxo","eAgLe","iHaTethis","y","o"}
        );
        org.junit.Assert.assertEquals(
            result, "osupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","titd","d","e","f","g","h","haaappleddzz","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","u","z"}
        );
        org.junit.Assert.assertEquals(
            result, "haaappleddzz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","ape","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","x","wyx","zyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","xcbaky","xyx","wyx","xky","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "xcbaky"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","actyxv","xy","abcxkydefg","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuv","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","iHaTeth","kiwi","pear","ape","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","xyx","grape","banana","kiwi","rpear","xylophone","datze","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cbad","e","f","g","h","titd","i","j","k","lsupersonic","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "lsupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","xylophoneiHaTethi","iHaTeth","kiwi","pear","ape","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophoneiHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","wy75XPBFq19","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","iHaTeth","kiwi","pear","ape","xylophone","supersoniec","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","actyxf","g","h","i","j","k","l","m","n","o","p","qcabcdHXs9s1Qg","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","ee","banana","kiwi","pear","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","e"}
        );
        org.junit.Assert.assertEquals(
            result, "xy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","wxyz","abckiwidefg","hijklmnop","qrstuactyxfv","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuactyxfv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","banana","pear","abcgdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcgdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","actyxf","g","h","i","j","k","l","m","n","o","p","qcabcdHXs9s1Qg","r","s","t","u","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","xcbaky","xyx","xky","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "xcbaky"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"orange","grape","banana","date","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","iHaTaethis","eAgLe","o","o"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTaethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"grape","xyxx"}
        );
        org.junit.Assert.assertEquals(
            result, "grape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","gg","h","i","j","zyxk","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg","w"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","banana","it","riwi","pear","ana","riwi"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appe","orange","banana","kiwi","pear","ape","xylophone","banana","appe"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"osupersonic","o","quv","eAgLe","iHaTethis","y","o"}
        );
        org.junit.Assert.assertEquals(
            result, "osupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglce","eAgLe","abanana","Eagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eaglce"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","date","qrstuv","abcgdefg","wxxyz","date"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","xiHaTethisyx","kiwi","pear","ape","xylophone","banana","kiwi","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "xiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLLe","iHaTethis","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","grape","ana","banana","bb","pear","bb","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","zyx","xyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","yxhwmnop","xy","yx","wyfwyxx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxhwmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","wxyz","wxyyz","abckiwigdefg","hijklmnop","qrstuactyxfv","wxz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuactyxfv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethiss","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","f","g","h","i","ana","j","k","l","m","n","p","q","r","s","t","wu","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"babckiwidefg","abckiwidefg","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","actyxf","g","h","i","j","k","l","m","n","o","p","qcabcdHXs9s1Qg","r","s","t","u","v","w","x","y","z","i"}
        );
        org.junit.Assert.assertEquals(
            result, "qcabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","rr","k","l","m","actyxv","n","p","q","r","s","t","u","v","w","x","y","z","v"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","cbadana","xyx","xky","ana","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "cbadana"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","h","banana","riwi","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglexyx","hwmnop","iHaTethiss","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","cabcdefg","peiHaTethissar","ape"}
        );
        org.junit.Assert.assertEquals(
            result, "peiHaTethissar"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"o","eAgLe","iHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhwmnop","hijklmnop","quv","wxyz","b"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","Eagle","banana","pear","abcgdefg","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "abcgdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxy","xyx","xyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","iHaTethis","Eaadategle","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wxyz","wxyyz","abckiwigdefg","hijklmnop","qrstuactyxfv","wxz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuactyxfv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","TiHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "TiHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wy75XPBFq19","abckiwidefg","qrstuv","abcgdefg","qrstuuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","z","b"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","iHaiTethis","iHaTethiselderberry","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiselderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","abcgdefg","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","xy","sutpersonicyxgrape","xyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "sutpersonicyxgrape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ale","orange","grape","banana","kiwi","pear","xylophone","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLcbadee","geAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yzyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abckiwidefg","hijklmnop","qrstuv","abcxkydefg","wxyz","abcdefg","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","l","m","n","o","p","q","r","s","t","u","v","x","y","z","o"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethiss","eAgLe","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","zyx","z","orange","grape","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdHXs9s1Qg","d","e","f","g","h","i","j","k","l","m","efghip","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg","i"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdHXs9s1Qg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","banana","pear","ana","riwi"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yzyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dabcxkydefg","Eadategle","actyxv","abcxkydefg","xyx","dabcxkydefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eacabcdefggle","Eagle","eAgLe","tit","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eacabcdefggle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","grape","banana","","pear","pear","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","ale","iHaTeth","kiwi","pear","apee","xylophone","supersoniec","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grape","banana","cabcdefg","pear","ape","xylophone","ape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx","zyx","xyx","xy"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"arbcdefg","qrstuv","iHaiTethis","wxyz","wyfwyxx","arbcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "arbcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"datze","xky","xcbaky","xyx","xky","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "xcbaky"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglce","eAgLe","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "Eaglce"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","xyx","zyx","zyx","xnyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qqrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaagle","iHaTethi","eAgLcbadee","geAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","yx","cabcdefg","d","e","f","gefghip","h","i","j","k","l","m","n","o","p","xx","q","r","aaappleddzz","s","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","gg","h","i","j","zyxk","l","m","n","ziHaTethis","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "ziHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnactyxvp","abcdefg","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnactyxvp"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","x","actyxv","xy","abcxkydefg","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaagle","ixteAgLee","iHaTethi","eAgLcbadee","geAgLee","eAgLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","peaac","banana","riwi","pear","ana","orange"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxEacabcdefggley","xyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxEacabcdefggley"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","Eadategle","iHaTethis","iHaTethis","apple"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","xyx","grape","banana","kiwi","rpear","supersconic","xylophone","datze","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersconic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","banana","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abckiwidefg","hijklmnop","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhwmnop","hijklmnop","qrsturv","quv","wxyz","bhijklmnop","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "bhijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applEaglexyxe","banana","cherry","ee","datze","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "applEaglexyxe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","abanabna","orange","grape","banana","kiwi","pear","apeAgLee","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","x","wyx","yxwy75XPBFq19","zyx","yx","x"}
        );
        org.junit.Assert.assertEquals(
            result, "yxwy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape","hwmnop","qrstuv","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abcdefgcba","abckiwidefg","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","peiHaTethissariHaTethi","eAgLcbadee","geAgLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "peiHaTethissariHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"e","yx","xy","sutpersonic","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "sutpersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"r","tac","act","tac","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaagle","iHaTethi","eAgLcbadee","geAgLee","eAgLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLLe","iHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"superbanana","ale","orange","grape","banana","kiwi","pear","xylophone","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "superbanana"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"f","xyx","zx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grape","banana","cabcdefg","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abckiwidefg","hijklmno","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","s","wy75XPBFq19","txy","yabcdef","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xy","yxx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","HhRQ35","ana","banana","pear","ana","ana","orange"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLcbadee","Eagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","grape","iHaTeth","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","peiHaTethissariHaTethi","eAgLcbadee","geAggrapeLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "peiHaTethissariHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","yx","wyx","zyx","yx","yxx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","b"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","wxyz","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ale","orange","h","banana","kiwi","pear","xylophone","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","gg","h","i","zyxk","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","cabcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","Eagl","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","abcgdefg","wxyz","wxyz","abcgdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"q","iHaTethiselderberry","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiselderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dabcxkydefg","Eadagle","actyxv","xyx","dabcxkydefg"}
        );
        org.junit.Assert.assertEquals(
            result, "dabcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cabcdefg","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxEacabcdefggleyzx","f","zx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxEacabcdefggleyzx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ixteAgLee","fig","hxfigy","xyx","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "ixteAgLee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHasTethiss","eAgLeqrstuuv","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLeqrstuuv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","a","ana","banana","kiwi","pear","ana"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","yxhwmnop","xy","yx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxhwmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"rr","tac","act","r","iHaiTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaiTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","grape","bbanana","kiwi","pear","bbanana"}
        );
        org.junit.Assert.assertEquals(
            result, "grape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"d","wxy75XPBFq19","iHaTethis","iHaTethiis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "wxy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","wy75XPBFq19","xEaglexyx","wy75XPBFq19"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wyx","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","xylophoneiHaTethi","iHaTeth","kiwi","pear","ape","xylophone","p","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophoneiHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eeagle","Eagle","Eagl","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","titv","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","hxy","wyx","yxwy75XPBFq19","zyx","yx","x","x"}
        );
        org.junit.Assert.assertEquals(
            result, "yxwy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLLe","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLLe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"tac","act"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","cabcdefg","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"d","wxy75XPBFq19","iHaTethis","iHaTethiis","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "wxy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","xyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"titv","actyxv","xy","abcxkydefg","xyx","titv"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iHaTethis","eAgLe","iqHaTethis","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iqHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","ana","banana","riwi","pear","ana","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLee","iHaTethi"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","xy","xyx","wyx","xyx","wyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"oarbcdefg","o","eAgLe","iHaTethis","o","eAgLe","o"}
        );
        org.junit.Assert.assertEquals(
            result, "oarbcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abckiwidefg","hijklmnop","qrstuv","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwidefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnactyxvp","abcdefg","hijklEaaglemnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnactyxvp"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appe","orange","nana","kiwi","pear","ape","xylophone","banana","appe"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aana","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "cat"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","xy","ywyx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applEaglexyxe","banana","fig","cherry","ee","datze","elderberry","t","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "applEaglexyxe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","xzyx","yzyx","yzyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xy","yxx","wyx","yx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","iHaTeth","kiwi","pear","appe","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","wxy75XPBFq19","banana","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "wxy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applEaglexyxe","ac","banana","fig","a","cherry","ee","datze","elderberry","t","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "applEaglexyxe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxy","xyx","xyx","abcgdefg","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "abcgdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"","mEagle","apple","orange","abanana","grape","ana","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "mEagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","abcdef","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","grape","ana","banana","bb","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","x","Eeagle","wyx","zyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "Eeagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eLAgLe","TiHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "TiHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"r","tac","acefghipt","tac","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "acefghipt"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"rsonic","abanabna","orange","grape","banana","kiwi","pear","apeAgLee","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","cherry","elderberry","fig","o","date"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","i","j","k","l","n","o","p","q","r","s","t","u","v","x","y","z","b"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","gdrape","bbanana","kiwi","pear","hxfigytt","bbanana"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigytt"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hxfigy","zyx","xyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","wxyz","wxyyz","abckiwigdefg","hijklmnop","qrstuactyxfv","wxz","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuactyxfv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuv","abcgdefg","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","ta","supersonic","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhwmnop","hijklmnop","qrsturv","quv","wxyz","qrsturv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"titd","yx","wyx","zyx","yx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "titd"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","wxyz","abcdefg","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hxy","xyx","xyx","abcgdefg","xyx","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grapeapplEaglexyxe","apear","banana","cabcdefg","pear","ape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "grapeapplEaglexyxe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grapeapplEaglexyxe","apear","banana","cabcdefg","per","ape","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "grapeapplEaglexyxe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","yzyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","e","f","g","h","i","j","l","m","n","e","o","p","q","r","s","t","u","v","x","y","z","o"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abmEaecdefg","hijklmnop","abcgdefg","wxxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abmEaecdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wy75XPBFq19","xEaglexyx","wy75XPBFq19"}
        );
        org.junit.Assert.assertEquals(
            result, "wy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"osupersonic","o","yzyxo","eAgLe","iHaTethis","y","o","o"}
        );
        org.junit.Assert.assertEquals(
            result, "osupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"bqrstuvb","xyx","wyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "bqrstuvb"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","ee","banana","kiwi","pear","xylophone","supersonic","ear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"titd","yx","wyx","zyx","yx","ititd","wyefghipx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyefghipx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","hxyyxhwmnop","actyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxyyxhwmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","epeiHaTethissariHaTethi","eAgLcbadee","geAggrapeLee","eAgLee","eAgLee","eAgLee"}
        );
        org.junit.Assert.assertEquals(
            result, "epeiHaTethissariHaTethi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","xiHaTethisyx","kiwi","pear","ape","xylophone","haaaappleddzzeaappleddezz","banana","kiwi","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "xiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abEadaglecdefg","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "abEadaglecdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","banana","pear","abanabna"}
        );
        org.junit.Assert.assertEquals(
            result, "abcgdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yxiHaTethisyx","wyx","zyx","yx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxy","xyx","zyx","xpxyx","xpyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","zyxx","hxy","xyx","zyx","xyx","xeefghiitnyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xeefghiitnyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear","xylophone","supersonic","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanana","grape","it","riwi","pear","ana","riwi"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xcbakyxyx","xyx","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xcbakyxyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","iHaTethis","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","wxyz","wxyyz","abckiwigdefg","hijklmnop","wxz","abcdefg","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "abckiwigdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","","cherry","elderberry","fig","wxxyz","date"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","cat","qrstuv","wxyz","gdrape","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grawxyzpe","bbanana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "grawxyzpe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","xy","sutpersonicyxgrape","xyx","xyx","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "sutpersonicyxgrape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"bbanaa","apple","orange","grpape","bbanana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","qrstuv","wxyz","abcdefg","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yEaaglex","wwyx","xy","yxx","wyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "yEaaglex"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eadategle","xy","supersonic","xyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eaglexyx","iHaTethiss","eAgLe","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiss"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wyx","zyx","yzyx","yx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","tac","aana","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "tac"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","hxfigy","zyx","xyx","xyx","yxyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "hxfigy"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"tacc","r","o","act","tac","tac","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","appe","zyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "appe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yxyzyx","tialetd","yx","wyx","zyx","yx","hxyyxhwmnop","ititd","wyefghipx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyefghipx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","ha","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","iHaTethi","eAgLcbadee","geAgLee","eAgLee","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLcbadee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","xylophone","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abmEaecdefg","abcdefg","hijklmnop","qrstuv","wxyz","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abmEaecdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"lmcnop","abcdefg","bbanaa","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","acat"}
        );
        org.junit.Assert.assertEquals(
            result, "acat"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qvuv","mhwmnop","hijklmnop","qrsturv","quv","wxyz","qrsturv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","wxz","wyx","zyx","yzyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wxz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aana","ccat","aana","aana"}
        );
        org.junit.Assert.assertEquals(
            result, "ccat"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","cabcdefg","d","cacdefg","e","f","g","h","i","j","l","m","n","e","o","p","q","r","s","t","u","v","x","y","z","o"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"eAgLe","iqHaititTethis","iHaTethis","eAgLe","iqHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iqHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ppear","wwyx","xy","yx","wyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "ppear"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","x","Eeagle","wyx","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "Eeagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xxxyxiHaTethisyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xxxyxiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"titv","actyxv","xy","abcxkydefg","xyx","titv","titv"}
        );
        org.junit.Assert.assertEquals(
            result, "abcxkydefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","abanabna","orange","kiqHaititTethisiwi","grape","banana","kiwi","pear","apeAgLee","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "kiqHaititTethisiwi"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xky","cbabana","xyx","xky","ana","xky"}
        );
        org.junit.Assert.assertEquals(
            result, "cbabana"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yxiHaTethisyx","wyx","yx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "yxiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","abanabna","abcgdefg","ana","wxy75XPBFq19","baxyxnana","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "wxy75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wwyx","xwyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wwyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","cabcdefg","zyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "cabcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","oarange","abanabna","ana","banana","bb","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "oarange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xyx","xy","xyx","wyx","xyx","wyx","wyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","e","f","g","h","i","j","k","l","m","n","o","p","q","abcdef","s","t","u","v","w","x","y","z","z","b"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdef"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"yx","zyx","yzyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "yzyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xnyx","xyx","xyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "xnyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","xyx","wyx","xyx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","appe","orange","banana","xiHaTethisyx","kiwi","pear","rr","ape","xylophone","haaaappleddzzeaappleddezz","banana","kiwi","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "xiHaTethisyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ppear","wwyx","xy","yx","eAgLee","wjyx","zyx"}
        );
        org.junit.Assert.assertEquals(
            result, "eAgLee"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hiijklm","apee","apple","orange","grape","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"lmcnpop","abcdefg","qrmeAgLLeuv","lmnop","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "qrmeAgLLeuv"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdef","ghijkl","mnopqr","stuvwx"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdef"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaa","bbb","ccc","ddd"}
        );
        org.junit.Assert.assertEquals(
            result, "aaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaa","aaaaaa","aaaaaaaa","aaaaaaaaaa"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaa"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","dates"}
        );
        org.junit.Assert.assertEquals(
            result, "cherry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefghijklmnopqrstuvwxyz","a"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefghijklmnopqrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"word","word","word"}
        );
        org.junit.Assert.assertEquals(
            result, "word"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","dog","pig"}
        );
        org.junit.Assert.assertEquals(
            result, "cat"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","kiwi","pear","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","f","ijklmn","efghip","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"f","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","l","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {""}
        );
        org.junit.Assert.assertEquals(
            result, ""
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaddzzupersonic","apple","xylopthone","m","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","f","d","efghip","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn","efghwxyzip","cbca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","grape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","date","elderberry","fig","grape","dwate","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75X1PBFq19","75XPBFq19","HXs9s1Q","HSSbsh","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "75X1PBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","xylopthone","m","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"f","ff",""}
        );
        org.junit.Assert.assertEquals(
            result, "f"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","cb","efghip","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaaddzzupersonic","xylophonee","apple","xylopthone","m","pear","xylophone","saaaddzzupersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "saaaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuvwxyz","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","banaapplena","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","efghip","cba","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "a"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","kiw","apple","orange","grape","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HSSbzyxsh","HXs9s1Q"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HSSbzyxsh","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","banaapplena","yelderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HSSbzyxsh","HXs9s1Q","gBFWztts67","HXs9s1Q"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","elderberry","fig","grape","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","EEagle","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","banaapplena","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","iHaTethis","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ff",""}
        );
        org.junit.Assert.assertEquals(
            result, "ff"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ae","orange","grape","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","u","iHaTethis","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appHSSbzyxshle","banana","cherry","l","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "appHSSbzyxshle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","xylopthone","m","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "xylopthone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","epear","grape","m","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","","HXs9s1Q","efghip","cba","aaddzz"}
        );
        org.junit.Assert.assertEquals(
            result, "HXs9s1Q"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","act","tac","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn","efghwxyezip","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","wcbcaxyz","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","act","tac","cat","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"f"}
        );
        org.junit.Assert.assertEquals(
            result, "f"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"v","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"banana","l","elderberry","fig","grape","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","efghwxyzip","cbca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"kiw","abcdefg","wcbcawxyz","hijklmnop","qrstuv","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"kiw"}
        );
        org.junit.Assert.assertEquals(
            result, "kiw"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HXs9s1","HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","xylopthone","m","kiwi","perar","ae"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","efghip","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"icbajklmn","efghwzip"}
        );
        org.junit.Assert.assertEquals(
            result, "icbajklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}
        );
        org.junit.Assert.assertEquals(
            result, "b"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EwEaglcbe","EE","EEagle","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "EwEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"","ijklmn","ikjklmn","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyz","banana","cherry","l","elderberry","fig","fg","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "wcbcaxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuvwxyz","wxyz","abcdefg","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","elderberry","fig"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","grape","z","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","iHaTethis","Eagle","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","elderberry","chery","efghwxyezip","grape","apple"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","banaapplena","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","ijklmn","ikjklmn","efghwxyzip","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuvwxyz","wxyz","abcdefg","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","m","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","kiw","apple","orange","grape","banana","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grape","banana","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","tac","HXs9s1Q","HXs9s1Q","gBFWztts67","HXs9s1Q"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"c",""}
        );
        org.junit.Assert.assertEquals(
            result, "c"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","xylophoone","pear","xylophone","grape","z","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdgefg","x","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","l","elderberry","fig","grape","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","wyx","zyx","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "wyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","m","kiwi","t","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","cb","efgphip","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efgphip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"banana","elderberry","fig","grape","chehrry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","dwate","pear","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaddzzupersonic","apple","xylopthone","m","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijklmn","efghip","qrstuv","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijklmn","efghip","qrstuv","ijklmn","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","banaapplena","elderberry","fig","grape","cherry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrstuv","wxyzs","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"banana","l","elderberry","fig","grape","cherry","cherry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","abcdefg","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","eAgLe","EEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","ijklmn","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","xylophone","kiwi","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"datev","v","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","orange","grape","banana","kiwi","pear","banana","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "orange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"jijklmn","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","efghwxyzip","cbbcca","cbcca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","EEagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgL","iHaaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cc","c",""}
        );
        org.junit.Assert.assertEquals(
            result, "c"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrsutuv","aaddzz","qrstuv","ijklmn","efghip","cba","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","elderberry","fig","grape","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","75XPBFq19","HXs9s1Q","HSSbzyxsh","HXs9s1Q","gBFWztts67","HhRQ35"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","epear","grape","m","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75X1PBFq19","75XPBFq19","HXs9s1Q","gBFWzFtts67","HSSbsh","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "75X1PBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","yx","zyx","xy"}
        );
        org.junit.Assert.assertEquals(
            result, "zyx"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrtuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","","HXs9s1Q","efghip","f","cba","aaddzz"}
        );
        org.junit.Assert.assertEquals(
            result, "HXs9s1Q"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"jijlklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "jijlklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","wcbz","qrstuv","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","a","wcbcaxyz","wcbcaxyz","wcbcaxyz","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","orange","grape","banana","kiwi","apear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","epear","grape","dwate","m","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","hijklkmnop","wxyzz","qrstuvwxyz","wxyz","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","banaapplena","fig","rgrape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","kiw","apple","orange","grape","banana","peqrstuvar","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "peqrstuvar"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmmn","efghwxyezip","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","kiw","apple","orange","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","m","kiwi","pear","Eagle","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"efghwezip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle"}
        );
        org.junit.Assert.assertEquals(
            result, "applle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HXs9s1","HhRQ35","HhRQ35h","gcbbccaBFWztts67","75XPBFq19","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "gcbbccaBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","epear","grape","m","kiwi","pear","gxylophoneerape"}
        );
        org.junit.Assert.assertEquals(
            result, "gxylophoneerape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","act","tac","catcb","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "catcb"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"chery","efghwxyzip","cbca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","efghwxyzip","cbca","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"l","elderberry","fig","grape","cherry","cherry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","ikjklmn","efghwxyzip","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"jimjlk","jimjlklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "jimjlklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"fg","ikjklmn","efghwxyzip","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"banana","l","elderberry","fig","grape","cherry","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HXs9s1","HhRQ35","gcbbccaBFWztts67","75XPBFq19","HSSbsh"}
        );
        org.junit.Assert.assertEquals(
            result, "gcbbccaBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","banaapplena","elderberry","fig","pgrape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supefgphipersonic","apple","orange","grape","banana","kiwi","pear","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supefgphipersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"elderberryEEaglcbe","Echehrry","EEagle","eAgLe","elderberryEEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberryEEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","grape","z","xylophone","ccff"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","peear","m","kiwi","pear","xylophone","grape","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ae","orange","grape","kiwi","orangchehrrye","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orangchehrrye"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","l","fig","grape","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "cherry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","wcbca","wcbcaxyz","wcbcaxyz","wcbca"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","l","elderberry","fifg","grape","l"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ff","",""}
        );
        org.junit.Assert.assertEquals(
            result, "ff"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","mm","kiwi","t","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","peHXs9s1ear","kiwi","pear","xylophone","grape","xylopthone","xylophone","qrsutuv"}
        );
        org.junit.Assert.assertEquals(
            result, "peHXs9s1ear"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","elderberry","l","grape","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","grape","xylophone","apple","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","qrsutuv","ap","banana","kiwi","pear","orange"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","epear","grape","m","kiwi","wyx","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appllle","y","banana","cherry","l","elderberry","fig","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","elderberry","fig","grape","dwate","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"datev","v","hijklmnop","qrstuv","wxyz","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","pear","xylophone","kiwi","supersonic","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdgefg","x","","hijklmnop","qrstuv","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"l","elderberry","fig","grape","nbanana","cherry","cherry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","banaapplena","qrstuv","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"elderberryfigEEaglcbe","Echehrry","EEagle","eAgLe","elderberryEEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberryfigEEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","ueAgL","EE","EEagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","a","wcbcaxyz","wcbcaxyz","hijklmjnop","wcbcaxyz","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmjnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appllle","y","banana","cherry","l","elderberry","fig","elderberry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appll","banana","cherry","l","banaapplena","yelderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","grape","rgrape","kiwi","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","eAgLe","iHaTethis","EEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","cherry","HSSbsh","cherry"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","elderberry","fig","grrape","cherry","b"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijklmn","efghip","qrstuv","ijklmn","HXs9s1","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"datev","v","hijklmnop","qrstuv","gBFWztts67wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFWztts67wxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","mm","kiwi","t","h"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","eAgLe","Eagele","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"v","hijklmnop","qrstuv","hijklmnnop","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","xylopthone","m","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","grape","iHaTethis","EEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"f","ff"}
        );
        org.junit.Assert.assertEquals(
            result, "f"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","wcbcaxyz","qrtuv"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"chehrry"}
        );
        org.junit.Assert.assertEquals(
            result, "chehrry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","hijklmnop","qrstuv","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"q"}
        );
        org.junit.Assert.assertEquals(
            result, "q"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","injklmn","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "injklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cc","c","","",""}
        );
        org.junit.Assert.assertEquals(
            result, "c"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","date","ae","fig","grape","dwate","iHaTethis","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","chey","l","elderberry","fig","grape","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","ijklmn","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"l","grape","cherry","cherry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "cherry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"elderberryEEaglcbe","Echehrry","EEagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberryEEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EE","eAgLee","EEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","","banana","cherry","l","banaapplena","fig","grape","banaapplena","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuvwxyz",""}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","cc","c",""}
        );
        org.junit.Assert.assertEquals(
            result, "dwate"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","kiwefghipi","orange","grape","banana","kiwi","pear","xylophone","kiwi","supersonic","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","a","banana","kiwi","dwate","ange","pear","xylophone","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmn","ijklmn","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","xylopthone","m","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","wcbca","i","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","banana","kiwi","r","xylophone","kiwi","supersonic","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"gcbbccaBFWztts67","act","tac","catcb","cat","act","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "gcbbccaBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"q","q"}
        );
        org.junit.Assert.assertEquals(
            result, "q"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","xylopthone","m","gBFWztts67","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HSSbzyxsh","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"gBFWztts67wxyz","saaddzzupersonic","xylopthone","m","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFWztts67wxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuvwxyz","wxyz","abcdefg","jimjllklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","xylophoone","pear","xylophone","grape","zz","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"y","banana","cherry","l","banaapplena","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ae","orange","grape","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","wcbcaxyz","hijklmjnop","wcbcaxyz","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmjnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","HXs9s1Q","gBFWztts67","HXs9s1Q","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appllle","banana","cherry","l","elderberry","elderberry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijkl","efghip","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","a","wcbcaxyz","wcbcaxyz","hijklmjnop","wcbcaxyz","hijklmnop","hijklmjnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmjnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","mmjijlklmn","kiwi","t","h"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"jijlklmln","jijlklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "jijlklmln"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cat","act","tac","catcb","cat","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "catcb"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","tac","HXs9s1Q","qrtuv","HXs9s1Q","gBFWztts67","HXs9s1Q"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","pear","xylophone","grape","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","EEaglcbee","xylopthone","grape","m","kiwi","xylophoone","pear","xylophone","grape","z","xylophone","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","hijklkmnop","grape","iHaTethis","EEaglcherrycbe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcherrycbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyz","banana","HhRQ35fg","cherry","l","elderberry","kiwefghipifig","fg","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "HhRQ35fg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dasaaddzzupersonictev","v","hijklmnop","qrstuv","HSSbzyxsh","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "dasaaddzzupersonictev"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"jimjlk","elderberryEEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberryEEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appllle","y","banana","rry","l","elderberry","fig","elderberry","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ff","y","","",""}
        );
        org.junit.Assert.assertEquals(
            result, "ff"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmmn","efghwxyezip","immn","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","elderberry","fig","grape","elderberry","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EE","EEagl","eAgLe","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"xy","icbajklmn","yx","zyx","xy"}
        );
        org.junit.Assert.assertEquals(
            result, "icbajklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","qrstuvl","banana","cherry","l","banaapplena","fig","rgrape"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvl"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","kiwefghipi","orange","grape","banana","kiwi","pear","kiwi","supersonic","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"chery","efghwxyzip","cherhy","cbca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","banana","cherry","date","elderberry","fig","grape","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"grrape","xylopthone","m","pear","xylophone","m"}
        );
        org.junit.Assert.assertEquals(
            result, "xylopthone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grhijklmjnope","orange","grape","kiwi","pear","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "grhijklmjnope"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","cbca"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklnmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hchehr"}
        );
        org.junit.Assert.assertEquals(
            result, "hchehr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","EErgrape","EE","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrstuvwxyz","wxyz","nbanana","hiEEagljklmnop","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hiEEagljklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"lijklmn","abcdefg","hijklmnop","ijklmn","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"appllgcbbccaBFWztts67e","y","banana","cherry","l","banaapplena","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "appllgcbbccaBFWztts67e"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"gcbbccaBFWztts67","tac","catcb","cat","act","tac"}
        );
        org.junit.Assert.assertEquals(
            result, "gcbbccaBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"grrape","xylopthone","m","pear","xylophone","m","m"}
        );
        org.junit.Assert.assertEquals(
            result, "xylopthone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrstuvwxyz","wxyz","ywxyz","nbanana","hiEEagljklmnop","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hiEEagljklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","grape","rgrape","kiwi","mm","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","m","kiwi","pear","xylophone","m"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","saaddzzupersonic","xylopthone","pea","m","pear","m"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","epear","m","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ff","y","","banana",""}
        );
        org.junit.Assert.assertEquals(
            result, "banana"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","ccc","c",""}
        );
        org.junit.Assert.assertEquals(
            result, "dwate"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","grape","rgrape","kiwi","grape","grape","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","iHaTethiis","apple","banana","cherry","date","elderberry","fig","grape","dwate","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethiis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmmn","efghwxyezip","immn","efghwxyzip","ijklmmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwaxylophoneete","saaddzzupersonic","xylopthone","m","pear","xylophone","xylopthone"}
        );
        org.junit.Assert.assertEquals(
            result, "dwaxylophoneete"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrsutuv","aaddzz","qrstuv","ijklmn","efghip","cba","qrstuv","cba"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdgefg","eAgLe","hijklmnop","qrstuv","wxyz","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","grhijklmjnope","orange","grape","pear","xylophone","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "grhijklmjnope"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hchehr","hchehr"}
        );
        org.junit.Assert.assertEquals(
            result, "hchehr"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijklmn","efghip","qrstuv","HXs9s1","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyz","banana","cherry","grappe","l","fig","fg","grape","grappe"}
        );
        org.junit.Assert.assertEquals(
            result, "wcbcaxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","ijklmn","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","qrstuv","ijklmn","cb","efghip","cba","cb"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwaefghwxyezipte","dwate","datev","c",""}
        );
        org.junit.Assert.assertEquals(
            result, "dwaefghwxyezipte"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","n","cherry","date","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","qrstuv","akiwibcdefg","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "akiwibcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","m","kiwi","pear","xylophone","m","kiwi"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","date","ae","fig","grape","dwate","iHaTethefghwxyezipis","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethefghwxyezipis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","abcdem","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","a","banana","kiwi","dwate","ange","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","qrstuvwxyz","wxyz","nbanana","hiEEagljklmnop","hijklmnop","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hiEEagljklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","75XPBFq19","HXs9s1Q","HXs9s1Q","gBFWztts67","HXs9s1Q","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","wcbcawxyz","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhijklmnop","wcbbcaxyz","jijlklmn","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "mhijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dasaaddzzupersonictev","v","hijklmnop","qrstuv","HSSbzyxsh"}
        );
        org.junit.Assert.assertEquals(
            result, "dasaaddzzupersonictev"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","c","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","elderberry","fig","grapse","elderberry","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","xylopthone","m","gBFgcbbccaBFWztts67Wztts67","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFgcbbccaBFWztts67Wztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"cc","c","75XPBFq19",""}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"injklmn","qrstuv","injklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "injklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","peHXs9s1ear","kiwi","pear","bananaar","xylophone","grape","xylopthone","xylophone","qrsutuv"}
        );
        org.junit.Assert.assertEquals(
            result, "peHXs9s1ear"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","iHaTethiis","orange","grape","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","chey","l","elderberry","fig","grape","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","nbanana","cherry","l","elderberry","fig","grape","elderberry","elderberry"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","7P5XPBFq19","75X1PBFq19","75XPBFq19","HXs9s1Q","HSSbsh","HSSbsh","75X1PBFq19"}
        );
        org.junit.Assert.assertEquals(
            result, "75X1PBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","iHaTethiis","orange","grape","banana","kiwi","pear","xlylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","qrsutuv","ap","banana","kiwi","pear","orange","qrsutuv"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"","act","tac","cat","cat"}
        );
        org.junit.Assert.assertEquals(
            result, "act"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","elderberry","fig","grape","dwate","bananaar"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","HhRQ35","iHaTethis","m","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","hijklkmnop","qrstuv","ijklmn","cb","efghip","cba","cbakiwibcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "cbakiwibcdefg"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdgefg","eAgLe","hijklmnop","qrstuv","wcbcaxyzyz","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","elderberry","fig","grape","dbwate","dwate","bananaar"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","zz","gBFWztts67","75XPBFq19","wcbcawxyz","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"y","banana","cherry","rry","yelderberry","banaapplena","elderberry","fig","grjHIjpape","banaapplena"}
        );
        org.junit.Assert.assertEquals(
            result, "grjHIjpape"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","d","hijklmnop","abcdem","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"catcb","supersonic","apple","aaddzz","xylopthone","grape","m","kiwi","pear","xylophone","grape","xylophone","apple","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","m","kiwi","xylophoone","pear","xylophone","grape","z","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","d","hijklmnop","abcdem","wxyz","qrstuv","abcdem"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"mhijklmnop","wcbbcaxyz","jijlklmn","wcbcaxyz","jijlklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "mhijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","orange","grape","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"catcb","supersonic","apple","aaddzz","xylopthone","grape","m","kiwi","pear","xylophone","appapearle","grape","xylophone","appple","xylophone","appple"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaddzz","f","d"}
        );
        org.junit.Assert.assertEquals(
            result, "aaddzz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apear","c","75XPBFq19","","",""}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ikjklmn","banana","cherry","l","banaapplena","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","kiwefghipi","orange","grape","banana","kiwi","kiwefghipi","pear","orcheyange","kiwi","supersonic","kiwi","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "orcheyange"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"c"}
        );
        org.junit.Assert.assertEquals(
            result, "c"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","hijklkmnop","qrstuvwxyz","wxyz","abcdefg","wxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"elderberryEEaglcbe","Echehrry","EEagle","eAgLe","elderberryEEaglcbe","elderberryEEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberryEEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","l","banaapplena","elderberry","fig","grape","l"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaaddzzupersonic","xylophonee","apple","xylopthone","m","pear","saaaddzzupersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "saaaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","kiw","apple","orange","grape","peqrstuvar","banana","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "peqrstuvar"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","HhRQ35h","hijklmjnop","wcbcaxyz","hijklmnop","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmjnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","gerape","xylopthone","epear","grape","m","kiwi","actm","pear","grape","pear"}
        );
        org.junit.Assert.assertEquals(
            result, "xylopthone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","gerape","xylopthone","peacheyrr","pearr","grape","m","pgrhijklmjnopeear","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "pgrhijklmjnopeear"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","gBFWztts67","75XPBFq19","tac","HXs9s1Q","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwate","c","Egagle","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "Eagle"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","","banana","cherry","l","banaapplena","fiig","grape","banaapplena","grape","banana"}
        );
        org.junit.Assert.assertEquals(
            result, "banaapplena"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"iHaTethis","apple","banana","cherry","elderberry","fig","grape","w","iHaTethis"}
        );
        org.junit.Assert.assertEquals(
            result, "iHaTethis"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"gcbbccaBFWztts67","act","tac","catcb","cat","act","tac","gcbbccaBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "gcbbccaBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"HhRQ35","75XPBFq19","HXs9s1Q","HXs9s1Q","gBFWztts67","HXs9ss1Q","HXs9s1Q","gBFWztts67"}
        );
        org.junit.Assert.assertEquals(
            result, "75XPBFq19"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaddzzupersonic","oxylopthone","m","kwi","p","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","banana","cherry","l","dwate","elderberry","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"saaddzzupersonic","apple","x","xylopthone","m","kiwi","pear","xylophone","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","xylopthone","m","xe","gBFWztts67","xylophone","xe","m","m"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","kiwefghipi","orange","grape","banana","kiwi","pear","kiwi","supersonic","kiwi","pear","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","ae","orange","grape","kiwi","orangchehrrye","c"}
        );
        org.junit.Assert.assertEquals(
            result, "orangchehrrye"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","y","chey","l","elderberry","fig","grape","elderberry","l"}
        );
        org.junit.Assert.assertEquals(
            result, "elderberry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applle","banana","cherry","ll","fig","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "cherry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","efghwxyzip","cbbcca","cbccca"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"gBFkiwtts67","apple","m","gBFWztts67","appple"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFkiwtts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylophonechehrry","xylopthone","grape","m","kiwi","pear","xylophone","grape","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophonechehrry"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwatwe","ccc","c","","ccc"}
        );
        org.junit.Assert.assertEquals(
            result, "dwatwe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"applleEEagl","banana","cherry","l","elderberry","fig","grrape","cherry","b"}
        );
        org.junit.Assert.assertEquals(
            result, "applleEEagl"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklnmn","efghwxyzip","ijklnmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyzip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyzyz","applle","chey","l","elderberry","fig","grape","elderberry","l"}
        );
        org.junit.Assert.assertEquals(
            result, "wcbcaxyzyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"Eagle","jijlklmlneAgLe","eAgLe","u","iHaTethis","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "jijlklmlneAgLe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","epear","grape","m","kiwi","wyx","pear","grape","pear","supersonic"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmmn","ijklmn","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "ijklmn"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"v","hijklmnop","qrstuv","grhijklmjnope"}
        );
        org.junit.Assert.assertEquals(
            result, "grhijklmjnope"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"dwatell","saaddzzupersonic","mm","b","t","h"}
        );
        org.junit.Assert.assertEquals(
            result, "saaddzzupersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrtuv","orange","grape","banana","kiwi","pear","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "xylophone"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyz","banana","mhijklmnop","cherry","l","elderberry","kiwefghipifig","fg","grape","cherry","fg"}
        );
        org.junit.Assert.assertEquals(
            result, "mhijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"catcb","supersonic","apple","xylopthone","y","m","kiwi","pear","xylophone","grape","xylophone","apple","xylophone"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuv","ijklmn","efghip","qrstuv","ijklmn","eghip","HXs9s1","ijklmn"}
        );
        org.junit.Assert.assertEquals(
            result, "efghip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","abcdem","hijklmnop","qrstuv","wcbcaxyz"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"wcbcaxyz","banana","cherry","l","elderberry","fg","grape"}
        );
        org.junit.Assert.assertEquals(
            result, "wcbcaxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abcdefg","hijklmnop","abcdefg","wxangez","qrstuv","abcdefg"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","orange","grape","kiwi","r","kiwi","supersonic","supersonic","supersonic","supersonic","apple"}
        );
        org.junit.Assert.assertEquals(
            result, "supersonic"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EE","eAgLEageleee","eAgLee","EEaglcbe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"EEaglcbe","ueAgL","EEagle","eAgLe"}
        );
        org.junit.Assert.assertEquals(
            result, "EEaglcbe"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnop","a","wcbcaxyz","wcbcaxyz","wcbcaxyz","hijklmnop","hijklmnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"oxylopthone","hijklmnop","abcdem","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"apple","xylopthone","m","xe","gBFWztts67","xylophone","xe","m","m","xe"}
        );
        org.junit.Assert.assertEquals(
            result, "gBFWztts67"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"ijklmmn","efghwxyezip","efghwxzyezip","efghwxyzip"}
        );
        org.junit.Assert.assertEquals(
            result, "efghwxyezip"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"qrstuvwxyz","yx"}
        );
        org.junit.Assert.assertEquals(
            result, "qrstuvwxyz"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"supersonic","apple","xylopthone","grape","peHXs9s1ear","kiwi","pear","grape","xylopthone","xylophone","qrsutuv"}
        );
        org.junit.Assert.assertEquals(
            result, "peHXs9s1ear"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnnop"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"oxylopthone","hijklmnop","abcdem","hmijklmnop","wxyz","qrstuv"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnop"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"hijklmnnop","c","Egagle","Eagle"}
        );
        org.junit.Assert.assertEquals(
            result, "hijklmnnop"
        );
    }
}

