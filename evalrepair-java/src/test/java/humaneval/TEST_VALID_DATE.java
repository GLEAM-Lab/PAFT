package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_VALID_DATE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("03-11-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("15-01-2012"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0-2040"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("06-04-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("01-01-2007"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("03-32-2011"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date(""));
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-3000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("06-06-2005"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("21-31-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("04-12-2003"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04122003"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20030412"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2003-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2003-04-12"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-2003"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("12-31-1999"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("02-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-31-2023"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-000-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-3104-202223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-01-000-200020000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-204-31-202221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("044-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-11-31-20233104-213-01-2002223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-230-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("011-3104-2022231-32-01-000-200020000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-43104-3202223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-00-20001-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("192-31-1999"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-01-0006-04-2020-200020000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("010-32-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-031-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-204-31-202-29-202102221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-311-2023"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-01-000-200000-20001-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("192-31--1999"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("192-31011-3104-2022231-32-01-000-200020000--19919"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("013-04-01-00-20001-20031-20000202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-04-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-31011-3104-2022231-32-01-000-2000200002223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-32-2000031-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-11-431204-3202223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-031-2001-32-001-32-01-0006-04-2020-2000200001-0006-04-2020-200020000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("000-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-3120212-31-19993"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-204-310-202-29-202102221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-032-2000031-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("192-1999"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-31011-3104-2022231-32-01-000-2000200002212-31-199923"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-02-230-20003120212-31-19993"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-13-01-202023"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2330-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-000-202-2330-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-04-2022-32-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-3101-32-200004-202223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-311-3"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02213-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("011-431004-3044-202220192-1999222302"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-02-230-20003120212-31-219993"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0113-01-20-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-229-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-01-0011-11-31-20233104-213-01-20022230-200000-20001-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("013-04-01-00-20001-20031-2000020201-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-230-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("011-3104-2022231-32-01-000-202213-01-2000020000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-00-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-219993"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0113-01-201-32-200002000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-230-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-11-31-2000-0113-01-20-20003-01-2002223"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-02-230-220003120212-31-19993"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-04-310222"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-204-31-11-311-302-29-202102221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-01-0011-11-31-20233104-213-01-20022230-200000-20001-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-004-31-20221-32-2000031-2022"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-031-2000000-0113-01-201-32-200002000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-01-01-0011-11-31-20233104-213-0101-00-2000001-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-0000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11-31011-3104-2022231-32-01-000-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-20-22"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("02-29-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--04201-00-20000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-202131-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-06--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-313-01-20201-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-21020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/20202006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-202-02-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-2020-06/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-06-042020-06--041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-202020-06-042131-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-0413-01-21020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/042/2002-29-2021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-06-042020-06-02-30-06/042/20202020-041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-02020-0413-01-210204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-/20202002-30-06/042/20202006/04/20202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("260202-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-0602-29-2020--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/04202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-02020-04131-210204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("WXDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-06/042020200-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-06-0420206-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-202-02-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-292-202131-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-04-02-29-2-202006--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-02-3004-02-29-20213104-04-02-29-202131-2020202020202042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-010-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020-06-04-31-2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-06/0420202000-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/042/20004-04-02-29-202131-202020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-30020202-30-06/0420202000-WXDu044-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-2002131-2020-06/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-042020-06-04-31-2020-04201-00-20000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-042020-06--042000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-2020-06-042020-06--0404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-06/04202WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-0602-29-2020--02-30-06/024/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-2020-0413-01-210200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/042/2002-2-2021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-2020-06-042020-06--00404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-02-29-231-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/202004-313-01-20201-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2002-42/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/0420202-30-06/0420202000-WXDu042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-06-04202001-00-20002020-0602-29-2020--02-30-06/04/20202020046-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-2020-2020-06-042020-06--040402-30-06/042/20202020-041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/04/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-202-020020-06-042020-06--042-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-2020-2020-06-042020-06--040406-0422020-06-02-30-06/042/20202020-041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-2021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/042/2002-29-202120202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-2-W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-230-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/2002"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-/20202002-30-06/042/20202000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02260202-06-042020-06--04-292-2021301-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-004-02260202-06-042020-06--04-292-2021301-20204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-220020-06-042020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-2020-06/004/2020202002-30-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-04-02-29-202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06--13-01-2102004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("e"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-292-20213104-02260202-06-042020-06--04-292-2021301-2020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2002020-06-042020-06--04201-00-20000-06--02-3004-02-29-202131-2020-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-040-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-02-29-20202-041WXDu3-01-21020029-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-042020-06-204-31-2020-04201-00-20000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020--06-04-02-292-2020-06--04202131-2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-2021302020-0409-01-20001-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020020-06-02-3004-02-29-20213104-04-02-29-202131-2020202020202042020-06--040-01-220020-06-042020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-220020-06-0420020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-04-02-29-2-202006--02-30-06/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-026020-06-0420206-06--042260202-06-042020-06--04-292-2021301-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-06/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0020-30-062/042/2002-2-2001-00-20002020-0602-29-2020--02-30-06/024/202020200421202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-06/04/20202021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/20002-30-06/042/2020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-06/04/20202021200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/02-30-06/202004-313-01-20201-20202002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-06/0422020200-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202-3004-02-29-202131-26020-06-0420206-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-02/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06--133-01-2102004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0WXDu6/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06020-30-062/042/2002-2-2021202020/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-06/04202220020-040200-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-06/04/2020202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020-606--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-26020-02020-04131-21020406/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06020-30-062/042/2002-2-06/04/20202021202020-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-22020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-3004-02-29-202131-20021-32-26020-06-042020-06--042000202002-30-06/042/20202006/04/20202006/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/042020-06--13-01-210200420004-04-02-29-202131-202020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-202-020020-06-042020-06--002-30-026/0420202-30-06/0420202000-WXDu042/2002042-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-2020-2020-06-042020-06--040406-0422020-06-02-30-06/042/20202020-02-30-206/042/20020041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-042020-06-204-3-00-20000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/042/2002-30-06/042/202020200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-220020-06-04200200-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-06/04/2020202202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-20/202002-30-06/042/20202006/04/20202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-04-02-29-020-30-06/042/20004-04-02-29-202131-202020020202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-22020-0413-01-210200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-002020-2020-2020-06-042020-06--040402-30-06/042/20202020-041-00-200006/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/20202020004-31-2002-30-026/042/20020202-30-206/042/20020-30-06/04020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("ee"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-20001020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-06/0420202000-WXDu040020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/04202020-06--0420"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-231-21020406/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06020-32/042/2002-2-06/04/20202021202020-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-21020-30-062/042/2002-2-06/04/20202021200020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-2002131-04-31-2002-42/20020202020-06/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/20002-30-06/04/2/2020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/042/2-0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/20002-30-06/042/202/0202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("040-3102-30-206/042/20020-20200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--04260202-06-042020-06--0400-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-292-20213104-02260202-06-042020-0620"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-02020-0413-01-21020402-30-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-00-01-220020--06-042020-06--0400000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2600-01-220020-06-042020-06--0402020-06-042020-06--041-00-20000000020-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("240020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-2026/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-313-02-29-202101-20201-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-0202-3004-02-29-202131-26020-06-0420206-06--046--0420020-06-042020-060000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/20002-30-06/042/202/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04000-01-220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-206/004/20002-30-06/042/202020202002-02-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202102-30-06/20202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202-30-2020-30-06/042/20202006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0402020-2020-2020-06-042020-06--040402-30-06/042/20202020-041-00-2000-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("102-3004-02-29-202131-2020-06/04/2020202002-30-206/042/200203-01-21020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-02-229-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-0022020-2020-2020-06-042020-06--040402-30-06/042/20202020-041-00-200006/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-22020-06/04/2020202002-30-206/042/2/0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0WXDXu6/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0400-01-220020-06-0420020-0-6--040000-202101-20201-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3001-32-200-206/042/20020202-30-06/042020200-WXDu0420"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2020202020-06-042020-06-02-30-06/042/20202020-041-00-20000-040-01-20001020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-2-20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2313-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/02-30-06/202004-313-01-20201-202020020200-06/042/2"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-042020-06-204-3-00-200000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0WXDXu6/04/2/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/0420202-30-002020-2020-2020-06-042020-06--040402-340-06/042/20202020-041-00-200006/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-040-3102-30-206/042/-20020-202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-020-30-062/042/2002-2-06/04/2020202120202001-220020-06-04200200-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-0422020-06--042000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/202023020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-2600-01-220020-06-042020-06--0402020-06-042020-06--041-00-20000000020-06-042020-06--042020-06-042020-06--00404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/0420202-30-06/042020200X0-WXDu042/220020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202-3006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-0604"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-3004-02-29-202131-/20202002-30-06/042/202020006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-202-02-2901-00-20002020-0602-29-2020--02-30-06/04/2020202004-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-9-2020--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-2-02021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-32220020-040200-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-04-02-29-020-30-06/042/26020-02020-04131-21020420004-04-02-29-202131-202020020202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-00-01-220020--202020-06-042020-06--0420020-06-042020-06-204-3-00-200000-06--0406-042020-06--0400000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("404-02-29-2-W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-2600-01-220020-06-042020-06--02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020--041-000-20000000020-06-042020-06--042020-06-042020-06--00404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-3102-30-06/042/2001-00-20002020-06--02-30-06/06/004/20002-30-06/042/202/020202004/2020202004202006/04/202020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-2020-06/04/2020202002-30-2060/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-3102-30-06/042/2001-004-04-02-29-231-2020200-20002020-06--02-30-06/06/004/20002-30-06/042/202/020202004/2020202004202006/04/202020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0202-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-2020-2020-06-042020-06--040406-0422020-06-02-30-06/042/20020-06-042020-606--041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--000-20000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06--133-031-2102004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/200201-220020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-22-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-04202--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-02020-0413-01-21020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-0040-01-2000102W02-3004-02-29-202131-20021-32-26020-06-042020-06--042000202002-30-06/042/20202006/04/20202006/04/20202020XDu0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-021-32-26020-06-0422020-06--0420006-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-04-02-29-020-30-06/042/0WXDu6/042/2002020004-04-02-29-202131-202020020202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("026020-2600-01-220020-06-042020-06--02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020--041-000-20000000020-06-042020-06--042020-06-042020-06--0040421-32-26020-06-042020-06--042000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-30-006/04202WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("102-3004-02-29-202131-22020-06/04/2020202002-30-206/042/200203-01-21020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/2002-30-02-30-06/202004-W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu313-01-20201-202020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-202131-20206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-202-02-2901-00-20002020-0602-29-2020--02-30-06/04/202002-30-06/202004-313-01-20201-2020202004-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-21020-30-062/0242/2002-2-06/04/20202021200020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("ffyBM02-3001-32-200-206/042/20020202-30-06/042020200-WXDu0420W"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-06-020-30-062/042021202020042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/02420202-30-06/0420202000-WXDu042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-042020-06-204-3-00-2404-02-29-2-W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu202000000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2002020-06-042020-06--04201-00-20000-06--02--202131-2020-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-202131-202013-01-202020-040-01-200010206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-04-02-29-2-202006--002-30-231-21020406/04/2020202004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020--06-04--02-292-2020-06--04202131-2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0102-3004-02-29-202131-2020-06/04/2020202002-30-206/042/200203-01-210202-30-026/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0226020-2600-01-220020-06-042020-06--0402020-06-042020-06--041-00-20000000020-06-042020-06--042020-06-042020-06--00404-3004-02-29-202131-2020-06/004/2020202002-30-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("404-02-29-2-W02-3004-02-29-202131-2-30-06/042/202002020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-/20202002-30-06/042/20202006/04/2004-313-01-20201-202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-040-004-04-02-29-231-2020201-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-2020-06-042020-06--4"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2-30-06/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-210202020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-0020-0413-01-210204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-300-206/042/2002-30-026/0420202-30-06/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-2-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("026020-2600-01-220020-06-042020-06--02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020--041-000-20000000020-06-042020-06--042020-06-0420200202-3006/04/202020-06--0040421-32-26020-06-042020-06--042000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-00-20002020-04-02-29-2-202006--02-30-06/04/202020200401-21020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202/0-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/042/2002-29-202120202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-026--04260202-06-042020-06--0400-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("260202-06--042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6//042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020020-06-02-3004-02-29-20213104-04-02-29-202131-20202020202020420220020-06-042020-606--040-06--040-01-220020-06-042020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/042/2002-02-30-026/042/2-002020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2102"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-06-046--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-230-206/00-010-2000042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-202131-202013-01-2020202-30-06/20200-040-01-200010206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("206020-06-042020601-00-20002020-06--02-30-06/04/2020202004--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("WX2020-06--133-01-2104u"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/2002-30-02-30-06/201-00-200002004-W02-3004-02-29-202131-20202002-30-06/042/20202006/04/20202006/04/20202020XDu313-01-20201-202020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-02-302-06/042/2002029-2021302020-0409-02020-06020-32/042/2002-2-06/04/20202021202020-0441-20001-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("ui"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6/042/2026020-06-0420206-06--042"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020202-322200-29-2-202006--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06020-30-062/042/200W02-3004-02-29-202202020/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202-3006/04/2020220"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/4042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/22002-2-06/04/2020202202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/0420202-202020-06-042020-026--04260202-06-042020-06--0400-06--0400X0-WXDu042/220020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-042020-06--0420020020-06-02-3004-02-29-20213104-04-02-29-202131-2020202020202042020-06--040"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-300-06/4042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/042002000-WXDu040020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/20200202-30-026/2042/20020-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/042/2002-02-30-0206/042/2-002020202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-06-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0WXDXu6/0426020-02020-0413-01-2102042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-04000-01-220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-02-29-202131-20202002-2-20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0102-3004-02-29-202131-2020-06/04/2020202002-30-206/042/200203-04-04-04000-01-220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-00-210202-30-026/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/04/2020202000WXDu6//042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-020-30-062/042/2002-2-0602020-06-042020-06--041-00-20000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6/042/200420"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-002-3004-02-29-202131-2020-06/04/2020202002-30-2046/042/02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-3004-02-29-202131-/20202002-30-06/04-02-22-2020042/202020006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-04000-01-220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-006/04202020000-WXDu042/20020020-02-29-202131-20202002-2-20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-0602-29-2020--02-30-06/024/202020204-313-02-29-202101-20201-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/002-300-06/4042/200204202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-0422020-06--0-42000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-022-2-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06020-30-062/042/2002-2-062020-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/0420202-020202-322200-29-2-202006--02-30-06/04/202020200430-06/0420202000-WXDu042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6//042/2600-01-220020-06-042020-06--0402020-06-042020-06--041-00-20000000020-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6/042/2026020-06-60420206-06--042"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0200WXDu6/042/2026020-06-60420206-06--042-300-206/042/2002-30-026/0420202-30-06/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2313-01-21002-3004-02-0202-3006/04/202022029-202131-2020-06/04/2020202002-30-206/0/-02-30-06/202004-313-01-20201-202020020200-06/042/2"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-2002-302020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-202-02-W02-3004-02-29-202131-20021-32-26020-06-042020-06--042000202002-30-06/042/20202006/04/20202006/04/20202020XDu29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("QkNn"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-02-302-06/042/2002029-2021302020-0409-02020-06020-32/042/2002-2-06/04/20202021202-3004-02-29-202131-26020-06-0420206-06--04202020-0441-20001-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04000-01-2220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-300-206/042/2002-30-026/0420202-30-06/04202020000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-0042020--06-04-02-292-2020-06--04202131-2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020-006-04-31-2020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/220"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("000-01-220020-06-0420020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0200WXDu6/042/20026020-06-60420206-06--042-300-206/042/2002-30-026/0420202-30-06/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("000-01-2200206--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/002020202020-06-042020-06--04260202-06-042020-06--0400-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WX0Du6/042/2026020-06-0420206-06--042"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-292-20213104-02260202-06-042020-013-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/20020200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/2020023020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-20220020202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2-30-202020-06-042020-06--0420020-06-042020-06-204-3-00-200000-06--0406/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("260202-06-042020-06--26020-02020-0413-01-21020404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("260-20-06-042020-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/004-02-22-202042/2020023020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-206/004/20002-30-06/042/202020202002-30-06/002-300-06/4042/20020420202002-02-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("404-26020-06-020-30-062/042021202020042020-06--0402-29-2-W02-3004-02-29-202131-2-30-06/042/202002020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-20001020202-3006/04/2020220/0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/0420/2002-2-2021202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-3106020-30-062/042/2002-2-2021202020/04/2020-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29--2021302020-0409-01-20001-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/042020202-2-206/004/20002-30-06/042/202020202002-02-29-20201-30-006/0420202000-WXDu042/20020020-02-29-2021301-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-20004-02-29-202020-06-042131-202001020202-3006/04/2020220/0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("ffyBM02-3001-32-200-206/042/2002020200-WXDu0420W"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/04/02020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("404-26020-06-020-30-062/042021202020042020-06-4-0402-29-2-W02-3004-02-29-202131-2-30-06/042/202002020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0202-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/200420020-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-292-20213104-02260202-06-042020-06--04-2922020-06--1303-01-2102004-2021301-2020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04-02-229-2004-31-2002-30-026/042/20020202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("ffyBM02-3001-32-200-206/042/20002020200-WXDu0420W"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020-002-30-06/042/2206--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2002-20-06/04/2020202202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0102-3004-02-29-202102020-040-01-200031-2020-06/04/2020202002-30-206/042/200203-04-04-04000-01-220020-06-04200200-06--0400002-30-206/042/2002-30-026/0420202-30-00-210202-30-026/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("zGm"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("z"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-2000120"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-040-3102-30-0-202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-020202-32220020-040200-WXDu042-2-20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-3004-02-29-202131-20202002-3002-2313-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/02-30-06/202004-313-01-20201-202020020200-06/042/2-06/042/20202006/04/20202006/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/200020020-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2013-01-00-01-220020--202020-06-0420202-06--0420020-06-042020-06-204-3-00-200000-06--0406-042020-06--040000020-040-3102-30-0-202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("206020-06-042020601-00-20002020-06--02-30-06/042020-210202020-044"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-2021321-20206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20201-00-20002020-0602-29-2020--02-30-06/024/202020204-313-02-29-202101-20201-20200-2020-06-042020-06--00404"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02026020-2600-01-220020-06-042020-06--02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020--041-000-20000000020-06-042020-06--042020-06-0420200202-30026020-06-042020-06--042000-29-202131-202013-01-202020-040-01-200010206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-06--02-30-06/04/20202022004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20002020-06-042020-06--04201-00-20000-06---02--202131-2020-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-0040-01-2000102W02-3004-02-29-202131-20021-32-26020-06-042020-06--042000202002-30-06/042/20202006/04/20202006/04/20204-02-02-302-06/042/2002029-2021302020-0409-02020-06020-32/042/2002-2-06/04/20202021202-3004-02-29-202131-26020-06-0420206-06--04202020-0441-20001-202002020XDu0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-042020-06--0420020020-06-02-3004-02-29-202131-04-04-02-29-202131-20020202020202042020-06--040"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-004013-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/042/2002-02-30-026/042/2-0020202032020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-06/042/2002-2-202120202-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("260-20-06-042020--06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3002-30-20202020002-2-202-02-29-202012-30-06/042/20202006/04/20202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/200020020-02-29-2021310-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("JDungnRcpt"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-3004-02-29-202131-20202002-30-06/042/20202006/04/2020200-6/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-20213202020-0409-01-20001-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-0420"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-042020--06-04-02-292-2020-06--020020-06-04202--04-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-002-3004-0220202-30-06/0422020200-WXDu041-2020-06/04/2020202002-30-206/042/200201-2200203-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("200020-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020020-06-02-30013-01-21024-02-29-20213104-04-02-29-202131-20202020202020420220020-06-042020-606--040-0604-0402-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/200020020-02-29-2021310-202020--040-01-220020-06-042020-06--040000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("021-32-26020-06-04204-02-29-20213202020-0409-01-20001-20202020-06--042000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-2026--042-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("BLTJEXD"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-20001020202-3-006/04/2020220/0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/0420/20004-04-02-29-202131-20202002209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00020-30-062/042/2002-2-020212020202-3004-02-29-202131-/20202002-30-06/04-02-22-2020042/202020006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01022-2020-30-06/042/20004-04-02-29-020-30-06/042/20004-04-02-29-202131-202020020202131-2020200209-2020-00-20002020-0602-29-2020--02-30-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-3102-30-06/042/2001-004-04-02-29-231-2020200-20002020-06--02-30-06/06/004/200202-30-06/042/202/020202004/2020202004202006/04/202020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0202-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/2020-30-062/042/2002-20-06/04/202020220202000420020-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-02-292-20213104-02260202-06-042020-06206/04/02020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-30-062/042/2000202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-02020-0413-01-21020020002-3004-02-29-202131-/20202002-30-06/04-02-22-2020042/202020006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("Intxyk"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-202020-040-01-200042-02-29-2020020-06-042131-202001020202-3006/04/2020220/0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01202002-30-206/0/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-320-026/0420202-020202-322200-29-2-202006--02-30-06/04/202020200430-06/0420202000-WXDu042/"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-2002-3020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0-4-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-202131-202013-01-204-04-02-229-202131-202020020202-30-06/20200-040-01-200010206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/004/20002-30-06/042/20202-30-026/0420202-020202-322200-29-2-202006--02-30-06/04/202020200430-06/0420202000-WXDu042/20020/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-200z2-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-310-2-30-06/042/2001-004-04-02-29-231-2020200-20002020-06--02-30-06/063/004/20002-30-062020-06-044/042/202/020202004/2020202004202006/04/202020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-030-06/4042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-206/004/20002-30-06/042/202020202002-30-06/002-300-06/4020201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-220202-29-22020-0413-01-2102000-0413-01-210200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-312020-06020-30-062/042/2002-2-004-02-29-202131-202013-01-2020202-30-06/20200-040--01-200010206/04/20202021202020-044-2002-30-026/042/2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("W02-3004-02-29-202131-20206/042/20202006/04/20202006/04/20202020XDu"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002-020-04-02-29-2-202006--002-30-231-21020406/04/2020202004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0202-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/2020-30-062/042/2002-20-06/04/20202020020-06-02-3004-02-29-20213104-04-02-29-202131-2020202020202042020-06--040-01-220020-06-042020-06--0400000220202000420020-2-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-202-6/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-29-2-20201-00-20002020-0602-29-2020--02-30-06/024/20202020040"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-026/0420202-30-06/04202-0200X0-WXDu042/220020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("26020-020020-0413-01-21020402-30-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("404-02-29-2-W02-3004-02-29-202131-2-30-06/-042/202002020XDu2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/004/2020202000WXDu6//042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("10-020202-32220020-040200-WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-330-026/042/2002-30-06/042/202020200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0WXDXu6/064/2/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-002-29-202131-2020-06/04/2020202002-30-2060/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-04000-01-220020-06-04200200-06--0400002-30-0206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-02-29-202131-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-200z2-30-026/042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/0042/20020-30-06/042/2002-29-202120202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDXu6/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20020-06-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/202004-313-01-2020-06020-32/042/2002-2-06/04/20202021202020-0440"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2/-30-06/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-0602-29-20202-30-06/042/20200230200--02-30-06/04/20202020020-30-06/0420/2002-2-202120202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002-02004-04-02-229-2004-31-2002-30-026/042/20020202131-202020-04-02-29-2-202006--002-30-231-21020406/04/2020202004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1302-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-01-204-0202-30-206/042/2002-30-026/0420202-30-006/0420202000-WXDu042/20020020-2-20201020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02260202-06-042020-06--04-292-20201301-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3004-02-29-202131-/20202002-30-06/042/2020200201-202006/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-0104-02-29-20213202020-0409-01-20001-2020-12020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-044-02-29-202131-2020200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20002020-04-02-29-e2-202006--02-30-06/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06--133-02-3004-02-29-202131-2020-06/004/2020202002-30-206/042/20020031-2102004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/0420/20004-04-02-29-21-20202002209-20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-206/042/2002-30-026/02-30-06/042/202020-30-06/0420202000-WXDu042/20020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("202020-06-042020-06--0420020-06-020202-06-0442020-06-204-3-00-200000-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-020-30-062/042/2002-2-0602020-06-042020-06--041-00-20000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2313-01-21002-3004-02-29-202131-2020-06/04/2020202002-30-206/0/0213-002-3004-02-29-2021311-2020-06/04/2020202002-30-206/042/02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/002020-30-06/202004-313-01-20201-202020020200-06/042/2"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2002020-06-042020-06--04201-00-20000-06-BLTJEXD-02-3004-02-29-202131-2020-06/04/2020202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-3004-02-29-202131-/20202002-3002020-0413-01-21020-30-026/042/202002-3004-02-29-202131-2020-06/04/2020202002-30-206/042/20020-30-06/04020-06/042/202020006/04/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/004-02-22-202042/2020-2020-06-042020-06--04042020023020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20202-u30-06/04202WXDu04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2/-3-06/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/042020202-2-206/004/20002-30-06/042/202020202002-02-29-20201-30-006/04202902000-WXDu042/20020020-02-29-2021301-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-06/042/2020202-29-202-02-29-20201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu626020-0020-0413-01-210204/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2-206/004/20002-30-06/042/26020-02020-0413-01-210204202020202002-30-06/002-300-06/4020201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0202-3006/004/202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("040-320-20200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0402-30-206/042/2002-30-026/0202002-02-29-20201-30-006/04202902000-WXDu042/20020020-02-29-2021301-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0226020-2600-01-220020-06-042020-06--0402020-06-042020-06--041-00-20000000020-06-042020-06--042020-06-042020-0600-01-220020-06-042020-06--040000--00404-3004-02-29-202131-2020-06/004/2020202002-30-206/042/20020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2020226020-06-04202001-00-20002020-0602-29-2020--02-30-06/04/20202020046-06--0402020-06-042020-06-02-30-06/042/20202020-041-00-20000-040-01-20001020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-0022-3004-02-29-202131-2020-06/04/2020202002-30-2046/042/02-3004-02-29-202131-2020-06/04/2020202002-30-206/042/2/002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-0400020-30-062/042/2002-2-020212020202-3004-02-29-202131-/20202002-30-06/04-02-22-2020042/202020006/04/2020200-3102-30-206/042/-20020-202004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-2002-302020-06020-30-062/042/2002-2-062020-0442020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2020-30-06/042/20004-04-02-29-2021331-20202200209-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-2022/-30-06/20200-2020-06-042020-06--040406-0422020-06-02-30-06/042/20202020-041-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00WXDu6/042/2002020-30-062/042/2002-2-06/04/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06- 04-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-04-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("02-29-1900"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20001-00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-200002-29-201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-22020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3013-01-2020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-032020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-04-0320202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-00-200004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20206/04/20200-06-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0010-900-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01--3-2-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-200010-00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("RXyRlBL"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-21000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20000-1-00-20002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20020-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-20002-29-202100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-202100-011-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-323-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-020206/04/20200-06-0432020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-02"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-0010-900-20002-29-202100-200010-00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-03020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-20002-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20200-01-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/04/20202-29-20200-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01---0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMUVJWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMUVJWu01-00-2000-1-00-20002-29-20210K"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-20002-29-202010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-13-01-2020-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-0004-31-22010020-200004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-32-200001--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMUV04-032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-20002-29-202100-011-204-31-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-20002-29-202100-011-06/01-0004-31-22010020-200004/2020204-31-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-20002020-06-04-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-03200-01-2000020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20001-3-2-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-200002-29-202100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-20002-29-202100-011-2004-31-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("301-3-2-20001-3-2-2000-01-20002-29-20210000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20020-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01--3-2-12000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-2004-03020002-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("061002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-200-2000-1-00-20002-29-202100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20-000-1-00-20002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-200029-20921"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1002-29-20221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("aUq"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-2202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00-01-200022020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-201-32-2000-01-200000004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-20002-29-202100-011-113-0001-00-20002-29-202100-011-2004-31-2020202004-31-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-001-20000-1-00-20002-29-2001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-2-200011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01002-29-2021-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0610202-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-2001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0-1-3-2-20020-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("6"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011061002-29-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-0001-00-20002-29-202100-011-113-0001-00-20002-29-202100-011-2004-31-2020202004-31-202020-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0220206/04/20200-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-20014-03020002-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/04/20202-29-20200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-32-2000001--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-000-2000-1-00-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-001-20000-1-00-20002-29-21001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11313-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-2000221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00--200022020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-02"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-001-2004/20202-29-20200-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-0061002-29-20210-20002-29-202010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-2001-00-20001-00-20002-29-202100029-20921"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-0suMUV04-032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0010-9000-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-201-32-200002-29-2019-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-013-01--01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("11"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-202100-0-11-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-0004-31-22010020-200004/02020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-202100-0-11-201-00-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20001-00-2000-1-00-20002-29-202010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-01-20001-00-20001-00-2000-1-00-20002-29-2020100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-201-32-2002019-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("066"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20001-3-20-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-200010-00-20002--29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0010-9000-20002-29-22021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0101-3-2-20020-01-2000000-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0610202-221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0610202-29-20221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00113-001--0-00-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20000-1-00-20002-29-2001-00-20002100-000-011-204-31-202001-3-2-200011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-020206/04/20200-06-043200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133-0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-0020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-002010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0610202-2121"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20001-3-2-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-20011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2001-00-20002-29-202100-0-11-204-31-2020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3113-0020013-01-2020-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-0020110"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-00-2000004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0004-31-22021-00-2000-1-00-20002-29-202010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("AAwP"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-20200-0101-3-2-20020-01-2000000-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-02000-0suMUV04-032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0006/01-00-2000004/202031-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-229-20921020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20200-06--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3013-01-2020-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2001-00-20002-29-2021suMUV04-032020JWuK31-2020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMU3V04-032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("zTzOoYWSE"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0013-01---2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20-0000-1-00-20002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2001-001-20000-1-00-20002-29-2001-00-200021000-1-0061002-29-20210-20002-29-202010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-13-011---0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1002-29-201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-013-01-3-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00220110"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20000-1-00-20002-29-2001-00-20001-3-2-20001-3-2-20000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3113-02000-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0606/01-00-2000004/2020/04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-201-312-2002019-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20200-06-0-04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-006/01-00-200004/1133-02020202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("022113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-20210Uq2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-2-9-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/29-20200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-20202-01-32-20002210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-20001--00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-02-3013-01-2020-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011061002-113-02029-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-20210210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-20002-29-202100-011-06/01-0004-31-2200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20020-01-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02-229-02-01-32-200022120921020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-00-201-00201104"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00-01-200002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-00210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-3-1-2202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OzTzOoYWSE"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2000-011-204-31-20201-0010-900-20002-29-2022100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-000-011-2004-31-202032020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-200022020-606-04-1-00-20002-29-20210210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-000-011-204-31-20206--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113300-0101-3-2-20020-01-2000000-200001-00-suMUV04-032020JWuK2000-02"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("aUqsuMUVJWu01-00-2000-1-00-20002-29-20210K"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/04/20202-29-20200-01-200000000-011061002-29-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-302113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-20210-00-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00102-9000-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-32-2000001-01-0010-900-20002-29-202100-200010-00-20002-29-20210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3323-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-201-32-2000-01-20006000004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0001-000-2000-1-00-2000002-1"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-20002-29-002-29-2001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("301-3-2-200091-3-2-2000-01-20002-29-20210000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-2004-431-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("006/01-00-200004/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-2-0013-01-13-011---0210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00100-9000-20002-29-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-200020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00--200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-0201-20-000-1113-0001-00-20002-29-202100-011-204-31-202020-00-20002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("106/01-00-2000004/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2000-011-204-31-20201-0010-900-20002-29-2022100-20001012-00-200022020-06-0401-3-2-21000-1-00-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-002010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OzTzOoY020-013-01--01-2000WSE"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-013-01--01-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20020-201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-2021001-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00100-9000-20002-29-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMUV13-001-32-200001--0JWuuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-201-3-2-200004-31-202000-0011-201-32-2000-01-20006000004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("313"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-220001-00-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-302113-0001-00-20002-29-202100-011-204-31-2020230200022020-06-04-1-00-20002-29-202100-20210-00-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMU3V04-03K"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-03200-01-2001-00-2000-1-00-20002-29-20210000020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-229-221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-002-13-01-2020-202106-04--1-00-20002-02-29-2021-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-00-01-20001-00-20001-00-2000-1-00-20002-29-20201002004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("33"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010-900-20002-29-20010-9000-20002-29-20210-200022020-06-04-1-00-20002-29-202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-004-3-1-220201-32-2000221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0010-9000-20002-29-22021010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-2020-06-04-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-20013-01-2001-00-20002-29-202100-0-11-204-31-20200204-03020002-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-2002100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-0404-03200-01-2001-00-2000-1-000-20002-29-20210000020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-22020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-302-01-32-20002212-200002-29-201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-2-200011-2001-00-200010-00-20002-29-202104-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/04/20202-29-20200-01-21133-020000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-2"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-420002-29-002-29-2001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133-102001-00-20002-29-202100-0011-204-31-20200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-001-2004/20202-29-20200-00"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/290-20200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00-1133-02001-200002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-0201-20-000-1113-0001-00-20002-29-202100-011-204-31-202020-00-20001-00-2000-1-00-20000002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-00-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-13-001--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20200-06-0-0404-020206/04/20200-06-0432020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-331-202001-3-2-200011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-02000-011061002-113-02029-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("pHzhiNtf"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("024-31-22020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20020-01-200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-004-3001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-202104-31-20200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-03200-001-20000020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20020-201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100--2021001-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-0001-32-2000-2000-0suMUV04-032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-31-01-001-20000-1-00-20002-29-21001-00-200021001-000-2000-1-00-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-202100610202-29-20210-0-11-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-13-001--001-001-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0006/01-00-2000004/202031-2020suMU3V04-03K"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/04/20202-29-20200-01-200000000-011061002-29-2021-202-3013-01-2020-02001-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-2004-231-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-2-002-13-01-2020-2021200011-2001-00-200010-00-20002-29-202104-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-00-2000004/2000-000-011-204-331-202001-3-2-200011-204-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02229-221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0113-001-32-2000001-01-0010-900-20002-29-2-02100-200010-00-20002-29-20210-0-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-200013-01--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20200-022113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-20210Uq200004"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-2204-31-20201-0010202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-200021-29-22000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OzTzOoY002-13-01-2020-2021WSE"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-004-3-1-2200201-32-2000221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-2004-001-001-20-000-1-00-20002-29-22000-011-2204-31-20201-0010202100-20210001-00-20031-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-420002-290-002-29-2001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("4-2002"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-200000-20002-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-32-suMU3V04-03K00002-29-201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29-20210-002010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20206/29-20200-01-20000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20020-011-200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("pcZIsiN"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29-202100020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0113-0002210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-210011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-06/01-0004-31-22010020-200004/20202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-000-2000-1-00-20001004-2002"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-2020001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OzTTzOoYWSE"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-002-13-01-2020-202101-0010-900-20002-29-2021000-200010-00-200-02-29"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-13-001-32-200001--000-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-020206/0413-01-2020/20200-06-043200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-20202-01-z322OzTzOoY002-13-01-2020-2021WSE-20002210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011061002-29-2021-201-3-2-200004-331-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-04-032020202004-31-01-001-20000-1-00-20002-29-21001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1301-00-2000-1-00-20002-29-202010-01002-29-2021-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20-000-1-00-20002-aUq29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("013-01---06"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-302113-0001-00-20002-29-202100004-31-01-001-20000-1-00-20002-29-21001-00-200021001-000-2000-1-00-2000000-20210-00-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-2204-31-20201-00161-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-0suMUV04-032020JWu0K"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133101-00-2000-0suMUV0402-30-00-01-200002020-33032020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-200024-200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-32-2000001-01-0010-900-20002-29-202100-200010106/01-00-2000004/202020210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2020-06-13-01-20202-01-32-20002210204"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-20200-01-20001-001-20-000-1-00-20002-29-2001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("020-29-20206/04/20202-29-20200-01-200000000-011061002-29-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00--000-011-204-31-202001-3-2-002-13-01-2020-2021200011-2001-00-200010-00-20002-29-202104-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-022-229-02-01-32-200022120921020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("10"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1113-002-13-01-2020-202101-0010-900-20002-29-201000-200010-00-200-02-2"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02020-04-03202020200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("4-22002"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-00121-2004-231-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-202001-3-2-200011-2002104-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-2002-302113-0001-00-20002-29-202100004-31-01-001-20000-1-00-20002-29-21001-00-200021001-000-2000-1-00-2000000-20210-00-01-20002020001-3-2-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02000-011-204-31-20201-0010-900-20002-29-2022100-20001012-00-200022020-06-040101-001-20-000-1-00-20002-29-2001-00-200021020210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0102-3013-01-2020-02013-0001-00-20002-29-202100-1011-113-0001-00-20002-29-202100-011--2020202004-31-2020201-000-2000-1-00-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OQrNs"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-22020-06-0404-03200-01-2001-00-2000-1-000-20002-29-202100000200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3013-01-020-013-01--01-2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0606/01-00-2000004/2020/204/2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("002-13-01-20201113-020-2021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-420002-290-002-29-2001-00-2200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-201-3-2-200004-31-202000-0011-201-32-2000-01-20OzTzOoY002-13-01-2020-2021WSE006000004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0113-001-32-2000001-01-0010-900-20002-29-2-02100-200010-1113-002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29-20210002000-20002-29-20210-0-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-202006/2900-20200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMUVVJWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30OzTzOoYWSE-00-01-200022020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-2000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-32-2000001-01-0010-900-20002-29-202100-2001-32-2000-01-2000000010-00-20002-29-20210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-22020-06-0404-03200-01-2001-00-20200-1-000-20002-29-202100000200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-31-20-200214-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13002-2-9-2021-01002-29-2021-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-1-00-200002-29-201-3-2-2002-302113-0001-00-20002-29-202100004-31-01-001-20000-1-00-20002-29-21001-00-200021001-000-2000-1-00-2000000-20210-00-01-20002020001-3-2-2000-01-20000002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011--2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-200-024-200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("000-2004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-0004-31-220010020-200004/02020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-13-001-32-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-001-20-0000001-001-20-000-1-00-20002-29-22000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210001-00-200-1-00-20002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/04/20202-29-220200-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-00-0011-2004-231-20201-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02113-0020-004-3001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-202104-31-20200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("pc02-004-3001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-202104-31-20200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0300-011-204-31-202001-3-20011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-0011-2004-231-2020011-2004-00-011-2004-31-202031-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-13-0101---0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-20002-29-22000-011-2204-31-20201-00161-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-20002-29-20200-01-20001-001-20-000-1-00-20002-29-2001-00-200021004-231-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-004-3001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-20002-29-202100-202104-0200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-200021-29-22000-011-204-31-20201-0010-900-20002-29-2021000-2000101-00-200022020-06-04-1-00-20002-29-2021100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0610202-29-2021133-102001-00-20002-29-202100-0011-204-31-2020021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06/01-001-2004/20202-29-20200-01-2000013-001-32-2000001-01-0010-900-2000220210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("201-0010-900-20002-29-20210002-3013-01-020-013-01--01-2002020-2000101-00-2020-06-04-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-22013-01-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("301-2-2000-01-20002-29-20210000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-3101-00-20001-900-2000-1-00-20002-29-202010-2202"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0113-001-32-2000001-01-0010-900-20002-29-2-02100-200010-1113-002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-929-20210002000-20002-29-20210-0-00-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20-000-1-00-200021-29-22000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-20210001-00-200101-002010"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-020013-01-2001-00-20002-29-202100-0-11-204-31-20200204-03020002-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0202060/04/20200-06-043200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-3200-000-011-204-31-202001-3-210011-204-0001-01-0010-900-20002-29-202100-2001-32-2000-01-2000000010-00-20002-29-20210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-229-221113-0201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-200004-03200-001-20000020100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-3-2-20001-3-2-20003-001-32-200001--0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0011-2004-431-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("pc02-004-3001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-0401-00-2000-1-00--2000001-20200221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-2002-302113-0001-00-20002-29-202100004-31-01-001-20000-1-00-20002-29-21001-00-200021001-000-2000-1-00-2000000-20210-00-01-200002020001-3-2-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20020-01004-31-2202-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20013-01---002-29-202100610202-29-20210-0-11-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMU3V04-0322020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("0102-3013-01-2020-02013-0001-0002-29-20206/04/20202-29-200200-01-200000000-011061002-29-2021-202-3013-01-2020-02001-3-2-200004-31-2020-20002-29-202100-1011-113-0001-00-20002-29-202100-011--2020202004-31-2020201-000-2000-1-00-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2000-011-204-31-20201-0010-900-20002-29-2022100-2000010101-00-200022020-06-04-1-000-20002-29-202100-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20020-01-2100000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("061002-29-01-00-220001-00-20002-29-202102021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("OzTzOoYWSE04-31-01-00101-00-2000-1-00-420002-290-002-29-2001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-20020-001004-31-2202-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-01-32-200-024-2-00221"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-000-011-2004-431-202032"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-04-1-00-200042-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("044-03200-001-2000020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-2-29-2001-00-20002100"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01010-9000-20002-29-22021"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-229-22"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-30-00-01-20022020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-01-2001-00-200000-2000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-06-04-1-00-20002-29-202100-202104-31-20202-29-2021suMUV04-032020JWuK31020020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2901-2020-20200-01-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1301-00-2000-12-00-20002-29-202010-01002-29-2021-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0104-31-22020-2000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02--201-32-2002019-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-1-00-020013-0101002-13-01-2020-202101-0010-900-20002-29-202100-200010-00-200-02-29-20210-0020102-291"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-001-20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("-02-301304-31-01-00101-00-2000-1-00-420002-290-002-29-2001-00-200-01-2020-020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-011-2004-001-001-20-000-1-00-20002-29-22000-011-2204-31-20201-000-20210001-00-20031-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-2113-0001-00-20002-29-202100-011-204-31-202020200022020-06-01-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("004-3-1-222020-000-011-204-31-20206--04"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-2291-221113-0201"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("06001-00-20002-29-2022020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3013-01-02-0-013-01--01-2002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-02020060/04/20200-06-043200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-000-2000-1-00-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-200000-20002-29-202106/01-001-2004/20202-29-20200-01-2000000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-01-00101-00-2000-1-00-420001-202002-290-002-29-2001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-0201-20-000-1113-0001-00-20002-29-202100-011-204-31-202020-00-20001-00-2000-1-00-2OzTzOoYWSE04-31-01-00101-00-2000-1-00-420002-290-002-29-2001-00-2000000002-29-2001-00-2000210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-302113-0001-00-20002-02100-0102-30-00-01-2000220201-204-31-2020230200022020-06-04-1-00-20002-29-202100-20210-00-01-20002020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-2000-011-204-31-20201-0010-900-20002-29-202100-2000101-00-200022020-001-32-suMU3V04-03K00002-29-2016-04-1-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-20002-29-202100610201-0010-900-20002-29-202100-2000101-00-2020-06-04-20210202-29-20210-0-11-204-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-20-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("suMU3V04-032J2020JWuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-001-20000-1-00-20002-29-2001-00--20002100-000-011-204-31-202001-3-2-200011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3-2-20-001-3-2-2000-01-200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("13-001-3200-000-011-204-31-202001-3-210011-204-0001-01-0010-900-20002-29-202100-20011-32-2000-01-2000000010-00-20002-29-20210-0"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-209-20200-01-20000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-3013-01-020-013-01--01-200202002-201-312-2002019-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113-0001-00-200020-011-204-31-202020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-3200000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("01-00-2000-29-20210"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-2113-0001-00-20002-29-202100-011-204-31-202020200-022020-06-04-1-00-20002-29-202100-202104-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("001-00-202-29-202100610201-0010-900-20002-29-202100-2000101-00-2020-06-031-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-000-011-204-331-202001--3-2-200011-204-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00-0110610301-3-2-20001-3-2-2000-01-20002-29-2021000002-113-02029-2021-201-3-2-200004-31-2020"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("02-29-2020001-001-20-000-1-00-20002-29-22000-011-204-31-20201-01010202100-20210001-00-200"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("00000"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("113301-00-2000-0suMUV04-032020JuuK"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-001-206"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("uYvOcbMv"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("1133-"));
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("101-3-2-20001-3-2-20003-001-32-20-0002-29-20206/04/20202-29-20200-01-200000000-011061002-29-2021-202-3013-01-2020-02001-3-2-200004-31-202001--0"));
    }
}
