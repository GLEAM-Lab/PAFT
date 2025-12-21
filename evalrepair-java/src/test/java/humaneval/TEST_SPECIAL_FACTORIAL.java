package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_SPECIAL_FACTORIAL {
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(1));
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(2));
    }
}
