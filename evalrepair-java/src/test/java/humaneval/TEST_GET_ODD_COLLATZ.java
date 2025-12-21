package humaneval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class TEST_GET_ODD_COLLATZ {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(14);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(5);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(12);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(2);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(3);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(7);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(15);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,15,23,35,53));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(20);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(25);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,25,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(30);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,15,23,35,53));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(100);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,25,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(13);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(6);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(101);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(99);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,99,149));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(29);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(19);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,27,31,35,41,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(26);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(8);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(28);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(11);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(102);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,29,51,77));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(18);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,9,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(16);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(98);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,49));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(17);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(4);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(21);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,21));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(9);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,9,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(62);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(22);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(103);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,53,61,103,155,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(97);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,73,83,91,97,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10000);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,469,625));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27345);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,193,233,251,257,263,283,319,325,377,395,425,433,445,479,577,593,685,719,911,913,1079,1217,1367,1619,2051,2429,3077,3245,7691,8653,11537,20509,27345));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48271);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,101,119,179,211,269,281,317,443,499,665,749,1181,1243,1399,1657,1865,1963,2099,2209,2945,3149,3871,4135,5513,5807,6203,6979,8711,9305,10469,13067,13763,14701,17183,19601,20645,24467,25775,30547,36701,38663,45821,48271,57995,65245,72407,86993,108611,162917));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(99999);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,227,341,605,955,1075,1433,1613,1787,2011,2263,2681,3017,3395,4699,5093,5287,6265,6599,7049,7931,8353,8471,8923,9899,10039,10427,11137,11731,11897,12707,13385,14849,15059,15641,17597,19061,22589,27805,99999,149999,152047,224999,228071,329167,337499,342107,360407,379687,384871,416603,438889,468679,493751,506249,513161,540611,569531,577307,585185,593173,624905,640723,649471,703019,740627,790897,810917,854297,865961,961085,974207,1054529,1110941,1461311,1560493,2080657,2191967,3287951,4931927,7397891,11096837));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1000000);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,587,593,661,719,881,911,1043,1079,1367,1565,1619,2051,2429,3077,11125,11719,14833,15625,17579,19777,26369));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27347);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,193,233,251,257,263,283,319,325,377,395,425,433,445,479,577,593,685,719,911,913,1079,1217,1367,1619,2051,2429,3077,3245,15383,23075,27347,34613,41021));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1000001);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1271,1907,2861,3011,4517,8029,9515,10705,11879,14273,17819,20047,25373,26729,30071,39551,45107,59327,67661,88991,105469,133487,200231,300347,337891,450521,506837,562501,750001,1000001));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1000002);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1271,1907,2861,3011,4517,8029,9515,10705,11879,14273,17819,20047,25373,26729,30071,39551,45107,59327,67661,88991,133487,200231,281251,300347,337891,375001,421877,450521,500001,506837));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10001);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,59,67,89,101,157,1055,1583,2287,2375,2813,3007,3349,3431,3563,4009,4465,4511,4703,5147,5345,5791,6767,7055,7501,7721,8687,8807,10001,10151,10583,12197,13031,13211,14455,14863,15227,15875,17131,19273,19547,19817,21683,21991,22295,22841,23485,23813,25697,29321,31313,32525,32987,33443,37111,49481,50165,55667,83501));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27348);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,271,361,407,481,611,641,917,6837));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27349);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,271,361,407,481,611,641,917,27349));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27350);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,587,593,661,695,719,881,911,1043,1079,1235,1367,1463,1565,1619,1853,2051,2195,2311,2429,3077,3293,3467,3901,5201,6491,7303,9737,10955,11539,12325,13675,15385,16433,17309,20513));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10002);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,85,113,301,3751,4007,5001,5627,5707,6011,6331,6421,6763,7123,7609,8441,8561,9017,9497,10145,10685));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(999999);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,73,83,91,97,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,859,911,919,967,1079,1145,1225,1289,1367,1379,1451,1619,1633,2035,2051,2069,2177,2429,3053,3077,3215,4823,7235,8573,10853,22861,33371,37543,42815,50057,50743,56315,60139,63355,64223,67657,71275,76115,80185,84473,90209,95033,96335,106913,114173,121925,144503,216755,325133,355957,999999,1499999,2249999,3374999,5062499,7593749));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(982927642);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,233,251,263,283,319,325,343,377,395,425,433,445,479,515,577,593,719,773,911,1079,1219,1367,1619,1829,2051,2429,3077,69347,104021,123283,164377,184925,876677,2337805,3117073,6919015,9225353,10378523,10933751,11675839,12958519,15567785,16400627,17278025,17513759,19437779,24600941,26270639,29156669,39405959,59108939,66497557,88663409,184298933,491463821));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(982927640);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,233,251,263,283,319,325,343,377,395,425,433,445,479,515,577,593,719,773,911,1079,1219,1367,1619,1829,2051,2429,3077,69347,104021,123283,164377,184925,876677,2337805,3117073,6919015,9225353,10378523,10933751,11675839,12958519,15567785,16400627,17278025,17513759,19437779,24600941,26270639,29156669,39405959,59108939,66497557,88663409,122865955,184298933));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48272);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,227,341,605,955,1075,1433,1613,2263,3017,3395,5093));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1073741824);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(100001);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1129,1271,1505,1783,1907,2377,2503,2675,2861,3169,3755,4013,4225,5633,13349,35597,56251,63283,75001,84377,94925,100001));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1073741826);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,203,229,305,541,721,961,5125,91007,109333,136511,204767,307151,388739,460727,583109,691091,970741,1036637,1294321,1725761,4035631,4309535,4602029,5380841,6053447,6464303,7661395,9080171,9565939,9696455,10215193,11492093,12272077,12754585,13620257,14348909,14544683,16362769,17006113,21817025,22674817,30233089,40310785,53747713,71663617,95551489,127401985,169869313,226492417,301989889,402653185,536870913));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(100000);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,83,91,103,107,121,125,137,155,161,167,175,233,251,263,283,293,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077,3125));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(9999);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,53,61,167,251,283,319,325,377,425,433,479,577,719,791,911,1079,1187,1367,1619,1781,2051,2429,3077,9999,14999,22499,33749));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(100002);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,14063,21095,31643,35599,37501,47465,50001,53399,80099,120149));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48270);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,101,119,179,211,269,281,317,443,499,665,749,1181,1243,1399,1657,1865,1963,2099,2209,2945,3149,3871,4135,5513,5807,6203,6979,8711,9305,10469,13067,13763,14701,17183,19601,20645,24135,24467,25775,30547,36203,36701,38663,40729,45821,54305,57995,65245,86993));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27346);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,193,233,251,257,263,283,319,325,377,395,425,433,445,479,577,593,685,719,911,913,1079,1217,1367,1619,2051,2429,3077,3245,10255,13673,15383,23075,34613));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(99998);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1129,1271,1505,1783,1907,2377,2503,2675,2861,3169,3755,4013,4225,5633,8899,13349,47461,49999,63281,74999,112499,168749));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(999998);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,73,83,91,97,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,859,911,919,967,1079,1145,1225,1289,1367,1379,1451,1619,1633,2035,2051,2069,2177,2429,3053,3077,3215,4823,7235,8573,10853,22861,33371,37543,42815,50057,50743,56315,60139,63355,64223,67657,71275,76115,80185,84473,90209,95033,96335,106913,114173,121925,144503,216755,325133,355957,499999,749999,1124999,1687499,1898437,2531249));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(99997);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1129,1271,1505,1783,1907,2377,2503,2675,2861,3169,3755,4013,4225,5633,8899,13349,37499,42187,47461,56249,63281,99997));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(982927636);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,109,121,137,145,155,161,167,175,233,251,263,283,319,325,343,377,395,425,433,445,479,515,577,593,719,773,911,1079,1219,1367,1619,1829,2051,2429,3077,69347,104021,123283,164377,184925,876677,2337805,3117073,6919015,9225353,10378523,10933751,11675839,12958519,15567785,16400627,17278025,17513759,19437779,24600941,26270639,29156669,39405959,46074733,59108939,66497557,88663409,245731909));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(37);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(82);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,31,35,41,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(999997);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1271,1907,2861,3011,4517,8029,9515,10559,10705,14273,15839,23759,25373,28157,30071,35639,45107,53459,67661,80189,158203,177979,200227,237305,266969,300341,374999,562499,843749,999997));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(70);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,35,53));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(36);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,9,11,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10003);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,85,113,301,4007,5627,5707,6011,6331,6421,6763,7123,7609,8441,8561,9017,9497,10003,10145,10685,15005));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(76);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(10004);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,469,2501));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27344);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,271,361,407,481,611,641,917,1709));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(9997);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,59,67,89,101,157,703,1055,1583,2287,2375,3007,3349,3431,3563,3749,4009,4465,4511,4703,5147,5345,5791,6767,7055,7721,8687,8807,9997,10151,10583,12197,13031,13211,14455,14863,15227,15875,17131,19273,19547,19817,21683,21991,22295,22841,23485,23813,25697,29321,31313,32525,32987,33443,37111,49481,50165,55667,83501));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(67);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,67,101));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27343);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,59,67,89,101,157,209,371,557,659,989,1171,1757,4163,6245,11101,12319,14801,18479,27343,27719,34607,35083,39469,41015,41579,46777,51911,52625,61523,62369,65701,77867,87601,92285,116801));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(9996);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,59,67,89,101,157,703,1055,1583,2287,2375,2499,3007,3349,3431,3563,3749,4009,4465,4511,4703,5147,5345,5791,6767,7055,7721,8687,8807,10151,10583,12197,13031,13211,14455,14863,15227,15875,17131,19273,19547,19817,21683,21991,22295,22841,23485,23813,25697,29321,31313,32525,32987,33443,37111,49481,50165,55667,83501));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(9998);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,53,61,167,251,283,319,325,377,425,433,479,577,719,791,911,1079,1187,1367,1619,1781,2051,2429,3077,4999,7499,8437,11249));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27342);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,29,59,67,89,101,157,209,371,557,659,989,1171,1757,4163,6245,11101,12319,13671,14801,18479,20507,23071,27719,30761,34607,35083,39469,41579,46777,51911,52625,62369,65701,77867,87601,116801));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(52);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27340);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,203,229,305,541,721,3845,6835,10253));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(68);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(83);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,61,71,83,91,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48273);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,49,65,115,173,613,817,2719,4079,4357,6119,9179,9667,10183,10327,12889,13577,13769,14501,15275,15491,17185,22913,23237,36205,48273));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48274);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,49,65,115,173,613,817,2719,4079,4357,6119,9179,9667,10327,12889,13769,14501,15275,15491,17185,18103,22913,23237,24137,27155,40733));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27341);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,7,11,13,17,37,43,49,65,203,229,305,541,721,3845,10253,27341));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(35);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,35,53));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(27339);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,53,163,217,245,289,1027,1369,1541,1825,5767,8651,9733,12977,27339,30757,41009));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(54);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,27,31,35,41,47,53,61,71,91,103,107,121,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(48276);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,227,341,605,955,1075,1433,1613,2263,3395,5093,12069));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(53);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,53));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(982927644);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,53,61,319,325,335,425,433,479,503,577,595,719,755,793,893,911,1079,1133,1367,1619,1879,2051,2429,2819,3077,4229,14075,15835,17815,21113,23753,26723,40085,59311,83311,88967,124967,133451,150133,187451,200177,210883,234047,243247,281177,316325,324329,351071,364871,369851,416083,461791,526607,547307,554777,615721,624125,692687,789911,820961,864877,876683,986269,1039031,1153169,1184867,1315025,1558547,1777301,2337821,32801251,43735001,49201877,245731911,311004451,368597867,414672601,466506677,552896801));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(34);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,13,17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(33);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,19,25,29,33));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(999996);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,151,227,341,805,847,1073,1271,1907,2861,3011,4517,8029,9515,10559,10705,14273,15839,23759,25373,28157,30071,35639,45107,53459,67661,80189,158203,177979,200227,237305,249999,266969,300341,374999,562499,843749));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1073741828);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,11,13,17,29,77,127,169,191,205,287,431,647,901,971,1067,1093,1201,1457,1601,2845,3551,5327,6743,7991,10115,11987,15173,17981,37877,239419,269347,359129,404021,851267,896807,1276901,1345211,1513363,2017817,2270045,2391485,6377293,8503057,11337409,15116545,20155393,26873857,35831809,47775745,63700993,84934657,113246209,150994945,201326593,268435457));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(96);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,3,5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(999995);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,73,83,91,97,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,859,911,919,967,1079,1145,1225,1289,1367,1379,1451,1619,1633,2035,2051,2069,2177,2429,3053,3077,3215,4823,7235,8573,10853,22861,29663,42815,44495,50743,56315,60139,63355,64223,66743,67657,71275,76115,80185,84473,90209,95033,96335,100115,106913,114173,121925,144503,150173,216755,316405,325133,999995,1124995,1499993,1687493));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(55);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1,5,23,35,47,53,55,61,71,83,91,103,107,121,125,137,155,161,167,175,233,251,263,283,319,325,377,395,425,433,445,479,577,593,719,911,1079,1367,1619,2051,2429,3077));
        org.junit.Assert.assertEquals(desired, result);
    }
}
