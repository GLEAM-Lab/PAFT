package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_SORT_NUMBERS {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("three");
        org.junit.Assert.assertEquals(
            result, "three"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("three five nine");
        org.junit.Assert.assertEquals(
            result, "three five nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five zero four seven nine eight");
        org.junit.Assert.assertEquals(
            result, "zero four five seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("six five four three two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four eight two");
        org.junit.Assert.assertEquals(
            result, "two four eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine");
        org.junit.Assert.assertEquals(
            result, "nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one six two four nine");
        org.junit.Assert.assertEquals(
            result, "one two four six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two seven eight zero five");
        org.junit.Assert.assertEquals(
            result, "zero two five seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine zero");
        org.junit.Assert.assertEquals(
            result, "zero nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven three one");
        org.junit.Assert.assertEquals(
            result, "one three seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two three three four five six");
        org.junit.Assert.assertEquals(
            result, "two two three three four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero one two four five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five four three two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two zero nine four five six");
        org.junit.Assert.assertEquals(
            result, "zero two four five six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five four one zero");
        org.junit.Assert.assertEquals(
            result, "zero one four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two zero nine");
        org.junit.Assert.assertEquals(
            result, "zero two nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four eight");
        org.junit.Assert.assertEquals(
            result, "four eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four one seven");
        org.junit.Assert.assertEquals(
            result, "zero one four five seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("six");
        org.junit.Assert.assertEquals(
            result, "six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two four five six");
        org.junit.Assert.assertEquals(
            result, "two two four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four one");
        org.junit.Assert.assertEquals(
            result, "zero one four five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five seven");
        org.junit.Assert.assertEquals(
            result, "zero five seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four two");
        org.junit.Assert.assertEquals(
            result, "two four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four");
        org.junit.Assert.assertEquals(
            result, "four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two six");
        org.junit.Assert.assertEquals(
            result, "two six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two five six");
        org.junit.Assert.assertEquals(
            result, "two two five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven");
        org.junit.Assert.assertEquals(
            result, "seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four zero five four one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero zero one two four four five five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero one two five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four four eight two");
        org.junit.Assert.assertEquals(
            result, "two four four eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven three");
        org.junit.Assert.assertEquals(
            result, "three seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven five four three two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four five six");
        org.junit.Assert.assertEquals(
            result, "two four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero four one");
        org.junit.Assert.assertEquals(
            result, "zero one four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero two six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five eight two six");
        org.junit.Assert.assertEquals(
            result, "zero two five six eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero");
        org.junit.Assert.assertEquals(
            result, "zero"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one six");
        org.junit.Assert.assertEquals(
            result, "one six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine six");
        org.junit.Assert.assertEquals(
            result, "six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two seven eight five");
        org.junit.Assert.assertEquals(
            result, "two five seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two");
        org.junit.Assert.assertEquals(
            result, "two"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two three three four five six");
        org.junit.Assert.assertEquals(
            result, "two three three four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four seven");
        org.junit.Assert.assertEquals(
            result, "zero four five seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven one zero");
        org.junit.Assert.assertEquals(
            result, "zero one seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four five six");
        org.junit.Assert.assertEquals(
            result, "four five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine");
        org.junit.Assert.assertEquals(
            result, "two nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two three");
        org.junit.Assert.assertEquals(
            result, "two two three"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five six");
        org.junit.Assert.assertEquals(
            result, "zero five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five");
        org.junit.Assert.assertEquals(
            result, "zero five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five two six");
        org.junit.Assert.assertEquals(
            result, "zero two five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four zero four one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero zero one two four four five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four eight two two three");
        org.junit.Assert.assertEquals(
            result, "two two three four eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five four one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "one two four five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine seven six five two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two five six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six zero");
        org.junit.Assert.assertEquals(
            result, "zero six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine seven six five two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two two five six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four six");
        org.junit.Assert.assertEquals(
            result, "two four six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine one zero");
        org.junit.Assert.assertEquals(
            result, "zero one nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four six");
        org.junit.Assert.assertEquals(
            result, "four six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four");
        org.junit.Assert.assertEquals(
            result, "zero four five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero two six");
        org.junit.Assert.assertEquals(
            result, "zero two six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five one");
        org.junit.Assert.assertEquals(
            result, "zero one five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine six five two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two five six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine eight seven six five four one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero four one seven");
        org.junit.Assert.assertEquals(
            result, "zero one four seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two zero nine four zero four one");
        org.junit.Assert.assertEquals(
            result, "zero zero one two four four nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one zero five six");
        org.junit.Assert.assertEquals(
            result, "zero one five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine seven six five two zero");
        org.junit.Assert.assertEquals(
            result, "zero two five six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine eight seven six five four one zero one zero");
        org.junit.Assert.assertEquals(
            result, "zero zero one one two four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine seven six five two one zero five two six");
        org.junit.Assert.assertEquals(
            result, "zero one two two two five five six six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one");
        org.junit.Assert.assertEquals(
            result, "one"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven five four three two one");
        org.junit.Assert.assertEquals(
            result, "one two three four five seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two seven");
        org.junit.Assert.assertEquals(
            result, "two seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six");
        org.junit.Assert.assertEquals(
            result, "six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five one seven six");
        org.junit.Assert.assertEquals(
            result, "zero one five six seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine one zero five four one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero one one two four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero two");
        org.junit.Assert.assertEquals(
            result, "zero two"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four zero four one");
        org.junit.Assert.assertEquals(
            result, "zero one two four four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four zero five four one seven");
        org.junit.Assert.assertEquals(
            result, "zero zero one four four five five seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two four five");
        org.junit.Assert.assertEquals(
            result, "two two four five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero one seven eight two six");
        org.junit.Assert.assertEquals(
            result, "zero one two six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine two six");
        org.junit.Assert.assertEquals(
            result, "two six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine one zero five four one six");
        org.junit.Assert.assertEquals(
            result, "zero one one four five six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two seven eight zero five four five six");
        org.junit.Assert.assertEquals(
            result, "zero two two four five five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four zero four");
        org.junit.Assert.assertEquals(
            result, "zero two four four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two zero six");
        org.junit.Assert.assertEquals(
            result, "zero two six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two three");
        org.junit.Assert.assertEquals(
            result, "two three"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine seven six five two one zero four five six");
        org.junit.Assert.assertEquals(
            result, "zero one two two four five five six six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine six five two three three four five six one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three three four five five six six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight one zero");
        org.junit.Assert.assertEquals(
            result, "zero one eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four");
        org.junit.Assert.assertEquals(
            result, "two four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four two nine eight seven six five four one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two four four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two two");
        org.junit.Assert.assertEquals(
            result, "two two"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine seven six five two one");
        org.junit.Assert.assertEquals(
            result, "one two five six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one six two nine");
        org.junit.Assert.assertEquals(
            result, "one two six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four one seven eight six");
        org.junit.Assert.assertEquals(
            result, "zero one four five six seven eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine seven four six");
        org.junit.Assert.assertEquals(
            result, "four six seven nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five six");
        org.junit.Assert.assertEquals(
            result, "five six"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two zero nine four one");
        org.junit.Assert.assertEquals(
            result, "zero one two four nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero five four one eight two six");
        org.junit.Assert.assertEquals(
            result, "zero one two four five six eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine one zero five four one");
        org.junit.Assert.assertEquals(
            result, "zero one one four five nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one two three four five six seven eight nine");
        org.junit.Assert.assertEquals(
            result, "one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five four three two one");
        org.junit.Assert.assertEquals(
            result, "one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five seven eight six nine four zero two one three");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four six nine eight seven one five zero two three");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven one zero five two four eight six nine three");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero one two three four five six seven eight nine");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two four six eight zero one three five seven nine");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine seven five three one eight six four two zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one zero three four two six five seven eight nine");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven five zero four nine eight two six one three");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five");
        org.junit.Assert.assertEquals(
            result, "five"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("eight");
        org.junit.Assert.assertEquals(
            result, "eight"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four six nine eight five zero two three");
        org.junit.Assert.assertEquals(
            result, "zero two three four five six eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one two three three");
        org.junit.Assert.assertEquals(
            result, "one two three three"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("two nine eight seven six five four three two one seven nine");
        org.junit.Assert.assertEquals(
            result, "one two two three four five six seven seven eight nine nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero one two five six seven eight nine");
        org.junit.Assert.assertEquals(
            result, "zero one two five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five four six nine eight seven one five zero two three two one three");
        org.junit.Assert.assertEquals(
            result, "zero one one two two three three four five five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five four two one");
        org.junit.Assert.assertEquals(
            result, "one two four five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one two one four");
        org.junit.Assert.assertEquals(
            result, "one one two four"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one one one one one");
        org.junit.Assert.assertEquals(
            result, "one one one one one"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one two");
        org.junit.Assert.assertEquals(
            result, "one two"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("four four two six nine two zero");
        org.junit.Assert.assertEquals(
            result, "zero two two four four six nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven six five two three two one");
        org.junit.Assert.assertEquals(
            result, "one two two three five six seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight seven two one");
        org.junit.Assert.assertEquals(
            result, "one two seven eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("one zero three nine");
        org.junit.Assert.assertEquals(
            result, "zero one three nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("nine eight");
        org.junit.Assert.assertEquals(
            result, "eight nine"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("seven one zero five three");
        org.junit.Assert.assertEquals(
            result, "zero one three five seven"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("zero two three");
        org.junit.Assert.assertEquals(
            result, "zero two three"
        );
    }
}

