package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_PARSE_NESTED_PARENS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()) ((())) () ((())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2,3,1,3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "() (()) ((())) (((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1,2,3,4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()(())((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(())(()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(())(()(()))((()()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()(((())))(()(())))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()((()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((())(()(()))((()()))))(()(()))((()()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()(()(())((()()(((())))(()(())))())(((()))))(()(())))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()(())(()(()))((()()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()(((())))(()(())(((())(()(()))((()()))))(()(()))((()()))))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()()(((())))(()(())))())((()()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()(((())((()()(((())))(()(())))())(((()))))(()(()))))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()(()()(((())))(()(())(((())(()(()))((()()))))(()(()))((()()))))()((()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(7)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()(())((()(()))((()())))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((())(())))())((()()()(()(((()(()))))))))()(((())(()(()))((()()()))()))((()))()(()))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()()()()()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((()))(()()((()))))(()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()()()()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())()))()(()))(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((())()()()((((())(())))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((()()()((()))(())()((()))((()())(())))))))()())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())())))(())(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()(((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((())))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((()(((()))))(()))()()())(())))()(())(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(9)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((())())()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((())()()((((())(())))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()(())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())(())))()()())((()))(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((()))()()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())())))(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((((((((((())))))))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(16)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((((())()()()))()))))(()))(())))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(13)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((())((((())(())))))))())))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())((())))()(())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((()))))))((()))()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()(())())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((())))))))((()))((((((((())((((())(())))(((()()((())((()))(()((((()))()())))))())((((())))((()((((((())))))))))())))))()((((())))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(22)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((()(()))))))(((()))()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((((((()))))))((()))()))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(15)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((((((()))))))((()))())((((((((()(()))))))(((()))())))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(17)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())())(((((((())((((())(()))))(((()()((())((()))(()((((()))()())))))())((((())))((()((((((())))))))))())))))()((((()))))))))(())(())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(19)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((())((()))())(())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(6)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()()()()()((((((((((()))))))((()))()))))()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((())))))((()))))(()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((())))))))((()))((((((((())((((())(())))(((()()((())((()))(()((((()))()())))))())((((()))))((()(((((((())))))))))())))))()((((())))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(22)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()((((()))))))))))((((((()()()((()))(())()(((((())))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(12)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((()()()((()))(())()((()))())))))(()((((((((((()))))))((())))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(12)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((()))(()()((())))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((()))))(()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(8)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "()()()()"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((()()()((()))(())()((()))((()())((((((()))(()()((()))))(()))))(())))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(14)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((()))(()()((())(((((()()()((()))(())()((()))((()())(())))))))))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(14)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((())((((((()(()))))))((((((((((((()))))))((())(()))())))((()))))))((()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(16)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((()(())))()))(((())))()))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(10)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "((((((((((()))))))((()))())))((())()()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(11)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((())((((())(())))(((()()((())((()))(()(((((()))()())))))))((((())))((()((((((())))))))))())))))())((((()))))))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(18)).toArray()
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(((((((((())((((())(())))(((()()((())((()))(()((((()))()())))))())((((())))((()((((((())))))))))())))))()((((()))))))((((())())))(())(())((((((((()))))))((())))())))((())()()))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(20)).toArray()
        );
    }
}
