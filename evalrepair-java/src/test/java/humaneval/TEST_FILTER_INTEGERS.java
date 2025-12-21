package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_FILTER_INTEGERS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4,new HashMap<Object, Object>(),new ArrayList<Integer>(),23.2,9,"adasd"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3,"c",3,3,"a","b"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,4,5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"2","3",4,-5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",2.71828,null,false,"watermelon",42
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,-1,0,999
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,-1,0,999).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,1,2,3,4,5,6,7,8,9
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,2,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","world","how","are","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,3.253739830287621,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "arare","world","how","are","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","are","you","hellhelloo","how"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-4.6,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4.6,7.8,"aapplebc",new HashMap<Object, Object>(),new ArrayList<Integer>(),2.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",2.71828,null,false,"watermelon",42,2.71828
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-4.6,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,-4.6,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","how","test","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(){{put("1.5", "hellhelloo");put("2.5", "-2");put("2.7", "-2");put("3.0", "-2");put("82.08860694438306", "hello");put("-51.08332919278058", "Guxr");put("18.590257578242174", "are");put("61.76736727274371", "HECIzOixT");put("62.37768526891736", "hello");}},3.14
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("1.5", "hellhelloo");put("2.5", "-2");put("2.7", "-2");put("3.0", "-2");put("82.08860694438306", "hello");put("-51.08332919278058", "Guxr");put("18.590257578242174", "are");put("61.76736727274371", "HECIzOixT");put("62.37768526891736", "hello");put("4.6", "watermelon");}},true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(){{put("1.5", "hellhelloo");put("2.5", "-2");put("2.7", "-2");put("3.0", "-2");put("82.08860694438306", "hello");put("-51.08332919278058", "Guxr");put("18.590257578242174", "are");put("61.76736727274371", "HECIzOixT");put("62.37768526891736", "hello");put("4.6", "watermelon");}},3.14
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-51.08332919278058,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                78.61928819331277,-6.77509560458482,-16.107923403329096,-80.34678514569492
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,1.5,2.7
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","how","","ho-2w","worldhow","test","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14,"test"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4.6,7.8,"aapplebc",new HashMap<Object, Object>(),new ArrayList<Integer>(),2.5,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.178596277327428,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                8,1,2,3,4,5,5,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1,2,3,4,5,5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple","appaapplebcle",2.71828,null,false,"watermelon",42,2.71828,"apple"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),7.8
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-16.107923403329096,-4.6,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,1.32,3.0,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","are","you","hellhelloo","howatermelonw"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc","cabc",new HashMap<Object, Object>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14,null
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","heho-2wllhelloo","are","you","hellhelloo","how"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,1.32,3.0,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","-2","you","htestlHECIzOixTonw","hellhelloo","howatermelHECIzOixTonw"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,1.5,2.8509645275834243,2.212995480233853,2.8509645275834243
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,-1,0,999,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,-1,0,999,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","-22","how","-2","you","htestlHECIzOixTonw","hellhelloo","howatermelHECIzOixTonw"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3.0,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"watermelon",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14,"test"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),7.8,4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,1.5,1.5,3.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","-22","htestlHECoIzOixTonw","how","-2","you","htestlHECIzOixTonw","hellhelloo","howatermelHECIzOixTonw"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4.6,7.8,3.14,"aapplebc",new HashMap<Object, Object>(),5.274713462957015,new ArrayList<Integer>(),2.5,7.8
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,1.5,2.8509645275834243,2.212995480233853,2.5072599122885295,2.8509645275834243,2.7
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,1,42,3,4,5,6,7,8,9
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,1,42,3,4,5,6,7,8,9).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","habcow","te"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.750003778215635,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),7.8
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,2.7,3.0,-16.107923403329096,-4.6,-4.6,-16.107923403329096
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","","ho-2w","worldhow","test","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","world","hhow","how","are"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc","cabc",new HashMap<Object, Object>(),new ArrayList<Integer>(),"cabc"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,8.693163028136272,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,8.693163028136272,"abc",2.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                78.61928819331277,2.8509645275834243,2.71828,-80.34678514569492
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",2.71828,null,false,"watermelon",42,2.71828,"watermelon"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,7.554464521917485,4.6,-80.34678514569492,"abc",1.5283152591294504,new HashMap<Object, Object>(),new ArrayList<Integer>(),7.8,4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","","ho-2w","worldhow","test","you","test"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",2.71828,null,false,"wahellhellootermelon",42
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","how","","ho-2w","worldhowhow","test","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                78.61928819331277,2.8509645275834243,2.71828,-80.34678514569492,-80.34678514569492
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.6,7.8,"abc",new HashMap<Object, Object>(),"abchaFbcowF",new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"2","3",4,-5,"2"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,-5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,1.8262900227722207,-4.6,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","how","","ho-2w","worldhowhowworldhow","test","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"2","3",4,-5,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,-5,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,3.0,1.5,3.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,4.750003778215635,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),8.164599210590822
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",2.71828,null,"-2",false,"wahellhellootermelon",42
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,3.253739830287621,3.0,-4.6,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                7.8,"aapplebc",new HashMap<Object, Object>(),new ArrayList<Integer>(),2.5,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,1.9007953338604962,1.8262900227722207,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,-1,0,999,999,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,-1,0,999,999,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","how","world","","ho-2w","worldhow","test","you","how"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,3.0,1.5,61.76736727274371
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,3.2332014890113814,4.6,7.8,"abc",new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,null,0,-10,"test",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14,3.14
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","are","you","hellhelloo"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,-1,0,999,5,998,1,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,-1,0,999,5,998,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,-16.107923403329096,-4.6,2.7,-4.6,-4.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4.178596277327428,7.8,"abc",new HashMap<Object, Object>(),new ArrayList<Integer>(),4.6,new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.5,3.9551271039754745,7.8,5.274713462957015,"abc","cabc",new HashMap<Object, Object>(),new ArrayList<Integer>(),"cabc"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,1.5,2.5072599122885295,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                8,1,2,3,4,5,5,1,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,1,2,3,4,5,5,1,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,null,0,-10,"watermelon",new ArrayList<Integer>(),new HashMap<Object, Object>(),3.14,"test"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,-10).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.5,1.32,3.0,1.5,1.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "apple",7.554464521917485,null,"-2",42
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(42).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "hello","worldd","how","heho-2wllhelloo","are","you","hellhelloo","how","you"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2.7,3.0,8.164599210590822,1.5,3.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,false,2,3,"four",3,5.5,6,"seven","8",9.0,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,7,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,false,2,3,"four",3,5.5,6,"seven","8",9.0,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,6,"33","seven","8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",-64.85350532834121,5.5,6,"seven","8",9.0,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new ArrayList<Integer>(),new ArrayList<Integer>(),8,8
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"8",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"foneour",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new HashMap<Object, Object>(),true,false,"3"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",6,"KmDGrOFc",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",5.5,6,"seven","8",9.0,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"8",5.5,6,"seven","8",9.0,5.5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",5.5,6,"seven","8",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,1,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "8seven",2,false,2,3,"four",3,5.5,6,"seven","8",9.0,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"foneour",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"8",5.5,6,-8,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,-8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven",6,"8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,false,2,3,"four","sevefour",3,5.5,6,"seven","8",9.0,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),8,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,8,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,4.38335732992138,new ArrayList<Integer>(),new HashMap<Object, Object>(),1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",-64.85350532834121,5.5,6,"r7","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new HashMap<Object, Object>(),1,5.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,4,"foneour",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",5.5,6,"seven","8",9.0,"four8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                98,1,2,4,"four",5.5,6,"33","8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(98,1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "33",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3,0,2,3,"four",5.5,6,"seven",9.0,"four",3
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,3,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(){{put("64", true);put("-39", false);put("-34", false);put("7", true);put("-75", false);put("10", true);put("-46", true);}},1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,6,"b",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,5.5,6,"seven","8",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"foneour",5.5,6,"seven",10.26739187055086,"8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new ArrayList<Integer>(),8,8
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(8,8).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,10,4,5.5,6,"b",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,10,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "8seven",2,false,2,3,"four",3,5.5,6,"seven","8",5.6,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,false,2,3,"four","sevefour",3,5.5,6,false,"seven","8",9.0,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "8seven",2,false,2,3,"four",3,5.5,6,"seve","8",5.6,"8"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,2,3,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,4.38335732992138,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4.38335732992138
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,10,4,"b",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,10,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,"8",2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"foneour",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,6,"seven",5.47111118517439,"8",9.0,9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4,4,4,4,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,1,4,4,4,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,0,new ArrayList<Integer>(),new HashMap<Object, Object>(),1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,"four",9.0,3
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(){{put("64", true);put("-39", false);put("-34", false);put("7", true);put("-75", false);put("10", true);put("-46", true);}},1,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,1,"3",4,4.38335732992138,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4.38335732992138
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,1,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,"four",-56.438301600649005,5.5,6,"8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "2","abc","def","2"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,5.5,6,"seven",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,true,false,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),"yPnTiQSee",8,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4,8,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3,0,2,3,"four",5.5,6,"seven","four",3,6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,0,2,3,6,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"33",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),1,4,4,4,4,4,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4,1,4,4,4,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "foneour",5.5,6,"seven","8",9.0,9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new ArrayList<Integer>(),"abc","def",new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,3,3,"8",5.5,"seven","8",9.0,5.5,9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(){{put("-70.36440522028158", "4");put("5.5", "JGIGeY");}},1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"88KGNzr",4,0,new ArrayList<Integer>(),new HashMap<Object, Object>(),1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,0,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,5.5,6,"seven","8",9.0,1
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                -46,2,1,"one",new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-46,2,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,3,5.5,6,"seven","sveven","88","four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,4,"four",5.5,7,"8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,89,2,3,"four",5.5,6,"seven","8",9.0,2,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,89,2,3,6,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,"four",9.0,3,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,0.0,"0",false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3,3,3,3,3,3,3,3,3,3
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3,3,3,3,3,3,3,3,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,null,4,5,null,6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,4,5,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new ArrayList<Integer>(),""
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                null,true,false,"",new HashMap<Object, Object>(),new ArrayList<Integer>(),"",new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1.23,"1",18,15,83
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(18,15,83).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven","8",9.0,9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven","8",9.0,9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("e", 4);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,true,false,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");put("2", 6);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 6);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,true,false,true,true,false,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,5.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,true,false,true,false,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,true,false,true,true,false,true,true,false,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,8.103551238465293,5,"seven","8",9.0,9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("EWGKODI", true);put("3", false);put("fd", false);put("cwhDbmHbxo", false);put("pZrsjm", false);put("bdef", true);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven","8",9.0,9.0,"four",5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,3,"seven","8",9.0,9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", false);put("9.0", false);put("-8.01599287644595", true);put("47.41964484826693", false);put("77.33841772040307", true);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,"seven",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),true,false,new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "7");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,-77,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,5.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,-77).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,8.103551238465293,5,"seven","8",9.0,9.0,"four",2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", "66");put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,true,false,true,false,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("seven", "7");put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven",9.0,9.0,"four",5,5.5,5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "22");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "2");put("9", "ZFWxOITt");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "2");put("9", "ZFWxOITt");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",8.103551238465293,5,"seven","8",9.0,9.0,"four",2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,true,false,true,false,true,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),29,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,88,"four",5.5,6,"seven","8",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,88,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,5.6,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(){{put("cgvOtL", 94);put("NK", 38);put("", 93);put("gRqSI", 4);}},new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,false,true,false,false,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,true,false,true,false,true,false,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,false,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");put("3", "VcusZwMFvpuf");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "7");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,8.103551238465293,5,"seven","8",9.0,9.0,"four",2,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,5.6,-91.64995486742458,36.87380586293398,-39.73466216049497,-97.4543891854423,-34.863898336778206,77.9888126831583,1.3,2,"3",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,-63.32672563437423,"one",new ArrayList<Integer>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("seven", "7");put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,true,false,true,false,true,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,3
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,true,true,false,true,true,false,true,false,true,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("ffoursix", false);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("ffoursix", false);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,5.6
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,8.103551238465293,4,"seven","8",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),29,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,-77,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,5.6,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,-77,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,false,true,false,false,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"2",new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),"2"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,5.6,-91.64995486742458,36.87380586293398,-39.73466216049497,-97.4543891854423,-34.863898336778206,77.9888126831583,1.3,2,"3",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,-63.32672563437423,"one",new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("eighEWGKODIt", 62);put("UgeMtOIu", 84);put("H", 2);put("yuCTQ", -52);put("KXZN", 62);put("vbiLqOQgc", 6);put("SIPe", 73);put("a", 21);put("7", 17);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "77");put("eight", -27);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "77");put("eight", -27);}},new HashMap<Object, Object>(){{put("seven", "77");put("eight", -27);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven",9.0,"four",5,5.5,5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 7);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", "66");put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 7);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,"2",new HashMap<Object, Object>(),new HashMap<Object, Object>(),2,"2"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,88,"four",5.5,6,"seven","8",9.0,"seven"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,88,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                false,true,false,true,true,false,true,true,false,true,false,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);put("2", -31);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",9.88644526278784,5,"seven","8",9.0,9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,true,true,false,true,true,false,true,false,true,true,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                5.6,2,3,"four",5.5,5,"seven","8",9.0,9.0,"four",5,3
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,5,3).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", false);put("9.0", false);put("-8.01599287644595", true);put("47.41964484826693", false);put("77.33841772040307", true);}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                75.4577532294401
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,new HashMap<Object, Object>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"eighEWGKODIt",3,"four",5.5,5,35.50077440707028,"seven","8",9.0,9.0,"four",5
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,5).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),true,false,new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "7");}},new HashMap<Object, Object>(){{put("anNy", false);put("L", true);put("GNjA", false);put("six", true);put("one", false);put("bBHMqFdc", true);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new HashMap<Object, Object>(){{put("cgvOtL", 94);put("NK", 38);put("", 93);put("gRqSI", 4);}},new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,5,"seven","8",9.0,9.0,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",8.103551238465293,"seven","8",9.0,9.0,"four",2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),4.857451407639946,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,false,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,true,"",new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,88,5.5,6,"seven","8",9.0,"seven"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,88,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,5.6,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(){{put("cgvOtL", 94);put("NK", 38);put("", 93);put("gRqSI", 4);}},true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,5.6,-91.64995486742458,36.87380586293398,-39.73466216049497,-97.4543891854423,-34.863898336778206,77.9888126831583,1.3,2,"3",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,-63.32672563437423,"one",-63.32672563437423,new ArrayList<Integer>(),true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,5.6,-91.64995486742458,36.87380586293398,-39.73466216049497,-97.4543891854423,-34.863898336778206,77.9888126831583,1.3,2,"3",5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,-63.32672563437423,"one",new ArrayList<Integer>(),new ArrayList<Integer>(),true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",8.103551238465293,5,"seven","8",9.0,9.0,"four",2,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                -58,0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},true,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-58,0,2,4,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("61", "b");put("9", "ei");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "ei");put("4", "Vf");put("-58", "5");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");put("9", -7);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "7");}},new HashMap<Object, Object>(){{put("anNy", false);put("L", true);put("GNjA", false);put("six", true);put("one", false);put("bBHMqFdc", true);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four",5.5,6,"seven","8",9.0,2,5.5,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "3",1,"cusZwMFvpu","5","5","5","5",7,"5","5"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,false,"3",4,79.39385924319336,49.594049472095335,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,79.39385924319336,49.594049472095335,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("-48.36360896397747", 37.306238284726476);put("9.0", 0.7145384384689315);put("43.68781663560574", 75.06494853429405);put("-27.569606066450092", 37.306238284726476);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),29,true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4,61,29).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,3,"four",5.5,8.103551238465293,4,"seven",1,"8",9.0,"four"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,3,4,1).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"four",5.5,5,"seven","8",9.0,9.0,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,5,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", false);put("9.0", false);put("-8.01599287644595", true);put("47.41964484826693", false);put("77.33841772040307", true);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,2,"four",5.5,6,"seven",9.0
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,2,6).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("def", -36);}},new HashMap<Object, Object>(){{put("one", 1);put("def", -36);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("one", 1);put("def", -36);}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("one", 1);put("def", -36);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,new ArrayList<Integer>(),true,false,new HashMap<Object, Object>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("Euq", -51.268307787490144);put("gn", 43.68781663560574);put("gRqSI", -13.324245400181894);put("XgKdCCzUpb", -90.43508845946826);put("kZqixRtNtY", -81.52388939145081);put("SLGdJC", 5.6);put("EnBsDBhyo", -69.12207297923977);put("R", -34.863898336778206);put("daOoxXE", 18.49102083179814);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,false,4,79.39385924319336,49.594049472095335,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,79.39385924319336,49.594049472095335,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"3",4,5.6,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,true,true,false,true,true,false,true,false,true,true,true,false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");put("2", 6);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");put("2", 6);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,new ArrayList<Integer>(),new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,38,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,5.6,4
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,38,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(){{put("five", 6);put("six", "");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 6);put("six", "");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("qbgoCBzBK", 99.70129825332367);put("", 96.49878140613427);put("d", 1.050449309718769);put("gtM", 9.435039861338495);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 81);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "7");put("eight", 81);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,false,new ArrayList<Integer>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                "3",1,"cusZwMFvpu","5","5",7,"5","5",7
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,7,7).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}},new HashMap<Object, Object>(){{put("seven", "77");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", true);put("9.0", false);put("47.41964484826693", false);put("77.33841772040307", true);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", true);put("9.0", false);put("47.41964484826693", false);put("77.33841772040307", true);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "ffour7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "ffour7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,"3",4,5.6,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,true,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("EWGKODI", true);put("3", false);put("fd", false);put("cwhDbmHbxo", false);put("pZrsjm", false);put("bdef", true);}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,0,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,4,0).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                true,false,true,true,false,true,true,true,true,false,true
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                6.235719294932776,0,2,"3",4,5.6,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,4).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                0,2,5,"3",4,7.9826049819970235,new ArrayList<Integer>(),new HashMap<Object, Object>(),true,true,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0,2,5,4,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", "66");put("six", "6");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                1,2,3,"four","foufr",5.5,6,"seven","8",9.0,2,5.5,2
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1,2,3,6,2,2).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "2");put("9", "ZFWxOITt");put("seveen", "gn");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("seven", "2");put("9", "ZFWxOITt");put("seveen", "gn");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "2");put("9", "ZFWxOITt");put("seveen", "gn");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", "66");put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}},new HashMap<Object, Object>(){{put("five", "66");put("six", "6");}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                -57,2,"3",4,79.39385924319336,75.06494853429405,35.50077440707028,37.306238284726476,77.9888126831583,-22.544858750883094,43.68781663560574,61,new HashMap<Object, Object>(),true,new HashMap<Object, Object>(){{put("9.0", "");put("77.9888126831583", "zFA");put("96.49878140613427", 15);put("1.3", "b");put("43.68781663560574", 4);put("37.306238284726476", true);put("5.6", null);}},false
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-57,2,4,61).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");put("NNK", "eight2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "62");put("NNK", "eight2");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("eighEWGKODIt", 7);}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("-15.842422215662566", false);put("9.435039861338495", true);put("6.733087772135377", true);put("-69.12207297923977", false);put("-84.39276411726209", false);put("-16.267889483115", false);put("-99.6018588630581", true);put("18.79725092012319", true);put("16.32275391068592", true);put("-10.758925193989825", false);}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "");put("fi", "6666");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");put("fi", "6666");}},new HashMap<Object, Object>(){{put("five", 5);put("six", "");put("fi", "6666");}},new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(){{put("one", 1);put("two", "2");}},new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("61", "b");put("9", "eight");put("4", "Vf");put("-58", "5");put("3", "VcusZwMFvpuf");}},new HashMap<Object, Object>(){{put("five", -35);put("sEWGKODIix", 4);}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);put("ieight", 3);}},new HashMap<Object, Object>(){{put("five", -35);put("sEWGKODIix", 4);}},new HashMap<Object, Object>(){{put("five", -35);put("sEWGKODIix", 4);}},new HashMap<Object, Object>(){{put("five", -35);put("sEWGKODIix", 4);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("five", 5);put("six", "6");}},new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("VvUwelV", true);put("Eb", true);put("five", false);put("R", false);put("Quo", false);put("SIPe", true);put("jCDAG", false);put("7", false);put("ffour7", false);}},new HashMap<Object, Object>(){{put("five", 6);put("six", "6");}},new HashMap<Object, Object>(){{put("seven", "7");put("eight", 8);}}
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(),new HashMap<Object, Object>(){{put("75.06494853429405", true);put("5.5", false);put("9.0", false);put("-8.01599287644595", true);put("47.41964484826693", false);put("77.33841772040307", true);put("41.03430562738179", false);}},new HashMap<Object, Object>(),new HashMap<Object, Object>()
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
}
