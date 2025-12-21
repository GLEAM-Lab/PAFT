package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_COUNT_UPPER {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aBCdEf");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdefg");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("dBBE");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("B");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("U");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("EEEE");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdOH");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcDEf");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEOIU");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("XYZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEi");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("ABCD");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hhEErrRR");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("UOIEA");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bbcefg");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEOIUBCD");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrStUv");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMABCDnOpQrStUv");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("ABCAbCdEfGhIjKlMABCDnOpQrStUabcDEfvD");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("CABCD");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEOIUIEA");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlabcDEfMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEiAEOIU");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdOHUOIEA");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEABCAbCdEfGhIjKlMABCDnAbCdEfGhIjKlabcDEfMnOpQrStUvWxYzOpQrStUabcDEfvDOIUIEA");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEOOIUBCD");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("CDbdOHUOIEAABCD");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hABCDhEErrRR");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AUEOIUIE");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOhhEErrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOOIUBCD");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdOHUOIIEA");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEIfGhIjKlabcDEfMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEOIUBCAAEIOOIUBCDD");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("UOIAEA");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("ABCAnbCdEfGhIjKlMABCDnOpQrStUabcDEfvD");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOOIAbCdEfGhIjKlMnOpQrStUvWxYzCD");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("UUOIAEA");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hhEAAEOIUBCDErrRR");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("ABCAbCdEfGhIjKlMABCAbCdEfGhIjKlMnOpQrStUvDnOpQrStUabcDEfvD");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpQrStUvWxhhEErrRRYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOhhbEErrRRStUvWxCDbdOHUOIEAABCDYzdEfGhIjKlMnOpQrStUv");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hABCDhEErrURRAEOIU");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOhhbEErrRRStUvWxCDbdOHUOIEAABCDYzdEfGhIjKlMnOpQrSCtUv");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOhhEErrRRStUvWxCDbAbCdEOfGhIjKlMnOStUvWxYzdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbxCdEfGhIjKlabcDEfMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzStUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOStUvWxYzlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdOHUIOIEA");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGABCAnbCdEfGhIjKlMABCDnnOpQrStUabDbdOHcDEfvDhIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpQrSntWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbAbCdEIfGhIjKlabcDfEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpQrStUvWxhhEErrERRYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEiiAEOIU");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hABChDhEEArrrURRAEOIU");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOpQrStUvWxYzrnrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGABCAnbCdEfGhIjKlMABCAfbCdEOhhEEAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYznOpQrStUabDbdOHcDEfvDhIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdH");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOAAEIOOIUBCDpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMABtCDnOpQrStUv");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEOIUBCAAEIOOIUBCDBD");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEAbCdEfGhIjKlMABtCDnOpQrStUvOIUBCD");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOpQrStUvWxYzrnrRAbCdEOhhEErrRRStUvWxCDbdOHUOIEAABCDYzRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEiiAEuOIU");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAAEOIUBCAAEIOOIUBCDDbCdEOfGABCAnbCdEfGhIjKlMABCDnnOpQrStUabDbdOHcDEfvDhIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbAbCdEIfIjKlabcDfEfMnOpQrStUvWxYzrrRRStUDbdOHUOIIEAvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOStUvWxYzlMnOpQrStUvWxYhIjKlMnOStAbCdEOfGhIjKlMnOpQrStUvWxhhEErrRRYzWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEiAEOAbCdEOhhEErrRRStUvWxCDbdOHUOIEAABCDYzIU");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGABCAnbCdEfGhIjKlMABCAfbCdEOhhEEAbCdEIfGhIjDhIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhxEEAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOpQrStUvWxYzrrRRStUvWhhEAAEOIUBCDErrRRxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOhhEErrRRStUvWxKlMnOStUvWxYzdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbAbCdEIfIjKlabcDfrEfMnOpQrStUvWxYzrrRRStUDbdOHUOIIEAvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bAfbCdEOhhEEAbCdEIfGhIjKlaAbCdEOfGhIjKlMnOpQrSntWxYzAbCAbCdEOStUvWxYzlMnOpQrStUvWxYhIjKlMnOStAbCdEOfGhIjKlMnOpQrStUvWxhhEErrRRYzWxYzfMnOpQrStUvWxYzrnrRAbCdEOhhEErrRRStUvWxCDbdOHUOIEAABCDYzRStUvWxCDbdOHUOIEAABCDYzbcefg");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("UOabcDEfIAEA");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEDOhhEEAbCdEIfGhIjKlabcDfEfMAbCAbCdEOhhbEErrRRStUvWxCDbdOHUOIEAABCDYzdEfGhIjKlMnOpQrStUvnOAAEIOOIUBCDpQrStUvWxYzrCrRRStUvWxCDbdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AE");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOAAEIOOIUBCDpQrStUvWxYzrrRRStUvWxCDbdOHUOIEACABCDBCDYz");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOhhEErrRRStAbCdEfGhIjKlMnOpQrStUvWxYzUvWxCDbAbCdEOfGhIjKlMnOStUvWxYzdOHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbAbCdEIfIjKlabcDfrEfMnOpQrStUvWxYzrrRRStUDbdOHUOIIEAvWxCDbdOAbCdEOAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzStUvWWxYzHUOIEAABCDYz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEiiAEOIUDbdOH");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhDbdOHUOIEAIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOfGhIjKlMnOpQrStUvWxYzdEOStUvWxYzlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOfGhIjKlMnOpQrStUvWxYzdEOSAbCdEOAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzStUvWWxYztUvWxYzlMnOpQrStUvWxAEOIUIEAYz");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOfGhIjKlMnOpQrStUvWxYzdEOSAbCdEOAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzStUvWWxYztUvWxYzlMnOpQrStUvWxAEOIUIEAYzUOabcDEfIAEA");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKAlMnOpQrSntWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhDbdOHUOIEAAbCdEOfGhIjKlMhnOpQrStUvWxhhEErrERRYzIjKlMnOpQrStWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DdH");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOfGhIjKlMnOpAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("ACAEOhhEAAEOIUBCDErrRRIUBCD");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCAbCdEOfGhIjKlMnOpQrStUvWxYzdEOStUvnWxYzlMnOpQrStUvWxYzAUEOIUIE");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQAbCAbCdEOStUvWxYzlMnOpQrStUvWxYhIjKlMnOStAbCdEOfGhIjKlMnOpQrStUvWxhhEErrRRYzWxYzv");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDfEfMnOAAEIOOIUBCDpQrStUvWxYzrrRRStUvWxCDbdOHUOIEACABCDBCDYAfbAbCdEIfIjKlabcDfEfMnOpQrStUvWxYzrrRRStUDbdOHUOIIEAvWxCDbdOHUOIEAABCDYzz");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bbcefguEiiAEuOIU");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("uEii");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdHhABCDhEErrRR");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("DbdOHuEiiUOIIE");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEAbCdEfGhIjKlMAuEiBtCDpQrStUvOIUBCD");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePJwoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHjklMpRStVWXZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VWAbCdEOpQrStUvWxYzxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOPCrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVW");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AWYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VWAbCCdEOpQrStUvWxYzxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjyNNsqqpPazeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpPazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnkfLt");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUPFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzGvGnTKnkfLtPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("z");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOpQAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiiouBCDFGyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnWxYzePJwoSMqrdxvQZaGTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdFEFGHiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpPazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZAbCdEfGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCODFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmynOPCrOsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUPFjyNNsqqzpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("YAWYz");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIOUaeiiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("h");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAEIOUaeiouBCDFGjkLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqYAWYzVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlqweRtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiouBCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWxYzoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDLFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVDjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTx");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGyfUFjyNNsqqpPazeMePJwoSTKnkfLtnHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVeWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDFGyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqcpMPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJxwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVysxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnfkfLt");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDLEFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouBCDFGjkLmnOPrsTxyzzz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouAEIOUaeiouBCDLFGjkLmnOPrsTxyzeBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVDjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDFyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnGyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIUOUaeiouBCDxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaueOiouBCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQfUFjyNNsqqpPazeMePJwoSMqrabcdFEFGHiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeMePJAWYzwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdVWx");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdMFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaAEIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzeiiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNssqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWxYzoSMqrqweRtYuIOPasdFghJklzXcVbnMdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKLMNOpAEIUOUaeiouBCDxyzQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIdjKlMnOpQrStUvWxYyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGDjakLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYAEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWYzzz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYAEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWYzzzvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxyzouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtnn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOUaeiouBCDLFGjkLmRnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRastuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGnRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpPazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMYAWYzePJwoKSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("YA");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDFyfUqyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnVsxzvGnPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOKUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGDjakLmnabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouByfbYpORjKDimUqVsxzvGnCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRW");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDsimUqVsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUzFjyNNsqqpPazeMePJwoSMqrdxvQZayfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJxwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZskjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLmnOPrsTxyzOGpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpFjyNNsqqpPazeMePJwoSMqrdxvQZaGTPabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdVWxNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGAjkLmnOPCrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zz");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnWxYzePJwoSMqrdxvQZaGTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMeePJwoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvyfUPFjyNNsqqzpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnQZaGTqVsxzTvGnOPCrOsTx");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouBCDFGjkLmnIOPrsTxyzzz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAaEIOUaeiouBCDLFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDimUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLt");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmOryfbYpORjKDimUqVAEIOUaeiouBCDFGJTyfbYpORjKDimUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQqVsxvzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazAEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxyzouBCDFGJzKLmnOPrsTxyAWYzzeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjNKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeDiiouBCDFGyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAaEIOUaeiouBCDLFsGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOpQAEIOUaeiouBCDFzbvuyrwFjyNNsqqpPazeMePJwoSMqrdxovQZaGTqpmlabcdELMNOpQRstuVWxyZkjtuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfkfLt");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOUaeiouVWAbCdEOpQrStUvWxYzxyZBCDLeFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQfUFjyNNsqqpPazeMePJwoSMqrabcdFEFGHiJKLMNOpQAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzRstuVWx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpPazZeMePJwvoSMqrdxvQZaGTcDfgHjklMpRStzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWabcyfUqVsxzvGndEFGHiJKLMNAEIOUaeiouBCDFGjkLmnOPrsTxyzOpQRstuVWxyZx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzkfLt");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIAWYzOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPbrsTxyzsxzGvGnTKnkfLtPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhiJkLmNPqRsTVuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStabcdVWxNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzxAEIOUaeiouAEIOUaeiouBCDLFGjkLmnOPrsTxyzeBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzYzkfLt");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDAEIOUaeiouBCDFGAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzJKLmnOPrsTxyzLEFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGyfUFjyNNsqqpPazeMePJwoSTKnkfLtnHFjyNNsqqpPazeMePJwoSMqyQqVsxzvGnrdxvQZaGTiJKLMNOpQRstuVeWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abbcdEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDabcdEFGHFjyNNsqqpPazeMePJAWYzwoSMqrdxvQZaGTiJKLMNOpQRstuVWxOsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJxwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGGnOPCrOsTx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIOUaeiiouBCDFGjkLmnOPrsTxyzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDsimUzvGnPyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGnTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLztnn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzJKLmnOPrsTxyzLEFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtnAWYzzEIOUaeiouBCDFGDjakLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaAEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzeiouBCDFGjkLmynOPCrOsTxyzouBCDFGJzKLmnOPrEsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazeMePJwoSMqQrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwWqpmlqweRtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIDOUaeOiouBCDFGJzKLmnOOz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKSDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwozbNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYAEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWYzzzvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKISMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRst");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpAEIOUaeiouBCDFGJKLmOryfbYpORjKDimUqVAEIOUaeiouBCDFGJTyfbYpORjKDimUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtvGnPrsTxyzsxzvGnPrsTxyzPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdyfUPFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNhNsqQZaGTqVsxzTvGxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIOUaeiAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyziouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmnOPrsTWxyzOpQRstuVWxyZAEIOUaeiouBCDFGJKGLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bFjsqqpPazZeMAbCdEfGhiJkLmNPqRsTVuVwXyZePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZAbCdEfGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouByfbYAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzpORjKDimUqVsxzvGnCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNswqqpPazeMePJwoSMqrdxvQZaGTqVysxzn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnastuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGnRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNYuIOPasdFghJklzXcVbnMvGnLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstEuVWxyZskjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyziouBCDFGJKLmOyfbYpORjKDimUqVAEIOUaeiGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrrsTxyAWYzzEIOUaeiouBCDFGDjakLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeyfbYpORjKDimUqVsxzabcdEFGHiJAaEIOUaeiouBCDLFsGjkLmnOPrsTxyzKLMNOpQRstuVWxvGnMYAWYzePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFAEIOUaeiouBCDLEFGjkLmnOPrsTxyzjyNNqsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwWqpmlqweURtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBOCODFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeAEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNYuIOPasdFghJklzXcVbnMvGnLKIGJzzMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWxYzoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDabcdEFGHFjyNNsqqpPazeMePJAWYzwoSMqrdxvQZaGTiJKAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzYzLMNOpQRstuVWxOsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJxwoSMqMrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDFyfUqyQfUFjyNNsqqpPazeMePJwoSsMqrdxvQZaGTqVsxzvGnVsxzvGnPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zzbFjsqqpPazZeMAbCdEfGhiJkLmNPqRsTVuVwXyZePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZAbCdEfGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeKiouBCDFGJzKLmnnOPrsTxyAWYzAEIOUaeiiouBCDFGyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJwoSTKnkKfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZskjhgRfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVDjKDimUqVsxzvGnePrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAEIOUaeiouBCDFGJKLmnOPrsTxyzz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZskjhgRfedcbaZAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyzXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGzbvuyrwqpmlqweRtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKInabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJxKLMNOpQAEIOUaeiouBCDFzbvuyrwFjyNNsqqpPazeMePJwoSMqrdxovQZaGTqpmlabcdELMNOpQRstuVWxyZkjtuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUAEIOUaeiiouBCDFGjkLmnOPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHLiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWzbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZskjhgfedcbaZXJUTSRPONMLKIxYzoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaezz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzSmnOPrsTxyzoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdFEFGHiJKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACODFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjaWkLmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazMYAWYzePJwoKSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLimnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRastuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrPsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstEuVWxyZskjhgfeTdcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsjTxyzKx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AmEIOUaeOiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVDjKDimmUqVsxzvGnPrsTYAWYzxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMGePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqAEIOUaeiouAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzqpPazeGTqVsxzqweRtYuIOPasFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyPazeMePJyfUFjsqqpPazeMePJwoSTKnkfLtnwoSMqrdxvQZaGTiJKLMNOpQRstuVeWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aTKnkfLtbcyfUqVsxzvGndEFGHiJKLMNAAEIOOKUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGDjakLmnabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeAEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNYuIOPasdFghJklzXcVbnMvGnLKIGJzzMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUAbCdEOpQrStUvWxYzqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeGTqVsxzqweRvtYuIOPasdFghJklzXMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMGePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLumnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJzeKLmnOPrsWTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrRsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUqVsxzzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDiymmUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLt");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 48
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzMGePJwoSMqryfUFjyNNsqqpPazeabcNFjyNNsqqpPazeMePJwAbCdEOpQrStqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("nKfkfLt");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRAEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDFGyzstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCODFUGsz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiiouBCDFGyyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExEIOUaeiiouByfbYpORjKDimUqVsxzvGnCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBACDFGJzKLmnOPWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUzFjyNNsqqpPazeMePJwoSMqrdxvQZayfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJxwoSMqrdxvQZaGTiJKLMNOabcdEFGHFjyWxpQRstuVWxQZaGTqVsxzvGnGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazAEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxyzouBCDFGJzKLmnOPrsTxyAWYzzeMePJwoSTKnkfLtnzz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDOFGJzKLmnOTPrszTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjKDyfUzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTAbCdEOpQrStUvWxYzxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBAabcdVWxWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hhh");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouBCDFGjkLmyzzz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeAExIOUaeiiouByfbYpORjKDimUqVsxzvGnCDFGjkLmnOPrsTxyzMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwWqpmlqweURtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRsyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGntuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrAEIOUaeiouBCDFGJKLmOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrRsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNssqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpzzPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdzbvuyrwWqpmlqweRtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("C");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOOUaeiouBAabcdVWxWYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTvxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVabcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZxaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdpEfGhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePJwjoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJwoSTKnkAbCdEfGhIjKlMnOpQrStUvWxYzfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDjkLmnOPCrsOTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAaEIOHUaeiouBCDLFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORmKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZHiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaAEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzeiouBCDFGjkLmynOPCrOsTxyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGnz");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpzbvuyrwqpmlqweRtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIPazeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGnLztnn");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOOUaeiuouBAabcdVWxWYzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrStUvWz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvAExIOUaeiiouBCDFGjkLmnOPrsTxyzzzWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoWSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDjLmnOPCrsOTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJztnn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRsthIjKlMnOpQrStUvWz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyfUFAEIOUaeiouBCDLEFGjkLmnOPrsTxyzjyNNqsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGnyZbcdEFGHiiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUqVsxzvGndEFGHmiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjPJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePpJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGzbvuyrwqpmlqweRtlzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKInabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabncdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUAEIOUaeiiouBCDFGjkLmnOPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTabcyfUqVsxzvGndEFGHmiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGyfUFjyNNsqqpPazeGTqVsxzqweRvtYuIOPasdFghJklzXMvGnJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwWqpmlqweRtYuIOPasdFghJkAkExIOUaeiAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyziouBCDFGjkLmnOPrsTxyzlzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeKiouBCDFGJzKLmnnOPrsTxyAWYAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzAEIOUaeiiouBCDFGyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsAEIOOUaeKiouBCDFGJzKLmnnOPrsTxyAWYAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzAEIOUaeiiouBCDFGyzTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTAbCdEOpQrStUvWxYzxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 46
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSIMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yAExIOUaeiiouBCDFGjkLmnOPrsTxyzfUFjyNuIOPasdFghJklzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkExIOUaeiioAEIOUaeiiouBCDFGyyzuBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdFEFGHAkExIOUaeiioAEIOUaeiiouBCDFGyyzuBCDFGjkLmnOPrsTxyziJKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOUaeiiouBCDFGyyzmEIOUaeOiouBCDFGJzKLmnOPrsAEIOUaeiouBCDLFGjkLmnOPrsTxyzTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("naabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsjTxyzKxfkfLt");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhiJkLmNoAPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTyqVsxzvGnNOpQRstuVWxPrsTvxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIabcdFEFGHAkExIOUaeiioAEIOUaeiiouBCDFGyyzuBCDFGjkLmnOPrsTxyziJKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxLMNOpQRstuTKnKfkfLtbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazAEIOOUaeiouBOCODFGJzKLmnOPrsTxyAWYzzeabcdEFGHFjyNNsqqpPazeMePJxwoSMqMrdxvQZaGyfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqtVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGabcdEFGHiJAaEIOUaeiouBCDLFsGjkLmnOPrsTxyzKLMNOpQRstuVWxJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yQqVsxvzvGnbFjsqqpPazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZAbCdTEfGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYyfUFjyNNsqAEIOUaeiouAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzqpPazeGTqVsxzqweRtYuIOPasFghJklzXcVbnMvGnPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUAEIOUaeiiouBCDFGjkLmnOPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTabcyfUqVsxzvGndEFGHmiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 43
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeAExIOUaeiiouByfbYpORjKDimUqVsxzvGnCDFGjkmLmnOPrsTxyzMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzJvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrPsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AkEAbCdEfGhiJkLmNoAPqRsTuVwXyZxIFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqyfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzSmnOPrsTxyzoSTKnkfLtnpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdyfUPFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnxvQZaGTiJKLMNOpQRstuVWxiazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeAExIOUaeiiouByfbYyfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnpORjKDimUqVsxzvGnCDFGjkmLmnOPrsTxyzMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoWSTKnkfxLtn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIzOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuAkExIOUaeiioAEIOUaeiiouBCDFGyyzuBCDFGjkLmnOPrsTxyzVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYAEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJwowSTKnkKfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouByfbYAEIOUaeiouBCDFGJKLmAEIOUAEIOUaeiiouBCDFGjkLmnOPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTabcyfUqVsxzvGndEFGHmiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyznOyfbYpORjKDimUqVsxzvGnPrsTxyzpORjKDimUqVsxzvGnCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGGnOPCrOsTxCdEfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOAEIOUaeiouBCDFAEyzGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTAbCdEOpQrStUvWxYzxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWx");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGyfUFjyNNsqqpPazeMePJwqrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FVjN");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzSmnOAEIOUaeiiouBCDFGjkLmnOPrsTxyzTxyzoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hhAEIOUaeOiouBCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUzFjyNNsqqpabcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWxPazeMePJwoSMqrdxvQZaGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFqAbCdpEfGhIjKlMnOpQrStUvWxYzjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJztnn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazUvWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaAEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzeiouBCDFGjkLmynOPCrOsTxyfUFjqyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGnz");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazAEIOOUaeiouBOCODFGJzKLmnOPrsTxyAWYzzeabcdEFGHFjyNNsqqpPazeMePJxwoSMqMrdxvQZaGyfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqtVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnTiJKLMNOpQRstuVWxQZaGTqVWAbCCdEOpQrStUvWxYzxyZxzvGn");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvXuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCODFUGyfUFjyNNsqqpPazeMePJwfoSMqrdxvQZaGTaqVsxzvGnz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaAEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzeiouBCDFGjkLmynOPCrOsTxyfUFjyNNsqqpRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGnz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEZaGTqVsxzvGnQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHiOlJKLMNOpQRstuVWxyZskjhgRfedcbaZAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyzXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePpJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEzFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEOpzbvuyrwWqpmlqweRtYuIOPasdFghJkAkExIOUaeiAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyziouBCDFGjkLmnOPrsTxyzlzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyefbYpORjKDimUqVAEIOUaeiouBCDFGKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpOAEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdxvQZaGTiJKLMNOpQhhAEIOUaeOiouBCDFGJzKLmnOzRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTyqVsxzvGnNOpQRstuVWxPrsTvxyzxzGvGAEIOOUaeiouBCODFUGsznTKnkfLtPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFAEIOUaeiouBCDFyQqVsxvzvGnbFjsqqpPazZeMePJwoSMqrdxvQZaGTcDfgHjklMpRStVWXZAbCdTEfGhiJkLmNoPqRsTuVwXyZGJKLmnOPrsTxyzGHiJKLMNOpQRstuVW");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWabcdVWxYzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHLiJKLMNEOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyAEIabcdFEFGHAkExIOUaeiioAEIOUaeiiouBCDFGyyzuBCDFGjkLmnOPrsTxyziJKabcdEoSMqrdxvQZaGTiJKLMNOpQRstuVWxLMNOpQRstuTKnKfkfLtbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzzKx");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzAEIOUaeiouBCDFGJzeKLmnOPrsWTxyAYWYzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzTz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazMYAWYzePJwoYKSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDiymmUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtabcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWx");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJyfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGnAEIOUaeiouVWAbCdEOpQrStUvWxYzxyZBCDLeFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUNFjyNNsqqpPazeMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWxYzoSMqrqweRtYuIOPasdFghJklzXcVbnMdxvQZaGTaeiouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvzbvuyrwqpmlabcdEFGHilJKLMNOpQRstEuVWxyZskjhgfedcbaZXJUTSRPONMLKIQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwonSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGnyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdfEFGyfUFjyNNsqqpPazeMePJwoSTKnkfLtnHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVeWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNsqqpPazeMMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzkfLt");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUAbCdEOpQrStUvWxYzqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmjnOPrsTxyzOpQRstuVWxyZAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiouBCDFGjkLmnOPrabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLmnOPrsTxyzOGpQRstuVWxyZsTxyzzz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaAEIOUaeiouBCDFGJzKLmnOPriiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDsimUzvGnPyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzRstuVWxQZaGTqVsxzvGnTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzGvGnTKnkfLtPrsTxyzqpPazeMePJwoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYabcdEFGHiJxKLMNOpQAEIOUaeiouBCDFzbvuyrwFjyNNsqqpPazeMePJwoSMqrdxovQZaGTqpmlabcdELMNOpQRstuVWxyZkjtuVWxyZEfGhIdjKlMnOpQrStUvAExIOUaeiiouBCDFGjkLmnOPrsTxyzzzWxYz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAaEIOUaeiouBCDLFGjVWx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnJKLmnOyfbYpORjKDimUqVAEIOUAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGzbvuyrwqpmlqweRtlzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKInabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabncdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyzaeiouBCDFGJKLmbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMGePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSzbNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYAEIOOUaeiouBCODFUGJzKLmnOPrsTxyAWyrwqpmlkjhgfedcbaZXJUTSRPONMLKIMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLumnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAEIOUaeiouBCDFGJKLmnOPrsTxyzAEIOUaeiouBCDjLmnOPCrsOTxyzz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abedcbaZXJUTSRPONMLKIGJzzRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaTKnkfLtGTaqVsxzvGnTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQyfUFjyNNsqqpPazMYAWYzePJwoYKSTKnkfLtnZaaGTiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDoFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqyfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzSmnOAEIOUaeiiouBCDFGjkLmnOPrsTxyzTxyzoSTKnkfLtnpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 35
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzFGyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazAhhhsqqpPazeMePJxwoSMqMrdxvQZaGyfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqtVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnTiJKLMNOpQRstuVWxQZaGTqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJAEIOUaeimouVWAbCdEOpQrStUvWxYzxyZBCDLeFGjkLmnOPrsTxyzKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFyfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGnGjkLmnOPCrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPzStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdEOpQrStUvWxYabcdEFGHiJxKLMNOpQAEIOUaeiouBCDFzbvuyrwFjyNNsqqpPazeMePJwoSMqrdxovQZaGTqpmlabcdELMNOpQRstuVWxyZkjtuVWxyZEfGhIdjKlMMnOpQrStUvAExIOUaeiiouBCDFGjkLmnOPrsTxyzzzWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKyNNsqqpPazeMePJwoSIMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDAEIOUaeiouBCDFGAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOAEIOUaeiouBCDAEIOUaeiouBCDFGAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzJKLmnOPrsTxyzLEFGjkLmnOPrsTxyzpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzJKLmnOPrsTxyzLEFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGnYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEoSMqrdxvQZaGTiJKLMNOpTQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpabcdEFGHFjyNNsqqpMPazeMePJwoSMqQrdxvQZaGTiJKLMNOpQRstuVWxPazeMePJwoSMqrOdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFyfUFjyNNswqqpPazeMePJwoSMqrdxvQZaGTqVysxznjyNNsqqpPazeMePJwoaSMqrdxvQZaGTqVsxzTvGnWxYzePJwoSMqrdxvQZaGTqVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOyfUFjyNNsqqpPazeMePJwoSMqrdxvQZxaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSIMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AAEIOUiiouBCTxyzTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNoKSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNsqqpPazeMMePJwAbCdEOpQrStUvWxYzoSMqrdAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyzxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzkfLt");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("NFjyNNsqqpPazeMePJwAbCdEOpQrStUvWyfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnOPrsTxyAWYzzz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeAEIOUaeiouBCDFGJKLmnOVyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzMGePJwoSMqryfUFjyNNsqqpPazeabcNFjyNNsqqpPazeMePJwAbCdEOpQrStqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzZaGTqVsxzvGndxvQZaGTiJpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzFEFGHiJKLMNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGyfUFjyNNsqqpPazeGTqVsxzqweRvtYuIOPasdFghAEIOUaeiouBCDFGjkLmynOPCrOsTxyzJklzXMvGnJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxAEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzzyzouBCDFGJzKLmnOPrsTxaabcdEFGHiJKLMNOpQRstuVWxyrsTxyzKxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaeiouBCDFGjkLmyyfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGnYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGnnOPCrOsTxyzouBCDFGJzKLmnOPrsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDiymmUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtabcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsyxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWx");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQyfUFjyNNsqqpPeazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOyfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGnYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGnUaeiiouBCDFGjkLmyzzz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQRstuVWxyZskjhgRfedcbaZAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGyfUFjyNNsqqpPazAhhhsqqpPazeMePJxwoSMqMrdxvQZaGyfUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqtVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtnTiJKLMNOpQRstuVWxQZaGTqVsxzvGnzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyzXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDiymmUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtabcdEFGHFIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWx");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouAEIdOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGvHiJAEZaGTqVsxzvGnQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAbCdAEyzNFjyNNsqqpPazUvWxYzEOpQrStUvWxYfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeDiiouBCDFabcdEFGHFjyNNsqqpPazeMePJAWYzwoSMqrdxvQZaGTiJKLMNOpQRstuVWxGyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abbcdEFGHiabcdEFGHiJKLMNOpQRstuVWxyZJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEyzNFjyNNsqqpPazeMePJwAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqYAWYzVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzAbCdAEyzNFjyNNsqqpPazUvWxYzEOpQrStUvWxYfGhIdjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJabcdEFGHFjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOfpQRstuVWxwJoSTKnkKfLtn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiuBCDFNFjyNNsqqpPazeMePJwAbCdEOpQrStqrdxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzGyyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeioGuBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzJvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrPsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHUiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazaeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxyzouBCDFGJzKLmnOPrsAWYzz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFjyNNsqqpPazeMePJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvvGnPrsTxyYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaueOiouBCDyfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtnnGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwWqpmlqweURtYuIOPasdFghJklzXcVbnMabcdEAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNStUvWxYzoSMqrdxvQZaGTAbCdEfGhIdjKlMnOpyfUFjsyqAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyzsxzGvGnTKnkfLtPrsTxyzqpPazeMePJwoSTKnkfLtnQrStUvWxYzkfLt");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzMORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRAEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDFGyzstuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuVWxzvGn");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGyfUFjyNNsqqpPaOsTxyzJklzXMvGnJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yefUFjsqqpPazeMePJwAEIyfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxyzoSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaueOiouBBCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AExIOUaeiiAEIOUaeiouAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzouBCDFGjkLmyzzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOVyfbYpORjKSDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwozbNFjyNNsqqpPaBCODFUGJzKLmnOPrsTxyAWYzzzvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKISMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDjkLmnOPCryfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnsOTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKabcdEoSMqrdyfUPFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnxvQZaGTiJKLMNOpQRstuVWxazeMePJwoSMqrdxvQZaGTiJKLMyQfUFjyAEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNYuIOPasdFghJklzXcVbnMvGnLKIGJzzNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyZrwWqpmlqweURtYuIOPasdFghJklzXcVbnMabcdEFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDiymmUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtabcdEFGHFwjyNNsqqpMPazezAEyzMePJwoSMqrdxvQZaaGTiJKLMNOpQRstuAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGdnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzVWx");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TyfbYpORjKDimUqVsxzvGnKVWAbCCdEOpQrStUvWxYzAEIOUaeOiAEIOUaeiouBCDFGjkLmynOPCrOsTxAEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzzyzouBCDFGJzKLmnOPrsTxaabcdEFGHiJKLMNOpQRstuVWxyrsTxyzKxyAWYzzxyZLt");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsyqqpPazeMePJabcdEFGHFjyNNsqhLMNOfpQRstuVWxwJoSTKnkKfLtn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrzbvuyrwWqpmlqweURtYuIOPasdFghJklzXcVbnMabcdEAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzFGHilJKLMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIsTxyzAEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzAEabcdEFAEIOUaeiouBCDFGJKLmnOPrsTxyzGHiJKLMNOpQRstuVWIOUaeiouBCDFGJzKLmnOPrsTxyAWYzzn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqqpPazeabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxQZaGTqVsxzvGndxvQZaGTiJAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzJvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrPsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("TKnKfAEyzNFjyNNsqqpPazeMMePJwAbCdEOpQrStUvWxYzoSMqrdAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyOzxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzkfLt");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("babcdGEFGHFjyOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjKDyfUzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnvqGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcyfUAbCdEOpQrStUvWxYzqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOPrsTxyzmnOPrsTxyzOpQRstuVWxyZAEIOUaeiouBCDFGJKLmnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpORjAEIOUaueOiouBCDyfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtnnGJzKLmnOzKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSxMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abbycdEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyTKnKfAEyzNFjyNNsqqpPazeMMePJwAbCdEOpQrStUvWxYzoSMqrdAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyzxvQZaGTAbCdEfGhIdjKlMnOpQrStUvWxYzkfLtrwqpmlkjhgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 39
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQAEIOUaeiouBCDjkLmnOPCrsOTxyzZaGTqVsxzTvGxYzxyZ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOpUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzzyfbYpORjKDyfUzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzTvGnvGn");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("OmCBnVEXqQ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGaabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKxnqpPazeabcdEFtGHabcyfUqVsxzvGndEFGHiJKLMNAAEIOOUaeiouBACDFGJzKLmnOPrsTxyAWYzzEIOUaeiouBCDFGjakLAkExIOUaeiioAEIOUaeiouBCDFGabcdEFGHiJAaEIOUaeiouBCDLFsGjkLmnOPrsTxyzKLMNOpQRstuVWxJKLVWAbCdEOpQrStUvWxYzxyZmnOyfbYpORjKDimUqVsxzvGnPrsTxyzuBCDFGjkLmnOUPrsTxyabcdEFGHiJAaEIOUaeiouBCDLFGjkrsTxyzKLMNOpQRstuVWxzmnOPrAEIOOUaeiouBACDFGJzKLmnOrsTxyAWYzzsTxyVWAbCdEOpQrStUvWxYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZstuVWxyZFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyz");
        org.junit.Assert.assertEquals(
            result, 50
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFjsqqpPazeMePJwAEIOUaeiouBCDLEFGjkLAbCdEOpQrStUvWxYzmnOPrsTxNFjyNNsqqpPazeAEIOUaeiouBCDFzbvuyrwqpmlabcdEFGHilJKLMNYuIOPasdFghJklzXcVbnMvGnLKIGJzzMePJwyfUFjyNNsqqpPazeMePJwqweRtlzXcVbnMvGnAbCdEOpQrStUvWxYzoSMqrdxvQZaGTyzoWSTKnkfLtn");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aabcdEFGHiJKLMNOpQRstuVyfUFqjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGyfUFjyNNsqqpPazeMYAWYzePJwoSTKnkfLtnnWxyZbcdEFGHiiJAEIOUaeiouBCDLFGjkLmnOPrsTxyzKx");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouAEIOUaeiouBCDFGjkLmynyfUFjyNNsqqpPazeMePJwcoSMqrdxvQZaGTqVsxzTvGnOPCrOsTxBCDFzbvuyrwqpmlabcdELMNOpQRstuVWxyZkjhgfedcbaZXJUTSRPONMLKIGJzz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("l");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORjAEIOUaeioGuBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqryfUFjyNNsqyfbYpORjKabcdFEFGHiJKLMNOpQRstuVWxDimUqVsxzvGnqpPazeabcdEFtGHFjyNNsqqpPazeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPRrsTxyzKDimUqVsxzvAEIOUaeiouBCAEIOUaeioueBCDFEzeMePJwoSMqrdxvxPrsTxyzDFGJKLmnOPrsTxyzGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKaLMNOpzQyfUFjyNNsqqpPeazeMePJwqweRtlzXcVbnMvGnRstuVWxPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOyfUAEFIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPaAEIOUaeiiouBCDFGyzzeMePJwoSIMqrdxvQZaGTqoVsxzTvGnWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlabcdEFGHilJKLMNOpQyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaAEIOUaeiouBCDFGJKLimnOVyfbYyfUFjyNNsqqpPazeMePJwYoSMqrdxvQZaGTqVsxzvGnpAEIOUAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGzbvuyrwqpmlzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIXJUTSRPONMLKIJKLmnOyfbzbvuyrwqpAEIOUaeiouBCDFGJKLmOryfbYpORjKDimUqVAEIOUaeiouBCDFGJTyfbYpORjKDimUqVsxzvGnKVWAbCCdEOpQrStUvWxYzxyZLtvGnPrsTxyzsxzvGnPrsTxyzPONMLKIYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJAEIOUaeiiouBCDFGjkLmnOPrsTxyzPrsTxyzaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORVjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxaGTiJKLMNOpQRastuVWxPrsTxyzGTaqabcdEFGHFjyNNsqqpMPazeMePJwTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 42
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaueOUiouBCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("OmCBnVEXAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpAEIOUaeiouBCAEIOUaeioueBCDFGJKLmnOyfbYpORjzsxzJvGnabFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzDFGJKLmnOPrsTxyzORjKDimUqVsxzvGnPrPsTxyzsxzvGnabcdEFGHFjyNNsqqpPazHeMeabcdFEFGHUiJKLMNOpQRstuVWxPJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzqQ");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOOUaeiouBCDFGJzKLmnOPrsTxyAWYzAEIOUaeiiouBCDFyfUFjyNhJklzXcVbnMvGnGyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfUFaabcdEFGHiJKLMNOpQRstuVWxyZbcdEFGHiJAEIOUaeiouBCDLFGjkLmnOPrsjTxyzKxjyNNsqqpPazeMePJwqweRtlzXcVbnMvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("YAAEFIOOUaeiouAbCdEfGhIjKlMnOyfUAEFIzOOUaeiouBCDFGJzKLmnOPrsTxyAWYzzFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqoVsxzTvGnWxYzBCDOFGJzKLmnOTPrszTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeOiouBUCDFGJzKLmnOz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouyfUFjyNNsqqpPazeGTqVsxzqweRtYuIOPasdFghJklzXcVbnMvGnBCDFGJKLmnOyfbYpORjKDimUqVsxzvGnPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvXuyrwqpmlkjhgfedAbCdEfGhIjKlMnOAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmnOyfbYpORKjKDimUqVsxzvGnPrsTxyzsxzvGnabcdEFGHFjyNNsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzyfUFjyNNsqqpPazeMAbCdEfGhIjKlMnOyfUFyfUFjyNNswqqpPazeMePJwoSMqrdxvQZaGTqVysxznjyNNsqqpPazeMePJwoaSMqrdxvQZaGTqVsxzTvGnWxYzePJwoSMqrdxvQZaGTqVsxzTvGnWxYzcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abedcbaZXJUTSRPONMLKIGJzyfUPFjyNNsqqpPazeMVWAbCdEOpQrStUvWxyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGyfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTaqVsxzvGnTqVsxzvGnYzAbCdEfGhIjKlMnOyfUFjyNNsqQZaGTqVsxzTvGxYzxyZePJwoSMqrdxvQZaGTqVsxzqweRtYuIOPasdFghJkYlzXcVbnMvGnWxyZ");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEFIOOUaeiouBCDFyfUqyQfUFjyNNsqqpPazeMePJwoSMqrdxvQZaGTqVsxzvGnVsxzvGnPrAEIOUaeiouAEIOUaeiouBCDLFGjkLmnOPrsTxyzeBCDFGJKLmnOyfbYpORjzsxzvGnabcdEFGHFjyNNAEIOUaeiouBCDFGJKLmnOyfbYpORjKDimUqVAEIOUaeiouBCDFGJKLmbYpORVDjKDimUqVsxzvGnPrsTxyzsxzvGnPrsTxyzsqqpPazeMePJwoSMqrdxvQZaGTiJKLMNOpQRstuVWxPrsTxyzsTxyAWYzz");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHFjyNNsqqpPazeAExIOUaeiioKLMGNOpQRstuVWx");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("dqweRtYuIOPasdFghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfVUzFjyNNsqqpPazeAbCdEfGhiJkLmNPqRsTVuVwXyZMePJwoSMqrdxvQZaGTqVsxzTvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("A");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("b");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("BC");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("eio");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AaBbCcDdEEFGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyzZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfG");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("aBCdEf!");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiou");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOU");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhiJkLmNo");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjkLmnrOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHWXZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcdEFGHiJKLMNOpQRstuVWxyZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZmqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpOjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOzPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKAlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbxYpOjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIOUaeiouBCDFGjkLmnOPrsTxyzQZaGT");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdGhiJkLmNoPqRsTuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdGhiJkLmNoPqRsTFjyNNsqqpPazeMePuVwXyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcdEFGHiJKLMNOpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYpORjKDimUqVsxzvGnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VX");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYzkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEAEIOUaPeiouBCDFGjkLmnrOPrsTxyzIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTwoSMqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEAEIOUaPeiouBCDFGjkLmnrOPrsTxyzIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqYRsTuVwXyZqrdxvQZaGTwoSMqrdabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouoBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyfbxYpOtUvWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnMAbCdEfGhIjKAlMyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnYz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkQLmnOPrsTxayzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOPrsATxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnMaeiouBCDFGjkLmnOPrsATxyz");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIjKlMnOpQrStQUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhPgfedcbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMrnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEMfGMhIyfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQFjyNNsqAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYzqpPazeMePJwoSMqrdxvQZaGTrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("V");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGvhIjKlMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTSRPONML");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvWxYzz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYUaeionOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnrOzPTrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("VqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnMX");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAJwoSMAbCdEzQZaGT");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpNPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTAbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvWxYzghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjAEIOUaPeiouBCDFGjkLmnOPrsTxyzkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfpGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQyfbYpORxzvGnZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOmUaeiouBCDFGjkLmnrOzPTrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdBFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQRZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPWqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGT");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpVORjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPON");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZzAbCdEfGhIjKlMnOpQrStUvWxYzSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQJZaGTMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTFjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTzoPqRsTuVwXyZqrdZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjysNNsqqpPaAOjpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvAbCdEfGhiJkLmNNoPqRsTuVwXyZWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FY");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUyfbxYpOjKDimUqVsxzvGnaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfeRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FzjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJywoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgzAbCdEfGMhIyFjyNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcgbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTI");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZmqrdxvQZaGTyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHitJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzFjyNNsqqpPazeMePeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHjklMpRStVXZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsFjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGTTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUbaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMzePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNJoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("X");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcMNOpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwooSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCzbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghJklJzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTiouBCDFGjkLmnrOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjKDimUqVFjyNNsqqpPaAOpQrStUvWxYzeMePJwooSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzyZqrdxvQZaGTStUvWxYzSRPONMLKIaGTvGn");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUyfbYpORjabcdEFGHiJKLMNOpQRstuVWxyHZKDimUqVsxzvGnvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNabQcdEFGHiJMKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGT");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbxvQZaGTrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSOMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnMaeiouBCDFGjkLmnOPrsATxyz");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcdEFGHiJKLMNOpQRstuVWxyHZKFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpVORjKDimUDqVszbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYzkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIvGn");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZdZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpyORxzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGTzvGn");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYGzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdyfbYpORxFjyNNsqqFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPaZsdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbFjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMePCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTbAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyXZqrdxvQZaGTStUvWxYzSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoYSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLzmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjAEIOabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZUaPeiouBCDFGjkLmnOPrsTxyzkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGFjyNNyfbYpORjKDimUqVsxzvGnsqqpPazeMePnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZimUqVsxzv");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdGhiJkLmNoPqRsTuAbCdEfGhiJkLmNoPPqRsTuVwXyZyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhimJkLmNo");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHjklMpRStVX");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVmwXyZqrdvxvQZaGTFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAbCdEfGhIjWKlMnOpQrStUvWxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGTYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdBFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkFzjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMePLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjxKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIONUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzyZqrdxvQZaGTStUvWxYzSRPONMLKIaGTlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdyfbYpORxFjyNNsqqFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYWzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqqOUaeiouoBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbxYpOjKDimUqqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTbAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYznkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGTJklzXcVbnMkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPON");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpzQrStUvWxYzeMePJwoSMAbCdEzQZaGT");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxFjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMMePwXyZqrdxvQRZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyfbxYpOtFjyNNsqqpPazeMePJwoSMqrdxvQZaGTUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTFjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeioPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTzoPqRsTuVwXyZqrdZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsKIaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZPqrdxvQZaGTiouBCDFGjkLmnrOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNYpORxzvGnZaGTpQxyZ");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVFjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTFjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeioPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTzoPqRsTuVwXyZqrdZxvQZaGTsxzvGnsqqpPazeMMeP");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePwJwoSMAbCdEfGhiJkLmNAEIqOUTaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 26
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPzAbCdEfGhIjKlMnOpQrStUvWxYzWqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbAEIOUaPeiouBCDFGjAEIOUaPeiouBCDFGjkLmnOPrsTxyzkLmnOPrsTxyzpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePzATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYzJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbxCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTqiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStAbCdGhiJkLmNoPqRsTuAbCdEfGhiJkLmNoPPqRsTuVwXyZyZUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXySMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnMaeiouBCDFGjkLmnOPrsATxyz");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVFjyNNsqqpPaAOpQrStUvWxYzeMePJwooSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXzATbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQZaGTStQUvWWxYzyZqrdxvQZaGTStUvWxYzSRPONMLKIaGTwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGTJklzXcVbnMkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPON");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbFjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMePCdEzQZaGTfbxYpOjKDimUqVsxzvFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfabcdEFGHiJKLMNOpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FzjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMjeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqFjyNNQsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyLzoPqRsTuVwXyZqrdxvQZaGTqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPON");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLabcdEFGHiJKLMNOFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVmwXyZqrdvxvQZaGTFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfpGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimRUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbxxYpOjKDimUqqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGzjkLmnOPrsATxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCzbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVTwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FYapORjKDimUqVsxzvGnsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIQjnOpQrStUIvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwqweRtYuIOPaZsdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjvyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdVxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnMAbCdEfGhIjKAlMyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnYz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStAbCdGhiJkLmNoPqRsTuAbCdEfGhiJkLmNoPPqRsTuVwXyZyZUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNJoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("MzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvWxYzz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSOMAbCdFjyFjyNNsqqpzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUbaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOSPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbAEIOUaPeiouBCVqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnMXDFGjAEIOUaPeiouBCDFGjkLmnOPrsTxyzkLmnOPrsTxyzpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWTxYzeMePJwoSMAbCdEfGhiJkLmNJoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbn");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FnqweRtYFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePzATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYzJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTuIOPasdFkghJklzXcVbnMsqqpPazeMeP");
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 30
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AETxyz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoabcdEFGHiJKLMNOFjyNNsuqqpPaAbxCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQyfbYpORxzvGnZaGTpQRstuVWxyZAFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsFjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGTTuVwXyZqrdxvQZaGTEzIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklVbnM");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkeLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTrdxAbCdEfGhimJkLmNovQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcgzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIbaZXJUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZmqrdxvQZaGTyZqrdxvQZaGTzvGnmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGT");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiabQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbxvQZaGTrdxvQZaGTpQRstuVWxyZoOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkoLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKzbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCzbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOtuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMyZqrdxvQZaGTrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpVqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnMXORjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNFjyNNsqqpPaAOpMQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIPrsTxyzZXJUTbAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnXcVbnM");
        org.junit.Assert.assertEquals(
            result, 41
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJywoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdzbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMqqpGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfabcdEFGHiJKLKMNOpQRstuVWxyHZKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjAEIOUaPeiokuBCDFGjkLmnOPrsTxyzkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdBFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnMqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouBCDFGjAEPIOUaPeiokuBCDFGjkLmnOPrsTxyzkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMrnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqqFjyNNsqqOpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjSyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFkgXcVbncM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkAEIOmUaeiouBCDFGjkLmnrOzPTrsTxyzLmNAEIqOUaeiouBCDFGjkLmnOyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnTAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 38
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOmCUaeiouBCDFGjkLmnrOzPTrsTxyz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeabcdEzAbCdEfGMhIjKlMnOpQrStUvWxYzxyZiouBCDFGjkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAIFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqVwJXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBnCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGTzvGn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHVlMpRStVX");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEAEIFjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTOUaPeiouBCDFGjkLmnrOPrsTxyzIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqYRsTuVwXyZqrdxvQZaGTwoSMqrdabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOTPrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTjwuVwXyZqrdxvQZaGTiouBCDFGFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTjkeLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvW");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTSON");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOzbvuyrwqpmlkjhgzAbCdEfGMhIyFjyNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvWxYzzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIUaeiouBCDFGjkLmnrOzPTrsTxyz");
        org.junit.Assert.assertEquals(
            result, 31
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIklJzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTbAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvGTStUvWxYzSRPONMLKIaGTtuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRWtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdBFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkFzjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMePLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjxKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhizAbCdEMfGMhIyfbxYpOjKDimUqVsxzvGntUvWxYzaeiouBCDPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTjwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFjyNabQcdEFGHiJMKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGTFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 45
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcMNOpQRstuVWxyHZKDimUqVsxzAbCdEfGMhIyFjyNNsqqpPaAOpQDimUqVsxzvGntUvWxYzzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjnOpQrAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxLyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyFjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdZxvQZaGTTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIklJnM");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqhRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGTRsTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRWtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdBFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMCdEfGhiJkFzjyNNyfbYapORjKDimUqVsxzvGnsqqpPazeMePLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjxKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGzbvuyrwqpmlkjhPgfedcbaZXJUTSRPONMLKIqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkeLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaPeiouUBCDFGjAEPIOUaPeiokuBCDFGjkLmnOPrsTxyzkLmnOPrsTxyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLAEIOUaeabcdEzAbCdEfGMhIjKlMnOpQrStUvWxYzxyZiouBCDFGjkLmnOPrsTxyzmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIjFjyNNsqqpPazeMePJwoSMqrdxvQPZaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpVqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrwnsTxyzoPqRsTuVwXyZqrdxvQZaGThJklzXcVbnMXORjKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("MzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsazeMePGnIjKlMnOpQrSttUvWxYzz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zIfZr");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZzAbCdEfGhIjKlMnOpQrStUvWxYzSRPONMLKIOpQrStUvWxz");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMqqpGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsNqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGzjkLmnOPrsMzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsazeMePGnIjKlMnOpQrSttUvWxYzzATxyz");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTjwuVwXyZqrdxvQZaGTiouBCDFGFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsbcDfgHjklMpRStVXqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTjkeLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 21
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOLpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuAVwXyXZqrdxvQZaGTStUvWxYzSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORjabcdEFGHiJKLMNOpQRstuVWxyHZKFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwVXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkAEIOmUaeiouBCDFGjkLmnrOzPTrsTxyzLmNAEIqOUaeiouBCDFGjkLmnOyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnTAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnMwuVwXyZqrdxvAEIOUaeiouBCyfbxxYpOjKDimUqqVsxzvGnDFGjkLmnOPrsTxyzQZaGT");
        org.junit.Assert.assertEquals(
            result, 52
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwTuVwXyZqrdxvabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQyfbYpORxzvGnZaGTpQRstuVWxyZAFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsFjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGTTuVwXyZqrdxvQZaGTEzIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklVbnM");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbn");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOTPrsTxLyzoPqRsTuVwzAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOPrsATxyyz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhFjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLAEIOUaeabcdEzAbCdEfGMhIjKlMnOpQrStUvWxYzxyZiouBCDFGjkLmnOPrsTxyzmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPONMLKIaGT");
        org.junit.Assert.assertEquals(
            result, 27
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOTPrsTxLyzabcdEFGHitJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzFjyNNsqqpPazeMePeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZoPqRsTuVwzAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzxvQZaGTStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMeCPJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGjkLmnOPrsqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMTxyz");
        org.junit.Assert.assertEquals(
            result, 22
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfpGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuFjyNNsqqpPaqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpNPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnMAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTVWxyZ");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTjwuVwXyZqrdxvQZaGTiouBCDFGFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTbAbCdEfGhiJkLmNoPqRosTuVwXyZSRPONMLKIfbYpORxFjyNNsqyzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTwXyZSRPONMLKIfbYpORxFjyNNsqqpPaAOpQrStUvWxQZaGTzvGnqpPaAOpQrStUvWxQZaGTzvGnMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTjkeLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 44
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhPJwoSMAbCdFjyNNsqqpPaAOfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsFjyNabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCGTTuVwXyZqrdxvQZaGTEzIOUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklVbnM");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqVwJXyZqrdxvQZaGFnqweRtYFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePzATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYzJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTuIOPasdFkghJklzXcVbnMsqqpPazeMePTzvGn");
        org.junit.Assert.assertEquals(
            result, 34
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGhIjKlabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZMnOFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEAEIOUaeiouBCDFGjkLmnOzPrsTxyzIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsqrdxvQZaGTrdxvQZaGTpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 18
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGJKLmnOPrsz");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGhIjKlFjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBAbCdEfGhIjKAlMnOpQrStUvWxYzCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTMnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGzbvuyrwqpmlkjhPgfedcbaZXJUTSRPONMLKIqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqROPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 11
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVFjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTFjyNNFjyNNsqqpPaAbCdGhiJkLmNoPqRsTuAbCdEfGhiJkLmNoPPqRsTuVwXyZyZAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeioPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTzoPqRsTuVwXyZqrdZxvQZaGTsxzvGnsqqpPazeMMeP");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwqweRtYuIOPaZsdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIePJwoSMAbCdEfTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMEfGhiJkLmNoPqRsTuVwXyZqrPdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEfGMhIyFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbFjyNNyfbYapORjKDimUqVvGntUvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsNqFjyNzbvuyrwqpmlkjhPgfedcbaZXJUTSRPONMLKINyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPazeMePFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBnCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGTzvGnEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsqrdxvQZaGTrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTqiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHVciJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyAzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjqweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvQZaGTJklzXcVbnMkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTStUvWxYzSRPON");
        org.junit.Assert.assertEquals(
            result, 24
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("MzAdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsxzvFjyNNsqqpPazeMePGnIjKlMnOpQrSttUvW");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsuqqpPaAbxCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRWxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("bcDfgHjklMp");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("StUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpVqweRtYuIOPasdFkgFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTyfbYpORjKDimUqVsxzvGnEfGhiJkLmNAEIqOUaeiouBCDFKDimUqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjvyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdVxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXqyZqrdxvQZaGTJklzXcVbnMAbCdEfGuhIjKAlMyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGnYz");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYprORxFjyNNsqqpPaAOpQrStUvWxYUaeionOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaXGTzvGn");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abcdEFGHiJKLMNOFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVmwXyZqrdvxvQZaGTFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOpQRstuVWAxyZwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 14
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPazAbCdEfGMhIyFjyNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCrDFGjkLmnOPrsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 32
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAabQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTpQRstuVWxyZeiouBCDFGjkoLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 8
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMmAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTjwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AEIOUaeiouBCDFGzjkLmnOPrsMzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsazeMePhGnIjKlMnOpQrSttUvWxYzzATxyz");
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgzAbCdEfGMhIyFjyNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEzQZaGTfbxYpOjKDimUqVsxzvGntUvWxYzfedcbaZXJFjyNNsqqpPaAOpQrJStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZaGTXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 33
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrCdEfGhiJkLmNoPqRsTuVabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstMAbCdEfGhiJkLmNAEIOUaeioOPrsTxyzoPqRsTuVwXyZqrdxvQZFjyNNsqqpPaAOpQrStUvWxYzeMeSPJwoSOMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTrdxvQZaGTmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGT");
        org.junit.Assert.assertEquals(
            result, 23
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zAbCdEyfGMhIyfbxYpOtUvWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("hlDwUVZWIo");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCzbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIdEfGhiJkMLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVTwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 28
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbxYpOqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMjKDimUqqVsxzvGn");
        org.junit.Assert.assertEquals(
            result, 20
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdEfGFjpyNNyfbYpORjKDimUqVsxzvGnsqqpPazeMePnOpQrStUvWxYz");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abFjyNNsqqpPwaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTcdEFGHiJKLMNOpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhAEIOUaPeiouBCDFGjkLmnOPrsTxyzgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJywoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdzbvuyrwqpmlkjFjyNMqrdxvQZaGThgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnabcdEFGHiJKLMNOFjyNNsuqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVabcdEFGHViJKLMNOpQRstuVWxyZwXyZqrdxvQZaGTpQRstuVWxyZOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBnCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGTzvGnONMLKI");
        org.junit.Assert.assertEquals(
            result, 53
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqVwJXyZqrdxvQZaGFnqweRtYFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePzATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYzJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzhoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTuIOPasdFkghJklzXcVbnMsqqpPazeMePTzvGn");
        org.junit.Assert.assertEquals(
            result, 37
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FnsqyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiOouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTGTzvGnpPaeMeP");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRzAbCdEfGhIjKlMnOpQrStUvWxYztYuIOPasdFghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOqFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnMpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTtUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsQTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVxvQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 36
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("AbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPWqRsTuVwXyZqrabQcdEFGHiJKLMNOrFjyNNsqqpPaAbCdEfUGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqFjyNNsqqpPaAOpQrSFjyNNsqqpPaAOpbQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvGTStUvWxYzSRPONMLKIaGTtuVWxyZdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYz");
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxrYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 17
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYzkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEjIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPazbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIAbCdEfGhIjKNoPqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbn");
        org.junit.Assert.assertEquals(
            result, 16
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVsxzvGnsqqpPazbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPDqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIzeMeP");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDJFGjkLmnOPrsTxyzoPqRsTuVwXyZqrabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZdZxvQAbCdGhiJkLmNoPqRsTFjyNNsqqpPazeMePuVwXyZZaGT");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("icDti");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNyfbYapORjKDimUqVFjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTFjyNNFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeioPqRsTwuVwXyZqrdxvQZaGTiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrsTxyzoPqRsTuVyfbYpVORjKDimUDqVszbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJAbCdabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZfGhIjKlMnOpQrStUvvWxYzkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJzbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKIwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTUTSRPONMLKIvGnwXyZqrdxvQZaGTzoPqRsTuVwXyZqrdZxvQZaGTsxzvGnsqqpPazeMMeP");
        org.junit.Assert.assertEquals(
            result, 54
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTSrRPONMLKI");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMzePJwoSMAbCdEfGhiJkLmNoPqRAEIOUaeiouBCDFGzjkLmnOPrsMzAbCdEfGhIjKlMnOpQrStUvWxYAbCdEfGhyfbYpORjKDimUqVsazeMePhGnIjKlMnOpQrSttUvWxYzzATxyz");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zbvuyrwqpmlkjhUTSRPONML");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpORxFjyNNsTqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTzvGn");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("yfbYpyORxbzvGn");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("zATbCdEfGMhIjFjyNNsNqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaFGTStQUvWWxYz");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("FjyNNsqqpPaAOpQrStUvWxYzFjyNNsqqpPaAOpQrStUvWxYzewoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDJFGjkLmnOPrsTxyzoPqRsTuVwXyZqrabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZdZxvQAbCdGhiJkLmNoPqRsTFjyNNsqqpPazeMePuVwXyZZaGTeMePJwoSMAbCdEfpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZpQRstuVWxyZAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyzbvuyrwqpmlkjhgfedcbaZXJUTAbCdEfGhIjKlMnOpQrFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsKIaGT");
        org.junit.Assert.assertEquals(
            result, 25
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qweRtYuIOasdFFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAabQcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvAEIONUaeiouBCDFGjkLmnOPrsTxyzQZaGTghJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("qFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTweRtYuIOPasdFghFjyNNsqqpPaAOpQrStUvWxYzeMePJFjyNNsqqpPazeMePJwoSMqrdxvQZaGTwoSMAbCdFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNJoPqRsTuVwXyZqrdxvQZaGTEfGhiJkLmNAEIqOUaeiouBCDFGzbvuyrwqpmlkjhgfedcbaAEIOUaPeiouBCDFGjkLmnrOPrsTxyzZXJUTAbCdEfGhiJkLmNoPyfbYpORxFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfiGhiJkmLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqVwJXyZqrdxvQZaGFnqweRtYFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOzbvuyrwqpmlkjhgfedcbaZXJFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeFjyNNsqqpPaAOpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouabcdEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMePzATbCdEfGMhIjFjyNNsqFjyNNyfbYpORjKDimUqVsxzevGnsqqpPazeaGTStQUvWWxYzJzbvuyrwqpmlkFjyNNsqqpPaAOpQrStUvWxYzehMePJwoSMAbCdEfGhiJkLmNAEIOUaeiouBCDFGjkLmnOPrsTxyzhoPqRsTuVwXyAbCdEfGhiJkLmNoZqrdxvQZaGTIPrnsTxyzoPqRsTuVwXyZqrdxvQZaGTuIOPasdFkghJklzXcVbnMsqqpPazeMePTzvGnqRsTuVwXyZSRPONMLKIjkLmnOPrnsTxyzoPqRqsTuVwXyZqrdxvyfbYpORxzvGnQZaGTJklzXcVbnM");
        org.junit.Assert.assertEquals(
            result, 60
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_UPPER.count_upper("abQcdFjyNNsqqpPaAOTpQrStUvWxYzeMePJwoSMAbCdEfGhiJkLmNAEIqOUaeiouBCDFGjkLmnOPrnsTxyzoPqRsTwuVwXyZqrdxvQZaGTEFGHiJKLMNOFjyNNsqqpPaAbCdEfGhIjKlMnOpQrStUvWxYzeMzePJwoSMAbCfdEfGhiJkLmNoPqRsTuVwXyZqrdxvQZaGTpQRstuVWxyZ");
        org.junit.Assert.assertEquals(
            result, 13
        );
    }
}

