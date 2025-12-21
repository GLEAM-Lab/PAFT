package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FACTORIAL {
    @org.junit.Test(timeout = 1000)
	public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_4() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(0);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList());
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_5() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_6() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_7() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(6);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_8() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(8);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_9() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(10);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320,45,3628800));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_13() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(12);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320,45,3628800,66,479001600));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_14() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(11);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320,45,3628800,66));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_15() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320,45));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 1000)
	public void test_21() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.FACTORIAL.factorial(13);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1,2,6,24,15,720,28,40320,45,3628800,66,479001600,91));
        org.junit.Assert.assertEquals(result, desired);
    }
}

