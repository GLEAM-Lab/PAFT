package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_NUMERICAL_LETTER_GRADE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3,1.7,2,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","C-","C","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1,0.3,1.5,2.8,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D-","C-","B","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,2.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","C+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.1,2.7,1.8,0.9,0.5,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C","D","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,0.8,3.5,0.9,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","D","A-","D","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.5,0.7,3.3,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","D-","B+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.1,3.0,2.9,2.8,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B+","B","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.8,2.5,1.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B-","C","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,4.0,4.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.7,1.7,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0,2.0,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","C","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.5,3.2,2.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.5,1.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,3.5,0.9,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","A-","D","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,2.5,3.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","A","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5,3.9,2.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","A","C+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,2.5,3.9,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","A","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.7,2.7,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","B-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.709427582366981,4.0,4.0,4.0,4.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,3.5,3.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","A-","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5,3.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","A","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.042839384499805,2.5,3.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D+","B-","A","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,2.5,3.9,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","A","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.1,2.7,1.8,0.9,0.5,3.2179011133442392,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C","D","D-","B+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.1,1.042839384499805,1.8,0.9,0.5,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","D+","C","D","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.5,3.3,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","B+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,2.5,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","B-","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,2.9,2.8,0.8,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B","B","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.709427582366981,4.0,4.0,4.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,2.9,2.8,1.805599623539984}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.5,1.9,1.0,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,2.2,1.0,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","C+","D","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,0.8,3.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","D","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,2.9,3.763604414675102,2.8,0.8,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B","A","B","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.0,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","D","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9912671479260595,3.709427582366981,2.2,1.395524873610277,3.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","C+","C-","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0,2.0,2.0,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","C","C","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,1.7,3.2,3.8,2.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","C-","B+","A","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.9,1.0,3.2,1.4895722008503087,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","D","B+","C-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.215384727410053,3.9912671479260595,3.709427582366981,2.2,1.395524873610277,2.7,3.5,1.8,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","A","C+","C-","B-","A-","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9113959701215952,2.5,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","B-","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,2.5,3.9,2.508642056561272,1.0,3.2,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","A","B-","D","B+","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,2.5,3.9,1.0,3.2,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","A","D","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,1.805599623539984,2.5,1.8175526777169158,1.9,4.0,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","B-","C","C","A+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0,1.4964639270220252,2.0,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","C-","C","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.4369192900023102,3.9,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C-","A","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0,1.4964639270220252,2.0,2.0,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","C-","C","C","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.9608727800276897,3.0,2.9,2.8,1.805599623539984,2.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","B","B","B","C","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,2.2,1.0,3.8,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","C+","D","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9113959701215952,3.5,2.5,1.0,3.2,2.1050281908694695,1.0,2.1050281908694695}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","A-","B-","D","B+","C+","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,0.3312835169497219,3.739849311828012,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","D-","A","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.0,1.0,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","D","D","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.215384727410053,3.709427582366981,2.2,1.395524873610277,2.7,3.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","C+","C-","B-","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.7,2.7,1.7,1.9019261670109442}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","B-","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,2.9,3.763604414675102,2.8,0.8,2.7,3.763604414675102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B","A","B","D","B-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.9608727800276897,3.0,2.8,1.805599623539984,2.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","B","B","C","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.8,3.2,3.0,2.9,2.8,1.805599623539984}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B+","B","B","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.5,1.9,1.0,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C","D","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.5,3.2,2.5,1.8,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","B-","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,1.607214262835292,2.5,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","C-","B-","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.9,1.0,3.2,1.4895722008503087,1.0,1.4895722008503087}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","D","B+","C-","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.9,2.9,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","B","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0,2.3849863566858387,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B-","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,0.3312835169497219,3.9,1.9,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","D-","A","C","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.8,3.2,3.0,2.9,2.8,3.763604414675102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B+","B","B","B","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,0.8,3.5,1.9,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","D","A-","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.8,3.5,0.9,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","A-","D","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.2,3.8,2.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B+","A","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9113959701215952,2.5,1.0,3.2,2.3477546845755017,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","B-","D","B+","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8623548805291374,3.2,2.5,3.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B+","B-","A","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.5,3.2,2.5,1.8133352848348985,3.763604414675102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","B-","C","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5,0.6908813412299079,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.5,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.5,3.2,2.5,1.8133352848348985,3.763604414675102,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","B-","C","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,2.9,2.8,0.8,2.7,0.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B","B","D","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.4885808177051267,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","C-","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.508642056561272,3.2,2.5,1.4964639270220252,3.9,2.508642056561272,1.0,3.2,1.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B+","B-","C-","A","B-","D","B+","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.8,3.3679104584481987,0.9,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","A-","D","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9113959701215952,2.5,1.0,3.2,2.3477546845755017,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","B-","D","B+","B-","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2179011133442392,3.2,3.9,1.0,3.2,3.2179011133442392,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B+","A","D","B+","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.394938144630335,3.709427582366981,2.2,1.395524873610277,2.508642056561272,3.5,1.8,1.395524873610277}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","C+","C-","B-","A-","C","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.2,1.4369192900023102,3.9,1.0,3.2,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B+","C-","A","D","B+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,1.805599623539984,3.9,1.0,3.2,1.4885808177051267,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C","A","D","B+","C-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.805599623539984,3.9,2.5,1.0,3.2,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A","B-","D","B+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,2.2,1.0,2.2,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","C+","D","C+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.215384727410053,3.709427582366981,2.5281471981485772,2.2,1.395524873610277,2.7,3.5,1.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","B-","C+","C-","B-","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,3.9,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","A","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.2,3.8,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B+","A","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,1.0,3.5,3.5,2.3663717052423885,1.8,1.6143077055865451,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","A-","A-","B-","C","C-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.1,3.0,1.042839384499805,3.7622258594833253,3.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B+","B","D+","A","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.0,3.081305199201915,2.5794486932430405}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.2,3.8,3.0,2.9,2.8,3.763604414675102}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A","B","B","B","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.5,3.9,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","A","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,2.5,3.9,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","B-","A","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6908813412299079,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,2.5,2.2,3.8,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B-","C+","A","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.2,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","D+","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2000284044866794,3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,1.2224601670126722,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,2.0,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C-","C-","D+","D+","D-","D-","E","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,1.7,1.3,1.2224601670126722,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","C-","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,1.2678826261426561,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.8978243038752357,2.0,3.5,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","A-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,0.8,1.99,1.7,1.69,1.3,3.3462428245777955,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","D","C","C-","C-","D+","A-","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,1.5,3.5,2.8,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","A-","B","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,0,0,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","E","E","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.3,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","D+","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","D-","D-","A+","D","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.2929830834956118,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","D-","D-","A+","D","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,1.2678826261426561,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.1,1.3,1.2224601670126722,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","D+","D+","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,1.412808394510622,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,1.412808394510622,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.4482181743363216,2.993721077381442,1.69,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","B-","B","C-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,0,0,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","E","E","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.31,2.3,1.7,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","C+","C-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.6,2.5,2.4,2.3,2.189704692581822,2.1,2.9960109163522706,2.1,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","B","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,2,2.7,2.3,1,1.7,1.3,0,0.7,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","C","B-","C+","D","C-","D+","E","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,1.7,1.3,1.2224601670126722,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,3.0,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","B","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.838695609224668,2.6123925604631633,2.1,2.0,2.1,3.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","B","B-","C+","C","C+","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.2929830834956118,1,1.7,1.3,0.5,4,0.7538009542820233,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","D-","A+","D","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.6024630952660888,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.29,3.0,2.99,2.7,2.69,1.7,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","B+","B","B","B-","B-","C-","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,2.5,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,2.29,2.7490299294737928,1.7,1.69,1.3,0.7,0.69,4.0,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B-","C+","C+","B","C-","C-","D+","D-","D-","A+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,1.5,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","C-","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2000284044866794,3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,2.94732785210108,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,0.7,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","D-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,2.993721077381442,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,1.030006862889675}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,0.2,1.1,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","D-","D+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,1.7,2.414149158442383,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","B-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,4,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","A+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.838695609224668,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","B","B-","C+","C","C+","A-","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,3.1,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","B+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,1.7,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+","A","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.5280954091696397,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,1.29,2.2498793154663708,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","D+","C+","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","E","B+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.5,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.332554814406929,3.6,3.4,3.3,3.2,3.1,3.0,2.9,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0,1.5,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B","C-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","D+","D-","D-","A+","D","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,1.0713492306275594,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","D+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,1.7,3.0393262031459374,2.414149158442383,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","B+","B-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.0713492306275594,1.7,1.3,1.2224601670126722,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,1.7,3.0393262031459374,2.414149158442383,1.3,0.5,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","B+","B-","D+","D-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.1,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.2224601670126722,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D+","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,2.9264230458450027,2.9,2.6,2.5,2.4,2.3,2.189704692581822,2.1,2.9960109163522706,2.1,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","B","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,1.3400768003930403,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C-","C+","D-","C-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0,0.69,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+","D-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.0,2.3,1.7,1.3,1.2224601670126722,2.993721077381442,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B","C+","C-","D+","D+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.3,1.7,1.3,1.2224601670126722,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C+","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.7,1.3,1.2224601670126722,1.2678826261426561,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C-","D+","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","D+","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,1,0,0,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","D","E","E","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99,1.030006862889675,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+","A","B","D+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,3.2044213220205795,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","B+","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,3.2,2.3,1,1.7,1.3,1,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B+","C+","D","C-","D+","D","E","D-","D-","A+","C+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,1.5,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","C-","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,0.7,2.7490299294737928,1.7,1.69,1.3,0.7,0.69,4.0,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B-","C+","D-","B","C-","C-","D+","D-","D-","A+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.0713492306275594,1.7,1.2224601670126722,0.5,0.5,1.0713492306275594,1.0713492306275594,1.0713492306275594}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","C-","D+","D-","D-","D+","D+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,3.9,2.2,1.1,1.0713492306275594,3.3,0.6349678796413173,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","A","C+","D+","D+","B+","D-","D-","B","B","C-","C+","C-","A-","B+","D","B-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.838695609224668,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B","A","B","A","C+","C","C-","C","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,3.2,2.3,1,1.7,1.3,0.5280954091696397,1,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B+","C+","D","C-","D+","D-","D","E","D-","D-","A+","C+","C-","A-","B","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.69,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.993721077381442,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,1.5,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","C-","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,2.9,3.8,3.7,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,1.69,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B","A","A-","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C-","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.0,1.7,1.3,1.2224601670126722,2.993721077381442,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B","C-","D+","D+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.29,1.2,2.5,3.9,2.9,1.4717072828761908,3.8,3.8,2.2,0.7,2.6123925604631633,2.6725566512853307,3.5,2.8,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","C+","D+","B-","A","B","C-","A","A","C+","D-","B-","B-","A-","B","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,2.4,3.9,3.8,3.7,3.31,2.2,3.0,3.047672353247607,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B-","A","A","A-","A-","C+","B","B+","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","D+","D-","D-","A+","D","A-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.0,1.881049945841771,2.5,3.0,3.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","C","B-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.4717072828761908,1.3309410838150897,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C+","D-","C-","C-","C-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,2.3,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","B+","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,0.7,2.7490299294737928,1.7,1.69,1.3,0.7,0.69,4.0,2.29,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B-","C+","D-","B","C-","C-","D+","D-","D-","A+","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,1,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","D","E","E","E","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,1.9,2.2,3.0,2.99,2.69,2.3,1.99,1.7,1.69,1.3,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","C","C+","B","B","B-","C+","C","C-","C-","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,2.414149158442383,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0,0.69,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","B-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+","D-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.7,0.69,0.0,3.29,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","D-","E","B+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,2.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","C+","D-","C-","B-","A-","B","D-","D+","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,1.3400768003930403,2.2,0.7,1.7,3.5,0.8303060165253497,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C-","C+","D-","C-","A-","D","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.3,1.2224601670126722,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","D+","D+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.047672353247607,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","B+","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.5,4,0.7538009542820233,3.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D-","A+","D","A-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7479657547962595,3.7,3.3,1.0713492306275594,1.7,1.3,1.2224601670126722,0.5,0.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","D+","C-","D+","D+","D-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,1,0,0,0,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","D","E","E","E","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.6,3.5,3.4,3.3,3.2,3.1,2.9264230458450027,2.9,2.6,2.5,2.4,2.3,2.1,2.9960109163522706,2.1,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","B","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.16537526446513184,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.047672353247607,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","B+","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.838695609224668,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","B","B-","C+","C","C+","A-","B","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,2.838695609224668,3.7,3.3,3.235565911123312,2,2.7,2.2929830834956118,1,3.0393262031459374,1.7,1.3,0.5,4,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B","A-","B+","B+","C","B-","C+","D","B+","C-","D+","D-","A+","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,1,0,0,1,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","D","E","E","D","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","A-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","B","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.94732785210108,1.0,1.5,0.6024630952660888,2.5,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","D","C-","D-","B-","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.6443196954911485,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.3366068405610493,4,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.37420880401780154,0.7,2.3158336467557668,4,2.2000284044866794,0.1,1.5,3.5,2.8,2.2000284044866794,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","B-","A+","C+","D-","C-","A-","B","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,3,4,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","B","A+","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,1.9024809748427238,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","C","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.5,0.7538009542820233,3.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D-","D","A-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.7,0.69,3.29,1.7,2.998584120230233}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","D-","B+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.0713492306275594,1.7,1.2224601670126722,0.5,0.5,1.0713492306275594,1.0713492306275594,1.0713492306275594,1.0713492306275594}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","C-","D+","D-","D-","D+","D+","D+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,1.2483422075359947,2.1,3.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B-","B-","B-","B-","C+","B-","C+","D+","C+","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,3.29,2.5,3.9,2.9,3.8,1.3766908365914055,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,2.5,1.5,1.7,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","B+","B-","A","B","A","C-","C+","D-","C-","B-","A-","B","D-","D+","B-","C-","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2.7,2.3,1,1.7,1.3,0,0.5280954091696397,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.8,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","C","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.7,3.5,3.2,0.9,2.6,0.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,1.1233080679845426,2.1,3.5,3.0,3.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","D+","C+","A-","B","B","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,3.4858244182755054,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","A-","A","A","C+","D-","C-","B-","A-","B","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,1.2678826261426561,3.080798248603921,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","D+","B+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.7,3.5,3.2,0.9,2.6,0.9,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.1,3.5,3.2,0.9,2.6,0.9,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,2.414149158442383,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","B-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,1.9024809748427238,3.2,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","C","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,3.0,2.8,1.7,2.1,0.7,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","B","B","C-","C+","D-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,1.5,3.0971006642928387,3.3462428245777955,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","C-","B+","A-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,0,0,1,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","E","E","D","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.4942934301549318,2.0,1.3,1.7,1.3,1.29,0.7,0.69,0.0,3.29,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C-","C","D+","C-","D+","D+","D-","D-","E","B+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,3.0,3.0,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B","B","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,3.2044213220205795,1.0,1.881049945841771,2.4482181743363216,2.5,3.0,3.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B+","D","C","B-","B-","B","B","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,3.2044213220205795,1.0,3.235565911123312,2.4482181743363216,2.5,3.0,3.0,1.0,3.0971006642928387}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B+","D","B+","B-","B-","B","B","D","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.31,2.3,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","C+","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,1.5,2.0,3.0971006642928387}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","C-","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,2.8,4.0,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","D-","B","B-","C+","C+","C","C-","C-","D+","D-","D-","B","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,2.454327070298727,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,1.5,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","A","C+","B-","C-","B-","A-","B","D-","D+","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.7,3.31,2.2,3.0,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A-","A-","C+","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.043633551545988,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9668475553120521,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,1.2678826261426561,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A-","B-","B","C+","C-","D+","D+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,2.6857608570289546,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,2.8,4.0,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B-","D-","B","B-","C+","C+","C","C-","C-","D+","D-","D-","B","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,0.5,1.1,2.5,1.5,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","C+","D-","C-","B-","A-","B","D-","D+","B-","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,2.8,0.5,1.1,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","B","D-","D+","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.7,3.5,3.2,0.26710445034477154,0.9,2.6,0.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D-","D","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,3.2044213220205795,1.0,1.881049945841771,2.4482181743363216,2.5,3.29,3.0,3.0,1.0,2.5,1.206920288916757,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B+","D","C","B-","B-","B+","B","B","D","B-","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,1.7,2.414149158442383,1.3,0.37420880401780154,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","B-","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.0119324827406504,3.5,3.4,3.3,3.5,3.1,2.9264230458450027,2.9,2.6,2.5,2.4,2.3,2.189704692581822,2.1,2.9960109163522706,2.1,2.6,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B+","A-","A-","B+","A-","B+","B","B","B-","B-","B-","C+","C+","C+","B","C+","B-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,2.838695609224668,3.7,1.412808394510622,3.6,2.425245250943626,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B","A-","C-","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,1.2678826261426561,3.080798248603921,2.29,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","D+","B+","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,0.2,1.1,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","A","C+","C","C-","C","A-","B","D-","D-","D+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,1.29,2.2498793154663708,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","D+","C+","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","E","B+","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.838695609224668,2.6123925604631633,2.3692136333889335,2.1,2.0,2.1,3.5,3.0,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","B","B-","B-","C+","C","C+","A-","B","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,1.4025534297404372,2.8,4.0,0.69,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","D-","B","B-","C+","C+","C","C-","C-","D+","D-","C-","B","A+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.5,2.6725566512853307,3.5,2.8,0.5,1.1,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D-","D+","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.0,1.881049945841771,2.5,3.0,3.0,2.993721077381442,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","C","B-","B","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7215631368275308,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0,0.69,2.69,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+","D-","B-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,3.1731023658243744,0.7,0,0.3366068405610493,4,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","B+","D-","E","D-","A+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,2.454327070298727,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","B-","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,0,0,1,1,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","E","E","D","D","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.99,1.69,1.3,1.29,0.7,0.69,0.0,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C-","D+","D+","D-","D-","E","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,3.29,2.5,3.9,2.9,3.8,1.3766908365914055,2.2,0.7,0.9001199916022925,1.7,2.6725566512853307,2.8,0.5,1.1,1.2483422075359947,3.3294603781164254,1.5,1.7,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","B+","B-","A","B","A","C-","C+","D-","D","C-","B-","B","D-","D+","D+","A-","C-","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,2.0,3.0971006642928387,3.0,1.5,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","C","B+","B","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.9,3.8,3.7,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,1.69,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A","A-","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C-","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6263853162588617,3.6,3.5,3.4,3.3,1.9024809748427238,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","A-","B+","C","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,1.29,2.2498793154663708,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.16537526446513184,3.9,3.9,3.8,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","D+","C+","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","D-","A","A","A","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,3.2044213220205795,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","B+","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.6,3.5,3.4,3.3,3.2,3.1,2.9264230458450027,2.9,2.6,2.5,2.4,2.3,2.1,2.9960109163522706,2.1,2.7490299294737928,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","B","C+","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,2.29,3.2,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","C+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,2.8,0.5,1.1,1.5,1.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","B","D-","D+","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C+","D+","D+","D+","D-","B+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.4482181743363216,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.1,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,2.838695609224668,3.7,1.412808394510622,3.6,2.425245250943626,1.030006862889675,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B","A-","C-","A-","B-","D+","A-","A-","B+","B+","B+","B","B","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,2.4,3.9,3.8,3.7,2.7490299294737928,3.31,2.2,3.0,3.047672353247607,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B-","A","A","A-","B","A-","C+","B","B+","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.993721077381442,2.7,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.1881522074720121,3.5,2.8,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","D+","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.414149158442383,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.31,2.3,1.7,0.5,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","C+","C-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","D+","D+","D+","D-","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.0,0.8739782337156561,1.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","B","D","D","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.4482181743363216,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0,2.2000284044866794}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","E","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.6443196954911485,1.7,1.9,3.5,2.8,0.5,1.1,1.5,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,0.8,1.99,1.7,1.69,1.3,3.3462428245777955,1.29,0.7,0.69,0.0,1.7,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","D","C","C-","C-","D+","A-","D+","D-","D-","E","C-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9668475553120521,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,3.249138830564843,1.2678826261426561,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A-","B-","B","C+","C-","D+","D+","B+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.0713492306275594,1.7,1.3,1.2224601670126722,0.5,0.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","C-","D+","D+","D-","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,1.412808394510622,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.99,1.69,1.3,1.29,0.7,0.69,0.0,3.8,1.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C-","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C-","D+","D+","D-","D-","E","A","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.3,2.554255700651047,1.3,1.2224601670126722,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C+","B-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.29,1.2,2.5,3.9,2.9,1.4717072828761908,3.8,3.8,2.2,0.7,2.6123925604631633,2.6725566512853307,3.5,2.8,1.1,3.8,1.5,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","C+","D+","B-","A","B","C-","A","A","C+","D-","B-","B-","A-","B","D+","A","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.5,0.7538009542820233,3.5,0.5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D-","D","A-","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6783459873904134,3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","B","A-","B+","B+","C","B-","C+","D","C-","D+","D-","D-","A+","D","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,0.2,1.1,1.5,2.8,1.7,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","A","C+","C","C-","C","A-","B","D-","D-","D+","C-","B","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,1,1.7,1.3,0,0.7215631368275308,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","D","C-","D+","E","D","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,3.0,2.332554814406929}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","A-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.7,3.5,3.2,0.9,2.6,0.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,1.3182890139016643,3.419989154143125,2.3,1.7,1.3,0.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C-","A-","C+","C-","D+","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,0.8,1.99,1.7,1.69,1.3,3.3462428245777955,1.29,0.7,0.16537526446513184,0.69,0.0,1.7,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","D","C","C-","C-","D+","A-","D+","D-","D-","D-","E","C-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,0.5,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,1.1,1.5,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D+","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,1.29,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","D+","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,2.5791180489638474,3.5,2.8,0.5,1.5,2.5791180489638474}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","B-","A-","B","D-","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.8,0.7,3.2161491635823385,0.69,0.0,3.5182986408219863}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","C","D-","B+","D-","E","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.31,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,2.2,0.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C+","D-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.9,3.8,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,1.69,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C-","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,3,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","B","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,0.7,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,3.2850149822546646,2.6,2.5,2.4,2.838695609224668,2.6123925604631633,2.1,2.0,2.1,3.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B+","B-","B-","B-","B","B-","C+","C","C+","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6710277272069116,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,2.3,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B+","C+","C+","D+","D+","D+","D-","B+","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.69,3.8,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","A","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,1.0,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,3.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","D+","D+","D+","D-","B+","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.9,3.8,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,1.69,2.2,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C-","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,1.2224601670126722,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","D+","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.7,3.5,3.2,0.9,2.6,0.9,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.99,3.31,2.3,1.7,2.414149158442383,1.3,0.37420880401780154,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A-","C+","C-","B-","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,3,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","B","C","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,3.2226680762740982,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,3.0,2.332554814406929}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B+","B-","B-","B-","B-","C+","B-","C+","C","C+","A-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.29,2.5,3.9,2.9,1.4717072828761908,3.8,3.8,2.2,0.7,2.6123925604631633,2.6725566512853307,3.5,2.8,1.1,3.8,1.5,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","C+","B-","A","B","C-","A","A","C+","D-","B-","B-","A-","B","D+","A","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.9,2.8,0.5,1.1,1.5,1.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C","B","D-","D+","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,2.838695609224668,3.7,1.412808394510622,3.6,2.425245250943626,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.5,2.3,2.2,1.5325209065428986,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B","A-","C-","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","C+","C+","C-","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,0.2,1.1,1.5,2.8,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","A","C+","C","C-","C","A-","B","D-","D-","D+","C-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.0,1.881049945841771,2.5,3.0,3.0,2.5,2.5,1.881049945841771}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","C","B-","B","B","B-","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.5,3.0971006642928387,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,3,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","B","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.3,2.3,2.554255700651047,1.3,1.2224601670126722,0.5945444635755677,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","C+","B-","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.69,3.8,3.0,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","A","B","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.31,2.3,0.6443196954911485,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","C+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,1,0,0,2,0,1,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","D","E","E","C","E","D","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,3,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","B","C","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.4,1.9024809748427238,3.2,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","C","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.7,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","D+","C-","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,2.8,4.0,0.69,0.16537526446513184}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","D-","B","B-","C+","C+","C","C-","C-","D+","D-","D-","B","A+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.1,2.9264230458450027,2.719778175131103,2.9,2.6,2.5,1.4942934301549318,2.3,2.189704692581822,2.1,2.9960109163522706,2.1,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B","B","B","B-","B-","C-","C+","C+","C+","B","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.4942934301549318,1.3,1.7,1.3,1.29,0.7,0.69,0.0,3.29,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C-","D+","C-","D+","D+","D-","D-","E","B+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,1.6577131324142091}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,0.8808755499445509,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.121783346183994,2.8,1.1,1.5,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D","B-","A","B","A","A","C+","D-","C-","B-","B+","B","D+","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.0,1.881049945841771,2.5,3.0,1.99,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","C","B-","B","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.2238633640026535,1.7,1.3,1.2224601670126722,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.2224601670126722,1.3182890139016643,1.0,2.6655371591635912,1.5,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D+","C-","D","B-","C-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,2.639048628440995,2.3,3.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","B-","C+","A-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,2.0,3.0971006642928387,2.9956659324039956,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","C","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,0.9001199916022925,1.7,2.414149158442383,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","D","C-","B-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.0103930084376698,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,1.5,2.0,2.0712218926716566,2.189704692581822,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","C-","C","C+","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,1.2,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","D+","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.1,1.3,1.2224601670126722,1.0713492306275594,0.5,3.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","D+","D+","D+","D+","D-","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,2,4,4,4,4,4,4,4,0,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C","A+","A+","A+","A+","A+","A+","A+","E","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.1881522074720121,1.5,0.16537526446513184,1.0713492306275594,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D+","C-","D-","D+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.9,3.8,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.205080232189883,2.6,2.5,2.4,2.3,1.69,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","C+","B-","B-","B-","C+","C-","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.1881522074720121,3.5,2.8,0.7,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","D+","A-","B","D-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.0,2.5,3.0,3.0,2.993721077381442,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D","B-","B","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.043633551545988,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0,3.8,1.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C-","C-","D+","D+","D-","D-","E","A","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,0.9691572725767021,2.0103930084376698,2.043633551545988,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","D","C+","C+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,3.0,0.7,0.69,0.0,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","B","D-","D-","E","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.4,1.8,3.1,2.9264230458450027,2.9,2.6,2.5,2.4,2.3,2.189704692581822,2.1,2.9960109163522706,2.1,2.6,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","C","B+","B","B","B-","B-","B-","C+","C+","C+","B","C+","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,2.203191217733748,0.7,0.69,4.0,0.69,2.69,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","C+","D-","D-","A+","D-","B-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.94732785210108,1.0,1.5,0.6024630952660888,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","D","C-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,1.412808394510622,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.7,2.6,2.5,2.3,2.4482181743363216,2.993721077381442,1.69,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C-","A-","A-","A-","B+","B+","B+","B","B-","B-","B-","C+","B-","B","C-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.8,0.7,3.2161491635823385,0.69,0.0,3.5182986408219863,1.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","C","D-","B+","D-","E","A-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.263385280762345,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D+","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.993721077381442,2.7,3.270902875881634,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B+","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.3182890139016643,1.0,1.5,3.0971006642928387,3.3462428245777955,2.043633551545988,3.0971006642928387}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","D","C-","B+","A-","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,1.946120157163334,3.9,2.9,3.8,2.2,2.0,1.9,2.8,0.5,1.1,1.5,1.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","C","A","B","A","C+","C","C","B","D-","D+","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,1.6,3.31,2.2,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,1.4025534297404372,2.8,4.0,0.69,0.7,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","C-","A-","C+","D-","B","B-","C+","C+","C","C-","C-","D+","D-","C-","B","A+","D-","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1.7,1.9668475553120521,0.7,0.5,0.7538009542820233,3.5,0.5,1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","C-","C","D-","D-","D","A-","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.0103930084376698,2.043633551545988,2.902011925364104}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","C","C+","B","C+","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,2.29,3.2,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","C+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.6489776323698395,2.0,1.99,1.7,1.69,1.3,2.902011925364104,1.29,0.7,0.69,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","B-","C","C","C-","C-","D+","B","D+","D-","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99,1.030006862889675,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+","A","B","D+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.348950994615779,3.0,0.9691572725767021,1.7,1.3,1.2224601670126722,1.2678826261426561,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","B","D","C-","D+","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,3.2146219064289436,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.8,0.7,3.2161491635823385,0.69,0.0,3.5182986408219863}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B+","B-","C+","C+","C","C","C-","C-","D+","C","D-","B+","D-","E","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.7,1.3,1.2224601670126722,1.2678826261426561,0.5,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C-","D+","D+","D+","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9668475553120521,3.31,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,2.9150760618856877,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,0.2,0.7,0.69,1.7,3.9,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","B","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D-","D-","D-","C-","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.0,1.7,3.0,1.9,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C","C-","B","C","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,1.0,3.29,3.0,2.99,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.7,2.6710277272069116,3.29,1.7,2.998584120230233}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","D","B+","B","B","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","B-","B+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0712218926716566,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,2.7490299294737928,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B-","D+","B-","A","B","A","C+","D-","C-","A-","B","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,1,0,0,0,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","D","E","E","E","E","E","E","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.8978243038752357,2.0,3.5,2.5,0.8978243038752357}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","A-","B-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,1.412808394510622,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.4482181743363216,2.993721077381442,1.69,2.1,2.0,2.1,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","B-","B","C-","C+","C","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,1.99,3.235565911123312,2,2.7,2.3,3.1485969428313334,1,1.7,1.3,0,0.7,0.5,1.4688539918270502,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","C","B+","C","B-","C+","B+","D","C-","D+","E","D-","D-","C-","A+","C+","C-","A-","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.419989154143125,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,2.6725566512853307,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","C-","B-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,1.3789072873793673,3.0971006642928387,2.9956659324039956,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","C-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.332554814406929,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","B+","B","B","B-","B-","C+","C+","B-","D+","C","C","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,2.0712218926716566,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,3.0,2.8,1.7,2.1,0.7,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","C+","B-","A","C+","D+","D+","B+","B","B","C-","C+","D-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,1.3400768003930403,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.113737392762231,2.29,1.99,1.69,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","C-","A-","A-","C+","B","B","B-","C+","C+","C+","C","C-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.3,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.6024630952660888,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B+","A","B","A","C+","C","C-","C","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.69,2.3,2.29,1.030006862889675,2.0,1.7,1.3,2.998584120230233,1.29,0.7,0.8464206380027806,3.29,1.7,2.998584120230233}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","C+","C+","D+","C","C-","D+","B","D+","D-","D","B+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.69,3.6,1.9,2.7,3.8,2.5,3.9,3.292871927273891,3.7273486311622666,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","A-","C","B-","A","B-","A","B+","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.729335367128124,3.3,2.3,1.7,1.3,0.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A","B+","C+","C-","D+","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.69,4.0,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2.7,1,1.7,1.3,0,0.7215631368275308,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","B-","D","C-","D+","E","D","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,0.8739782337156561,1.7,1.3,1.2224601670126722,0.5,0.5,1.7,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D","C-","D+","D+","D-","D-","C-","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,1.7,1.3,1.2224601670126722}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","C-","D+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.9,2.8,0.5,1.1,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","A","C+","C","C-","C","B","D-","D+","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,0.6902591077409321,3.29,3.9,2.99,1.030006862889675,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","D-","B+","A","B","D+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,4,4,3,4,4,0,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A+","A+","B","A+","A+","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,0.8739782337156561,1.7,1.3,1.2224601670126722,0.5,0.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D","C-","D+","D+","D-","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.3182890139016643,1.0,1.5,0.6349678796413173,3.3462428245777955,2.043633551545988,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","D","C-","D-","A-","C+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,0.7215631368275308,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.2,2.3179104838175766,1.7,1.3,1.2224601670126722,1.2678826261426561,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","D+","B-","C-","D+","D+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,0.7538009542820233,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","D","D+","D+","D-","D-","E","B+","A","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,0.7,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","D-","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,1.7,1.881049945841771,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","C-","C","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,1.3182890139016643,2.9,3.8,2.2,2.0,1.7,1.1881522074720121,3.5,2.8,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","C-","B","A","C+","C","C-","D+","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.5,4,0.7538009542820233,3.5,0.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D-","A+","D","A-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,3.4414716753892725,2.3,1.7,3.6263853162588617,2.7013520203526418,1.2224601670126722,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","A-","C+","C-","A-","B","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,1.229045501888098,3.9,2.9,3.8,2.2,2.0,1.7,1.1881522074720121,3.5,2.8,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","D+","A","B","A","C+","C","C-","D+","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.2,1.5,3.0393262031459374,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","D+","C-","B+","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,2.3,1.7,1.3,1.2224601670126722,2.29,1.2224601670126722}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C+","C-","D+","D+","C+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,2.9,3.8,2.2,2.49630909276324,1.9,2.8,0.5,1.1,1.5,1.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B","A","C+","B-","C","B","D-","D+","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,1.412808394510622,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.9029418657170252,1.99,1.69,1.3,1.29,0.7,0.69,0.0,3.8,1.99,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C-","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C","C-","D+","D+","D-","D-","E","A","C","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,2.6655371591635912,1.5,2.0,3.0971006642928387,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","B-","C-","C","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,0.8808755499445509,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.121783346183994,2.8,1.1,1.5,1.1,3.121783346183994}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D","B-","A","B","A","A","C+","D-","C-","B-","B+","B","D+","C-","D+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,2.5,2.4,3.9,3.7,3.31,2.2,3.0,3.047672353247607,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,2.425245250943626,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B-","B-","A","A-","A-","C+","B","B+","B-","B-","C+","C+","C","C","C-","C-","D+","B-","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.6489776323698395,2.0,1.99,1.7,1.69,2.902011925364104,1.29,0.7,0.69,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","B-","C","C","C-","C-","B","D+","D-","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.7538009542820233,3.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D","A-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,3.0,2.332554814406929}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","B-","C+","C","C+","A-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,2.1,2.0,2.1,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C","C+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,0.5,3.1,3.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D-","B+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,2.8147691586791046,3.0,3.0,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B","B","B","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,3.1731023658243744,1.7,2.414149158442383,0.7373264176728421,0.37420880401780154,0.5,3.31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C-","B-","D","D-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9029418657170252,3.5,3.7,3.3,2.043633551545988,2.3,0.6481189062280039,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A-","A-","B+","C+","C+","D-","D+","D+","D-","C","C+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6,1.3182890139016643,1.5,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","C-","C-","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","D+","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.6443196954911485,1.7,1.9,3.5,2.8,0.5,1.1,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,2.29,2.4,1.7,1.69,1.3,0.7,0.69,1.3766908365914055,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","C+","B","B-","C+","C+","B-","C-","C-","D+","D-","D-","C-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.0,1.99,1.7,1.69,1.3,1.29,0.69,3.8,2.554255700651047}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","D+","D+","D-","A","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.1233080679845426,1.7,1.3,1.2224601670126722,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","D+","C-","D+","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,0.7,1.7,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","D-","C-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.7,1.0978059922190242,1.2224601670126722,1.0713492306275594,1.2678826261426561,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C-","D+","D+","D+","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,1.9024809748427238,3.2,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,2.332554814406929,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","C","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+","B-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,1.2224601670126722,2.9960109163522706,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","D+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0,1.5,1.0,1.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B","C-","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.881049945841771,2.5,3.0,3.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","C","B-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+","A","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,2.2230495505258783,3.5182986408219863,3.9,3.8,3.31,2.2,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,2.8,4.0,0.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C+","A-","A","A","A-","C+","D-","B","B-","C+","C+","C","C-","C-","D+","D-","D-","B","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,2.6725566512853307,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","B-","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,2.8,1.1,1.5,1.1,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D+","C-","D+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3,3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.993721077381442,2.7,3.270902875881634,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D+","A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B+","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.554255700651047,1.263385280762345,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.31,2.2,2.6857608570289546,0.16537526446513184,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,2.8,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","C+","B-","D-","B","B-","C+","C+","C","C-","C-","D+","D-","D-","B","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.0,2.99,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.7,0.69,3.29,1.7,2.998584120230233}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B","B","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","D-","B+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.5,2.2262298431757404,2.0,1.0713492306275594,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","B-","C+","C","D+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,2.239148217442401,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7215631368275308,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","C+","B+","B+","C","B-","C+","D","C-","D+","E","D","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.3182890139016643,1.8206450236242824,1.5,0.6349678796413173,3.3462428245777955,2.043633551545988,1.0,2.043633551545988}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","C","C-","D-","A-","C+","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,1.0713492306275594,2,2.7,2.2929830834956118,1,1.7,1.3,0.7,0.5,4,0.7538009542820233,3.5,2.8,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","D+","C","B-","C+","D","C-","D+","D-","D-","A+","D","A-","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.7,0.9691572725767021,1.0713492306275594,1.2678826261426561,0.5,0.5,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","C-","D","D+","D+","D-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,3.5,2.0,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","C+","A-","C","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,2.3158336467557668,1.3,1.29,3.0,0.7,2.719778175131103,0.69,0.0,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","B-","D+","D+","B","D-","B","D-","E","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.16537526446513184,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,1.410050681330601,2.9960109163522706,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.151207222164227,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,3.0,0.7,0.69,0.0,3.7,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","B","D-","D-","E","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,2.239148217442401,3.3,3.235565911123312,2,2.7,0,2.3,1,1.7,1.3,0,0.7215631368275308,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","C+","B+","B+","C","B-","E","C+","D","C-","D+","E","D","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.0,2.99,2.69,2.3,2.29,1.030006862889675,2.0,1.99,1.7,1.3,2.998584120230233,1.29,0.69,3.29,1.7,2.998584120230233}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B","B","B-","C+","C+","D+","C","C","C-","D+","B","D+","D-","B+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,1.1144109922884053,3.7,1.9024809748427238,2.3,1.7,2.9150760618856877,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","D+","A-","C","C+","C-","B","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.353044791844421,2.4,3.0,3.4414716753892725,2.3,1.7,3.6263853162588617,2.7013520203526418,1.2224601670126722,2.29,2.7013520203526418}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","A-","C+","C-","A-","B","D+","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.883730373386329}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.5,3.4,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.3,2.2,2.1,2.0,2.1,3.9,3.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","B+","B","B","B-","B-","B-","C+","C+","C+","C","C+","A","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,3.9,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","B","A","A","C+","D-","C-","B-","A-","A","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,3.5,2.2000284044866794}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","A-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.8867808372759645,3.9,3.8,3.31,2.2,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,3.8,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A","A-","C+","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.5,0.2,1.1,1.5,2.8,1.7,2.8,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","A","C+","C","C-","C","A-","B","D-","D-","D+","C-","B","C-","B","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.554255700651047,1.263385280762345,3.819052199448031,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","A","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,4,1,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","A+","D","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,0.1,3.5,3.2,0.9,2.6,0.9,3.8,0.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","D-","A-","B+","D","B-","D","A","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.6725566512853307,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","B-","B-","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6263853162588617,3.5,3.4,3.3,1.9024809748427238,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","A-","B+","C","B+","B+","B","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.881049945841771,2.5,2.768992860197399,3.0,1.881049945841771}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B-","B","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.9,3.8,3.6,2.3158336467557668,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,1.69,2.2,2.1,2.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A","A-","B-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C-","C+","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,2,1,4,4,4,4,4,4,4,0,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C","D","A+","A+","A+","A+","A+","A+","A+","E","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.043633551545988,2.3,1.1,1.3,1.2224601670126722,0.5,3.3,2.3,3.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C+","D+","D+","D+","D-","B+","C+","A-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,1.4025534297404372,2.0,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C-","C","C-","C","A-","B","D-","D+","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.332554814406929,3.6,3.4,1.9024809748427238,3.2,3.0,2.7,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","B-","A-","A-","C","B+","B","B-","B-","B-","B-","C+","B-","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.5259465432603694,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.16537526446513184,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","A-","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","A","B","A","C+","D-","C-","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,0.8808755499445509,2.5,3.9,2.9,3.8,3.8,2.2,0.7,2.6725566512853307,3.121783346183994,2.8,1.1,1.5,1.1,3.121783346183994,2.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D","B-","A","B","A","A","C+","D-","B-","B+","B","D+","C-","D+","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,2.043633551545988,1.5,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C+","C-","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3692136333889335,1.0,1.5,0.6024630952660888,1.5,1.0,0.6024630952660888}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D","C-","D-","C-","D","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,0.7538009542820233,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,2.6725566512853307,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","D","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","B-","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,1.2,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,1.7,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","D+","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.422977184923104,2.29,1.030006862889675,2.0,1.99,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.9,2.99,2.7,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","B+","B","B","B-","B-","B-","C+","D+","C","C","C-","D+","D+","D-","D-","E","B+","A","B","B-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,0.8739782337156561,1.7,1.3,1.2224601670126722,0.5,0.5185517903453263,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D","C-","D+","D+","D-","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.3182890139016643,1.5,0.6349678796413173,3.3462428245777955,2.043633551545988,1.0,1.3182890139016643}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","C-","D-","A-","C+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.1,2.3,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","B-","C+","C+","C+","C","C+","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,4,1.7,1.3,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,2.2000284044866794,1.7,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","A+","C-","D+","E","D-","D-","A+","C+","C-","A-","B","C+","C-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,2.8970473637762337,2,2.7,2.3,1,1.7,2.719778175131103,0,3.1731023658243744,0.7,0,0.3366068405610493,4,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B","C","B-","C+","D","C-","B","E","B+","D-","E","D-","A+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.414149158442383,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,3.5,2.8,0.6024630952660888,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B-","D+","B-","A","B","A","C+","C","C-","C","A-","B","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.0713492306275594,3.3,0.3,3.0,2.8,1.7,2.1,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.4,3.0,1.2239371577447271,1.7,1.3,1.2224601670126722,2.993721077381442,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B-","B","D+","C-","D+","D+","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.3,1.7,1.3,1.29,0.7,0.69,0.0,3.29,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","D+","C-","D+","D+","D-","D-","E","B+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,3.2,2.3,1,1.7,1.3,1,0,0.7,0.5,4,2.2000284044866794,1.5,3.5,2.8,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B+","C+","D","C-","D+","D","E","D-","D-","A+","C+","C-","A-","B","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.7,2.2929830834956118,1,1.7,1.9668475553120521,0.7,0.5,4,0.7538009542820233,3.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","C+","D","C-","C","D-","D-","A+","D","A-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.37420880401780154,0.7,2.3158336467557668,3,2.2000284044866794,0.1,1.5,3.5,2.8,2.2000284044866794,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","B-","B","C+","D-","C-","A-","B","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.915978742100445,3.7,2.3,1.7,1.3,1.2224601670126722}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","C+","C-","D+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,2.838695609224668,3.7,1.412808394510622,3.6,2.425245250943626,3.4,3.3,3.2,3.1,3.0,2.9,2.7,2.5,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B","A-","C-","A-","B-","A-","B+","B+","B+","B","B","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.69,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,0.450178165536979,3.3,2.3,1.1,1.3,1.2224601670126722,0.5,1.946120157163334,2.3,2.902011925364104,2.0103930084376698,2.043633551545988,2.902011925364104}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","D-","B+","C+","D+","D+","D+","D-","C","C+","B","C+","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,1.412808394510622,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.7,2.69,2.3,0.8,2.29,2.0,1.9029418657170252,1.99,1.69,1.3,1.29,0.7,0.69,0.0,1.99,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","C-","A-","A","A","A-","A-","C+","B","B","B-","B-","C+","D","C+","C","C","C","C-","D+","D+","D-","D-","E","C","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,2.7,2.3,1,1.7,1.3,0,0.7,0.3366068405610493,2.264766394876499,4,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","B-","C+","D","C-","D+","E","D-","D-","C+","A+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,2,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","C","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.332554814406929,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.6,2.5,2.4,2.3,2.6123925604631633,2.1,2.0,2.1,3.5,3.0,3.0,2.332554814406929}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B-","A-","A-","A-","B+","B+","B+","B","B","B-","B-","B-","C+","B-","C+","C","C+","A-","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,2.7,1.2,2.6,2.5,3.9,2.9,3.8,3.8,2.2,0.7,1.5,2.6725566512853307,3.5,2.8,0.5,1.1,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B-","D+","B-","B-","A","B","A","A","C+","D-","C-","B-","A-","B","D-","D+","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.043633551545988,2.3,0.5,1.1,1.3,1.2224601670126722,0.5,3.3,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C+","D-","D+","D+","D+","D-","B+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,2.29,2.4,1.7,1.69,1.3,0.7,0.69,0.7509439006610583,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","A-","A-","C+","B","B-","C+","C+","B-","C-","C-","D+","D-","D-","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1,0,0,0,0,0,2,1,0,1,0,0,1,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","E","E","E","E","E","C","D","E","D","E","E","D","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.419989154143125,2.6489776323698395,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,1.99,1.7,3.249138830564843,2.6725566512853307,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","B-","A","A-","A-","C+","B","B","B-","C+","C","C-","B+","B-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.3182890139016643,1.0,2.6655371591635912,1.4025534297404372,2.474853978044933,3.2044213220205795,2.0,3.0971006642928387,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D","B-","C-","B-","B+","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,1,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","D","E","E","E","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,2.0,1.7,1.9,2.8,0.5,0.5498343501023899,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","C","C-","C","B","D-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.419989154143125,3.9,3.8,3.047672353247607,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.3,1.29,0.7,0.69,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A","A","B+","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","D+","D+","D-","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.633890346534575,4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.99,2.69,2.3,2.29,1.99,1.7,1.69,1.3,0.7,0.69,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A+","A-","A","A","A-","A-","C+","B","B","B-","C+","C+","C","C-","C-","D+","D-","D-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.2,2.5,3.9,3.8,2.2,2.0,1.7,1.1881522074720121,3.5,2.8,0.7,0.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","D+","B-","A","A","C+","C","C-","D+","A-","B","D-","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.5299405912054946,3.0,2.9,2.7,2.6,2.5,2.9059283725426726,2.3,2.2,2.1,2.0,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","A-","B","B","B-","B-","B-","B","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,1.946120157163334,3.030715265301924,2.9,3.8,2.2,2.0,1.9,2.8,0.5,1.1,1.5,1.5,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","C","B+","B","A","C+","C","C","B","D-","D+","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.043633551545988,1.881049945841771,2.5,3.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","C","B-","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,2.4,3.0,1.7,0.9691572725767021,1.0713492306275594,1.2678826261426561,0.5,0.5,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","B","C-","D","D+","D+","D-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,3.235565911123312,2,0.13077251960091935,2.7,2.3,1,1.7,1.3,0,0.37420880401780154,0.7,2.3158336467557668,4,2.2000284044866794,0.1,1.5,3.5,2.8,2.2000284044866794,2.993721077381442,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","B+","C","D-","B-","C+","D","C-","D+","E","D-","D-","B-","A+","C+","D-","C-","A-","B","C+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,3,3,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","B","B","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,0,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","E","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,2.9150760618856877,3.31,2.2,3.0,2.99,2.7,2.69,2.29,2.0,1.99,1.7,1.69,2.2929830834956118,1.3,0.2,0.7,0.69,1.7,3.9,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","B","A-","C+","B","B","B-","B-","C+","C","C","C-","C-","C+","D+","D-","D-","D-","C-","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.1,3.0,2.7,1.2,2.5,3.9,2.1107331612416576,3.8,3.8,2.2,0.7,1.7,2.6725566512853307,3.5,1.2,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","B","B-","D+","B-","A","C+","A","A","C+","D-","C-","B-","A-","D+","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6,1.3182890139016643,1.5,3.0971006642928387,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","C-","C-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,0.8739782337156561,1.7,1.3,1.2224601670126722,0.282610221045587,0.5,1.7,1.7,1.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D","C-","D+","D+","D-","D-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.0713492306275594,1.7,1.2224601670126722,0.5,0.5,1.0713492306275594,1.0713492306275594,1.0713492306275594,1.0713492306275594,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","C-","D+","D-","D-","D+","D+","D+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.31,2.3,1.7,3.0393262031459374,2.414149158442383,1.3,0.5,2.3,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","B+","B-","D+","D-","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6,1.3182890139016643,1.5,3.0971006642928387,3.0,0.6960843507296339,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","C-","C-","B+","B","D-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.69,1.2,2.5,3.9,2.9,3.8,1.3400768003930403,2.2,0.7,1.7,3.5,2.562982105075087,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","C-","D+","B-","A","B","A","C-","C+","D-","C-","A-","B-","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.5182986408219863,3.9,3.8,3.7,3.31,2.2,3.0,2.69,2.3,0.7,2.7490299294737928,1.7,1.3,0.7,0.69,4.0,2.29,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","C+","B","B-","C+","D-","B","C-","D+","D-","D-","A+","C+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,3.1056051586532125,2.7,2.69,2.6725566512853307,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B+","B-","B-","B-","C+","C","C","C-","C-","D+","D+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,1.9,1.8,1.7,1.6,1.5,1.4,1.3,1.2,1.1,1.0,0.9,0.8,0.7,0.6,0.5,0.4,0.3,0.2,0.1,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","B-","C+","C+","C+","C","C","C","C-","C-","C-","C-","D+","D+","D+","D","D","D","D-","D-","D-","D-","D-","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6,2.65,2.7,3.4,3.45,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B-","B-","A-","A-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.95,3.3,2.8,2.3,1.7,1.0,0.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","B+","B","C+","C-","D","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.5,2.5,2.5,2.5,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B-","B-","B-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.0,0.7,1.0,1.3,1.7,2.0,2.3,2.7,3.0,3.3,3.7,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","D-","D","D+","C-","C","C+","B-","B","B+","A-","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","C","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","C-","D+","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D+","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.3,2.3,1.7,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","C+","C-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B","A","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,2.4,0.6,0.8,1.2,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","B-","D-","D","D+","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.019078867628035,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","B","B","C+","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","C-","D+","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.396166996884342,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,3.8,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","A","D-","C-","C","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.7,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,1.9179639623568823,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5216090323494273,3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B","B-","D+","B-","B+","A","E","C+","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,3.8,0.7,1.7,3.5,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","A","D-","C-","A-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.0,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","E","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,1.66650216124391,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,3.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","C-","B","B-","B-","B-","B-","C+","C+","C+","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,2.5,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,2.3034637938752276,1.7,1.9,3.5,2.8,0.5,1.1,1.5,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","B-","C-","C","A-","B","D-","D+","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,1.9179639623568823,2.5,3.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,1.5,2.0,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","C-","C","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,4.0,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","A+","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","B","E","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.1,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","B-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0752879252940226,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.66650216124391,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","B-","B+","B","B","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.4956408192364727,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.5092121454706966,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,1.6861731437934284,3.1,3.4,3.5,3.6,3.7,3.8,0.5,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D+","C-","C","C+","C-","B+","A-","A-","A-","A-","A","D-","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,3.5,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","A-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,3.3,2.3,1.7,1.3,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B+","C+","C-","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,1.001174006348176,2.2,2.5249306372830596,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","D+","C+","B-","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","C-","C+","C-","A-","B+","D","B-","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,1.4504570488683117,2.7,2.6,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","C-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.8050411870944807,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,0.7207832887584608,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,2.3034637938752276,1.7,1.9,2.5847832150444283,2.8,0.5,1.1,1.5,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","B-","C-","C","B-","B","D-","D+","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,0.7207832887584608,2.29,0.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D","C+","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,1.66650216124391,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,3.1,1.66650216124391}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","C-","B","B-","B-","B-","B-","C+","C+","C+","C","B+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.0,2.5,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.714133025941265,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","B","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,1.7,1.9,3.5,2.8,0.5,1.6695877941066195,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","C-","C","A-","B","D-","C-","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,1.6861731437934284,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","C-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.3,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,1.5,3.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","A-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,1.6861731437934284,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8,1.29,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","C-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B","D+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,3.3,2.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,3.3,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B+","C+","B-","C-","D+","C+","A+","B+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.0,2.5,2.2646016721191256,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0752879252940226,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.66650216124391,1.5,1.4916045811788032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","B-","B+","B","B","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,1.4504570488683117,2.7,2.6,2.4,2.3,2.2,2.1,2.0,0.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","C-","B-","B-","B-","C+","C+","C+","C","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,1.4504570488683117,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C-","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","B","E","C+","D-","C-","C","A-","B","D-","D+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,3.3,2.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,2.69,2.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B+","C+","B-","C-","D+","C+","A+","B-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.1795485013825338,2.5,3.1603467092537,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","C+","B-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,1,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","D","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","C","E","C+","D-","D","C","A-","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.4981486552127663,2.7,1.29,3.8,1.6861731437934284,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","B-","D+","A","C-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.346953881299916,1.3,0.5,2.2646016721191256,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","C+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","C","E","C+","D-","D","C","A-","B","D-","D+","D-","C-","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,1.2802041150410628,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0752879252940226,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","B-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.9627589397420344,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,3.0089656924915475,0.7,1.9179639623568823,0.69,0.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","B+","D-","C","D-","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9421736386393464,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,0.8021147018594553,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A","A-","A-","A-","A-","B+","B+","B+","D","B","D","B","B","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.0341374357785895,2.1,1.6,3.5,3.2,0.9,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C+","C+","C-","A-","B+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.5,3.03614602926769,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,2.3034637938752276,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","E","C+","D-","C-","C","A-","B","D-","B-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.2,2.0,2.5,3.0,3.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D+","C","B-","B","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.971273365664875,0.7378198540433399,2.0,2.5,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","B","D","C","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6,2.5,2.4,4.0,2.3,2.2,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","B-","A+","C+","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,2.4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","C+","C+","C+","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.749681061709162,4.0,3.9,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,2.69,3.31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A+","A","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","B-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.69,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","C-","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","D+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,1.9996266191371412,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.8662047729715556,3.7,3.3,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","B+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,1.5,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","C-","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,3.3,2.3,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","B-","C-","D+","C+","A+","B+","C+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,1.4504570488683117,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,2.2238464627881944,2.99,1.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C-","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","C+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.7,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9421736386393464,3.8,3.7,3.6,3.5,3.4,3.3,3.2,1.9353928468721506,3.1,0.8021147018594553,3.0,0.9,2.9,2.8,2.7,1.9179639623568823,2.5,2.4,2.3,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","A","A-","A-","A-","A-","B+","B+","C","B+","D","B","D","B","B","B-","C","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.9,3.9,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","D-","C-","C","A-","B","D-","D+","C-","A","A","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,3.0089656924915475,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","B+","C+","D-","C-","C","A-","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.3,3.2,3.1,3.0,0.9,2.0341374357785895,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,2.4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","B+","B+","B+","B","D","C+","B","B-","B-","B-","C+","C+","C+","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.7,1.3,0.5,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C-","D+","D-","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,0.0,2.2,0.7,0.870282952445668,1.0746709443000961,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","E","C+","D-","D","D+","C","A-","B","D-","D+","D-","C-","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,1.5,2.0,2.5,3.0,2.5,1.5,3.5092121454706966}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","C-","C","B-","B","B-","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,0.7207832887584608,0.5,3.8,2.5,3.9,2.2,1.1,3.3,1.61331358062491,0.3,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","D","D-","A","B-","A","C+","D+","B+","C-","D-","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.019078867628035,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","B","C+","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.4916045811788032,1.5,2.0,2.1795485013825338,2.5,3.1603467092537,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","C","C+","B-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.12290545912659744,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,1.61331358062491,1.6861731437934284,3.1,3.4,3.5,3.6,3.7,3.8,0.5,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D-","D+","C-","C","C+","C-","C-","B+","A-","A-","A-","A-","A","D-","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,3.3,2.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,3.3,2.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B+","C+","B-","C-","D+","C+","A+","B+","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5249306372830596,3.03614602926769,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B","A","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.1795485013825338,2.5,3.1603467092537,3.0,3.0,2.1795485013825338}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","C+","B-","B+","B","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,3.8,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","C","E","C+","D-","D","C","A-","B","D-","D+","D-","C-","C-","A","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","D+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","C+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,1.9996266191371412,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1687932232504803,2.1,1.6,3.5,3.2,0.9,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C+","C-","A-","B+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.9,3.5,2.8,0.5,1.1,1.5,2.8,0.0,2.8,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","B","E","C+","D-","C","A-","B","D-","D+","C-","B","E","B","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,0.7,2.019078867628035,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","B","D-","C+","B-","B-","B-","B-","C+","C+","C+","C","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,2.5,3.0,3.0,3.078272939237423,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B","B","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,2.492085735325856,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,3.3,2.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","B-","C-","D+","C+","A+","B+","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,0.1,3.3,3.2,3.1,3.0,1.0725850872295748,2.9,1.4504570488683117,2.7,2.6,2.7,2.4,2.3,2.2,2.1,2.0,0.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","D-","B+","B+","B+","B","D+","B","C-","B-","B-","B-","B-","C+","C+","C+","C","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,0.8179093130273609,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","D","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.6,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","B-","C-","C-","C","B-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,1.1,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-","D+","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.3,2.4956408192364727,1.7,0.870282952445668,1.3,2.1562560321230997,4.0,3.3,2.3,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C+","B-","C-","D","D+","C+","A+","B+","C+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,2.492085735325856,1.7,2.1,1.6,3.5,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D-","B-","D+","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,2.3034637938752276,1.7,1.9,2.5847832150444283,2.8,0.5,3.29,1.1,1.5,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","B-","C-","C","B-","B","D-","B+","D+","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,1.9614609849951297,3.8,2.5,3.9,2.2,1.2141825320982542,1.7,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","C","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","C-","C+","C-","A-","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,2.0465286113881587,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","C+","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.608217362562206,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,3,1,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","B","D","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,3.967515190463491,2.4,0.6,0.8,1.2,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","A","B-","D-","D","D+","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,4.0,1.5,1.9857472091720034,1.5686461260811804,2.0,2.5,3.0,1.5686461260811804}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","A+","C-","C","C-","C","B-","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.469249244129425,3.3,0.3,2.5847832150444283,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","C-","B+","D-","B-","B","B","C-","C+","D+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,1.6861731437934284,1.69,3.1,3.4,3.5,3.6,3.7,3.8,0.5,3.9,4.0,0.1,1.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D+","C-","C","C+","C-","C-","B+","A-","A-","A-","A-","A","D-","A","A+","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.66650216124391,1.5,1.4916045811788032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","B","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.0,2.99,2.7,2.69,2.3,1.396166996884342,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.3,2.29,2.0,1.99,1.7,1.69,1.3,1.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","C+","C+","C","C","C-","C-","D+","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6398053300483975,2.6,2.4,2.3,2.2,2.1,1.0725850872295748,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","B-","C+","C+","C+","D+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B+","C","E","C+","D-","D","C","A-","B","D","D","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.469249244129425,3.3,0.3,2.5847832150444283,3.0,2.8,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596,0.8021147018594553,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","C-","B+","D-","B-","B","B","C+","D+","A-","B+","D","B-","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,2.9,3.8,2.2,0.7,1.7,4.0,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B","A","C+","D-","C-","A+","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,1.0974926345706222,3.0,2.8,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B-","D-","A","B-","A","C+","D+","B+","D-","D+","B","B","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,0,4,4,4,4,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","E","A+","A+","A+","A+","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.019078867628035,2.7,2.6,2.5,2.4,2.4493513486707315,2.2615377417153852,2.2,2.1,1.9857472091720034}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","B","B","C+","B-","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,0.5,0.5,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D-","D-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,2.019078867628035,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","C+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,0.5,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","D-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.5982519024543568,2.3034637938752276,2.3258222873035153,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","B-","B-","C-","C-","C","B-","B+","B","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,0.9063108397552643,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","D","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.749681061709162,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,0.7378198540433399,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","C","A-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3,3.7,3.3,2,2.7,2.3,1,1.7,1.3,0,0.7,0.5,4,1.5,2.2615377417153852,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","B+","C","B-","C+","D","C-","D+","E","D-","D-","A+","C-","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,2.4956408192364727,1.7,1.3,2.1562560321230997,4.0,3.3,2.3,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","B-","C-","D+","C+","A+","B+","C+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,3.0089656924915475,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,1.7,1.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","B+","C+","D-","C-","C","A-","B","D-","D+","C-","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5216090323494273,3.0,2.7,1.2,3.8,0.0,2.2,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B","B-","D+","A","E","C+","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,0.9063108397552643,2.019078867628035,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","B+","B","B","B-","C-","C+","C-","A-","B+","D","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.557523937389682,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,0.5,0.5481291210226951}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","C","E","B-","D-","D","C","A-","B","D-","D+","D-","C-","C-","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9218159113125628,0.5982519024543568,1.5,2.0,2.5,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","D-","C-","C","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,0,4,0,4,4,4,4,1,4,2,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","E","A+","E","A+","A+","A+","A+","D","A+","C","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,2.347638745339878,3.0,3.0,1.66650216124391,1.5,1.4916045811788032,1.4916045811788032}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B-","B","B","C-","C-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,1.6583989260674812,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","C-","D+","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.966523961656619,2.2,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","B","C+","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,1.6861731437934284,3.9,3.0577626154561717,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8,1.29,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","C-","A","B+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B","D+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.1034326263966467,2.0,2.5,2.2646016721191256,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C+","C","B-","C+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.5,2.4,4.0,2.3,2.2,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","A+","C+","C+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.7,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,2.8,3.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","D+","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B","A","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,2.4,3.9,2.0,1.99,1.7,1.69,1.69,1.5284543392254082,2.29,0.7,0.69,0.0,4.0,2.99,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","B-","A","C","C","C-","C-","C-","C-","C+","D-","D-","E","A+","B","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.0,0.9,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B","D","B","B","B-","B-","B-","C+","C+","C+","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,2.5,3.9,2.2,1.1,1.469249244129425,3.3,0.3,2.5847832150444283,3.0,2.8,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596,0.8021147018594553,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","B-","A","C+","D+","C-","B+","D-","B-","B","B","C+","D+","A-","B+","D","B-","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9,0.2,1.6583989260674812,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","D-","C-","D+","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.1,2.3034637938752276,1.4916045811788032,1.5,2.0,2.206719380647742,2.5,3.1603467092537,3.0,3.0,1.5,3.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","C+","B-","B+","B","B","C-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.749681061709162,4.0,3.9,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,2.69,3.31,2.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A+","A","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","B-","A-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,2.99,1.2,1.5,1.8,2.2,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","B","D+","C-","C","C+","B+","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,0,3,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","E","B","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,1.1,3.3,0.3,3.2303340591779497,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","D+","B+","D-","B+","B","B","B-","C-","C+","C-","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,2.2,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.9,3.5,2.8,0.5,1.1,3.0318814166783534,1.5,2.8,3.630731890754824,0.0,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","C+","B+","A","B","E","C+","D-","C","A-","B","D-","D+","B+","C-","B","A-","E","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.2,1.5,1.8,2.2,2.7,1.9996266191371412,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","D+","C-","C","C+","B-","C","B+","A-","A-","A-","A-","A","A","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","C","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,2.5,3.0,2.5,1.5,3.5092121454706966}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B","B-","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B+","A","B","E","C+","D-","C-","C","A-","B","D-","D+","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,4.0,1.1,0.7378198540433399,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","A+","D+","D","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.69,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.469249244129425,1.9952290463544613,0.3,2.5847832150444283,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","C-","C","D-","B-","B","B","C-","C+","D+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,1.5,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.4956408192364727,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.7378198540433399,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","A","E","C+","D-","C-","C","A-","B","D","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0,0,0,0,0,0,0,0,3,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E","E","E","E","E","E","E","E","B","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,1.5,2.0,1.001174006348176,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,3.31,2.8,2.019078867628035,3.304228449970311,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","A-","B","C+","A-","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5902848664020242,0.6813186450656247,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","C","E","C+","D-","D","C","A-","B","D","D","D+","D-","D-","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,2.805533470415009,2.3,1.7,1.3,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B","C+","C-","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.5982519024543568,2.3034637938752276,2.3258222873035153,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5,0.5982519024543568}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","B-","B-","C-","C-","C","B-","B+","B","B","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,1.1,0.7378198540433399,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","D+","D","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.1795485013825338,3.6,3.5,3.4,2.636387703981728,3.2,3.0,0.9,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C+","A-","A-","A-","B-","B+","B","D","B","B","B-","B-","B-","C+","C+","C+","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,2.8,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","B","E","C+","D-","C-","C","A-","B","D-","D+","C-","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.714133025941265,2.1004106498793536,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","B","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.7202316538919511,1.5,2.0,2.5,3.0,0.7202316538919511}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B-","B","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.805533470415009,2.1,1.6,3.5,3.2,0.9,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","B","C+","C-","A-","B+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,1.1058281634660014,0.6,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,3.0,1.7,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","D+","D-","D+","B-","B+","C","E","C+","D-","D","C","A-","B","D-","D+","D-","B","C-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.4956408192364727,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,2.3409287010069173,3.472930434387596,3.0,0.9,2.9,1.4504570488683117,2.7,2.6,2.4,2.3,2.2,2.1,2.0,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B-","A-","B","D","B","C-","B-","B-","B-","C+","C+","C+","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,2.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","A","B","C-","C+","C-","A-","B+","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,1.66650216124391,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,3.1,2.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","C-","B","B-","B-","B-","B-","C+","C+","C+","C","B+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,1.66650216124391,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","B+","D-","C-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.03614602926769}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","C-","C","A-","B","D-","D+","C-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.0,0.9,2.9,2.8,2.7,2.6,2.4,3.2815052600151895,2.2,2.1,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B","D","B","B","B-","B-","B-","B+","C+","C+","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,3.3,0.3,3.2303340591779497,2.8,2.4956408192364727,1.7,2.1,1.6,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","B+","D-","B+","B","B-","C-","C+","C-","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.7352971426398023,0.9063108397552643,2.019078867628035,0.9,0.1,2.019078867628035}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","B+","D-","B","B-","C-","C+","C-","A-","A","D","C+","D","D-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,3.543726897059356,2.6,2.5,2.4,2.3,2.2,2.1,2.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","A-","B-","B-","B-","C+","C+","C+","C","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.9627589397420344,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,3.0089656924915475,0.7,1.9179639623568823,0.69,0.0,4.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","B+","D-","C","D-","E","A+","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.3,2.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B+","B","E","C+","D-","C-","C","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,1.9179639623568823,0.0,0.7,0.01985517592319941,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5902848664020242,0.6813186450656247,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","C","E","D-","D-","C","A-","B","D","D","D+","D-","D-","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.7,1.69,1.69,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C+","C","C-","C-","C-","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.69,0.2,0.3,0.6,0.8,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.7,3.6,0.8179093130273609,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","D-","D-","D-","D","C-","C","C+","B-","B+","A-","A-","A-","A-","D","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,1,4,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","D","A+","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.2,2.019078867628035,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","B+","C+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","C-","C","B-","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,4,4,4,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","A+","A+","A+","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.3,1.747110500284571,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","C","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.1614474163273725,3.0,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B+","B","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.719097468784439,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.0341374357785895,2.1,1.6,3.5,3.2,0.9,3.4,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C+","C+","C-","A-","B+","D","A-","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,3,0,4,4,0,4,4,4,3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","B","E","A+","A+","E","A+","A+","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.5,1.3,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.608217362562206,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,2.7,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D+","C-","C","C+","B-","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.530936876262255,3.0,2.7,1.2,2.5249306372830596,3.03614602926769,2.9,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","B","B-","D+","B-","B+","B","A","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,2.5,3.9,2.2,1.1,1.469249244129425,3.3,0.3,2.5847832150444283,3.0,2.8,2.3,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596,0.8021147018594553,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","B-","A","C+","D+","C-","B+","D-","B-","B","B","C+","D+","A-","B+","D","B-","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,2.2807563821317034,2.2,3.8,0.7,1.7,3.5,3.5,2.8,0.5,1.1,1.5,3.5,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","C+","C+","A","D-","C-","A-","A-","B","D-","D+","C-","A-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.4956408192364727,1.3999000656568406,3.03614602926769,2.557523937389682,3.8,2.2,0.7,1.7,1.9,3.5,2.8,0.7378198540433399,1.1,1.5,2.4956408192364727}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","C-","B+","B-","A","C+","D-","C-","C","A-","B","D","D+","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,2.1795485013825338,3.6,3.5,3.4,2.636387703981728,3.0,0.9,2.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,3.2,3.5,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","C+","A-","A-","A-","B-","B","D","B","B","B-","B-","B-","C+","C+","C+","C","B+","A-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.6759088043422827,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,0.7,2.019078867628035,2.7,2.6,2.5,3.5913526622381533,2.4,2.2615377417153852,2.2,2.1,2.0,2.2,3.4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","B","D-","C+","B-","B-","B-","A-","B-","C+","C+","C+","C","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0752879252940226,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","C-","C-","C","B-","B+","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,2.9042970164851347,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5481291210226951,1.5,1.7,2.8,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B","C","E","C+","D-","D","C","A-","B","D","D","D+","D-","C-","C-","B","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.7061695985691503,1.3,2.1687932232504803,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C","D+","C+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,2.8,2.4956408192364727,1.7,2.1,1.6,3.5,3.7352971426398023,0.9063108397552643,2.019078867628035,0.9,0.1,2.019078867628035,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B-","D-","A","B-","A","C+","D+","B+","D-","B","B-","C-","C+","C-","A-","A","D","C+","D","D-","C+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.0,2.99,2.7,2.3,2.29,2.0,1.99,1.7,1.69,1.3,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B","B","B-","C+","C+","C","C","C-","C-","D+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,3.0089656924915475,2.2,0.7,1.7,1.9,3.5,0.5,1.1,1.5,1.7,1.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","B+","C+","D-","C-","C","A-","D-","D+","C-","C-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.5,1.8,2.2,1.6561866182447165,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","C-","C","C+","C-","B-","B+","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,2.5,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,2.8,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","A","B","C-","C+","C-","A-","B+","B-","B","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,1.8743107478666374,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.2,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","D+","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,2.0,1.001174006348176,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3192015040868372,0.9799856738365232,1.5,1.0974926345706222,2.5,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D","C-","D+","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.9,2.9,3.8,2.2,3.8,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.5,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","A","B","A","C+","A","D-","C-","C","A-","B","D-","D+","C-","A-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5902848664020242,0.6813186450656247,0.5481291210226951,1.7216864522041253,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","C","E","C+","D-","D","C","A-","B","D","D","D+","D-","D-","D-","C","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,0.7,0.69,0.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","D-","D-","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.5,3.03614602926769,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.7378198540433399,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","E","C+","D-","C-","C","A-","B","D-","D+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,2.3409287010069173,3.472930434387596,3.0,0.9,2.9,1.4504570488683117,2.7,2.6,2.4,2.3,2.2,2.1,2.0,3.3,2.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B-","A-","B","D","B","C-","B-","B-","B-","C+","C+","C+","C","B+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,3.3,0.3,3.2303340591779497,2.8,2.4956408192364727,1.7,2.1,1.6,0.8,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","B+","D-","B+","B","B-","C-","C+","C-","D","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.7207832887584608,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,2.019078867628035,3.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","C+","B+","D","B","A","B","C-","C+","C-","A-","B+","B-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.2,2.7,1.29,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,2.492085735325856,1.7,2.1,1.6,3.5,0.9,2.6,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D-","B-","D+","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","D","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4,4,4,4,4,4,4,4,3,4,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A+","A+","A+","A+","A+","A+","A+","B","A+","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.019078867628035,2.7,2.6,2.5,2.4,2.4493513486707315,2.2615377417153852,3.5,2.1,1.9857472091720034,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","B","B","C+","B-","B-","B-","B-","B-","C+","A-","C+","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,2.805533470415009,1.69,1.69,1.29,2.29,0.7,0.69,0.0,3.29}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","B","C-","C-","D+","C+","D-","D-","E","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,3.3422621377038992,1.7,2.1,1.6,3.5,3.2,0.9,2.5249306372830596,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","A-","C-","C+","C-","A-","B+","D","B-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.530936876262255,3.0,2.7,1.2,2.5249306372830596,3.03614602926769,2.9,3.8,2.0341374357785895,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","B","B-","D+","B-","B+","B","A","C+","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.5,2.4,4.0,2.3,2.2,2.1,3.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","A+","C+","C+","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.8759777934749753,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,4.0,1.1,0.7378198540433399,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","A+","D+","D","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,2.3,1.7,3.921301369806522,0.5,1.3,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","C+","C-","A","D-","D+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,3.5092121454706966,1.5,2.519679221762928,2.0,2.5,3.0,2.5,1.5,3.5092121454706966}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","A-","C-","B-","C","B-","B","B-","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,1.2802041150410628,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.9218159113125628}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","D+","B-","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,4.0,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,3.3422621377038992,1.7,2.1,1.6,3.5,3.2,0.9,1.396166996884342,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","A+","D-","A","B-","A","C+","D+","B+","D-","B","A-","C-","C+","C-","A-","B+","D","C-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.8759777934749753,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,4.0,1.1,0.7378198540433399,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","A+","D+","D","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.5982519024543568,2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.5,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","B-","C-","C-","C","B-","B+","B","B","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.0465286113881587,3.7,3.3,2.3,1.7,1.3,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","A-","B+","C+","C-","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.469249244129425,1.9952290463544613,0.3,2.5847832150444283,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","C-","C","D-","B-","B","B","C-","C+","D+","A-","B+","D","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.966523961656619,2.206719380647742,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","B","C+","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,3.5,3.5,2.8,0.5,1.1,1.5,3.5,0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","A-","A-","B","D-","D+","C-","A-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,0.7207832887584608,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,2.7,3.5,2.8,0.5,1.1,0.7378198540433399,1.5,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D","B-","B+","A","E","C+","D-","C-","B-","A-","B","D-","D+","D","C-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.9952290463544613,2.5,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","B","C","B-","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,3.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,3.5,2.8,0.5,4.0,1.1,0.7378198540433399,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","D+","B-","B+","A","E","C+","D-","C-","A-","B","D-","A+","D+","D","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.6,2.5,2.4,4.0,2.989123794765767,2.2,2.1,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B-","B-","B-","A+","B","C+","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.369355625324329,1.9179639623568823,0.0,2.2,0.7,0.870282952445668,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5481291210226951,1.5,2.8,0.0,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","A-","C","E","C+","D-","D","C","A-","B","D","D","D+","D-","C-","B","E","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,1.7,2.1,3.5,3.2,0.9,0.8876013200359498,2.6,2.8,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","C-","C+","A-","B+","D","D","B-","B","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,1.2802041150410628,3.49258323511477,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,3.5,0.5,1.1,0.5481291210226951,0.7202316538919511}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","D+","A-","B-","B+","A","E","C+","D-","C-","A-","D-","D+","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6634410858206614,3.0,2.7,1.2,2.5,3.9,2.9,2.5021217157960574,2.2,3.8,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.5,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","B","B-","D+","B-","A","B","B-","C+","A","D-","C-","C","A-","B","D-","D+","C-","A-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.4956408192364727,3.03614602926769,3.8,0.0,2.2,0.2428413553027755,0.7,1.7,1.9,0.9849925692786241,3.5,2.8,0.5,1.1,1.5,3.03614602926769}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","A","E","C+","D-","D-","C-","C","D","A-","B","D-","D+","C-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.03614602926769,1.9179639623568823,0.0,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,3.8,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B+","C","E","D-","D","C","A-","B","D-","D+","D-","C-","C-","A","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.9042970164851347,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,1.7,1.9,3.5,2.8,0.5,1.1,1.5,3.03614602926769}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B","B-","D+","B-","B+","A","E","C+","C-","C","A-","B","D-","D+","C-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,2.460601793067368,3.0,2.9,2.8,2.019078867628035,2.7,2.6,2.5,2.4,2.2615377417153852,2.3301548127056266,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B-","B","B","B","C+","B-","B-","B-","B-","C+","B-","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,3.3,2.3,0.7207832887584608,1.3,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B+","C+","D","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.3,2.3,1.7,1.3,0.01985517592319941,0.7207832887584608,1.3,0.01985517592319941}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","B+","C+","C-","D+","D-","D","D+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.2,2.1,2.0,3.8}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","C+","C+","C","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,3.9,1.1,3.3,0.3,3.2303340591779497,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","A","D+","B+","D-","B+","B","B","B-","C-","C+","C-","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,1.2274322737605134,3.5,2.8,0.5,1.1,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","D+","A-","B","D-","D+","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,1.469249244129425,1.9952290463544613,0.3,2.5847832150444283,3.0,2.8,1.7,2.1,1.0974926345706222,3.5,3.2,0.9,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","C-","C","D-","B-","B","B","C-","C+","D+","A-","B+","D","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,2.0,1.001174006348176,1.6302982958036256,0.9799856738365232,0.9799856738365232}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","D+","C-","D","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.4288677280674262,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.3,2.29,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A-","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","C+","C","C","C-","C-","C-","D+","C+","D-","D-","E"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,1.2802041150410628,3.1504355199122633,3.49258323511477,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,3.5,0.5,1.1,0.5481291210226951,0.7202316538919511}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","D+","B+","A-","B-","B+","A","E","C+","D-","C-","A-","D-","D+","D-","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.7202316538919511,2.0,2.5,3.0,0.7202316538919511}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","B-","B","D"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,1.29,1.9614609849951297,3.8,2.5,3.9,2.2,1.2141825320982542,1.7,1.1,3.3,0.3,3.0,2.8,3.2527338037184883,1.7,2.1,1.6,3.5,0.9,2.6,2.8,1.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D+","C","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","B+","C-","C+","C-","A-","D","B-","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,0.8662047729715556,2.5,3.9,1.1,3.3,0.3,3.2303340591779497,3.0,2.8,2.4956408192364727,1.7,2.1,1.6,3.2,2.019078867628035,0.9,2.6,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","D","B-","A","D+","B+","D-","B+","B","B","B-","C-","C+","C-","B+","C+","D","B-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,3.31,2.8,2.019078867628035,3.304228449970311,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,3.025309164026438,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","A-","B","C+","A-","B-","B-","B-","B-","C+","C+","B+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.7061695985691503,1.3,2.1687932232504803}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C","D+","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,2.3034637938752276,1.7,1.9,3.5,2.8,0.5,1.1,1.5,1.1,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","E","C+","D-","B-","C-","C","A-","B","D-","D+","C-","D+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.7,1.1,3.3,0.3,3.0,2.8,2.1,1.6,3.5,3.2,0.9,2.6,2.8,3.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","D+","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","C+","C-","A-","B+","D","B-","B","A","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,2.8759777934749753,0.0,2.2,1.7,1.9,3.5,2.8,0.5,0.14641797471104145,1.1,1.5,3.03614602926769}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B","E","C+","C-","C","A-","B","D-","D-","D+","C-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,0.7378198540433399,1.7,3.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","D","C-","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.0,2.99,2.7,2.69,2.3,1.396166996884342,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,0.0,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","E","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,2.867746650867409,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.69,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","B","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.0341374357785895,2.1,1.6,3.5,3.2,0.9,2.6,3.3,2.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C+","C+","C-","A-","B+","D","B-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,1.9179639623568823,0.0,2.2,0.7,1.562780356825903,1.9,3.5,2.8,0.7335880754647408,1.9614609849951297,0.8662047729715556,1.1,0.6813186450656247,0.5481291210226951,1.7216864522041253,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","C","E","C+","D-","C-","C","A-","B","D","C","D","D+","D-","D-","C","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.2,2.7,1.29,3.8,2.5,3.9,1.2141825320982542,3.3,0.3,3.0,2.8,2.492085735325856,1.7,2.1,1.6,3.6539558282564455,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D-","B-","D+","A","B-","A","D+","B+","D-","B","B","B-","C-","C+","C-","A-","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B+","A","E","C+","D-","C-","C","A-","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.8,0.3,0.6,0.14641797471104145,1.2,1.5,1.8,2.2,1.6861731437934284,1.69,3.1,3.5,3.6,3.7,3.8,0.5,3.9,4.0,0.1,1.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D","D-","D-","D-","D+","C-","C","C+","C-","C-","B+","A-","A-","A-","A","D-","A","A+","D-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.9799856738365232,2.0,1.001174006348176,1.2255111164251886,1.6302982958036256}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C","D+","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,2.019078867628035,3.3,0.8,2.9042970164851347,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,1.2946747418287787,2.6,1.9,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","C+","B+","D","B","B","A","B","C-","C+","C-","A-","B+","D+","B-","C","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,3.9,2.9,3.8,2.2,3.8,0.7,1.7,1.2274322737605134,3.5,2.8,0.5,1.1,1.5,3.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","A","B","A","C+","A","D-","C-","D+","A-","B","D-","D+","C-","A-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,2.0341374357785895,2.1,1.6,3.5,3.2,0.9,2.6,3.3,2.5,2.0341374357785895}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","C+","C+","C-","A-","B+","D","B-","B+","B-","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0752879252940226,2.3034637938752276,0.6053749981062893,2.989123794765767,1.5,2.0,2.5,3.1603467092537,3.0,3.0,1.66650216124391,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","B-","D-","B","C-","C","B-","B+","B","B","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5,3.7,3.4172494458273226,1.7,1.3,0.5,1.3,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","A-","A-","C-","D+","D-","D+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,3.31,2.019078867628035,3.304228449970311,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","A-","C+","A-","B-","B-","B-","B-","C+","C+","C+","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.8225690622126731,1.9,2.7,0.5,2.5,1.66650216124391,3.9,2.2,1.1,1.469249244129425,3.3,0.3,2.5847832150444283,3.0,2.8,2.3,1.0974926345706222,3.5,3.2,0.9,2.5249306372830596,0.8021147018594553,2.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","C","B-","D-","B-","C-","A","C+","D+","C-","B+","D-","B-","B","B","C+","D+","A-","B+","D","B-","D","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,1.9179639623568823,0.0,0.7,0.01985517592319941,1.9,3.5,2.8,0.7335880754647408,0.8662047729715556,1.1,0.5902848664020242,0.6813186450656247,0.5481291210226951,1.5,1.7,1.9179639623568823}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","C","E","D-","D-","C","A-","B","D","D","D+","D-","D-","D-","C-","C-","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.5,1.8,2.2,2.7,3.1,3.4,3.5,3.6,3.7,3.8,3.9,4.0,3.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","C-","C","C+","B-","B+","A-","A-","A-","A-","A","A","A+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.3,1.747110500284571,1.3,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","C","D+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.9627589397420344,2.7,2.69,2.29,3.9,2.0,1.99,1.7,1.69,1.69,1.29,3.0089656924915475,0.7,0.69,0.0,4.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","B+","D-","D-","E","A+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,1.9945831786887105,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","C","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.7,3.3,1.7,1.3,0.4113411924263526,0.5,0.8179093130273609,0.5,0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B+","C-","D+","D-","D-","D","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.03614602926769,3.8,0.0,1.1058281634660014,2.2,0.7,2.0169200753553063,1.9,2.8,0.5,1.1,0.5481291210226951,1.5,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B+","A","E","D+","C+","D-","C+","C","B","D-","D+","D-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,1.9,3.5,1.1,0.7378198540433399,1.5,3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","B-","B+","A","E","C+","D-","C-","C","A-","D+","D","C-","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.7,1.2,2.5,3.03614602926769,1.9179639623568823,0.0,2.1562560321230997,2.557523937389682,0.7,0.870282952445668,1.9,3.5,2.8,0.5,1.1,0.5481291210226951,1.5,1.7,0.5,0.5481291210226951}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D+","B-","B+","C","E","C+","B-","D-","D","C","A-","B","D-","D+","D-","C-","C-","D-","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.1,0.2,0.3,0.6,0.8,1.2,1.5,1.8,2.2,2.7,2.482496149479828,3.4,3.5,3.6,3.7,3.8,3.9,4.0,0.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-","D-","D-","D-","D","D+","C-","C","C+","B-","B-","A-","A-","A-","A-","A","A","A+","D-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,0.7,1.1,3.3,0.3,3.0,2.8,1.7,2.1,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","D-","D+","B+","D-","B","B","C-","C+","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.3,1.747110500284571,1.3,0.5,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","B+","C","D+","D-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.1795485013825338,2.5,3.1603467092537,3.0,1.530936876262255,3.0,2.1795485013825338}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","C+","B-","B+","B","C-","B","C+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,3.7,1.2,2.5,3.03614602926769,3.8,0.0,2.2,0.7,1.7,3.5,1.61331358062491,0.5,4.0,1.1,0.7378198540433399,1.5,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","A-","D+","B-","B+","A","E","C+","D-","C-","A-","C-","D-","A+","D+","D","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,3.066387551847856,1.7,2.1,1.6,3.5,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B+","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.3034637938752276,1.4916045811788032,1.5,2.0,2.5,3.1603467092537,3.0,1.5,2.0,2.3034637938752276}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","C-","C-","C","B-","B+","B","C-","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,2.2129211176940524,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6,3.9}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C+","B-","D+","A","B-","A","C+","D+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.29,3.1,3.0,2.99,2.7,2.69,2.29,3.9,1.99,1.7,1.69,1.69,1.29,2.29,0.847279854631733,0.69,0.0,4.0,2.69}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B+","B+","B","B","B-","B-","C+","A","C","C-","C-","C-","D+","C+","D","D-","E","A+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.0,1.5,2.0,3.0,2.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D","C-","C","B","C"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.078272939237423,3.7,2.805533470415009,2.3,1.7,1.3,0.5,3.3,2.2646016721191256,1.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B+","A-","B","C+","C-","D+","D-","B+","C+","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.2,0.2,2.7,1.29,2.5,3.9,2.2,1.2141825320982542,3.3,0.3,3.0,2.8,2.492085735325856,1.7,2.1,1.6,3.5,0.9,2.6,1.7,1.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C+","D-","B-","D+","B-","A","C+","D+","B+","D-","B","B","B-","C-","C+","C-","A-","D","B-","C-","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,2.5,3.9,2.966523961656619,2.2,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","B-","A","B","C+","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,2.6,3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","A","B-","A","C+","D+","B+","D-","B","B","C-","C+","C-","A-","B+","B-","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.749681061709162,4.0,3.9,3.608217362562206,3.7,3.31,3.29,3.0,2.99,2.7,2.69,2.3,1.69,2.0,1.99,1.7,1.69,1.69,1.29,2.29,2.385381226722181,0.7,0.69,0.0,2.69,3.31,1.0434544410010682,2.29,3.31}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A+","A","A-","A-","A-","B+","B","B","B-","B-","C+","C-","C","C","C-","C-","C-","D+","C+","B-","D-","D-","E","B-","A-","D+","C+","A-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,2.2,1.1,3.3,0.3,3.0,2.8,3.066387551847856,1.7,2.1,1.6,1.0434544410010682,3.2,0.9,2.5249306372830596}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C+","D+","B+","D-","B","B","B+","C-","C+","C-","D+","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.4916045811788032,2.843218225917466,1.5,2.0,2.5,3.1603467092537,3.0,3.0,3.894381151551462}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"C-","B","C-","C","B-","B+","B","B","A"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,2.1003344731606215,3.5,3.4,3.3,3.2,3.1,3.0,2.9,3.31,2.8,2.019078867628035,3.304228449970311,2.7,2.6,2.5,2.4,2.2615377417153852,2.2,2.1,2.0,2.0,3.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","C+","A-","A-","B+","B+","B+","B","B","A-","B","C+","A-","B-","B-","B-","B-","C+","C+","C+","C","C","B+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.7,3.6,3.5,3.4,3.3,3.2,3.1,3.0,2.9,2.8,2.7,2.798786831409463,2.5,2.4,4.0,2.989123794765767,2.2,2.1,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A-","A-","A-","A-","B+","B+","B+","B","B","B","B-","B","B-","B-","A+","B","C+","C+","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5,3.03614602926769,3.8,2.8,0.0,2.2,0.7,1.7,1.9,1.8743107478666374,3.5,2.8,0.5,1.1,1.5,2.8,2.8,2.7,1.1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","A","B","E","C+","D-","C-","C","C","A-","B","D-","D+","C-","B","B","B-","D+"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.5216090323494273,3.0,2.7,1.2,3.8,0.0,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","B","B-","D+","A","E","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,0.8,3.1,3.0,2.99,2.7,2.69,2.29,3.9,1.8743107478666374,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,4.0,2.99}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","D","B+","B","B","B-","B-","C+","A","C","C","C-","C-","C-","D+","C+","D-","D-","E","A+","B"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0,3.9,3.8,3.7,3.31,3.0,2.99,2.7,2.69,2.3,2.712361637388972,1.396166996884342,2.0,1.99,1.7,1.69,1.69,1.29,2.29,0.7,0.69,0.0,0.0,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+","A","A","A-","A-","B","B","B-","B-","C+","B","C-","C","C","C-","C-","C-","D+","C+","D-","D-","E","E","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.3,3.2,3.1,3.0,0.9,2.8,2.7,2.6,2.4,2.3,2.2,2.1,2.0,2.4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","B+","B+","B+","B","D","B","B-","B-","B-","C+","C+","C+","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {2.6398053300483975,0.2,2.7,1.29,3.8,2.5,3.9,2.2,1.2141825320982542,1.6400850310177304,1.1,3.3,0.3,3.0,2.8,1.7,2.1,1.6,3.5,3.2,0.9,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B-","D-","B-","D+","A","B-","A","C+","D+","C-","D+","B+","D-","B","B","C-","C+","C-","A-","B+","D","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.9,3.8,3.7,3.6,3.5,3.4,3.3,3.1,3.0,0.9,2.9,2.8,2.7,2.6,2.5,2.4,2.3,2.714133025941265,2.1004106498793536,2.0,2.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A","A","A-","A-","A-","A-","B+","B+","B","D","B","B","B-","B-","B-","B-","C+","B","C+","C","B-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.0,2.7,1.2,2.5249306372830596,3.03614602926769,2.9,3.8,1.9104629488624383,2.2,0.7,1.7,1.9,3.5,2.8,0.5,1.1,1.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"B","B-","D+","B-","B+","B","A","C","C+","D-","C-","C","A-","B","D-","D+","C-"}
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {3.6,1.9,2.7,0.5,3.8,2.5,3.9,1.5660104994260502,1.1,3.3,0.3,0.8,3.0,3.921301369806522,2.8,1.7,2.1,1.6,3.5,3.2,2.6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A-","C","B-","D-","A","B-","A","C-","D+","B+","D-","D","B","A","B","C-","C+","C-","A-","B+","B-"}
        );
    }
}

