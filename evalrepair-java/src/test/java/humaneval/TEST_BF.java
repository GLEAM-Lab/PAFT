package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_BF {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus","Earth","Mars","Jupiter","Saturn"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth","Mars","Jupiter","Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Makemake");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus","Earth","Mars","Jupiter","Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus","Earth","Mars","Jupiter"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Mars","Jupiter","Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Saturn"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus","Earth","Mars","Jupiter","Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptunMarse", "MeurJupitery");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuNeptunMarsery", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuNeptunMarsery", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "NeptuMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rn", "Sturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ury", "Mercrury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mar", "Mar");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "MerVenuscury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rnth", "Earath");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Earath");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "NepntuMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "UranusEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Sturn", "Sturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UranusEarth", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UranusEarth", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("xrON", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Puluto", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptunePluto", "UrntVenushranusEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rnth", "MeurJupitery");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("tJupiter", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rnth", "rntPlutoh");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rnthh", "UrntVenushraMercurynusEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plo", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Puluto", "Earath");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "MaNepntuMarsnrs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plsuto", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "UranusEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Saturn", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uSturnPuluto", "rntPlutohuSturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMaNepntuMarsnrs", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercrury", "MarstJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Sturn", "MarstJupiterSturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "NepntueMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("aMars", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptunMarse", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earath", "Puluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NepPlutontueMarsn", "NepntueMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptunMarse", "NepntuMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ss", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarMr", "Mar");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PuluMercruryo", "Earath");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NepntueMarsn", "NepntueMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Plutuo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NepPlutontueMarsn", "NepPlutontueMarsn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptuneuto", "NeptunePluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "PMars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "PMPPNepntuMarsnars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MPlutuoercury", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupUranuser", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("EartMeurJupiteryh", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "tEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Sturn", "MarstJupiterSturnxrON");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("lPluto", "lPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MPlutuoercury", "MPlutuoPulutoury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pululto", "Pululto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("tJupiter", "PlsutoMars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "NeptuPulultone");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("tJupiterMercurPMPPNepntuMarsnars", "tJupiterMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UrntVenushraMercurynusEarth", "UrntVenushraMercurynusEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "EarthPuluMercruryo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutoaMars", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rntPlutohuSturn", "uSturnPuluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupUranuser", "ars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("aMarMMarMrr", "aMar");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "MarMr");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mar", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PxrONlutto", "tEarth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("urMarstJupiterSturnxrONy", "Mercrury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earrth", "MerVVenusenuscuruy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("cMerc", "cMerc");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rn", "SaturnStur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercruy", "MarsteJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mrnercury", "Mrnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsteJuer", "MarsteJupite");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "NeptuPulultonne");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "Sturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "Mercy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeruVVenusnuscuruy", "MeruVVen");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Jupiter","Saturn","Uranus"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Saturn", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus","Earth","Mars","Jupiter"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth","Mars"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meurcury", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcuryuto", "PUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Veneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "uto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("EaMercuryh", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcuryuto", "PUranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uto", "JupitJupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "PUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuney", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcuryuto", "PUranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuney", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusluto", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uto", "uto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Merry", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcurynues", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiterupiter", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranu", "Jupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "Venues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UrasnUus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUranus", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcurynues", "Plut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercur", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptne", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "MeurcuryVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veneu", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlut", "utoPlut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespi", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespi", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "MrerMcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiutJupiterer", "JupiutJupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meuyrccury", "Meurcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "MJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitJupiterer", "Jupupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "Jupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Merry", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrccuryu", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcurryuto", "PUranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryu", "uto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercury", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuney", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuneyMercury", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeurcuryVensus", "MeurcuryVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plut", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Satuurn", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercury", "JuVeMeurcurynuespi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MJSatuurniterercuryPUranuslMeurcuryuto", "MJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupMercuryiutJupiterer", "JupiutJupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "JupiMerry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiMerry", "JupiMerry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatuurniterercuryPUranuslMeurcuryuto", "Jupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NpepteunVeneus", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "PUranJMJSatuurniterercuryPUranuslMeurcuryrutousluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlPut", "utoPlut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ss", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veneu", "Veneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranu", "MercuryJupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatuurno", "utoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "MeMMercMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veneu", "PUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plut", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vensus", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatuurniterercuryMeurcuryVensusPUranuslMeurcuryuto", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusluto", "PtUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUranus", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeMMercMury", "VenuJupMercuryiutJupiterers");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jite", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppepteunVeneus", "NpepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plut", "JJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meuyrccury", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Venuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Earth", "MercSaturnury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptne", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "Venuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriter", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Earrth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriter", "UrasnUus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pNeptne", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MrerMcury", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MJSatuurniterercuryPUranuslMeurcuryuto", "PUrJJupiterupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcMercuryJupiurNeptuney", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryu", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJupiterupiteranu", "ss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "eVenues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerry", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiter", "MJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrannu", "PUranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "uotoPlPut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatunurno", "utoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeneNpepteunVeneusu", "Veneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mas", "MarMs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerSaturnry", "P");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPUranusVenuJupMercuryiutJupiterersJMJSatuurniterercuryPUranuslMeurcuryutolutourn", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiter", "JupJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrannu", "PUrPlutoanu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrVeneuJJupiterupiteranuotoPlutu", "MJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarMs", "JupitJupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppeepteunVeneus", "NppepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJtiter", "JupJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespiVenuus", "JuVeMeurcurynuespiVenuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcurynues", "lut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuneyMercury", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercury", "JuVeMeurcurynruespi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "JitPUranuslMeurcuryutoJer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vensus", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranuJiteruryMarMsranus", "UPUranuJiteruryMarMsranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MUrasnUus", "JMJSatuurniterercuryMeurcuryVensusPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiter", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meurcuury", "Meurcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Saturn", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth","Mars","Jupiter"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurMMercuryryuto", "PUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JitPUranuslMeurcuryutoJer", "uotoPlPut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PtUranursluto", "JMJSatuurniterercuryPUranuslMueurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Satuurn", "Satuurn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Maas", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "eVen");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrccuryPu", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrurNeptuneyry", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JitPUranuslMeurcuryutoJer", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "MeMMercMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppepteunVeneus", "NppepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pNeptne", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiMerry", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "JuPtUranurslutoi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatuurniterercuryPUranuslMeurcuryuto", "JMJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "rMerry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranuJiteruryMarMsranus", "UPUranuJPUrannuiteruryMarMsranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluo", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercurcury", "VeMeurcEarthurynues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uto", "UPUranuJiteruryMarMsranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "PUrJJupitrupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriMrerMcuryter", "JupJupiteriter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utoo", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPluts", "MeMMercMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryu", "uuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJtiter", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "MeVenusJupiutJupitererrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryVeneurcuryutous", "Plut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUranus", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteruMercuryJupipiter", "JJupiterupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuJupMercuryiutJupiterers", "MeVenJJupiterusrcMercuryJupiurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatuurno", "utSatuurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupi", "PtUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utoo", "NppepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespi", "UrasnUus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrccuryPu", "Pluo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uuto", "uotoPlPut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuycPUranucury", "PlMeuycPUranucuryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatunurno", "Pluo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uuto", "MercSaturnury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercSatucrnury", "MercSaturnury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteruMercuryJupipiter", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteruJMercuryJupipiter", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "JuJupiterpiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venuus", "Venuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuney", "MeVenusrcurNeptuMeVenuotoPlPutusrcuryney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venuees", "MeMMercMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlut", "Satuurn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "NNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuUPUranuJiteruryMarMsranus", "PUranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "rMery");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupitreer", "Jupitrer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerSaturnry", "NpepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespiVenuus", "utSatunurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PMeurcuurytUrano", "PMeurcuurytUranursluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "PUrJJupiterupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrncury", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiter", "JupJiterMeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plutoo", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pNeptne", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlut", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynues", "lut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ss", "Jupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uuto", "uuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUMJSatuurniterernuuslMeurcuryutoranu", "PUMJSatuurniterercuryPUranuuslMeurcuryutoranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMetuneturnry", "rMerSaNeptuneturnry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrccurNeptuneyry", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Maas", "VVeneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarMs", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMeurcuryVensusPlMeuycPUranucuryu", "PlMeuyrccuryPu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veneu", "JiterVenuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenuotoPloPutusrcury", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "MyJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("oPlu", "uto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppepteMMercuryunVeneus", "NppepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUMJSatuurniterernuuslMeurcuryutoranu", "PUMJSatuurnuryPUranuuslMeurcuryutoranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJ", "ss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusluto", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrcurNeptuneyry", "JupeiMerry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryVeneurcuryutous", "VeJMJSatuurniterercuryMeurcuryVeneurcuryutous");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcurynues", "Pllut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mury", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "M");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Merry", "PUranJMJSatuurniterercuryPUranuslMeurcuryrutousluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mury", "JMJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meuyrccury", "eurccury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcusrynues", "VeMeurcurynues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerry", "PlutMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plutoo", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MJiterercury", "MJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PluPto", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteriuJMercuryJupipiter", "JJupiteriuJMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MuPlutoory", "JMJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcEarthurynues", "MMerMMercurceury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJupitrupiteranu", "VenPUrVeneuJJupiterupiteranuotoPlutuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JiterVenus", "Venues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPluts", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pllut", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mury", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranuJiteruryMarMsranMus", "UPUranuJiteruryMarMsranMus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVVenusrcury", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatJiterunurno", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meuyrccury", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "PUrJJupitePUrVeneuJJupiterupiteranuotoPJluturupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuycPUranucury", "PMeurcuurytUranursluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptuune", "Neptuune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcuerryutoJupiter", "PUranuslMeurcuerryutoJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenPUrVMerryeneuJJupiterupiteranuotoPlutuus", "VenPUrVMerryeneuJJupiterupiteranuotoPlutuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiMerrry", "JupiMerry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrVeneuJJupiterupiteranuotoPlutu", "uuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mury", "JJupiteruMerer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusluto", "JupitJupiJupiutJupitererterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitePlutor", "JupitePlutor");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMetuneturnry", "PUrPlutoanu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMMeVenusrcurNeptuneyeu", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranrMsranMus", "UPUranuJiteruryMarMsranMus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeurcuryMVensus", "MeuurcuryMVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUMJSatuurnuryPUranuuslMeurcuryutoranu", "lut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcurryuto", "PUVeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynuesranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mrry", "Mry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "MeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pNeptpne", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuney", "MeVeneVenuesuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranuslMeurcuerryutoJupiter", "PUranuslMeurcuerryutoJJJupiteruMererer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PtUranurNppeepteunVeneusto", "PtUranursluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitEarrthJupiterer", "Jupupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPlJuVeMeMJSatuurniterercuryPUranuslMeurcuryutourcurynuespiuts", "VenuPlJuVeMeurcurynuespiuts");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuJupJupiterers", "VenuJupMercuryiutJupiterers");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryulut", "lut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("J", "J");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uPUranuslMeurcurryutouto", "uotoPlPut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturUPUranuJPUrannuiteruryMarMsranusn", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUranMuPlutooryus", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJupitrupiteranu", "PUrJJupitrupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSaVenuJupJupitererstuurnieurPUrannucuryuto", "JMJSatuurnieurPUrannucuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeurcuryMVensus", "Veneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMury", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatuuPUranuslMeurcuerryutoJJJupiteruMerererrno", "utSatuurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiteir", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJtiteer", "JupJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrurNeputuneyry", "MercuMeVenusrcurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupitreer", "VeJMJSatuurniterercuryMeurcuryVeneurcuryutous");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercurcury", "VeMeurcEartluthurynues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJJiteirupiteruJMercuryPUranuJupipiter", "JJJiteirupiteruJMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSaVenuJupJupitererstuurnieurPUrannucuryuto", "Plutoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PiUranuJiterury", "PUranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerry", "PlutMurrMerSaNeptuneturnry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VePUranuJiterurysus", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeurcuryMVensus", "MeurcuryMVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JiterVenus", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusruruNeptuneyry", "MercuMeVenusrurNeptuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenNppepteunVeneussus", "Vensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "Jupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eurccury", "euUUranMuPlutooryusrccury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespi", "JuVeMeurcurynuespi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "MMerMMercurcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryulut", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSaVenuJupJupitererstuurnieurPUrannucuryuto", "JMJSatuurniterercuryMeurcuryVensusPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupitrer", "Venuees");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veneu", "Meurcuury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercur", "Mercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrcurNeptuneyry", "Venuees");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeeurMerryrcusrynues", "VVensuseMeurcurynues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeptuneyry", "Venuees");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerSaturnry", "rMerSaturnry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatJiterunurno", "utSatJiterunurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatuurno", "uutSatuurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiterMeVJupitreerenusrcury", "JupJiterMeVenuotoPlPutusrcuryMeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVeneu", "Jiupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerceury", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "JupJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JitPUMJSatuurniterercuryPUranuuslMeurcuryutoranur", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JitPUMJSatuurnitNeptuneerercuryPUranuuslMeurcuryutoranur", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuPtUranurrsluatoi", "JuPtUranursluatoi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriMrer", "JupJupiteriter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PJMJSatuurniterercuryMeurcuryVensusPUranuslMeurcuryutoUranu", "MercuryJupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatrannucuryuto", "JMJSatuurnieurPUrannucuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturUPUranuJPUrannuiteruryMarMsranusn", "MercSaturnury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurPlMeuyrccuryur", "PUranruslMeurcuerryutoJJJupiteruMererer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranuJiteruryMaruMsranus", "UPUranuJiteruryMarMsranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venuus", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMury", "MMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcury", "MeVenusrncury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVeneu", "utSatMaruurno");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Meurcury", "P");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PiUranuJiterury", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "NNepteune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenuotoPloPutusrcury", "MeVenusJupiutJupitererrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Maas", "MeVenJJupiterusrcMercuryJupiurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercuy", "MMerMMercurcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercuy", "MMerMMercuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJupiJitPUranuslMeurcuryutoJerterupiteranu", "VVeneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiMJSatuurniterercuryPUranuslMeurcuryutoer", "Plut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMerry", "PUranuslMeurcuerryutoJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JutSatuuPUranuslMeurcrMuryuerryutoJJJupiteruMerererrnoupi", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitEarrthJupitererVeneNpepteunVeneusu", "Veneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUMJSatuurnuryPUranuuslMeurcuryutoranu", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptuneyMercury", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaEarrthrMs", "VenuJupJupiterers");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Satuurn", "Saturun");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "JJJiteirupiteruJMercuryPUranuJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPUranusVenuJupMercuryiutJupitereorsJMJSatuurniterercurPUranuslMeurcuryutolutourn", "SatPUranusVenuJupMercuryiutJupitereorsJMJSatuurniterercurPUranuslMeurcuryutolutourn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurPlMeuyrccuryur", "PUranruslMeurPlMeuyrccuryur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPUranusVenuJupMercuryiutJupitereorsJMJSatuurniterercurPUranuslMeurcuryutolutourn", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MrerMcuryJitPUMJSatuurniterercuryPUranuuslMeurcuryutoranur", "JitPUMJSatuurniterercuryPUranuuslMeurcuryutoranur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VePUranuJiterurysus", "VePUranuJiteruryrMeryus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryu", "PlMeuyrcPUranucuryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "PtUranursluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plutoo", "oPlutoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteruMercuuryJupipiter", "JJupiteruMercuryJupipiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Satuurn", "SatPrun");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uuuto", "uuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPrun", "MeuurcuryMVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUVeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynuesranuJiterury", "PUVeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynuesranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryVeneurcuryutous", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynues", "JuVeMeurcurynruespi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiitier", "JitPUMJSatuurniterercuryPUranuuslMeurcuryutoranur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Saturn", "PtUranusluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uto", "JupitJupitVenPUrVeneuJJupiterupiteranuotoPlutuuserer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriter", "MyJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPluts", "Jitupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranu", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PtUranurNppeepteunVeneusto", "PtUranurNppeepteunVeneusto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitEarrthJupitererVeneNpepteunVeneusu", "JupitEarrthJupitererVeneNpepteunVeneusu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utoPJuPtUranurrsluratoilut", "utoPJuPtUranurrsluatoilut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJJupitEarrthJupitererVeneNpepteunVeneusuupitrupiteranu", "PUrJJupitrupiteranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plut", "MyJiterercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MJSatuurniterercuryPUranuslMeurcuryuPlutto", "MJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "VenuJupJupiterersluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("oPlutoo", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pJupiJupJiterMeVJupitreerenusrcury", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiMerry", "VeJMJSatuurniterercuryMeurcuryVeneurcuryutous");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMMercury", "MMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NNepteune", "NNepteune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMMeVenusrcurNeptuneyeu", "PlMeuyrccuryPu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuryJupi", "MercuryJupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UPUranuJiteruryMarMsranus", "rMerSaturnryJupitEarrthJupiterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarMMs", "MarMs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jite", "MMerMMerrcuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurPlMeuyrccuryurM", "Meuyrccury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeMMercMury", "Veneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPUranusVeanuJupMercuryiutJupiterersJMJSatuurniterercuryPUranuslMeurcuryutolutourn", "SatPUranusVenuJupMercuryiutJupiterersJMJSatuurniterercuryPUranuslMeurcuryutolutourn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryVeneurcuryutous", "VeJMJSatuurnryVeneurcuryutous");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJtiteer", "JupJter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranu", "VeJMJSatuurnryVeneurcuryutous");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurcuerryutoJJJupiteruMererer", "PUranruslMeurcuerryutoJJJupiteruMererer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusluto", "JupitJitererterer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiterMeVenusrcury", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeMeurcusrynues", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurPlMeuyrccuryurM", "Mrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pNeptne", "PllutJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eJiter", "eJiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeuurcuryMeVensusury", "MMerMMercuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranussluto", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeMMerMMercurceuryurcuMry", "Meurucuury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatuurniterercuryPUranuslMeurcuryuto", "oPlu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("utSatunuorno", "Pluo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranucuryu", "PlMeuyrcPUranucuJitPUranuslMeurcuryutoJerryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPluMeVenuotoPloPutusrcuryt", "uotoPlut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppepteMMercuryunVeneus", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JitVenueser", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiter", "JitPiUranuJiteruryr");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuVeMeurcurynuespi", "PUranruslMeurPlMeuyrccuryur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJupiteriter", "uuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "rMurSatPUranusVeanuJMMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercurcurPy", "VeMeurcEartluthurynues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrurNeputuneyry", "MercuMeVenusrurNeputuneyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranusslutto", "NNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JMJSatuurniterercuryPUranuslMeurcuryuto", "JMJeurcuryutoUPUranuJiteruryMarMsranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PtUranurNppeepteunVeeneusto", "PtUranurNppeepteunVeneusto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitJitererterer", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "Plutoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JiterVenuus", "Jiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UrasnUus", "arrMurSatPUranusVeanuJMMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeryu", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlut", "Satuuurn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiteir", "JiMuPlutooryter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlPut", "utPJitPUranuslMeurcuryutoJerlut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUrJJupitrupiteranu", "MuPlutoory");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "uto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "NeptunePUranuslMeurMMercuryryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupitrer", "Veenuees");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMerrcuy", "Pluo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMeurucuryVensusPlMeuycPUranucuryu", "PlMeuyrccuryPu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uotoPlPut", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercury", "MMercur");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Veunus", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUMJSatuurniterercuryPUranuuslMerMerSaturnryJupitEarrthJupitererurcuryutoranu", "PUMJSatuurniterercuryPUranuuslMerMerSaturnryJupitEarrthJupitererurcuryutoranu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryPlMeuyrcPUranucuryulutVeneurcuryutous", "Marslut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("anus", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eVenues", "MercuMeVenusrcurNeptuJitupiterry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NppeepnteunVeneus", "NppepteunVeneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("s", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiupiter", "VVeneu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenuotoPloPutMMerMMercurceuryusrcury", "MeVenuotoPloPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plutlu", "Plutlut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptunePUranuslMeurMMercu", "NeptunePUranuslMeurMMercuryryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venues", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeuurcuryMVensus", "MeVenusrcurNeptuneyMercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VerJMJSatuurniterercuryMeurcuryPlMeuyrcPUranucuryulutVeneurcuryutous", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VePUranuJiterurysus", "VePUranuJiteruruuutoyrMeryus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PUranruslMeurPlMeuyrccuryurM", "MJSatuurniterercuryPUranuslMeurcuryuto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiMerry", "PUVeMJSatuurniterercuryPUranuslMeurcuryutoMeurcurynuesranuJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Maas", "MeVenJJupiterey");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pl", "JJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrurNeptuneyry", "Plut");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMerccuy", "MMerMMercuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mar", "VeMeurcEarthurynJitPUMJSatuurniterercuryPUranuuslMeurcuryutoranurues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jitupitter", "Jitupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenuotoPlPutusrcury", "MeVenuotoPlPutusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMerrcuy", "oPlVVensuseMeurcurynuesutoo");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUrarnus", "s");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ss", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMercur", "Mercr");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jiupiter", "PUranruslMeurcuerryutoJJJupiteruMerererJiterury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "rMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPlJuVeMeMJSatuurniterercuryPUranuslMeurcuryutourcurynuespiuts", "VenuPlJuVeMeMJSatuurniterercuryPUranuslMeurcuryutourcurynuespiuts");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVenusrcurNeptunJJupiteruMercuryJupipiterey", "MeVenusrcurNeptuney");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NNePUranJMJSatuurniterercuryPUranuslMeurcuryrutouslutopteune", "NNepteune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyrcPUranNNepteuneucuryu", "PJupitJupiJupiutJupiterertererlMeuyrcPUranucuJitPUranuslMeurcuryutoJerryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MMerMMercurcurPy", "PtUranurNppeeptenunVeneusto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Plouto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatPUuranusVenuJupMercuryiutJupitereorsJMJSatuurniterercurPUranuslMeurcuryutolutourn", "SatPUranusVenuJupMercuryiutJupitereorsJMJSatuurniterercurPUranuslMeurcuryutolutourn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venuuus", "Veenuus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupJiterMeVJupitreerenusrcury", "JupJiPlMeuyrccuryuenuotoPlPutusrcuryMeVenusrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "JuPtUranursluatoi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiteruJMercuryJupipiter", "PlMeuyrcPUranNNepteuneucuryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("UUranustupitter", "Jitupitter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeJMJSatuurniterercuryMeurcuryVeneurcuryutous", "MercuryJupi");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JVenuuusupiter", "Veneus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercuMeVenusrurNeptuneyry", "Jitup");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("rMetuneturnry", "Saturun");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JJupiter", "pNeptne");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venuuus", "MeurcuryMVensus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlMeuyMMerMMerrcuyrccuryPu", "PlMeuyrccuryPu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuPlJuVeMeurcurynuespiuts", "VeMeurcEarthurynJitPUMJSatuurniterercuryPUranuuslMeurcuryutoranurues");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranuus", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NNePUranJMJSatuurniterercuryPUranuslMeurcuryrutouslutopteune", "JupitJupiJupiutJupiterertetrer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("S", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth","Mars","Jupiter","Saturn"
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Saturn", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("cMercry", "Mercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Veunus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "Vnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcury", "MarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "VenuscMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MVenuscMercryarsMSaturneMercuryrcury", "MarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eJupirter", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhtn", "VeunMVenuscMercryarsMSaturneMercuryrcuryus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "Ms");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhtn", "SaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "MSatuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "SaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercrry", "Mercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnuss", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnuss", "MSatuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSMaturnercury", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MVenusMercurycMercryarsMSaturneMercuryrcury", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiUranuster", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "Vnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Vnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirt", "JuMercurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhtn", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "JuepiMSatuyter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptuMVenuscMercryarsMSaturneMercuryrcuryune", "MaNeptuune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MSMaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercury", "MarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercurMarsy", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnuss", "Vnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercry", "VenusUranuscMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatuMercuryrEarthhtn", "SatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Ms", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "NeptuneVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("eJupirter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupitter", "Jupitter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturrneMercuryrcurypiter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Ea", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vs", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMerJuMercurypitercurypiter", "JuMercurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_642() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtn", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Ms", "MarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("upiUranuster", "MSaturnercuryVenusUranuscMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMercry", "MarsMSaturneMercuryrcurypiteMaNeptuuner");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uss", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mss", "MarsMSaturneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_650() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "uVnyMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhtn", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptuneVnus", "MarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Neptuu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uss", "ss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercrry", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMercurypiter", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuJuepiMSatuyterpirter", "JuJuepiMSatuyterpirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "MSMaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mrcrry", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMerJuMercurypitercurypiter", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercrry", "VenuscMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaMarsMSaturneuMercuryrcurys", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcuryPluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcuryrpiter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVeunusVnus", "sVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "JuJuepiMSatuyterpirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uJuMerJuMercurypitercurypiterVnMSaturnercury", "uVnMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupirsVnusr", "JupiVsSatuMercuryrEarthhtnrtuer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutEa", "Jupirt");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "VeunMVenuscMercryarsMSaturneMercuryrcuryus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Ms", "VeunusMs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiiter", "MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SS", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiVsSatuMercuryrEarthhtnrtuer", "Mercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jeupirter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "MVsSatuMercuryrEarthhtnaNeptunUranuse");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaMarsMSaturneuMercuryrcurys", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMarsMSaturneMercuryrcury", "VenusUranuscMercryMarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnus", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVnuss", "Vnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeuNeptuneVnusnus", "Veunus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMarsMSaturneMercuryrcury", "uVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "SaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Nepttu", "Neptuu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtn", "MaNepMtune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "Neptuu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "PlutoV");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVenus", "Mars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnercury", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtnJupiter", "VsSatuMercuryrEarthhhtnJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiitier", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PtlutE", "PtlutE");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiitier", "Jupiiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupNeptuneVnusirter", "JupNeptuneVnurter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMercry", "VenuscMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "MarsMSaturneMercuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuJpiter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVenus", "Ms");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercyry", "Mercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnerScury", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnuss", "cMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturneVeunMVenuscMercryarsMSaturneMercuryrcuryusrScury", "MSaturneVeunMVenuscMercryarsMSaturneMercuryrcuryusrScury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnsus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupMaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusuneiter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "JupirsVnusr");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "sMMars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptunePlutEa", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrScurypitePlutEar", "JuJuepiMSatuyterpirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEanJupiter", "VsSatuMercuryrEarthhhtnJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercyry", "MSaturneVeunMVenuscMercryarsMSaturneMercuryrcuryusrScury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeuNeptunMarsMSaturneMercuryrcurypitereVnusnus", "VeuNeptuneVnusnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVenus", "VVenus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnyMSaturnercury", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "uss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarrthhtn", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMarsMSaturneMercuryrcury", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMMarsMSaturneMercuryrcuryercrPlutEa", "VenuscMMarsMSaturneMercuryrcuryercrPlutEa");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnercury", "uVnryMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mrcrry", "Mrcrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vs", "uVnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturrneMercuryrcurypiter", "MarsMSaturneMercuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SS", "SS");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMtSaturneMercuryrcurypiteMaNeptuuner", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercurMarsy", "MSaturnercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiitier", "Saturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercurrMSaturnercuryy", "MercurMSaturnercuryy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMVsSatuMercuryrEarthhtnaNeptunUranuseVcMercryeunusVnus", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupitSaturEarthhtner", "VensVeunusVnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "MarsMSaturneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "SaturEahn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnerrcury", "MSaturnercucry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhtn", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVnJuMercuirypiteruss", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptuu", "Jupiiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranurs", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVenus", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuJuepiMSatuyterpirter", "MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNepMtune", "MSaturnercucry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "Mercurssy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_747() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSMaturnercury", "MSMaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVs", "VVenus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarrthhtn", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VeuNeptunMarsMSaturneMercuryrcurypitereVnusnus", "MSatuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "MuSaturnercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMMarsMSaturneMercuryrcuryercrPlutEa", "cMercry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMerJuMercurypitercypiteJupiiterr", "JuMerJuMercurypitercypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtn", "VsSatuMercuryrEarrthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnnercury", "uVnryMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "MarsMSaturneMercuryrcuryrpiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MuSatursy", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMVsSatuMercuryrEarthhMaNeptuunetnaNeptunUranuseVeunusVnus", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutEa", "MarsMSaturneMercuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVs", "upiUranuster");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "SatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiitter", "MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarrsMSaturneMercuryrcurJupirtery", "MarrsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranurs", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaMarsMSaturneuMercueryrcurys", "Vs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pitter", "rJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercurssy", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercyry", "JupiVsSatuMercuryrEarthhtnrtuer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMarturnnercuryrcury", "VenusUranuscMercryMarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnercury", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarrsMSaturneMercuryrcury", "S");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pitter", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptune", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatuMercuryrEarthhtn", "NJuJpitereptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupMaNeptVeunMVenuscMercryarsMSaturneMercuryrcMVenusMercurycMercryarsMSaturneMercuryrcuryuryusuneiter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "SaturEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mars", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "ars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MVenuscMercryarsMSaturneMercuryrcury", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercuryuss", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "SaturEaMSaturnercuryrthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturuaEarthn", "SaturMSaturnerScuryaEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VVMSaturnerScuryenus", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuMarssUranuscMercryMarturnnercuryrcury", "VenusUranuscMercryMarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NJuJpitereptJupirsVnusrune", "NJuJpitereptJupirsVnusrune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Plluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MuSaturnercurMarsy", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "rJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("nVnuss", "Vnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pitter", "pitter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "MJupirsVnusrs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("lPlutEa", "eJupirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcuryrSaturn", "MarsMSaturneMercuryrcuryrSaturn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranus", "S");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VMaNeptunePlutEas", "VVenus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnerScury", "MuSaturnercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtn", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMerJuMercurypitercypiter", "JuepiMSatuyter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMerJuMercurypitercurypiter", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("aSatturEarthn", "aSaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSMaturnercury", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NJuJpitereptJupirsVnusrune", "SatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturrneMercuryrcurypiter", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PllutVenuscMercry", "Plluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune", "JuJuepiMSatuyterpirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Vnssus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "r");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhhtnJupiter", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutEa", "PlutEa");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneeMercuryrcuryrpSiter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Juipirter", "uVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMercry", "Mercrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnercury", "VsSatuMercuryrEanJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptune", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercursy", "MSaturJupiitaernercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupMaNeptVeunMVenuscMercryarsMSaturneMercuryrcMVenusMercurycMercryarsMSaturneMercuryrcuryuryusuneiter", "VsSatuMercuryrEarthhhtnJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uss", "uss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptVeunMVenuscMercryarsMSaturneMercuryrcuryusune", "lPlutEa");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("tu", "tu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "MarsMSaturneMercuryuVnyMSaturnercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnus", "VeuNeptunMarsMSaturneMercuryrcurypitereVnusnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaMarsMSaturneuMercueryrcurys", "VMVsSatuMercuryrEarthhtnaNeptunUranuses");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercury", "MarsMSaeMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Juipirter", "MarsMSaturneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarnttn", "SaturEarnthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MarsMSaturrneMercuryrcuMSaturnercursyrypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercury", "MSatuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercyry", "JupNeptuneVnurter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MeVMVsSatuMercuryrEarthhtnaNeptunUranusesrcury", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarJupirtthhtn", "VeunMVenuscMercryarsMSaturneMercuryrcuryus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiiter", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupirsVnusr", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neputune", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptunJuMerJuMercurypitercypiteJupiiterre", "SaturEa");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMarsMSaturneMercuryrcury", "uVunus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MVenusMercurycMercryarsMSaturneMercuryrcury", "Mercyry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NepMercurrMSaturnercuryyttu", "Neptuu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptuu", "Neptuu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturuaEarthn", "MSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEaMSaturnercuryrthn", "SaturEaMSaturnercuryrthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptuSatuMercuryrEarthhtn", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranurs", "UranuMercurMSaturnercuryys");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnryMSaturnercury", "VhsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pllutlo", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "MuSaturnercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercuryuss", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhcMercrytn", "SaturEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEa", "MercurMSaturnercuryy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("ssVnuss", "ssVnuss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMVsSatuMercuryrEarthhMaNeptuunetnaNeptunUranuseVeunusVnus", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pitter", "rpJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Pllluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("aaSaturEarthn", "MVenuscMercryarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMcurypiter", "JuMercurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "ars");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturrneMercuryrcuMSaturnercursyrypiter", "MarsMSaturrneMerycuryrcuMSaturnercursyrypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "VenusUranuscMercryMarturnnercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhttn", "SaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatuMercuryrEarthhtn", "SatuMercMJupirsVnusrsrthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupirsVnusr", "uVnMSaturnercuVenusry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptunePlutEa", "MarsMSaturrneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_864() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupNeptuneVMVenusMercurycMercryarsMSaturneMercuryrcurynusirter", "JupNeptuneVnusirter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiteMaNeptuuner", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarrthhttn", "SaturEarrthhttn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatturEarthn", "MaNeptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercury", "Neptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatuVsrEarthn", "Jupiitier");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MrcrrysVeunusVnus", "MrcrrysVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMtSaturneMercuryrcurypiteMaNeptuuner", "yuVnyMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Usranus", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneuMercuryrcury", "MarsMSaturneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMerrcuryrEarthhtn", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnMSaturnercuVenusry", "Plluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupititer", "Jupititer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "yuVnyMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMMars", "VVs");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uJuMerJuMercurypitercurypiterVnMSaturnMaMarsMSaturneuMercueryrcurysercury", "uVnMSaurnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVnJuMercuuirypiteruss", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMerMcuryrcuryPluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMerMcauryrcuryPluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "Vnssus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVnJuMercurypiteruss", "aSaturEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercury", "VsSatuMercuryrEarthEahtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthhhtn", "SaturEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarrsMSaturneMercuryrcurJupirter", "MarrsMSaturneMercuryrcurJupirtery");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("cMercPllutVenuscMercryy", "cMercMry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercrcrry", "Merrcrry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("cMercry", "SaturEaMSaturnercuryrthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutVenuscMMarsMSaturneMercuryrcuryercrPlutEao", "Pluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenusUranuscMercryMaMaNeptunJuMerJuMeVnusteJupiiterrercury", "VenusUranuscMercryMaMaNeptunJuMerJuMeVnusteJupiiterrercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Neptu", "JuMcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SS", "r");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupirsVnusr", "uVnMSaturnMaNeptuuneercuVenusry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NVVMSaturnerScuryenuseptu", "Vnssus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pittper", "pittper");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiVsSatuMercuryrEarthhtnrtuer", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("PlutEa", "SaturMSaturnerScuryaEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NVVuMSaturnerScuryenuseptu", "NVVMSaturnerScuryenuseptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MuStatuy", "MSatuy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnerccury", "MEarthSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("cMercPllutVenEarcryy", "cMercPllutVenuscMercryy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiitier", "Juppiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMerrcuryrEaarthhtn", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarrathn", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Uranurs", "MarsMSaturneMerMcuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnerScury", "NeptMarsMSaturneeMercuryrcuryrpSiteruu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("auaSaturEarthn", "MVenuscMercryarsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sVnJuMercurypiteruss", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMpercuryrScurypitePlutEar", "MaNeptunJuMerJuMercurypitercypiteJupiiterre");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mss", "MarsMSatMurneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturnercucry", "MSMaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatulPlurtEaruaEarthn", "SaturuaEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSaturJupiitaernercurMarsy", "MuSaturnercurMarsy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSMSaturnercurMarsyaturneMercuryrcuryPluto", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupititer", "JupiUranusterupititer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MercurrMSaturnercuryy", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMerrcuryrEarthhtn", "uVnMSaturnMaNeptuuneercuVenusry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSaSaturEarrathnMerrcuryrEarthhtn", "uVnMSaturnMaNeptuuneercuVenusry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMpercuryrScurypitePrlutEar", "MaNeptunJuMerJuMercurypitercypiteJupiiterre");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarrathn", "V");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNepMtune", "JuJuepiMSatuyterpirterpitter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VenuscMMarsMSaturneMercuryrcuryercrPlutEa", "PlutVenuscMMarsMSaturneMercuryrcuryercrPlutEao");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMerrcuryrEaarthMuSatursyhtn", "VsSatuMercuryrEarthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMVsSatuMercuryrEarthhhtnJupiterercuryrcurypiter", "MarsMSaturneMercuryrcurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SatuMhercuryrEarthhtn", "SatuMhercuryrEthhtn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupiitierSatulPlurtEaruaEarthn", "Santurn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MJuMcurypiterSaturnercucry", "MSMaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuepiMSatuyter", "JuepiMSatuyter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "uVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("auaSaturEarthn", "JupiitierSatulPlurtEaruaEarthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeptVeunMVenusccMercryarsMSaturneMercuryrcuryusune", "MaNeptVeunMVenusccMercryarsMSaturneMercuryrcuryusune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupiter", "VeunMVenuscMercryarsMSaturyus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupirsVnusr", "uVnMSJuMerJuMercurypitercypiteJupiiterraturnMaNeptuuneercuVenusry");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiter", "MarsMSaturneMercuryrcurypaSaturEarthnitMercrryer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VnssMarrsMSaturneMercuryrcuryus", "Vnssus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("tpitMarsMSaturneMpercuryrScurypitePlutEarter", "sVnJuMercurypiteruss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaNeMarsMSMSaturnercurMarsyaturneMercuryrcuryPlutoptune", "MaNeptunePlutEa");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MaaNepMtune", "sMVsSatuMercuryrEarthhtnaNeptunUranuseVeunusVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("pittper", "pitrtper");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Nepttu", "uVunus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptuSaEarthhtn", "NeplPlutEaPlllutou");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uVnrySaturEaMSaturnercuryrthncury", "uVnryMSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarnttn", "Jupiitier");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneeMercuryrcuryrpSiter", "MarsMSaturneMercuryrcurSypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Ea", "cMercPllutVenEarcryy");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSMSaturnercurMarsyaturneMercuryrcury", "MarsMSMSaturnercurMarsyaturneMercuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("SaturEarthn", "SaturEaJupiUranusterMSaturnercuryrthn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MuSatursy", "MarsMSaturneuMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarrthhtnJuepiMSatuyter", "JuepiMSatuyter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MSatuy", "yuVnyMrSaturnercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMercuryrcurypiteMaNeptuuner", "MercMury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "MaNeptuune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Mercyry", "MaNeptunJuMerJuMercurypitercypiteJupiiterre");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarthhtn", "VsSatuMercuryrEarrthhNeputunetn");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSMSaturnercurMarsyaturMarsMSaturneMercuryrcurypiteMaNeptuunerneMercuryrcuryPluto", "MarsMSMSaturnercurMarsyaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NepMercurrMSaturnercuryyttu", "rpJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VsSatuMercuryrEarrthhtn", "MarrsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupirter", "uss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("VnssusNeptuu", "pitterNeptuMSaturneVeunMVenuscMercryarsMSaturneMercuryrcuryusrScuryu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturneMpercuryrScurypitePlutEar", "VenuMarssUranuscMerccryMarturnnercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JupNeptuneVnusirter", "MarrsMSaturneMercuryrcury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("sMVsSatuMercuryrEarthhMaNeptuunMaNeptVeunMVenusccMercryarsMSaturneMercuryrcuryusuneetnaNeptunUranuseVeunusVnus", "MarsMSaturneMercuryrcurypaSaturEarthnitMercrryer");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuJuepiMSatuyterpirterpitter", "Jupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("MarsMSaturrneMercuryrcurypiter", "VsSatuMercuryrEarthhhtnJupiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuMercurypiter", "JVsSatuMercuryrEarthEahtnuMercurypiter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NeptuSaEarthhtn", "MarsMSaturneMercuryrcuryPluto");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("JuepiMSatuyteVenuMarssUranuscMerccryMarturnnercuryrcury", "JuepiMSatuyter");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("NVVuMSaturnerScuryenuseptu", "NVVuMSaturnerScuryenuseptu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("uss", "ssVnJuVeuNeptuneVnusnusMercuuirypiterusss");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Jupr", "NeptuneVnus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("Venus", "NepMercurrMSaturnercuryyttu");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.BF.bf("McMercrySatuy", "PlutuVnMSaturnercuryoV");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                
            ))
        );
    }
}

