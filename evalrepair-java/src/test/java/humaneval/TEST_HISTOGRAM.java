package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_HISTOGRAM {
	@org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 2);put('b', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c a b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 2);put('b', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("r t g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 1);put('t', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("b b b b a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_8() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a r s");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('c', 1);put('a', 1);put('r', 1);put('s', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_9() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h e l l o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_10() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_11() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z z l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_12() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);put('b', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_13() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c c c c b b b a a a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('c', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_14() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 3);put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_15() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('e', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_16() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_17() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_18() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_19() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_20() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_21() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_22() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_23() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_24() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('e', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_25() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);put('l', 1);put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_26() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_27() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);put('u', 1);put('z', 1);put('l', 1);put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_28() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 3);put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_29() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 3);put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_30() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_31() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);put('l', 1);put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_32() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);put('o', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_33() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);put('r', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_34() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_35() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_36() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('e', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_37() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_38() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j m m m p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_39() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_40() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);put('o', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_41() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_42() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_43() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_44() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_45() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_46() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_47() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_48() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_49() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_50() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_51() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_52() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_53() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('e', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_54() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c c c c b b b a a a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('c', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_55() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z z l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_56() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_57() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e p f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('e', 1);put('p', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_58() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b h i j j m m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_59() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_60() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_61() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_62() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_63() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l h i j j k l m m m p e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_64() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_65() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('h', 1);put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_66() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m m m n o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);put('o', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_67() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l h i j j k l m e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 2);put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_68() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_69() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_70() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c h i j j k l m o d e p f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_71() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z z e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_72() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z z e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_73() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p u z z l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_74() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_75() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("s");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_76() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k h i j j k l m o o p p p p r r r m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_77() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j m m m p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_78() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l h i j j k l m e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 2);put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_79() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p r h i j j k l m m m n o o o o p r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_80() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_81() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_82() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_83() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_84() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j p p r r r j k l m");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_85() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c c c c b b a a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('c', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_86() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 3);put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_87() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_88() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_89() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j m m m");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_90() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k l m o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_91() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i j j k h i j j k l m o o p p p p r r r m m n o o o o p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_92() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_93() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r r r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 3);put('r', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_94() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l h i j j k l m e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 2);put('j', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_95() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p p r h i j j p p p r r r p k l m m m n o o o o p r u z z e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_96() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);put('b', 1);put('c', 1);put('d', 1);put('e', 1);put('f', 1);put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_97() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_98() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_99() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a p h i j j k l m o a a a a a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_100() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a a a a b b b b b b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_101() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_102() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p l e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);put('l', 1);put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_103() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h i p p r h i j j k l m o o r r j k l m");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 3);put('j', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_104() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_105() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p q q q r r r s s s t t t u u u v v w w x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('q', 3);put('r', 3);put('s', 3);put('t', 3);put('u', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_106() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);put('w', 6);put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_107() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l m m m m m m m m n n n n n n n n n n n n n n o o p p q q r r s");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('n', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_108() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_109() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_110() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_111() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 3);put('b', 3);put('c', 3);put('d', 3);put('e', 3);put('f', 3);put('g', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_112() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_113() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_114() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('h', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_115() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_116() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_117() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("d");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('d', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_118() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("u");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('u', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_119() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("b");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('b', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_120() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_121() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_122() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_123() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s a a a a b b d d d d f f f g h i s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('d', 8);put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_124() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('g', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_125() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_126() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("s");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_127() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_128() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('c', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_129() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_130() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("n");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('n', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_131() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("v");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('v', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_132() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_133() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("f");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('f', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_134() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y a a a a b b d d d d f f f g h i y y y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);put('w', 6);put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_135() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('i', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_136() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_137() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_138() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_139() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_140() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_141() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_142() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_143() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("m");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('m', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_144() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);put('w', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_145() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_146() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_147() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('w', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_148() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_149() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_150() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("r");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('r', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_151() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("j");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('j', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_152() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_153() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v s x x x x y a a a a b b d d d d f f f g h i y y y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_154() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_155() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("e");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('e', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_156() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_157() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_158() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_159() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_160() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_161() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_162() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_163() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_164() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_165() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_166() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_167() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_168() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l m m m m m m m m n n n n n n n n n n n n n p p q q r r s");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('n', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_169() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_170() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_171() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_172() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("k");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('k', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_173() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_174() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_175() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);put('w', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_176() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_177() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_178() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("y");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('y', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_179() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_180() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_181() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_182() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_183() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 7);put('y', 7);put('z', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_184() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_185() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);put('y', 10);put('z', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_186() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 2);put('y', 2);put('z', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_187() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_188() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 11);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_189() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a b b x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_190() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_191() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_192() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 28);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_193() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_194() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_195() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p q q q r r r s s s t t t u u u v v w w x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('q', 3);put('r', 3);put('s', 3);put('t', 3);put('u', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_196() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_197() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_198() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 21);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_199() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x j a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_200() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y a a a a b b d d d d f f f g h i p y y y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('p', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_201() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_202() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_203() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_204() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_205() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_206() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g l m n o p q r r r s s s s s s s t t t t t t t t a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_207() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_208() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h l a a a a b b d d d d f f f g h i h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_209() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('i', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_210() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_211() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 27);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_212() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_213() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_214() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_215() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x z x y z x y z x z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_216() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_217() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t t t u v w x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 17);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_218() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_219() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_220() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y a b k k l l t t t t t t u v w x y z z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_221() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_222() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_223() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_224() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z e y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('y', 7);put('z', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_225() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_226() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_227() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('f', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_228() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_229() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y z z z z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 31);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_230() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_231() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t l a a a a b b d d d d f f f g h i t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_232() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y a b k k l l t t t t t t u v w x y z z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_233() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);put('y', 10);put('z', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_234() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);put('w', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_235() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_236() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x j a b c d e f a g g h h h j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_237() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_238() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x j a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_239() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_240() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a b b d f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_241() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t a b k k l l t t t t l a a a a b b d d d d f f f g h i t t u v w x y z t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_242() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_243() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_244() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_245() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 26);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_246() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_247() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_248() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 27);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_249() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_250() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x a b c d e f a g g h h x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_251() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_252() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_253() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);put('t', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_254() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 27);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_255() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_256() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_257() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b s s t t t t t t t t u v w x y z j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_258() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s a a a a b b x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 11);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_259() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_260() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_261() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 19);put('t', 19);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_262() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_263() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_264() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s x a b c d e f a g g h h h h i j j j k k k k l l l l a a a a b b f f g i l m n o p q r r r s s s s s s s t t t t s s s t t t t t t u u u u u u v v v l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_265() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_266() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_267() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_268() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_269() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a b b d d d d f f x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i a a b b d d d d f f f g h i f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 26);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_270() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x y z u x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_271() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b a b k k l l t t t t t t u v w x y z f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_272() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_273() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g a a a a b b x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x i i i i i j j j j k k k k l l l l m t t t u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 11);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_274() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s s t t t t t z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 25);put('t', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_275() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_276() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y a b k k l l t t t t t t u v w x y z z x y z x y z x y z x y z x y z a b k k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 12);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_277() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_278() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_279() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_280() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_281() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a a a a b x t t t t t b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_282() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('f', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_283() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_284() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 19);put('t', 19);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_285() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 27);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_286() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);put('t', 6);put('u', 6);put('v', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_287() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b a b k k l l t t t t t t u v w x y z f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_288() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("h x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 27);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_289() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_290() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o u u u v v v v v v w w w w w w x x x z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('v', 6);put('w', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_291() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x z x y z x y z x z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 12);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_292() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_293() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x x x y y y y y z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);put('y', 10);put('z', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_294() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_295() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('z', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_296() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t v v v v v w w w w w w x x x x x x y y y y y z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);put('y', 10);put('z', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_297() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("s a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 8);put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_298() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('y', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_299() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l l t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_300() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_301() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z a a a a b b x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 18);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_302() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t v v v v v w w w w w w x x x x x x y y y y y z z z z z y z e y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);put('y', 10);put('z', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_303() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a a a c a a a a i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_304() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p q q q r r r s s s y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('q', 3);put('r', 3);put('s', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_305() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_306() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t x x y y z z z z z a g g h h h h i j j j k k k k l l n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_307() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z t t t a a a b b d f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_308() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_309() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t l a a a a b x y z x y z x y z x y z x y z x y z e y z u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('y', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_310() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_311() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 19);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_312() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t l a a a a b x y z x y z u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_313() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t t l a a a a b x y z x y z x y z x y z x y z x y y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('y', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_314() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_315() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_316() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_317() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 20);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_318() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b a b k k l l t t t t t t u v w a b k k l l t t t t l a a a a b x y z x y z x y z x y z x y z x y z e y z u v w x y z x y z f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 10);put('t', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_319() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_320() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x l a a a a b b d d d d f f f g h i y z x y z x y x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_321() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t a b k k l l t t t t t t u v w x y z t u v w x y z t t t a a a b b d f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_322() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z s s s s u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_323() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l s t t t t t k l l t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 25);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_324() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('p', 6);put('q', 6);put('r', 6);put('s', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_325() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o u u u v v v v v v w w w w w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('v', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_326() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p s t t t u u u v v w w x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 3);put('u', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_327() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_328() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z y z x y z x y z x y z x y z x y z u x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);put('y', 9);put('z', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_329() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_330() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y a b k k l l t t t t t t u v w x y z z x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 10);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_331() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('f', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_332() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s x a b c d e f a g g h h h h i a b s s t t t t t t t t u v w x y z j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_333() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_334() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g a a a a b b x y z x y z x y z l a a a a b b d d d d f f f g h i x y z x y z x y z x y z x y z x i i i i i j j j j k k k k l l l l m t t t u v w a a a a b b a b k k l l t t t t t t u v w x y z f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_335() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_336() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_337() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_338() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o p q r r r s s s s s s s v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_339() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v a b a b s s s s s t t t t t t t t u v w x y z k k l s t t t t t p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 29);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_340() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o v w w w w w w x x h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('w', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_341() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_342() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l l l m n o t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('l', 4);put('t', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_343() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("o o o o o o p p p r r r s s s s s s t t t t t t u u u u u u v v v v v z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('o', 6);put('s', 6);put('t', 6);put('u', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_344() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('h', 7);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_345() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 13);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_346() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x a b c d e f a g g h h h i j a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g h i j k l m n o p q r s t u v w x y z a b c d e f g m n o p q r r r s s s s s s s t t t t t t t t u v w x y z y z x a b c d e f a g g h h h h i j j j k k k k l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 16);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_347() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b f f g");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_348() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_349() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a b b a b k k l l t t t t t t u v w x y z f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 6);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_350() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r u v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('i', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_351() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d e f a g g h h h i j j j k k k l l l l m n o a b k k l l t t t t t t u v w x y z p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_352() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b c d e f a g g h h h i j j j k k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_353() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r s s s s s s s t t t t t a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 33);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_354() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);put('y', 5);put('z', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_355() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y a a a b b d d d d f f f g h i i i i i j j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t t t x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_356() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("c a a a a b b d f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_357() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_358() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p s t t t u u u v x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t v w w x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_359() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l a a a a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_360() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b k k l l t t t z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_361() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("p p s t t t u u u v x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u q r r r s s s s s s s t t t t t v w w x x y y z z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('s', 14);put('t', 14);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_362() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b a b s s s s s t t t t t t t t u v w x y z a b s s s s s t t t t t t t t u v w x y z k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 24);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_363() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x x y z x y z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_364() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("l p p q q q r r r s s s t t t u u u v v w w x x y y z z a a a a b b d d d d f f f g h i");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 4);put('d', 4);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_365() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("t a b k k l l l l m n o p q r r r s s s s s s s t t t t t t t t u v w x y z");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_366() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x a b c d e f a g g h h h h i a b c d e f a g g h h h i j j j k k a b k k l l t t t t t t u v w x a b c d e f o o o o o o p p p p p p q q q q q q r r r r r r s s s s s s t t t t t t u u u u u u v v v v v v w w w w w w x x x x y y z z z z z a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t t a a a a b b d d d d f f f g h i x y z o p q r r r s s s s s t t t t t");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('t', 22);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_367() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x z x y z x y x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_368() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x a b c d e f a g g h h h h i j j j k k k k l l l l m n o p q r r r s s s s s s s t t t t x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 9);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_369() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x y z x y z x y z x y z x y z z x y z x y z x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 8);put('z', 8);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_370() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a a b b c c d d");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 2);put('b', 2);put('c', 2);put('d', 2);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_371() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("x x x x x");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('x', 5);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_372() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d a b c d a b c d");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 3);put('b', 3);put('c', 3);put('d', 3);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_373() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a");
		HashMap<Character, Integer> desired = new HashMap<Character, Integer>() {{
			put('a', 1);
		}};
		org.junit.Assert.assertEquals(result, desired);
	}
}
